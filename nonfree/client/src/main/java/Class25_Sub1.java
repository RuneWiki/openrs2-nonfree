import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class25_Sub1 extends Class25 implements Interface22 {

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	private final int anInt504;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ui;IZ[[I)V")
	public Class25_Sub1(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static255.aClass214_8, Static108.aClass82_8, arg2 && arg0.aBoolean632, arg1 * arg1 * 6);
		this.anInt504 = arg1;
		if (this.aBoolean643) {
			this.anIDirect3DCubeTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt504, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt504, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt504, this.anInt504, 0, local52);
			if (te.a(2005530599, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt504 * 4 == local79) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt504 * this.anInt504);
				} else {
					for (@Pc(100) int local100 = 0; local100 < this.anInt504; local100++) {
						local52.a(arg3[local54], this.anInt504 * local100, local100 * local79, this.anInt504);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7526() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!td;B)V")
	@Override
	public void method7527(@OriginalArg(0) Class301 arg0) {
		super.method7527(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method7528() {
		this.aClass121_Sub2_Sub2_8.method7307(this);
	}
}
