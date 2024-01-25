import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class1_Sub2 extends Class1 implements Interface18 {

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
	private final int anInt313;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!mba;IZ[[I)V")
	public Class1_Sub2(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static492.aClass261_14, Static302.aClass200_11, arg2 && arg0.aBoolean565, arg1 * arg1 * 6);
		this.anInt313 = arg1;
		if (this.aBoolean695) {
			this.anIDirect3DCubeTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt313, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt313, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt313, this.anInt313, 0, local52);
			if (sw.a((byte) -58, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt313 * 4 == local78) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt313 * this.anInt313);
				} else {
					for (@Pc(103) int local103 = 0; local103 < this.anInt313; local103++) {
						local52.a(arg3[local54], local103 * this.anInt313, local78 * local103, this.anInt313);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!gv;I)V")
	@Override
	public void method8222(@OriginalArg(0) Class130 arg0) {
		super.method8222(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6928() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	@Override
	public void method8223() {
		this.aClass15_Sub2_Sub2_8.method5492(this);
	}
}
