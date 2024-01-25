import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!hd;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lclient!ea;")
	private Class19_Sub2[] aClass19_Sub2Array1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class2_Sub1(@OriginalArg(0) Class63_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean260) {
			this.aBoolean3 = arg0.anInt3605 < 3;
			@Pc(24) int local24 = this.aBoolean3 ? 48 : 127;
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
			this.aClass19_Sub2Array1 = new Class19_Sub2[3];
			this.aClass19_Sub2Array1[0] = new Class19_Sub2(this.aClass63_Sub1_30, 6406, 64, false, local32, 6406);
			this.aClass19_Sub2Array1[1] = new Class19_Sub2(this.aClass63_Sub1_30, 6406, 64, false, local36, 6406);
			this.aClass19_Sub2Array1[2] = new Class19_Sub2(this.aClass63_Sub1_30, 6406, 64, false, local28, 6406);
			this.method62();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
		this.aClass63_Sub1_30.method3355(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		if (this.aClass78_1 == null || !arg0) {
			this.aClass63_Sub1_30.method3371(0, 34168);
			return;
		}
		if (!this.aBoolean3) {
			this.aClass63_Sub1_30.method3345(2);
			this.aClass63_Sub1_30.method3355(this.aClass63_Sub1_30.aClass19_Sub3_3);
			this.aClass63_Sub1_30.method3345(0);
		}
		this.aClass78_1.method2433('\u0000');
		this.aBoolean4 = true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		if (this.aBoolean4) {
			if (!this.aBoolean3) {
				this.aClass63_Sub1_30.method3345(2);
				this.aClass63_Sub1_30.method3355(null);
			}
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(null);
			this.aClass63_Sub1_30.method3345(0);
			this.aClass78_1.method2433('\u0001');
			this.aBoolean4 = false;
		} else {
			this.aClass63_Sub1_30.method3371(0, 5890);
		}
		this.aClass63_Sub1_30.method3356(8448, 8448);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
	private void method62() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_1 = new Class78(this.aClass63_Sub1_30, 2);
		this.aClass78_1.method2431(0);
		this.aClass63_Sub1_30.method3345(1);
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
		if (this.aBoolean3) {
			this.aClass63_Sub1_30.method3356(260, 7681);
			this.aClass63_Sub1_30.method3325(0, 5890, 770);
			this.aClass63_Sub1_30.method3371(0, 34167);
		} else {
			this.aClass63_Sub1_30.method3356(7681, 8448);
			this.aClass63_Sub1_30.method3325(0, 34168, 768);
			this.aClass63_Sub1_30.method3345(2);
			this.aClass63_Sub1_30.method3356(260, 7681);
			this.aClass63_Sub1_30.method3325(0, 34168, 768);
			this.aClass63_Sub1_30.method3325(1, 34168, 770);
			this.aClass63_Sub1_30.method3371(0, 34167);
		}
		this.aClass63_Sub1_30.method3345(0);
		this.aClass78_1.method2432();
		this.aClass78_1.method2431(1);
		this.aClass63_Sub1_30.method3345(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean3) {
			this.aClass63_Sub1_30.method3356(8448, 8448);
			this.aClass63_Sub1_30.method3325(0, 5890, 768);
			this.aClass63_Sub1_30.method3371(0, 5890);
		} else {
			this.aClass63_Sub1_30.method3356(8448, 8448);
			this.aClass63_Sub1_30.method3325(0, 5890, 768);
			this.aClass63_Sub1_30.method3345(2);
			this.aClass63_Sub1_30.method3356(8448, 8448);
			this.aClass63_Sub1_30.method3325(0, 5890, 768);
			this.aClass63_Sub1_30.method3325(1, 34168, 768);
			this.aClass63_Sub1_30.method3371(0, 5890);
		}
		this.aClass63_Sub1_30.method3345(0);
		this.aClass78_1.method2432();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub1_30.method3356(8448, 7681);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
		if (this.aBoolean4) {
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(this.aClass19_Sub2Array1[arg0 - 1]);
			this.aClass63_Sub1_30.method3345(0);
		}
	}
}
