import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class80_Sub2 extends Class80 implements Interface20 {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	private final int anInt6733;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!aia;IZ[[I)V")
	public Class80_Sub2(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static264.aClass361_8, Static553.aClass330_14, arg2 && arg0.aBoolean63, arg1 * arg1 * 6);
		this.anInt6733 = arg1;
		if (this.aBoolean764) {
			this.anIDirect3DCubeTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt6733, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt6733, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6733, this.anInt6733, 0, local52);
			if (rn.a(local73, -105)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (local81 == this.anInt6733 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt6733 * this.anInt6733);
				} else {
					for (@Pc(93) int local93 = 0; local93 < this.anInt6733; local93++) {
						local52.a(arg3[local54], this.anInt6733 * local93, local81 * local93, this.anInt6733);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8757() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	@Override
	public void method8759() {
		this.aClass16_Sub1_Sub1_9.method693(this);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public void method8758(@OriginalArg(0) Class395 arg0) {
		super.method8758(arg0);
	}
}
