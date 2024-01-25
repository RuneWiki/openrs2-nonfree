import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class43_Sub5 extends Class43 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!ns;")
	private Class147 aClass147_3;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lclient!pi;")
	private Class66_Sub4[] aClass66_Sub4Array1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class43_Sub5(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean352) {
			this.aBoolean215 = arg0.anInt5622 < 3;
			@Pc(24) int local24 = this.aBoolean215 ? 48 : 127;
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
			this.aClass66_Sub4Array1 = new Class66_Sub4[3];
			this.aClass66_Sub4Array1[0] = new Class66_Sub4(this.aClass122_Sub2_37, 6406, 64, false, local32, 6406);
			this.aClass66_Sub4Array1[1] = new Class66_Sub4(this.aClass122_Sub2_37, 6406, 64, false, local36, 6406);
			this.aClass66_Sub4Array1[2] = new Class66_Sub4(this.aClass122_Sub2_37, 6406, 64, false, local28, 6406);
			this.method3233();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		this.aClass122_Sub2_37.method4864(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_3 == null || !arg0) {
			this.aClass122_Sub2_37.method4816(0, 34168);
			return;
		}
		if (!this.aBoolean215) {
			this.aClass122_Sub2_37.method4811(2);
			this.aClass122_Sub2_37.method4864(this.aClass122_Sub2_37.aClass66_Sub1_6);
			this.aClass122_Sub2_37.method4811(0);
		}
		this.aClass147_3.method3754('\u0000');
		this.aBoolean216 = true;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	private void method3233() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_3 = new Class147(this.aClass122_Sub2_37, 2);
		this.aClass147_3.method3752(0);
		this.aClass122_Sub2_37.method4811(1);
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
		if (this.aBoolean215) {
			this.aClass122_Sub2_37.method4860(260, 7681);
			this.aClass122_Sub2_37.method4815(0, 5890, 770);
			this.aClass122_Sub2_37.method4816(0, 34167);
		} else {
			this.aClass122_Sub2_37.method4860(7681, 8448);
			this.aClass122_Sub2_37.method4815(0, 34168, 768);
			this.aClass122_Sub2_37.method4811(2);
			this.aClass122_Sub2_37.method4860(260, 7681);
			this.aClass122_Sub2_37.method4815(0, 34168, 768);
			this.aClass122_Sub2_37.method4815(1, 34168, 770);
			this.aClass122_Sub2_37.method4816(0, 34167);
		}
		this.aClass122_Sub2_37.method4811(0);
		this.aClass147_3.method3753();
		this.aClass147_3.method3752(1);
		this.aClass122_Sub2_37.method4811(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean215) {
			this.aClass122_Sub2_37.method4860(8448, 8448);
			this.aClass122_Sub2_37.method4815(0, 5890, 768);
			this.aClass122_Sub2_37.method4816(0, 5890);
		} else {
			this.aClass122_Sub2_37.method4860(8448, 8448);
			this.aClass122_Sub2_37.method4815(0, 5890, 768);
			this.aClass122_Sub2_37.method4811(2);
			this.aClass122_Sub2_37.method4860(8448, 8448);
			this.aClass122_Sub2_37.method4815(0, 5890, 768);
			this.aClass122_Sub2_37.method4815(1, 34168, 768);
			this.aClass122_Sub2_37.method4816(0, 5890);
		}
		this.aClass122_Sub2_37.method4811(0);
		this.aClass147_3.method3753();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		if (this.aBoolean216) {
			if (!this.aBoolean215) {
				this.aClass122_Sub2_37.method4811(2);
				this.aClass122_Sub2_37.method4864(null);
			}
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(null);
			this.aClass122_Sub2_37.method4811(0);
			this.aClass147_3.method3754('\u0001');
			this.aBoolean216 = false;
		} else {
			this.aClass122_Sub2_37.method4816(0, 5890);
		}
		this.aClass122_Sub2_37.method4860(8448, 8448);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
		if (this.aBoolean216) {
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(this.aClass66_Sub4Array1[arg0 - 1]);
			this.aClass122_Sub2_37.method4811(0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
		this.aClass122_Sub2_37.method4860(8448, 7681);
	}
}
