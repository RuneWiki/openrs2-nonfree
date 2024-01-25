import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class29_Sub6 extends Class29 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!tp;")
	private Class199 aClass199_6;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!sh;")
	private final Class189 aClass189_4;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!lp;")
	private final Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!h;Lclient!sh;)V")
	public Class29_Sub6(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_4 = arg1;
		this.method5096();
		this.aClass20_Sub3_1 = new Class20_Sub3(this.aClass32_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass20_Sub3_1.method3522();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
	private void method5096() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_6 = new Class199(this.aClass32_Sub2_39, 2);
		this.aClass199_6.method5169(0);
		this.aClass32_Sub2_39.method2314(1);
		this.aClass32_Sub2_39.method2255(7681, 260);
		this.aClass32_Sub2_39.method2276(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass32_Sub2_39.method2314(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass189_4.aBoolean553) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass199_6.method5168();
		this.aClass199_6.method5169(1);
		this.aClass32_Sub2_39.method2314(1);
		this.aClass32_Sub2_39.method2255(8448, 8448);
		this.aClass32_Sub2_39.method2276(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass32_Sub2_39.method2314(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass189_4.aBoolean553) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass199_6.method5168();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_39.anOpengl2;
		if (this.aClass32_Sub2_39.anInt2493 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass32_Sub2_39.anInt2493;
			this.aClass32_Sub2_39.method2314(1);
			Static302.aFloatArray29[0] = 0.0F;
			Static302.aFloatArray29[1] = 0.0F;
			Static302.aFloatArray29[2] = local14;
			Static302.aFloatArray29[3] = this.aClass32_Sub2_39.aFloat26 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static302.aFloatArray29, 0);
			local3.glPopMatrix();
			this.aClass32_Sub2_39.method2289(0.5F, (float) this.aClass32_Sub2_39.anInt2493);
			this.aClass32_Sub2_39.method2287(this.aClass20_Sub3_1);
			this.aClass32_Sub2_39.method2314(0);
		}
		this.aClass199_6.method5170('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
		this.aClass32_Sub2_39.method2255(260, 8448);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_6.method5170('\u0001');
		if (this.aClass32_Sub2_39.anInt2493 > 0) {
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(null);
			this.aClass32_Sub2_39.method2289(1.0F, 0.0F);
			this.aClass32_Sub2_39.method2314(0);
		}
		this.aClass32_Sub2_39.method2255(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass189_4.aBoolean553) {
				this.aClass32_Sub2_39.method2287(this.aClass189_4.aClass20_Sub4_1);
				Static302.aFloatArray29[0] = 0.0F;
				Static302.aFloatArray29[1] = 0.0F;
				Static302.aFloatArray29[2] = 0.0F;
				Static302.aFloatArray29[3] = (float) (this.aClass32_Sub2_39.anInt2487 % 4000) / 4000.0F;
				this.aClass32_Sub2_39.anOpengl2.glTexGenfv(8194, 9473, Static302.aFloatArray29, 0);
			} else {
				@Pc(56) int local56 = this.aClass32_Sub2_39.anInt2487 % 4000 * 16 / 4000;
				this.aClass32_Sub2_39.method2287(this.aClass189_4.aClass20_Sub1Array2[local56]);
			}
		} else if (this.aClass189_4.aBoolean553) {
			this.aClass32_Sub2_39.method2287(this.aClass189_4.aClass20_Sub4_1);
			Static302.aFloatArray29[0] = 0.0F;
			Static302.aFloatArray29[1] = 0.0F;
			Static302.aFloatArray29[2] = 0.0F;
			Static302.aFloatArray29[3] = 0.0F;
			this.aClass32_Sub2_39.anOpengl2.glTexGenfv(8194, 9473, Static302.aFloatArray29, 0);
		} else {
			this.aClass32_Sub2_39.method2287(this.aClass189_4.aClass20_Sub1Array2[0]);
		}
	}
}
