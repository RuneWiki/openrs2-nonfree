import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class51_Sub2 extends Class51 implements Interface24 {

	@OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
	private final int anInt2275;

	@OriginalMember(owner = "client!eja", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!sd;IZ[[I)V")
	public Class51_Sub2(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static412.aClass114_17, Static453.aClass278_13, arg2 && arg0.aBoolean705, arg1 * 6 * arg1);
		this.anInt2275 = arg1;
		if (this.aBoolean261) {
			this.anIDirect3DCubeTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2275, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2275, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt2275, this.anInt2275, 0, local52);
			if (hc.a(local73, true)) {
				@Pc(82) int local82 = local52.getRowPitch();
				if (this.anInt2275 * 4 == local82) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt2275 * this.anInt2275);
				} else {
					for (@Pc(104) int local104 = 0; local104 < this.anInt2275; local104++) {
						local52.a(arg3[local54], local104 * this.anInt2275, local82 * local104, this.anInt2275);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZLclient!li;)V")
	@Override
	public void method8306(@OriginalArg(1) Class216 arg0) {
		super.method8306(arg0);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
	@Override
	public void method8305() {
		this.aClass57_Sub3_Sub2_6.method7877(this);
	}

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method2834() {
		return this.anIDirect3DCubeTexture1;
	}
}
