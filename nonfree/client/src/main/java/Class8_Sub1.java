import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!t;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "[Lclient!qh;")
	private Class7_Sub4[] aClass7_Sub4Array1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class8_Sub1(@OriginalArg(0) Class82_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean412) {
			this.aBoolean9 = arg0.anInt5235 < 3;
			@Pc(24) int local24 = this.aBoolean9 ? 48 : 127;
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
			this.aClass7_Sub4Array1 = new Class7_Sub4[3];
			this.aClass7_Sub4Array1[0] = new Class7_Sub4(this.aClass82_Sub2_34, 6406, 64, false, local32, 6406);
			this.aClass7_Sub4Array1[1] = new Class7_Sub4(this.aClass82_Sub2_34, 6406, 64, false, local36, 6406);
			this.aClass7_Sub4Array1[2] = new Class7_Sub4(this.aClass82_Sub2_34, 6406, 64, false, local28, 6406);
			this.method241();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
		if (this.aBoolean10) {
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(this.aClass7_Sub4Array1[arg0 - 1]);
			this.aClass82_Sub2_34.method4582(0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		if (this.aBoolean10) {
			if (!this.aBoolean9) {
				this.aClass82_Sub2_34.method4582(2);
				this.aClass82_Sub2_34.method4614(null);
			}
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(null);
			this.aClass82_Sub2_34.method4582(0);
			this.aClass217_1.method5089('\u0001');
			this.aBoolean10 = false;
		} else {
			this.aClass82_Sub2_34.method4631(0, 5890);
		}
		this.aClass82_Sub2_34.method4624(8448, 8448);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
		this.aClass82_Sub2_34.method4624(8448, 7681);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
	private void method241() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_1 = new Class217(this.aClass82_Sub2_34, 2);
		this.aClass217_1.method5088(0);
		this.aClass82_Sub2_34.method4582(1);
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
		if (this.aBoolean9) {
			this.aClass82_Sub2_34.method4624(260, 7681);
			this.aClass82_Sub2_34.method4592(0, 5890, 770);
			this.aClass82_Sub2_34.method4631(0, 34167);
		} else {
			this.aClass82_Sub2_34.method4624(7681, 8448);
			this.aClass82_Sub2_34.method4592(0, 34168, 768);
			this.aClass82_Sub2_34.method4582(2);
			this.aClass82_Sub2_34.method4624(260, 7681);
			this.aClass82_Sub2_34.method4592(0, 34168, 768);
			this.aClass82_Sub2_34.method4592(1, 34168, 770);
			this.aClass82_Sub2_34.method4631(0, 34167);
		}
		this.aClass82_Sub2_34.method4582(0);
		this.aClass217_1.method5090();
		this.aClass217_1.method5088(1);
		this.aClass82_Sub2_34.method4582(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean9) {
			this.aClass82_Sub2_34.method4624(8448, 8448);
			this.aClass82_Sub2_34.method4592(0, 5890, 768);
			this.aClass82_Sub2_34.method4631(0, 5890);
		} else {
			this.aClass82_Sub2_34.method4624(8448, 8448);
			this.aClass82_Sub2_34.method4592(0, 5890, 768);
			this.aClass82_Sub2_34.method4582(2);
			this.aClass82_Sub2_34.method4624(8448, 8448);
			this.aClass82_Sub2_34.method4592(0, 5890, 768);
			this.aClass82_Sub2_34.method4592(1, 34168, 768);
			this.aClass82_Sub2_34.method4631(0, 5890);
		}
		this.aClass82_Sub2_34.method4582(0);
		this.aClass217_1.method5090();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		if (this.aClass217_1 == null || !arg0) {
			this.aClass82_Sub2_34.method4631(0, 34168);
			return;
		}
		if (!this.aBoolean9) {
			this.aClass82_Sub2_34.method4582(2);
			this.aClass82_Sub2_34.method4614(this.aClass82_Sub2_34.aClass7_Sub1_4);
			this.aClass82_Sub2_34.method4582(0);
		}
		this.aClass217_1.method5089('\u0000');
		this.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
		this.aClass82_Sub2_34.method4614(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}
}
