import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!ns;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!tk;")
	private final Class192 aClass192_1;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!gi;")
	private final Class66_Sub2 aClass66_Sub2_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!se;Lclient!tk;)V")
	public Class43_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class192 arg1) {
		super(arg0);
		this.aClass192_1 = arg1;
		this.method1025();
		this.aClass66_Sub2_1 = new Class66_Sub2(this.aClass122_Sub2_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass66_Sub2_1.method1753();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
		this.aClass122_Sub2_37.method4860(260, 8448);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass192_1.aBoolean411) {
				this.aClass122_Sub2_37.method4864(this.aClass192_1.aClass66_Sub3_2);
				Static64.aFloatArray2[0] = 0.0F;
				Static64.aFloatArray2[1] = 0.0F;
				Static64.aFloatArray2[2] = 0.0F;
				Static64.aFloatArray2[3] = (float) (this.aClass122_Sub2_37.anInt5610 % 4000) / 4000.0F;
				this.aClass122_Sub2_37.anOpengl2.glTexGenfv(8194, 9473, Static64.aFloatArray2, 0);
			} else {
				@Pc(56) int local56 = this.aClass122_Sub2_37.anInt5610 % 4000 * 16 / 4000;
				this.aClass122_Sub2_37.method4864(this.aClass192_1.aClass66_Sub1Array3[local56]);
			}
		} else if (this.aClass192_1.aBoolean411) {
			this.aClass122_Sub2_37.method4864(this.aClass192_1.aClass66_Sub3_2);
			Static64.aFloatArray2[0] = 0.0F;
			Static64.aFloatArray2[1] = 0.0F;
			Static64.aFloatArray2[2] = 0.0F;
			Static64.aFloatArray2[3] = 0.0F;
			this.aClass122_Sub2_37.anOpengl2.glTexGenfv(8194, 9473, Static64.aFloatArray2, 0);
		} else {
			this.aClass122_Sub2_37.method4864(this.aClass192_1.aClass66_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "()V")
	private void method1025() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_1 = new Class147(this.aClass122_Sub2_37, 2);
		this.aClass147_1.method3752(0);
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4860(7681, 260);
		this.aClass122_Sub2_37.method4815(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass122_Sub2_37.method4811(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass192_1.aBoolean411) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass147_1.method3753();
		this.aClass147_1.method3752(1);
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4860(8448, 8448);
		this.aClass122_Sub2_37.method4815(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass122_Sub2_37.method4811(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass192_1.aBoolean411) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass147_1.method3753();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_1.method3754('\u0001');
		if (this.aClass122_Sub2_37.anInt5645 > 0) {
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(null);
			this.aClass122_Sub2_37.method4874(1.0F, 0.0F);
			this.aClass122_Sub2_37.method4811(0);
		}
		this.aClass122_Sub2_37.method4860(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_37.anOpengl2;
		if (this.aClass122_Sub2_37.anInt5645 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass122_Sub2_37.anInt5645;
			this.aClass122_Sub2_37.method4811(1);
			Static64.aFloatArray2[0] = 0.0F;
			Static64.aFloatArray2[1] = 0.0F;
			Static64.aFloatArray2[2] = local14;
			Static64.aFloatArray2[3] = this.aClass122_Sub2_37.aFloat66 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static64.aFloatArray2, 0);
			local3.glPopMatrix();
			this.aClass122_Sub2_37.method4874(0.5F, (float) this.aClass122_Sub2_37.anInt5645);
			this.aClass122_Sub2_37.method4864(this.aClass66_Sub2_1);
			this.aClass122_Sub2_37.method4811(0);
		}
		this.aClass147_1.method3754('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}
}
