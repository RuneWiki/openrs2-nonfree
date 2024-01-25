import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!tp;")
	private Class199 aClass199_4;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[Lclient!hp;")
	private Class20_Sub2[] aClass20_Sub2Array1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class29_Sub5(@OriginalArg(0) Class32_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean234) {
			this.aBoolean464 = arg0.anInt2497 < 3;
			@Pc(24) int local24 = this.aBoolean464 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(57) float local57 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(99) float local99;
						if (local91 == 0) {
							local99 = -local85;
						} else if (local91 == 1) {
							local99 = local85;
						} else if (local91 == 2) {
							local99 = local89;
						} else if (local91 == 3) {
							local99 = -local89;
						} else if (local91 == 4) {
							local99 = local81;
						} else {
							local99 = -local81;
						}
						@Pc(141) int local141;
						@Pc(150) int local150;
						@Pc(159) int local159;
						if (local99 > 0.0F) {
							local141 = (int) (Math.pow((double) local99, 96.0D) * (double) local24);
							local150 = (int) (Math.pow((double) local99, 36.0D) * (double) local24);
							local159 = (int) (Math.pow((double) local99, 12.0D) * (double) local24);
						} else {
							local159 = 0;
							local150 = 0;
							local141 = 0;
						}
						local32[local91][local38] = (byte) local141;
						local36[local91][local38] = (byte) local150;
						local28[local91][local38] = (byte) local159;
					}
					local38++;
				}
			}
			this.aClass20_Sub2Array1 = new Class20_Sub2[3];
			this.aClass20_Sub2Array1[0] = new Class20_Sub2(this.aClass32_Sub2_39, 6406, 64, false, local32, 6406);
			this.aClass20_Sub2Array1[1] = new Class20_Sub2(this.aClass32_Sub2_39, 6406, 64, false, local36, 6406);
			this.aClass20_Sub2Array1[2] = new Class20_Sub2(this.aClass32_Sub2_39, 6406, 64, false, local28, 6406);
			this.method4292();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		if (this.aClass199_4 == null || !arg0) {
			this.aClass32_Sub2_39.method2265(0, 34168);
			return;
		}
		if (!this.aBoolean464) {
			this.aClass32_Sub2_39.method2314(2);
			this.aClass32_Sub2_39.method2287(this.aClass32_Sub2_39.aClass20_Sub1_3);
			this.aClass32_Sub2_39.method2314(0);
		}
		this.aClass199_4.method5170('\u0000');
		this.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
	private void method4292() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_4 = new Class199(this.aClass32_Sub2_39, 2);
		this.aClass199_4.method5169(0);
		this.aClass32_Sub2_39.method2314(1);
		local3.glTexGeni(8192, 9472, 34065);
		local3.glTexGeni(8193, 9472, 34065);
		local3.glTexGeni(8194, 9472, 34065);
		local3.glEnable(3168);
		local3.glEnable(3169);
		local3.glEnable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		local3.glMatrixMode(5888);
		if (this.aBoolean464) {
			this.aClass32_Sub2_39.method2255(260, 7681);
			this.aClass32_Sub2_39.method2276(0, 5890, 770);
			this.aClass32_Sub2_39.method2265(0, 34167);
		} else {
			this.aClass32_Sub2_39.method2255(7681, 8448);
			this.aClass32_Sub2_39.method2276(0, 34168, 768);
			this.aClass32_Sub2_39.method2314(2);
			this.aClass32_Sub2_39.method2255(260, 7681);
			this.aClass32_Sub2_39.method2276(0, 34168, 768);
			this.aClass32_Sub2_39.method2276(1, 34168, 770);
			this.aClass32_Sub2_39.method2265(0, 34167);
		}
		this.aClass32_Sub2_39.method2314(0);
		this.aClass199_4.method5168();
		this.aClass199_4.method5169(1);
		this.aClass32_Sub2_39.method2314(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean464) {
			this.aClass32_Sub2_39.method2255(8448, 8448);
			this.aClass32_Sub2_39.method2276(0, 5890, 768);
			this.aClass32_Sub2_39.method2265(0, 5890);
		} else {
			this.aClass32_Sub2_39.method2255(8448, 8448);
			this.aClass32_Sub2_39.method2276(0, 5890, 768);
			this.aClass32_Sub2_39.method2314(2);
			this.aClass32_Sub2_39.method2255(8448, 8448);
			this.aClass32_Sub2_39.method2276(0, 5890, 768);
			this.aClass32_Sub2_39.method2276(1, 34168, 768);
			this.aClass32_Sub2_39.method2265(0, 5890);
		}
		this.aClass32_Sub2_39.method2314(0);
		this.aClass199_4.method5168();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		if (this.aBoolean465) {
			if (!this.aBoolean464) {
				this.aClass32_Sub2_39.method2314(2);
				this.aClass32_Sub2_39.method2287(null);
			}
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(null);
			this.aClass32_Sub2_39.method2314(0);
			this.aClass199_4.method5170('\u0001');
			this.aBoolean465 = false;
		} else {
			this.aClass32_Sub2_39.method2265(0, 5890);
		}
		this.aClass32_Sub2_39.method2255(8448, 8448);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
		this.aClass32_Sub2_39.method2287(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
		if (this.aBoolean465) {
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(this.aClass20_Sub2Array1[arg0 - 1]);
			this.aClass32_Sub2_39.method2314(0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
		this.aClass32_Sub2_39.method2255(8448, 7681);
	}
}
