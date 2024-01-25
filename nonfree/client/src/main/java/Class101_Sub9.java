import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class101_Sub9 extends Class101 {

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!fb;")
	private Class106 aClass106_6;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Z")
	private boolean aBoolean724 = false;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "[Lclient!waa;")
	private Class23_Sub4[] aClass23_Sub4Array1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class101_Sub9(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean591) {
			this.aBoolean725 = arg0.anInt7690 < 3;
			@Pc(26) int local26 = this.aBoolean725 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local85;
						} else if (local91 == 1) {
							local105 = local85;
						} else if (local91 == 2) {
							local105 = local89;
						} else if (local91 == 3) {
							local105 = -local89;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local105 > 0.0F) {
							local154 = (int) ((double) local26 * Math.pow((double) local105, 96.0D));
							local163 = (int) (Math.pow((double) local105, 36.0D) * (double) local26);
							local172 = (int) ((double) local26 * Math.pow((double) local105, 12.0D));
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local34[local91][local40] = (byte) local154;
						local38[local91][local40] = (byte) local163;
						local30[local91][local40] = (byte) local172;
					}
					local40++;
				}
			}
			this.aClass23_Sub4Array1 = new Class23_Sub4[3];
			this.aClass23_Sub4Array1[0] = new Class23_Sub4(super.aClass100_Sub3_43, 6406, 64, false, local34, 6406);
			this.aClass23_Sub4Array1[1] = new Class23_Sub4(super.aClass100_Sub3_43, 6406, 64, false, local38, 6406);
			this.aClass23_Sub4Array1[2] = new Class23_Sub4(super.aClass100_Sub3_43, 6406, 64, false, local30, 6406);
			this.method7847();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean724) {
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(this.aClass23_Sub4Array1[arg0 - 1]);
			super.aClass100_Sub3_43.method6344(0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		if (this.aClass106_6 == null || !arg0) {
			super.aClass100_Sub3_43.method6332(34168, 0);
			return;
		}
		if (!this.aBoolean725) {
			super.aClass100_Sub3_43.method6344(2);
			super.aClass100_Sub3_43.method6277(super.aClass100_Sub3_43.aClass23_Sub1_5);
			super.aClass100_Sub3_43.method6344(0);
		}
		this.aClass106_6.method2294('\u0000');
		this.aBoolean724 = true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		if (this.aBoolean724) {
			if (!this.aBoolean725) {
				super.aClass100_Sub3_43.method6344(2);
				super.aClass100_Sub3_43.method6277(null);
			}
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(null);
			super.aClass100_Sub3_43.method6344(0);
			this.aClass106_6.method2294('\u0001');
			this.aBoolean724 = false;
		} else {
			super.aClass100_Sub3_43.method6332(5890, 0);
		}
		super.aClass100_Sub3_43.method6300(8448, 8448);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		super.aClass100_Sub3_43.method6277(arg1);
		super.aClass100_Sub3_43.method6322(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_43.method6300(8448, 7681);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	private void method7847() {
		this.aClass106_6 = new Class106(super.aClass100_Sub3_43, 2);
		this.aClass106_6.method2292(0);
		super.aClass100_Sub3_43.method6344(1);
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
		if (this.aBoolean725) {
			super.aClass100_Sub3_43.method6300(260, 7681);
			super.aClass100_Sub3_43.method6283(0, 770, 5890);
			super.aClass100_Sub3_43.method6332(34167, 0);
		} else {
			super.aClass100_Sub3_43.method6300(7681, 8448);
			super.aClass100_Sub3_43.method6283(0, 768, 34168);
			super.aClass100_Sub3_43.method6344(2);
			super.aClass100_Sub3_43.method6300(260, 7681);
			super.aClass100_Sub3_43.method6283(0, 768, 34168);
			super.aClass100_Sub3_43.method6283(1, 770, 34168);
			super.aClass100_Sub3_43.method6332(34167, 0);
		}
		super.aClass100_Sub3_43.method6344(0);
		this.aClass106_6.method2293();
		this.aClass106_6.method2292(1);
		super.aClass100_Sub3_43.method6344(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean725) {
			super.aClass100_Sub3_43.method6300(8448, 8448);
			super.aClass100_Sub3_43.method6283(0, 768, 5890);
			super.aClass100_Sub3_43.method6332(5890, 0);
		} else {
			super.aClass100_Sub3_43.method6300(8448, 8448);
			super.aClass100_Sub3_43.method6283(0, 768, 5890);
			super.aClass100_Sub3_43.method6344(2);
			super.aClass100_Sub3_43.method6300(8448, 8448);
			super.aClass100_Sub3_43.method6283(0, 768, 5890);
			super.aClass100_Sub3_43.method6283(1, 768, 34168);
			super.aClass100_Sub3_43.method6332(5890, 0);
		}
		super.aClass100_Sub3_43.method6344(0);
		this.aClass106_6.method2293();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}
}
