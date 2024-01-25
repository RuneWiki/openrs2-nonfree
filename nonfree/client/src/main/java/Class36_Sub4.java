import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class36_Sub4 extends Class36 {

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!iq;")
	private Class120 aClass120_4;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "[Lclient!ef;")
	private Class65_Sub1[] aClass65_Sub1Array1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class36_Sub4(@OriginalArg(0) Class26_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean68) {
			this.aBoolean420 = arg0.anInt964 < 3;
			@Pc(26) int local26 = this.aBoolean420 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local89;
						} else if (local91 == 1) {
							local98 = local89;
						} else if (local91 == 2) {
							local98 = local85;
						} else if (local91 == 3) {
							local98 = -local85;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local98 > 0.0F) {
							local147 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local156 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local165 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local34[local91][local40] = (byte) local147;
						local38[local91][local40] = (byte) local156;
						local30[local91][local40] = (byte) local165;
					}
					local40++;
				}
			}
			this.aClass65_Sub1Array1 = new Class65_Sub1[3];
			this.aClass65_Sub1Array1[0] = new Class65_Sub1(super.aClass26_Sub1_43, 6406, 64, false, local34, 6406);
			this.aClass65_Sub1Array1[1] = new Class65_Sub1(super.aClass26_Sub1_43, 6406, 64, false, local38, 6406);
			this.aClass65_Sub1Array1[2] = new Class65_Sub1(super.aClass26_Sub1_43, 6406, 64, false, local30, 6406);
			this.method3972();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		super.aClass26_Sub1_43.method673(arg0);
		super.aClass26_Sub1_43.method669(arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		if (this.aClass120_4 == null || !arg0) {
			super.aClass26_Sub1_43.method643(0, 34168);
			return;
		}
		if (!this.aBoolean420) {
			super.aClass26_Sub1_43.method696(2);
			super.aClass26_Sub1_43.method673(super.aClass26_Sub1_43.aClass65_Sub3_1);
			super.aClass26_Sub1_43.method696(0);
		}
		this.aClass120_4.method2782('\u0000');
		this.aBoolean421 = true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		if (this.aBoolean421) {
			if (!this.aBoolean420) {
				super.aClass26_Sub1_43.method696(2);
				super.aClass26_Sub1_43.method673(null);
			}
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(null);
			super.aClass26_Sub1_43.method696(0);
			this.aClass120_4.method2782('\u0001');
			this.aBoolean421 = false;
		} else {
			super.aClass26_Sub1_43.method643(0, 5890);
		}
		super.aClass26_Sub1_43.method695(8448, 8448);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean421) {
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(this.aClass65_Sub1Array1[arg1 - 1]);
			super.aClass26_Sub1_43.method696(0);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
		super.aClass26_Sub1_43.method695(8448, 7681);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	private void method3972() {
		this.aClass120_4 = new Class120(super.aClass26_Sub1_43, 2);
		this.aClass120_4.method2784(0);
		super.aClass26_Sub1_43.method696(1);
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
		if (this.aBoolean420) {
			super.aClass26_Sub1_43.method695(260, 7681);
			super.aClass26_Sub1_43.method646(0, 770, 5890);
			super.aClass26_Sub1_43.method643(0, 34167);
		} else {
			super.aClass26_Sub1_43.method695(7681, 8448);
			super.aClass26_Sub1_43.method646(0, 768, 34168);
			super.aClass26_Sub1_43.method696(2);
			super.aClass26_Sub1_43.method695(260, 7681);
			super.aClass26_Sub1_43.method646(0, 768, 34168);
			super.aClass26_Sub1_43.method646(1, 770, 34168);
			super.aClass26_Sub1_43.method643(0, 34167);
		}
		super.aClass26_Sub1_43.method696(0);
		this.aClass120_4.method2781();
		this.aClass120_4.method2784(1);
		super.aClass26_Sub1_43.method696(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean420) {
			super.aClass26_Sub1_43.method695(8448, 8448);
			super.aClass26_Sub1_43.method646(0, 768, 5890);
			super.aClass26_Sub1_43.method643(0, 5890);
		} else {
			super.aClass26_Sub1_43.method695(8448, 8448);
			super.aClass26_Sub1_43.method646(0, 768, 5890);
			super.aClass26_Sub1_43.method696(2);
			super.aClass26_Sub1_43.method695(8448, 8448);
			super.aClass26_Sub1_43.method646(0, 768, 5890);
			super.aClass26_Sub1_43.method646(1, 768, 34168);
			super.aClass26_Sub1_43.method643(0, 5890);
		}
		super.aClass26_Sub1_43.method696(0);
		this.aClass120_4.method2781();
	}
}
