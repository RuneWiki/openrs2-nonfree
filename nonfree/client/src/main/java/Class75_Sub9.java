import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class75_Sub9 extends Class75 {

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!uj;")
	private Class328 aClass328_6;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
	private boolean aBoolean847 = false;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Z")
	private boolean aBoolean845;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lclient!gfa;")
	private Class11_Sub3[] aClass11_Sub3Array1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class75_Sub9(@OriginalArg(0) Class15_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean438) {
			this.aBoolean845 = arg0.anInt5360 < 3;
			@Pc(24) int local24 = this.aBoolean845 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local62 * local62 + local53 * local53 + 1.0F)));
					@Pc(81) float local81 = local62 * local77;
					@Pc(85) float local85 = local53 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(93) float local93;
						if (local87 == 0) {
							local93 = -local85;
						} else if (local87 == 1) {
							local93 = local85;
						} else if (local87 == 2) {
							local93 = local81;
						} else if (local87 == 3) {
							local93 = -local81;
						} else if (local87 == 4) {
							local93 = local77;
						} else {
							local93 = -local77;
						}
						@Pc(136) int local136;
						@Pc(135) int local135;
						@Pc(133) int local133;
						if (local93 > 0.0F) {
							local136 = (int) (Math.pow((double) local93, 96.0D) * (double) local24);
							local135 = (int) (Math.pow((double) local93, 36.0D) * (double) local24);
							local133 = (int) (Math.pow((double) local93, 12.0D) * (double) local24);
						} else {
							local133 = 0;
							local135 = 0;
							local136 = 0;
						}
						local32[local87][local38] = (byte) local136;
						local36[local87][local38] = (byte) local135;
						local28[local87][local38] = (byte) local133;
					}
					local38++;
				}
			}
			this.aClass11_Sub3Array1 = new Class11_Sub3[3];
			this.aClass11_Sub3Array1[0] = new Class11_Sub3(super.aClass15_Sub3_42, 6406, 64, false, local32, 6406);
			this.aClass11_Sub3Array1[1] = new Class11_Sub3(super.aClass15_Sub3_42, 6406, 64, false, local36, 6406);
			this.aClass11_Sub3Array1[2] = new Class11_Sub3(super.aClass15_Sub3_42, 6406, 64, false, local28, 6406);
			this.method8298();
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	private void method8298() {
		this.aClass328_6 = new Class328(super.aClass15_Sub3_42, 2);
		this.aClass328_6.method7870(0);
		super.aClass15_Sub3_42.method4458(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean845) {
			super.aClass15_Sub3_42.method4451(7681, 260);
			super.aClass15_Sub3_42.method4442(770, 5890, 0);
			super.aClass15_Sub3_42.method4378(0, 34167);
		} else {
			super.aClass15_Sub3_42.method4451(8448, 7681);
			super.aClass15_Sub3_42.method4442(768, 34168, 0);
			super.aClass15_Sub3_42.method4458(2);
			super.aClass15_Sub3_42.method4451(7681, 260);
			super.aClass15_Sub3_42.method4442(768, 34168, 0);
			super.aClass15_Sub3_42.method4442(770, 34168, 1);
			super.aClass15_Sub3_42.method4378(0, 34167);
		}
		super.aClass15_Sub3_42.method4458(0);
		this.aClass328_6.method7868();
		this.aClass328_6.method7870(1);
		super.aClass15_Sub3_42.method4458(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean845) {
			super.aClass15_Sub3_42.method4451(8448, 8448);
			super.aClass15_Sub3_42.method4442(768, 5890, 0);
			super.aClass15_Sub3_42.method4378(0, 5890);
		} else {
			super.aClass15_Sub3_42.method4451(8448, 8448);
			super.aClass15_Sub3_42.method4442(768, 5890, 0);
			super.aClass15_Sub3_42.method4458(2);
			super.aClass15_Sub3_42.method4451(8448, 8448);
			super.aClass15_Sub3_42.method4442(768, 5890, 0);
			super.aClass15_Sub3_42.method4442(768, 34168, 1);
			super.aClass15_Sub3_42.method4378(0, 5890);
		}
		super.aClass15_Sub3_42.method4458(0);
		this.aClass328_6.method7868();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		if (this.aClass328_6 == null || !arg0) {
			super.aClass15_Sub3_42.method4378(0, 34168);
			return;
		}
		if (!this.aBoolean845) {
			super.aClass15_Sub3_42.method4458(2);
			super.aClass15_Sub3_42.method4377(super.aClass15_Sub3_42.aClass11_Sub2_3);
			super.aClass15_Sub3_42.method4458(0);
		}
		this.aClass328_6.method7872('\u0000');
		this.aBoolean847 = true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass15_Sub3_42.method4377(arg1);
		super.aClass15_Sub3_42.method4432(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean847) {
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(this.aClass11_Sub3Array1[arg0 - 1]);
			super.aClass15_Sub3_42.method4458(0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		if (this.aBoolean847) {
			if (!this.aBoolean845) {
				super.aClass15_Sub3_42.method4458(2);
				super.aClass15_Sub3_42.method4377(null);
			}
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(null);
			super.aClass15_Sub3_42.method4458(0);
			this.aClass328_6.method7872('\u0001');
			this.aBoolean847 = false;
		} else {
			super.aClass15_Sub3_42.method4378(0, 5890);
		}
		super.aClass15_Sub3_42.method4451(8448, 8448);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
		super.aClass15_Sub3_42.method4451(7681, 8448);
	}
}
