import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!eq;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[Lclient!vk;")
	private Class124_Sub3[] aClass124_Sub3Array1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class35_Sub2(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean41) {
			this.aBoolean120 = arg0.anInt322 < 3;
			@Pc(24) int local24 = this.aBoolean120 ? 48 : 127;
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
			this.aClass124_Sub3Array1 = new Class124_Sub3[3];
			this.aClass124_Sub3Array1[0] = new Class124_Sub3(this.aClass4_Sub1_35, 6406, 64, false, local32, 6406);
			this.aClass124_Sub3Array1[1] = new Class124_Sub3(this.aClass4_Sub1_35, 6406, 64, false, local36, 6406);
			this.aClass124_Sub3Array1[2] = new Class124_Sub3(this.aClass4_Sub1_35, 6406, 64, false, local28, 6406);
			this.method1366();
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "()V")
	private void method1366() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_35.anOpengl1;
		this.aClass57_1 = new Class57(this.aClass4_Sub1_35, 2);
		this.aClass57_1.method1811(0);
		this.aClass4_Sub1_35.method600(1);
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
		if (this.aBoolean120) {
			this.aClass4_Sub1_35.method580(260, 7681);
			this.aClass4_Sub1_35.method590(0, 5890, 770);
			this.aClass4_Sub1_35.method588(0, 34167);
		} else {
			this.aClass4_Sub1_35.method580(7681, 8448);
			this.aClass4_Sub1_35.method590(0, 34168, 768);
			this.aClass4_Sub1_35.method600(2);
			this.aClass4_Sub1_35.method580(260, 7681);
			this.aClass4_Sub1_35.method590(0, 34168, 768);
			this.aClass4_Sub1_35.method590(1, 34168, 770);
			this.aClass4_Sub1_35.method588(0, 34167);
		}
		this.aClass4_Sub1_35.method600(0);
		this.aClass57_1.method1810();
		this.aClass57_1.method1811(1);
		this.aClass4_Sub1_35.method600(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean120) {
			this.aClass4_Sub1_35.method580(8448, 8448);
			this.aClass4_Sub1_35.method590(0, 5890, 768);
			this.aClass4_Sub1_35.method588(0, 5890);
		} else {
			this.aClass4_Sub1_35.method580(8448, 8448);
			this.aClass4_Sub1_35.method590(0, 5890, 768);
			this.aClass4_Sub1_35.method600(2);
			this.aClass4_Sub1_35.method580(8448, 8448);
			this.aClass4_Sub1_35.method590(0, 5890, 768);
			this.aClass4_Sub1_35.method590(1, 34168, 768);
			this.aClass4_Sub1_35.method588(0, 5890);
		}
		this.aClass4_Sub1_35.method600(0);
		this.aClass57_1.method1810();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5195(@OriginalArg(0) boolean arg0) {
		if (this.aClass57_1 == null || !arg0) {
			this.aClass4_Sub1_35.method588(0, 34168);
			return;
		}
		if (!this.aBoolean120) {
			this.aClass4_Sub1_35.method600(2);
			this.aClass4_Sub1_35.method602(this.aClass4_Sub1_35.aClass124_Sub2_1);
			this.aClass4_Sub1_35.method600(0);
		}
		this.aClass57_1.method1809('\u0000');
		this.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method5198(@OriginalArg(0) int arg0) {
		if (this.aBoolean119) {
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method602(this.aClass124_Sub3Array1[arg0 - 1]);
			this.aClass4_Sub1_35.method600(0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
	@Override
	public void method5197() {
		if (this.aBoolean119) {
			if (!this.aBoolean120) {
				this.aClass4_Sub1_35.method600(2);
				this.aClass4_Sub1_35.method602(null);
			}
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method602(null);
			this.aClass4_Sub1_35.method600(0);
			this.aClass57_1.method1809('\u0001');
			this.aBoolean119 = false;
		} else {
			this.aClass4_Sub1_35.method588(0, 5890);
		}
		this.aClass4_Sub1_35.method580(8448, 8448);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5200(@OriginalArg(0) boolean arg0) {
		this.aClass4_Sub1_35.method580(8448, 7681);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!lp;)V")
	@Override
	public void method5196(@OriginalArg(0) Class124 arg0) {
		this.aClass4_Sub1_35.method602(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()Z")
	@Override
	public boolean method5199() {
		return true;
	}
}
