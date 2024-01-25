import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.fo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class21_Sub3 extends Class21 implements Interface20 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	private final int anInt7180;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!wda;IZ[[I)V")
	public Class21_Sub3(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static72.aClass16_3, Static489.aClass289_13, arg2 && arg0.aBoolean647, arg1 * arg1 * 6);
		this.anInt7180 = arg1;
		if (this.aBoolean475) {
			this.anIDirect3DCubeTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt7180, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt7180, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7180, this.anInt7180, 0, local52);
			if (fo.a(local73, (byte) 78)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt7180 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt7180 * this.anInt7180);
				} else {
					for (@Pc(88) int local88 = 0; local88 < this.anInt7180; local88++) {
						local52.a(arg3[local54], local88 * this.anInt7180, local88 * local80, this.anInt7180);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!pw;I)V")
	@Override
	public void method7955(@OriginalArg(0) Class234 arg0) {
		super.method7955(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6151() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	@Override
	public void method7954() {
		this.aClass9_Sub1_Sub2_6.method7783(this);
	}
}
