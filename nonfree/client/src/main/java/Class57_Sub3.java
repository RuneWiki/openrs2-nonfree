import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class57_Sub3 extends Class57 implements Interface10 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	private final int anInt6630;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!vg;IZ[[I)V")
	public Class57_Sub3(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static493.aClass171_15, Static407.aClass254_14, arg2 && arg0.aBoolean652, arg1 * 6 * arg1);
		this.anInt6630 = arg1;
		if (this.aBoolean461) {
			this.anIDirect3DCubeTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt6630, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt6630, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6630, this.anInt6630, 0, local52);
			if (vba.a(-1, (int) local73)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt6630 * 4 == local81) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt6630 * this.anInt6630);
				} else {
					for (@Pc(106) int local106 = 0; local106 < this.anInt6630; local106++) {
						local52.a(arg3[local54], this.anInt6630 * local106, local81 * local106, this.anInt6630);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	@Override
	public void method7033() {
		this.aClass90_Sub3_Sub2_6.method7665(this);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5363() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!qaa;)V")
	@Override
	public void method7034(@OriginalArg(1) Class257 arg0) {
		super.method7034(arg0);
	}
}
