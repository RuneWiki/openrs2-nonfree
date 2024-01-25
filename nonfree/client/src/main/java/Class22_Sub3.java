import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Lclient!wm;")
	private Class218 aClass218_3;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[Lclient!ih;")
	private Class18_Sub2[] aClass18_Sub2Array1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class22_Sub3(@OriginalArg(0) Class2_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean202) {
			this.aBoolean162 = arg0.anInt2434 < 3;
			@Pc(24) int local24 = this.aBoolean162 ? 48 : 127;
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
			this.aClass18_Sub2Array1 = new Class18_Sub2[3];
			this.aClass18_Sub2Array1[0] = new Class18_Sub2(this.aClass2_Sub1_41, 6406, 64, false, local32, 6406);
			this.aClass18_Sub2Array1[1] = new Class18_Sub2(this.aClass2_Sub1_41, 6406, 64, false, local36, 6406);
			this.aClass18_Sub2Array1[2] = new Class18_Sub2(this.aClass2_Sub1_41, 6406, 64, false, local28, 6406);
			this.method1746();
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()V")
	private void method1746() {
		@Pc(3) opengl local3 = this.aClass2_Sub1_41.anOpengl1;
		this.aClass218_3 = new Class218(this.aClass2_Sub1_41, 2);
		this.aClass218_3.method5674(0);
		this.aClass2_Sub1_41.method2373(1);
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
		if (this.aBoolean162) {
			this.aClass2_Sub1_41.method2351(260, 7681);
			this.aClass2_Sub1_41.method2372(0, 5890, 770);
			this.aClass2_Sub1_41.method2346(0, 34167);
		} else {
			this.aClass2_Sub1_41.method2351(7681, 8448);
			this.aClass2_Sub1_41.method2372(0, 34168, 768);
			this.aClass2_Sub1_41.method2373(2);
			this.aClass2_Sub1_41.method2351(260, 7681);
			this.aClass2_Sub1_41.method2372(0, 34168, 768);
			this.aClass2_Sub1_41.method2372(1, 34168, 770);
			this.aClass2_Sub1_41.method2346(0, 34167);
		}
		this.aClass2_Sub1_41.method2373(0);
		this.aClass218_3.method5675();
		this.aClass218_3.method5674(1);
		this.aClass2_Sub1_41.method2373(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean162) {
			this.aClass2_Sub1_41.method2351(8448, 8448);
			this.aClass2_Sub1_41.method2372(0, 5890, 768);
			this.aClass2_Sub1_41.method2346(0, 5890);
		} else {
			this.aClass2_Sub1_41.method2351(8448, 8448);
			this.aClass2_Sub1_41.method2372(0, 5890, 768);
			this.aClass2_Sub1_41.method2373(2);
			this.aClass2_Sub1_41.method2351(8448, 8448);
			this.aClass2_Sub1_41.method2372(0, 5890, 768);
			this.aClass2_Sub1_41.method2372(1, 34168, 768);
			this.aClass2_Sub1_41.method2346(0, 5890);
		}
		this.aClass2_Sub1_41.method2373(0);
		this.aClass218_3.method5675();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0) {
		if (this.aBoolean163) {
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2376(this.aClass18_Sub2Array1[arg0 - 1]);
			this.aClass2_Sub1_41.method2373(0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!nj;)V")
	@Override
	public void method5718(@OriginalArg(0) Class18 arg0) {
		this.aClass2_Sub1_41.method2376(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		this.aClass2_Sub1_41.method2351(8448, 7681);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	@Override
	public void method5717() {
		if (this.aBoolean163) {
			if (!this.aBoolean162) {
				this.aClass2_Sub1_41.method2373(2);
				this.aClass2_Sub1_41.method2376(null);
			}
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2376(null);
			this.aClass2_Sub1_41.method2373(0);
			this.aClass218_3.method5676('\u0001');
			this.aBoolean163 = false;
		} else {
			this.aClass2_Sub1_41.method2346(0, 5890);
		}
		this.aClass2_Sub1_41.method2351(8448, 8448);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
	@Override
	public void method5716(@OriginalArg(0) boolean arg0) {
		if (this.aClass218_3 == null || !arg0) {
			this.aClass2_Sub1_41.method2346(0, 34168);
			return;
		}
		if (!this.aBoolean162) {
			this.aClass2_Sub1_41.method2373(2);
			this.aClass2_Sub1_41.method2376(this.aClass2_Sub1_41.aClass18_Sub1_3);
			this.aClass2_Sub1_41.method2373(0);
		}
		this.aClass218_3.method5676('\u0000');
		this.aBoolean163 = true;
	}
}
