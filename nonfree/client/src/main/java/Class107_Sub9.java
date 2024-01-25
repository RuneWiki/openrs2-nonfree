import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class107_Sub9 extends Class107 {

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "Lclient!eha;")
	private Class91 aClass91_6;

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "Z")
	private boolean aBoolean673;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "[Lclient!ni;")
	private Class88_Sub3[] aClass88_Sub3Array1;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class107_Sub9(@OriginalArg(0) Class87_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean542) {
			this.aBoolean673 = arg0.anInt7389 < 3;
			@Pc(26) int local26 = this.aBoolean673 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local55 * local55 + local64 * local64 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(107) float local107;
						if (local89 == 0) {
							local107 = -local87;
						} else if (local89 == 1) {
							local107 = local87;
						} else if (local89 == 2) {
							local107 = local83;
						} else if (local89 == 3) {
							local107 = -local83;
						} else if (local89 == 4) {
							local107 = local79;
						} else {
							local107 = -local79;
						}
						@Pc(143) int local143;
						@Pc(142) int local142;
						@Pc(140) int local140;
						if (local107 > 0.0F) {
							local143 = (int) ((double) local26 * Math.pow((double) local107, 96.0D));
							local142 = (int) (Math.pow((double) local107, 36.0D) * (double) local26);
							local140 = (int) (Math.pow((double) local107, 12.0D) * (double) local26);
						} else {
							local140 = 0;
							local142 = 0;
							local143 = 0;
						}
						local34[local89][local40] = (byte) local143;
						local38[local89][local40] = (byte) local142;
						local30[local89][local40] = (byte) local140;
					}
					local40++;
				}
			}
			this.aClass88_Sub3Array1 = new Class88_Sub3[3];
			this.aClass88_Sub3Array1[0] = new Class88_Sub3(super.aClass87_Sub2_37, 6406, 64, false, local34, 6406);
			this.aClass88_Sub3Array1[1] = new Class88_Sub3(super.aClass87_Sub2_37, 6406, 64, false, local38, 6406);
			this.aClass88_Sub3Array1[2] = new Class88_Sub3(super.aClass87_Sub2_37, 6406, 64, false, local30, 6406);
			this.method7711();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub2_37.method6167(arg0);
		super.aClass87_Sub2_37.method6159(arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (this.aBoolean672) {
			if (!this.aBoolean673) {
				super.aClass87_Sub2_37.method6155(2);
				super.aClass87_Sub2_37.method6167(null);
			}
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(null);
			super.aClass87_Sub2_37.method6155(0);
			this.aClass91_6.method2497('\u0001');
			this.aBoolean672 = false;
		} else {
			super.aClass87_Sub2_37.method6195(5890, 0);
		}
		super.aClass87_Sub2_37.method6227(8448, 8448);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean672) {
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(this.aClass88_Sub3Array1[arg1 - 1]);
			super.aClass87_Sub2_37.method6155(0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
		super.aClass87_Sub2_37.method6227(8448, 7681);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		if (this.aClass91_6 == null || !arg0) {
			super.aClass87_Sub2_37.method6195(34168, 0);
			return;
		}
		if (!this.aBoolean673) {
			super.aClass87_Sub2_37.method6155(2);
			super.aClass87_Sub2_37.method6167(super.aClass87_Sub2_37.aClass88_Sub2_2);
			super.aClass87_Sub2_37.method6155(0);
		}
		this.aClass91_6.method2497('\u0000');
		this.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
	private void method7711() {
		this.aClass91_6 = new Class91(super.aClass87_Sub2_37, 2);
		this.aClass91_6.method2499(0);
		super.aClass87_Sub2_37.method6155(1);
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
		if (this.aBoolean673) {
			super.aClass87_Sub2_37.method6227(260, 7681);
			super.aClass87_Sub2_37.method6206(0, 770, 5890);
			super.aClass87_Sub2_37.method6195(34167, 0);
		} else {
			super.aClass87_Sub2_37.method6227(7681, 8448);
			super.aClass87_Sub2_37.method6206(0, 768, 34168);
			super.aClass87_Sub2_37.method6155(2);
			super.aClass87_Sub2_37.method6227(260, 7681);
			super.aClass87_Sub2_37.method6206(0, 768, 34168);
			super.aClass87_Sub2_37.method6206(1, 770, 34168);
			super.aClass87_Sub2_37.method6195(34167, 0);
		}
		super.aClass87_Sub2_37.method6155(0);
		this.aClass91_6.method2495();
		this.aClass91_6.method2499(1);
		super.aClass87_Sub2_37.method6155(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean673) {
			super.aClass87_Sub2_37.method6227(8448, 8448);
			super.aClass87_Sub2_37.method6206(0, 768, 5890);
			super.aClass87_Sub2_37.method6195(5890, 0);
		} else {
			super.aClass87_Sub2_37.method6227(8448, 8448);
			super.aClass87_Sub2_37.method6206(0, 768, 5890);
			super.aClass87_Sub2_37.method6155(2);
			super.aClass87_Sub2_37.method6227(8448, 8448);
			super.aClass87_Sub2_37.method6206(0, 768, 5890);
			super.aClass87_Sub2_37.method6206(1, 768, 34168);
			super.aClass87_Sub2_37.method6195(5890, 0);
		}
		super.aClass87_Sub2_37.method6155(0);
		this.aClass91_6.method2495();
	}
}
