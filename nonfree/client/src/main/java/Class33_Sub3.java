import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class33_Sub3 extends Class33 implements Interface22 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	private final int anInt7088;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!er;IZ[[I)V")
	public Class33_Sub3(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static171.aClass358_12, Static104.aClass86_8, arg2 && arg0.aBoolean198, arg1 * 6 * arg1);
		this.anInt7088 = arg1;
		if (this.aBoolean471) {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt7088, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt7088, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7088, this.anInt7088, 0, local52);
			if (gh.a(-2005530585, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (local80 == this.anInt7088 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt7088 * this.anInt7088);
				} else {
					for (@Pc(92) int local92 = 0; local92 < this.anInt7088; local92++) {
						local52.b(arg3[local54], local92 * this.anInt7088, local80 * local92, this.anInt7088);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6164() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass100_Sub1_Sub1_6.method2533(this);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!se;)V")
	@Override
	public void method8896(@OriginalArg(1) Class328 arg0) {
		super.method8896(arg0);
	}
}
