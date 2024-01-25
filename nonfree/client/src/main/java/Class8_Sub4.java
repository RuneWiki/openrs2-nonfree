import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!t;")
	private Class217 aClass217_4;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Lclient!co;")
	private final Class37 aClass37_2;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!ap;")
	private final Class7_Sub2 aClass7_Sub2_1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!qi;Lclient!co;)V")
	public Class8_Sub4(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class37 arg1) {
		super(arg0);
		this.aClass37_2 = arg1;
		this.method2159();
		this.aClass7_Sub2_1 = new Class7_Sub2(this.aClass82_Sub2_34, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass7_Sub2_1.method320();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
		this.aClass82_Sub2_34.method4624(260, 8448);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
	private void method2159() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_4 = new Class217(this.aClass82_Sub2_34, 2);
		this.aClass217_4.method5088(0);
		this.aClass82_Sub2_34.method4582(1);
		this.aClass82_Sub2_34.method4624(7681, 260);
		this.aClass82_Sub2_34.method4592(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass82_Sub2_34.method4582(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass37_2.aBoolean82) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass217_4.method5090();
		this.aClass217_4.method5088(1);
		this.aClass82_Sub2_34.method4582(1);
		this.aClass82_Sub2_34.method4624(8448, 8448);
		this.aClass82_Sub2_34.method4592(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass82_Sub2_34.method4582(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass37_2.aBoolean82) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass217_4.method5090();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass82_Sub2_34.anOpengl2;
		if (this.aClass82_Sub2_34.anInt5230 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass82_Sub2_34.anInt5230;
			this.aClass82_Sub2_34.method4582(1);
			Static114.aFloatArray6[0] = 0.0F;
			Static114.aFloatArray6[1] = 0.0F;
			Static114.aFloatArray6[2] = local14;
			Static114.aFloatArray6[3] = this.aClass82_Sub2_34.aFloat56 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static114.aFloatArray6, 0);
			local3.glPopMatrix();
			this.aClass82_Sub2_34.method4588(0.5F, (float) this.aClass82_Sub2_34.anInt5230);
			this.aClass82_Sub2_34.method4614(this.aClass7_Sub2_1);
			this.aClass82_Sub2_34.method4582(0);
		}
		this.aClass217_4.method5089('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_4.method5089('\u0001');
		if (this.aClass82_Sub2_34.anInt5230 > 0) {
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(null);
			this.aClass82_Sub2_34.method4588(1.0F, 0.0F);
			this.aClass82_Sub2_34.method4582(0);
		}
		this.aClass82_Sub2_34.method4624(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass37_2.aBoolean82) {
				this.aClass82_Sub2_34.method4614(this.aClass37_2.aClass7_Sub3_1);
				Static114.aFloatArray6[0] = 0.0F;
				Static114.aFloatArray6[1] = 0.0F;
				Static114.aFloatArray6[2] = 0.0F;
				Static114.aFloatArray6[3] = (float) (this.aClass82_Sub2_34.anInt5197 % 4000) / 4000.0F;
				this.aClass82_Sub2_34.anOpengl2.glTexGenfv(8194, 9473, Static114.aFloatArray6, 0);
			} else {
				@Pc(56) int local56 = this.aClass82_Sub2_34.anInt5197 % 4000 * 16 / 4000;
				this.aClass82_Sub2_34.method4614(this.aClass37_2.aClass7_Sub1Array2[local56]);
			}
		} else if (this.aClass37_2.aBoolean82) {
			this.aClass82_Sub2_34.method4614(this.aClass37_2.aClass7_Sub3_1);
			Static114.aFloatArray6[0] = 0.0F;
			Static114.aFloatArray6[1] = 0.0F;
			Static114.aFloatArray6[2] = 0.0F;
			Static114.aFloatArray6[3] = 0.0F;
			this.aClass82_Sub2_34.anOpengl2.glTexGenfv(8194, 9473, Static114.aFloatArray6, 0);
		} else {
			this.aClass82_Sub2_34.method4614(this.aClass37_2.aClass7_Sub1Array2[0]);
		}
	}
}
