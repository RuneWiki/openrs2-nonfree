import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class67_Sub7 extends Class67 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!cq;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	private boolean aBoolean427;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "[Lclient!gm;")
	private Class81_Sub1[] aClass81_Sub1Array1;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class67_Sub7(@OriginalArg(0) Class37_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean58) {
			this.aBoolean427 = arg0.anInt641 < 3;
			@Pc(24) int local24 = this.aBoolean427 ? 48 : 127;
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
			this.aClass81_Sub1Array1 = new Class81_Sub1[3];
			this.aClass81_Sub1Array1[0] = new Class81_Sub1(this.aClass37_Sub1_27, 6406, 64, false, local32, 6406);
			this.aClass81_Sub1Array1[1] = new Class81_Sub1(this.aClass37_Sub1_27, 6406, 64, false, local36, 6406);
			this.aClass81_Sub1Array1[2] = new Class81_Sub1(this.aClass37_Sub1_27, 6406, 64, false, local28, 6406);
			this.method4169();
		}
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "()V")
	private void method4169() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_6 = new Class45(this.aClass37_Sub1_27, 2);
		this.aClass45_6.method947(0);
		this.aClass37_Sub1_27.method759(1);
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
		if (this.aBoolean427) {
			this.aClass37_Sub1_27.method735(260, 7681);
			this.aClass37_Sub1_27.method732(0, 5890, 770);
			this.aClass37_Sub1_27.method769(0, 34167);
		} else {
			this.aClass37_Sub1_27.method735(7681, 8448);
			this.aClass37_Sub1_27.method732(0, 34168, 768);
			this.aClass37_Sub1_27.method759(2);
			this.aClass37_Sub1_27.method735(260, 7681);
			this.aClass37_Sub1_27.method732(0, 34168, 768);
			this.aClass37_Sub1_27.method732(1, 34168, 770);
			this.aClass37_Sub1_27.method769(0, 34167);
		}
		this.aClass37_Sub1_27.method759(0);
		this.aClass45_6.method949();
		this.aClass45_6.method947(1);
		this.aClass37_Sub1_27.method759(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean427) {
			this.aClass37_Sub1_27.method735(8448, 8448);
			this.aClass37_Sub1_27.method732(0, 5890, 768);
			this.aClass37_Sub1_27.method769(0, 5890);
		} else {
			this.aClass37_Sub1_27.method735(8448, 8448);
			this.aClass37_Sub1_27.method732(0, 5890, 768);
			this.aClass37_Sub1_27.method759(2);
			this.aClass37_Sub1_27.method735(8448, 8448);
			this.aClass37_Sub1_27.method732(0, 5890, 768);
			this.aClass37_Sub1_27.method732(1, 34168, 768);
			this.aClass37_Sub1_27.method769(0, 5890);
		}
		this.aClass37_Sub1_27.method759(0);
		this.aClass45_6.method949();
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		if (this.aBoolean426) {
			if (!this.aBoolean427) {
				this.aClass37_Sub1_27.method759(2);
				this.aClass37_Sub1_27.method767(null);
			}
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(null);
			this.aClass37_Sub1_27.method759(0);
			this.aClass45_6.method948('\u0001');
			this.aBoolean426 = false;
		} else {
			this.aClass37_Sub1_27.method769(0, 5890);
		}
		this.aClass37_Sub1_27.method735(8448, 8448);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
		this.aClass37_Sub1_27.method735(8448, 7681);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
		this.aClass37_Sub1_27.method767(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
		if (this.aBoolean426) {
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(this.aClass81_Sub1Array1[arg0 - 1]);
			this.aClass37_Sub1_27.method759(0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		if (this.aClass45_6 == null || !arg0) {
			this.aClass37_Sub1_27.method769(0, 34168);
			return;
		}
		if (!this.aBoolean427) {
			this.aClass37_Sub1_27.method759(2);
			this.aClass37_Sub1_27.method767(this.aClass37_Sub1_27.aClass81_Sub4_3);
			this.aClass37_Sub1_27.method759(0);
		}
		this.aClass45_6.method948('\u0000');
		this.aBoolean426 = true;
	}
}
