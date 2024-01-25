import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class33_Sub3 extends Class33 implements Interface23 {

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
	private final int anInt9325;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!rd;IZ[[I)V")
	public Class33_Sub3(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static393.aClass188_12, Static290.aClass189_11, arg2 && arg0.aBoolean594, arg1 * 6 * arg1);
		this.anInt9325 = arg1;
		if (this.aBoolean692) {
			this.anIDirect3DCubeTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt9325, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(this.anInt9325, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt9325, this.anInt9325, 0, local52);
			if (wd.a(86, (int) local73)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (local81 == this.anInt9325 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt9325 * this.anInt9325);
				} else {
					for (@Pc(106) int local106 = 0; local106 < this.anInt9325; local106++) {
						local52.a(arg3[local54], this.anInt9325 * local106, local81 * local106, this.anInt9325);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLclient!tb;)V")
	@Override
	public void method7837(@OriginalArg(1) Class328 arg0) {
		super.method7837(arg0);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
	@Override
	public void method7839() {
		this.aClass95_Sub3_Sub1_8.method6733(this);
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7838() {
		return this.anIDirect3DCubeTexture1;
	}
}
