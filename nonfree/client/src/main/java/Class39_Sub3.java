import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!q;")
	private Class168 aClass168_3;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[Lclient!m;")
	private Class92_Sub3[] aClass92_Sub3Array1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class39_Sub3(@OriginalArg(0) Class89_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean199) {
			this.aBoolean283 = arg0.anInt2615 < 3;
			@Pc(24) int local24 = this.aBoolean283 ? 48 : 127;
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
			this.aClass92_Sub3Array1 = new Class92_Sub3[3];
			this.aClass92_Sub3Array1[0] = new Class92_Sub3(this.aClass89_Sub1_39, 6406, 64, false, local32, 6406);
			this.aClass92_Sub3Array1[1] = new Class92_Sub3(this.aClass89_Sub1_39, 6406, 64, false, local36, 6406);
			this.aClass92_Sub3Array1[2] = new Class92_Sub3(this.aClass89_Sub1_39, 6406, 64, false, local28, 6406);
			this.method3360();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		if (this.aClass168_3 == null || !arg0) {
			this.aClass89_Sub1_39.method2451(0, 34168);
			return;
		}
		if (!this.aBoolean283) {
			this.aClass89_Sub1_39.method2433(2);
			this.aClass89_Sub1_39.method2445(this.aClass89_Sub1_39.aClass92_Sub4_5);
			this.aClass89_Sub1_39.method2433(0);
		}
		this.aClass168_3.method4287('\u0000');
		this.aBoolean284 = true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		if (this.aBoolean284) {
			if (!this.aBoolean283) {
				this.aClass89_Sub1_39.method2433(2);
				this.aClass89_Sub1_39.method2445(null);
			}
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(null);
			this.aClass89_Sub1_39.method2433(0);
			this.aClass168_3.method4287('\u0001');
			this.aBoolean284 = false;
		} else {
			this.aClass89_Sub1_39.method2451(0, 5890);
		}
		this.aClass89_Sub1_39.method2419(8448, 8448);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
		this.aClass89_Sub1_39.method2419(8448, 7681);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		this.aClass89_Sub1_39.method2445(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
		if (this.aBoolean284) {
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(this.aClass92_Sub3Array1[arg0 - 1]);
			this.aClass89_Sub1_39.method2433(0);
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	private void method3360() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_3 = new Class168(this.aClass89_Sub1_39, 2);
		this.aClass168_3.method4286(0);
		this.aClass89_Sub1_39.method2433(1);
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
		if (this.aBoolean283) {
			this.aClass89_Sub1_39.method2419(260, 7681);
			this.aClass89_Sub1_39.method2392(0, 5890, 770);
			this.aClass89_Sub1_39.method2451(0, 34167);
		} else {
			this.aClass89_Sub1_39.method2419(7681, 8448);
			this.aClass89_Sub1_39.method2392(0, 34168, 768);
			this.aClass89_Sub1_39.method2433(2);
			this.aClass89_Sub1_39.method2419(260, 7681);
			this.aClass89_Sub1_39.method2392(0, 34168, 768);
			this.aClass89_Sub1_39.method2392(1, 34168, 770);
			this.aClass89_Sub1_39.method2451(0, 34167);
		}
		this.aClass89_Sub1_39.method2433(0);
		this.aClass168_3.method4285();
		this.aClass168_3.method4286(1);
		this.aClass89_Sub1_39.method2433(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean283) {
			this.aClass89_Sub1_39.method2419(8448, 8448);
			this.aClass89_Sub1_39.method2392(0, 5890, 768);
			this.aClass89_Sub1_39.method2451(0, 5890);
		} else {
			this.aClass89_Sub1_39.method2419(8448, 8448);
			this.aClass89_Sub1_39.method2392(0, 5890, 768);
			this.aClass89_Sub1_39.method2433(2);
			this.aClass89_Sub1_39.method2419(8448, 8448);
			this.aClass89_Sub1_39.method2392(0, 5890, 768);
			this.aClass89_Sub1_39.method2392(1, 34168, 768);
			this.aClass89_Sub1_39.method2451(0, 5890);
		}
		this.aClass89_Sub1_39.method2433(0);
		this.aClass168_3.method4285();
	}
}
