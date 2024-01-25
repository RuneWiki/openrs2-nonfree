import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!bb;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lclient!ds;")
	private Class56_Sub1[] aClass56_Sub1Array1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class22_Sub1(@OriginalArg(0) Class129_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean393) {
			this.aBoolean13 = arg0.anInt5901 < 3;
			@Pc(24) int local24 = this.aBoolean13 ? 48 : 127;
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
			this.aClass56_Sub1Array1 = new Class56_Sub1[3];
			this.aClass56_Sub1Array1[0] = new Class56_Sub1(this.aClass129_Sub2_32, 6406, 64, false, local32, 6406);
			this.aClass56_Sub1Array1[1] = new Class56_Sub1(this.aClass129_Sub2_32, 6406, 64, false, local36, 6406);
			this.aClass56_Sub1Array1[2] = new Class56_Sub1(this.aClass129_Sub2_32, 6406, 64, false, local28, 6406);
			this.method241();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		if (this.aBoolean14) {
			if (!this.aBoolean13) {
				this.aClass129_Sub2_32.method5091(2);
				this.aClass129_Sub2_32.method5084(null);
			}
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(null);
			this.aClass129_Sub2_32.method5091(0);
			this.aClass20_1.method223('\u0001');
			this.aBoolean14 = false;
		} else {
			this.aClass129_Sub2_32.method5097(0, 5890);
		}
		this.aClass129_Sub2_32.method5067(8448, 8448);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
	private void method241() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_1 = new Class20(this.aClass129_Sub2_32, 2);
		this.aClass20_1.method222(0);
		this.aClass129_Sub2_32.method5091(1);
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
		if (this.aBoolean13) {
			this.aClass129_Sub2_32.method5067(260, 7681);
			this.aClass129_Sub2_32.method5037(0, 5890, 770);
			this.aClass129_Sub2_32.method5097(0, 34167);
		} else {
			this.aClass129_Sub2_32.method5067(7681, 8448);
			this.aClass129_Sub2_32.method5037(0, 34168, 768);
			this.aClass129_Sub2_32.method5091(2);
			this.aClass129_Sub2_32.method5067(260, 7681);
			this.aClass129_Sub2_32.method5037(0, 34168, 768);
			this.aClass129_Sub2_32.method5037(1, 34168, 770);
			this.aClass129_Sub2_32.method5097(0, 34167);
		}
		this.aClass129_Sub2_32.method5091(0);
		this.aClass20_1.method221();
		this.aClass20_1.method222(1);
		this.aClass129_Sub2_32.method5091(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean13) {
			this.aClass129_Sub2_32.method5067(8448, 8448);
			this.aClass129_Sub2_32.method5037(0, 5890, 768);
			this.aClass129_Sub2_32.method5097(0, 5890);
		} else {
			this.aClass129_Sub2_32.method5067(8448, 8448);
			this.aClass129_Sub2_32.method5037(0, 5890, 768);
			this.aClass129_Sub2_32.method5091(2);
			this.aClass129_Sub2_32.method5067(8448, 8448);
			this.aClass129_Sub2_32.method5037(0, 5890, 768);
			this.aClass129_Sub2_32.method5037(1, 34168, 768);
			this.aClass129_Sub2_32.method5097(0, 5890);
		}
		this.aClass129_Sub2_32.method5091(0);
		this.aClass20_1.method221();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		if (this.aClass20_1 == null || !arg0) {
			this.aClass129_Sub2_32.method5097(0, 34168);
			return;
		}
		if (!this.aBoolean13) {
			this.aClass129_Sub2_32.method5091(2);
			this.aClass129_Sub2_32.method5084(this.aClass129_Sub2_32.aClass56_Sub4_7);
			this.aClass129_Sub2_32.method5091(0);
		}
		this.aClass20_1.method223('\u0000');
		this.aBoolean14 = true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		if (this.aBoolean14) {
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(this.aClass56_Sub1Array1[arg0 - 1]);
			this.aClass129_Sub2_32.method5091(0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
		this.aClass129_Sub2_32.method5084(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
		this.aClass129_Sub2_32.method5067(8448, 7681);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}
}
