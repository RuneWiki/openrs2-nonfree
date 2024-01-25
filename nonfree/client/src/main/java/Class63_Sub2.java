import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "Lclient!lo;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "[Lclient!gi;")
	private Class20_Sub3[] aClass20_Sub3Array1;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class63_Sub2(@OriginalArg(0) Class163_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean379) {
			this.aBoolean206 = arg0.anInt5250 < 3;
			@Pc(26) int local26 = this.aBoolean206 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local101 > 0.0F) {
							local149 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local148 = (int) (Math.pow((double) local101, 36.0D) * (double) local26);
							local146 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local146 = 0;
							local148 = 0;
							local149 = 0;
						}
						local34[local91][local40] = (byte) local149;
						local38[local91][local40] = (byte) local148;
						local30[local91][local40] = (byte) local146;
					}
					local40++;
				}
			}
			this.aClass20_Sub3Array1 = new Class20_Sub3[3];
			this.aClass20_Sub3Array1[0] = new Class20_Sub3(super.aClass163_Sub2_43, 6406, 64, false, local34, 6406);
			this.aClass20_Sub3Array1[1] = new Class20_Sub3(super.aClass163_Sub2_43, 6406, 64, false, local38, 6406);
			this.aClass20_Sub3Array1[2] = new Class20_Sub3(super.aClass163_Sub2_43, 6406, 64, false, local30, 6406);
			this.method2687();
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
	private void method2687() {
		this.aClass147_1 = new Class147(super.aClass163_Sub2_43, 2);
		this.aClass147_1.method3028(0);
		super.aClass163_Sub2_43.method4131(1);
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
		if (this.aBoolean206) {
			super.aClass163_Sub2_43.method4164(260, 7681);
			super.aClass163_Sub2_43.method4181(0, 770, 5890);
			super.aClass163_Sub2_43.method4135(0, 34167);
		} else {
			super.aClass163_Sub2_43.method4164(7681, 8448);
			super.aClass163_Sub2_43.method4181(0, 768, 34168);
			super.aClass163_Sub2_43.method4131(2);
			super.aClass163_Sub2_43.method4164(260, 7681);
			super.aClass163_Sub2_43.method4181(0, 768, 34168);
			super.aClass163_Sub2_43.method4181(1, 770, 34168);
			super.aClass163_Sub2_43.method4135(0, 34167);
		}
		super.aClass163_Sub2_43.method4131(0);
		this.aClass147_1.method3029();
		this.aClass147_1.method3028(1);
		super.aClass163_Sub2_43.method4131(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean206) {
			super.aClass163_Sub2_43.method4164(8448, 8448);
			super.aClass163_Sub2_43.method4181(0, 768, 5890);
			super.aClass163_Sub2_43.method4135(0, 5890);
		} else {
			super.aClass163_Sub2_43.method4164(8448, 8448);
			super.aClass163_Sub2_43.method4181(0, 768, 5890);
			super.aClass163_Sub2_43.method4131(2);
			super.aClass163_Sub2_43.method4164(8448, 8448);
			super.aClass163_Sub2_43.method4181(0, 768, 5890);
			super.aClass163_Sub2_43.method4181(1, 768, 34168);
			super.aClass163_Sub2_43.method4135(0, 5890);
		}
		super.aClass163_Sub2_43.method4131(0);
		this.aClass147_1.method3029();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_1 == null || !arg0) {
			super.aClass163_Sub2_43.method4135(0, 34168);
			return;
		}
		if (!this.aBoolean206) {
			super.aClass163_Sub2_43.method4131(2);
			super.aClass163_Sub2_43.method4118(super.aClass163_Sub2_43.aClass20_Sub1_5);
			super.aClass163_Sub2_43.method4131(0);
		}
		this.aClass147_1.method3026('\u0000');
		this.aBoolean207 = true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		super.aClass163_Sub2_43.method4118(arg0);
		super.aClass163_Sub2_43.method4107(arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean207) {
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(this.aClass20_Sub3Array1[arg0 - 1]);
			super.aClass163_Sub2_43.method4131(0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
		super.aClass163_Sub2_43.method4164(8448, 7681);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		if (this.aBoolean207) {
			if (!this.aBoolean206) {
				super.aClass163_Sub2_43.method4131(2);
				super.aClass163_Sub2_43.method4118(null);
			}
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(null);
			super.aClass163_Sub2_43.method4131(0);
			this.aClass147_1.method3026('\u0001');
			this.aBoolean207 = false;
		} else {
			super.aClass163_Sub2_43.method4135(0, 5890);
		}
		super.aClass163_Sub2_43.method4164(8448, 8448);
	}
}
