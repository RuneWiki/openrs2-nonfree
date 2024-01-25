import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class19_Sub9 extends Class19 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!jv;")
	private Class170 aClass170_6;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Z")
	private boolean aBoolean750 = false;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Z")
	private boolean aBoolean749;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "[Lclient!q;")
	private Class85_Sub3[] aClass85_Sub3Array1;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class19_Sub9(@OriginalArg(0) Class20_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean636) {
			this.aBoolean749 = arg0.anInt8793 < 3;
			@Pc(26) int local26 = this.aBoolean749 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local98 > 0.0F) {
							local146 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local145 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local143 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = (byte) local146;
						local38[local91][local40] = (byte) local145;
						local30[local91][local40] = (byte) local143;
					}
					local40++;
				}
			}
			this.aClass85_Sub3Array1 = new Class85_Sub3[3];
			this.aClass85_Sub3Array1[0] = new Class85_Sub3(super.aClass20_Sub3_42, 6406, 64, false, local34, 6406);
			this.aClass85_Sub3Array1[1] = new Class85_Sub3(super.aClass20_Sub3_42, 6406, 64, false, local38, 6406);
			this.aClass85_Sub3Array1[2] = new Class85_Sub3(super.aClass20_Sub3_42, 6406, 64, false, local30, 6406);
			this.method9171();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (this.aBoolean750) {
			if (!this.aBoolean749) {
				super.aClass20_Sub3_42.method7325(2);
				super.aClass20_Sub3_42.method7358(null);
			}
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(null);
			super.aClass20_Sub3_42.method7325(0);
			this.aClass170_6.method5086('\u0001');
			this.aBoolean750 = false;
		} else {
			super.aClass20_Sub3_42.method7362(0, 5890);
		}
		super.aClass20_Sub3_42.method7316(8448, 8448);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub3_42.method7358(arg0);
		super.aClass20_Sub3_42.method7348(arg1);
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	private void method9171() {
		this.aClass170_6 = new Class170(super.aClass20_Sub3_42, 2);
		this.aClass170_6.method5087(0);
		super.aClass20_Sub3_42.method7325(1);
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
		if (this.aBoolean749) {
			super.aClass20_Sub3_42.method7316(260, 7681);
			super.aClass20_Sub3_42.method7349(5890, 770, 0);
			super.aClass20_Sub3_42.method7362(0, 34167);
		} else {
			super.aClass20_Sub3_42.method7316(7681, 8448);
			super.aClass20_Sub3_42.method7349(34168, 768, 0);
			super.aClass20_Sub3_42.method7325(2);
			super.aClass20_Sub3_42.method7316(260, 7681);
			super.aClass20_Sub3_42.method7349(34168, 768, 0);
			super.aClass20_Sub3_42.method7349(34168, 770, 1);
			super.aClass20_Sub3_42.method7362(0, 34167);
		}
		super.aClass20_Sub3_42.method7325(0);
		this.aClass170_6.method5083();
		this.aClass170_6.method5087(1);
		super.aClass20_Sub3_42.method7325(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean749) {
			super.aClass20_Sub3_42.method7316(8448, 8448);
			super.aClass20_Sub3_42.method7349(5890, 768, 0);
			super.aClass20_Sub3_42.method7362(0, 5890);
		} else {
			super.aClass20_Sub3_42.method7316(8448, 8448);
			super.aClass20_Sub3_42.method7349(5890, 768, 0);
			super.aClass20_Sub3_42.method7325(2);
			super.aClass20_Sub3_42.method7316(8448, 8448);
			super.aClass20_Sub3_42.method7349(5890, 768, 0);
			super.aClass20_Sub3_42.method7349(34168, 768, 1);
			super.aClass20_Sub3_42.method7362(0, 5890);
		}
		super.aClass20_Sub3_42.method7325(0);
		this.aClass170_6.method5083();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean750) {
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(this.aClass85_Sub3Array1[arg0 - 1]);
			super.aClass20_Sub3_42.method7325(0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		if (this.aClass170_6 == null || !arg0) {
			super.aClass20_Sub3_42.method7362(0, 34168);
			return;
		}
		if (!this.aBoolean749) {
			super.aClass20_Sub3_42.method7325(2);
			super.aClass20_Sub3_42.method7358(super.aClass20_Sub3_42.aClass85_Sub1_3);
			super.aClass20_Sub3_42.method7325(0);
		}
		this.aClass170_6.method5086('\u0000');
		this.aBoolean750 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub3_42.method7316(8448, 7681);
	}
}
