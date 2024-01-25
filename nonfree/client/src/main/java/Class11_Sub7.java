import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!oc;")
	private Class147 aClass147_6;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Z")
	private boolean aBoolean405 = false;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
	private boolean aBoolean406;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "[Lclient!wl;")
	private Class52_Sub4[] aClass52_Sub4Array1;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class11_Sub7(@OriginalArg(0) Class47_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean227) {
			this.aBoolean406 = arg0.anInt3075 < 3;
			@Pc(24) int local24 = this.aBoolean406 ? 48 : 127;
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
			this.aClass52_Sub4Array1 = new Class52_Sub4[3];
			this.aClass52_Sub4Array1[0] = new Class52_Sub4(this.aClass47_Sub2_33, 6406, 64, false, local32, 6406);
			this.aClass52_Sub4Array1[1] = new Class52_Sub4(this.aClass47_Sub2_33, 6406, 64, false, local36, 6406);
			this.aClass52_Sub4Array1[2] = new Class52_Sub4(this.aClass47_Sub2_33, 6406, 64, false, local28, 6406);
			this.method4752();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
		this.aClass47_Sub2_33.method2772(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "()V")
	private void method4752() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_6 = new Class147(this.aClass47_Sub2_33, 2);
		this.aClass147_6.method4035(0);
		this.aClass47_Sub2_33.method2828(1);
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
		if (this.aBoolean406) {
			this.aClass47_Sub2_33.method2790(260, 7681);
			this.aClass47_Sub2_33.method2801(0, 5890, 770);
			this.aClass47_Sub2_33.method2804(0, 34167);
		} else {
			this.aClass47_Sub2_33.method2790(7681, 8448);
			this.aClass47_Sub2_33.method2801(0, 34168, 768);
			this.aClass47_Sub2_33.method2828(2);
			this.aClass47_Sub2_33.method2790(260, 7681);
			this.aClass47_Sub2_33.method2801(0, 34168, 768);
			this.aClass47_Sub2_33.method2801(1, 34168, 770);
			this.aClass47_Sub2_33.method2804(0, 34167);
		}
		this.aClass47_Sub2_33.method2828(0);
		this.aClass147_6.method4036();
		this.aClass147_6.method4035(1);
		this.aClass47_Sub2_33.method2828(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean406) {
			this.aClass47_Sub2_33.method2790(8448, 8448);
			this.aClass47_Sub2_33.method2801(0, 5890, 768);
			this.aClass47_Sub2_33.method2804(0, 5890);
		} else {
			this.aClass47_Sub2_33.method2790(8448, 8448);
			this.aClass47_Sub2_33.method2801(0, 5890, 768);
			this.aClass47_Sub2_33.method2828(2);
			this.aClass47_Sub2_33.method2790(8448, 8448);
			this.aClass47_Sub2_33.method2801(0, 5890, 768);
			this.aClass47_Sub2_33.method2801(1, 34168, 768);
			this.aClass47_Sub2_33.method2804(0, 5890);
		}
		this.aClass47_Sub2_33.method2828(0);
		this.aClass147_6.method4036();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		if (this.aBoolean405) {
			if (!this.aBoolean406) {
				this.aClass47_Sub2_33.method2828(2);
				this.aClass47_Sub2_33.method2772(null);
			}
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(null);
			this.aClass47_Sub2_33.method2828(0);
			this.aClass147_6.method4034('\u0001');
			this.aBoolean405 = false;
		} else {
			this.aClass47_Sub2_33.method2804(0, 5890);
		}
		this.aClass47_Sub2_33.method2790(8448, 8448);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
		this.aClass47_Sub2_33.method2790(8448, 7681);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
		if (this.aBoolean405) {
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(this.aClass52_Sub4Array1[arg0 - 1]);
			this.aClass47_Sub2_33.method2828(0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_6 == null || !arg0) {
			this.aClass47_Sub2_33.method2804(0, 34168);
			return;
		}
		if (!this.aBoolean406) {
			this.aClass47_Sub2_33.method2828(2);
			this.aClass47_Sub2_33.method2772(this.aClass47_Sub2_33.aClass52_Sub1_7);
			this.aClass47_Sub2_33.method2828(0);
		}
		this.aClass147_6.method4034('\u0000');
		this.aBoolean405 = true;
	}
}
