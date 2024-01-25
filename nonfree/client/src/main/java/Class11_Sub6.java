import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!oc;")
	private Class147 aClass147_5;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!fg;")
	private final Class67 aClass67_4;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!vr;")
	private final Class52_Sub3 aClass52_Sub3_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ig;Lclient!fg;)V")
	public Class11_Sub6(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_4 = arg1;
		this.method4508();
		this.aClass52_Sub3_1 = new Class52_Sub3(this.aClass47_Sub2_33, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass52_Sub3_1.method5496();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_5.method4034('\u0001');
		if (this.aClass47_Sub2_33.anInt3090 > 0) {
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(null);
			this.aClass47_Sub2_33.method2833(1.0F, 0.0F);
			this.aClass47_Sub2_33.method2828(0);
		}
		this.aClass47_Sub2_33.method2790(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
		this.aClass47_Sub2_33.method2790(260, 8448);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass67_4.aBoolean172) {
				this.aClass47_Sub2_33.method2772(this.aClass67_4.aClass52_Sub2_1);
				Static260.aFloatArray28[0] = 0.0F;
				Static260.aFloatArray28[1] = 0.0F;
				Static260.aFloatArray28[2] = 0.0F;
				Static260.aFloatArray28[3] = (float) (this.aClass47_Sub2_33.anInt3057 % 4000) / 4000.0F;
				this.aClass47_Sub2_33.anOpengl2.glTexGenfv(8194, 9473, Static260.aFloatArray28, 0);
			} else {
				@Pc(56) int local56 = this.aClass47_Sub2_33.anInt3057 % 4000 * 16 / 4000;
				this.aClass47_Sub2_33.method2772(this.aClass67_4.aClass52_Sub1Array2[local56]);
			}
		} else if (this.aClass67_4.aBoolean172) {
			this.aClass47_Sub2_33.method2772(this.aClass67_4.aClass52_Sub2_1);
			Static260.aFloatArray28[0] = 0.0F;
			Static260.aFloatArray28[1] = 0.0F;
			Static260.aFloatArray28[2] = 0.0F;
			Static260.aFloatArray28[3] = 0.0F;
			this.aClass47_Sub2_33.anOpengl2.glTexGenfv(8194, 9473, Static260.aFloatArray28, 0);
		} else {
			this.aClass47_Sub2_33.method2772(this.aClass67_4.aClass52_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass47_Sub2_33.anOpengl2;
		if (this.aClass47_Sub2_33.anInt3090 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass47_Sub2_33.anInt3090;
			this.aClass47_Sub2_33.method2828(1);
			Static260.aFloatArray28[0] = 0.0F;
			Static260.aFloatArray28[1] = 0.0F;
			Static260.aFloatArray28[2] = local14;
			Static260.aFloatArray28[3] = this.aClass47_Sub2_33.aFloat48 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static260.aFloatArray28, 0);
			local3.glPopMatrix();
			this.aClass47_Sub2_33.method2833(0.5F, (float) this.aClass47_Sub2_33.anInt3090);
			this.aClass47_Sub2_33.method2772(this.aClass52_Sub3_1);
			this.aClass47_Sub2_33.method2828(0);
		}
		this.aClass147_5.method4034('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "()V")
	private void method4508() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_5 = new Class147(this.aClass47_Sub2_33, 2);
		this.aClass147_5.method4035(0);
		this.aClass47_Sub2_33.method2828(1);
		this.aClass47_Sub2_33.method2790(7681, 260);
		this.aClass47_Sub2_33.method2801(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass47_Sub2_33.method2828(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass67_4.aBoolean172) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass147_5.method4036();
		this.aClass147_5.method4035(1);
		this.aClass47_Sub2_33.method2828(1);
		this.aClass47_Sub2_33.method2790(8448, 8448);
		this.aClass47_Sub2_33.method2801(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass47_Sub2_33.method2828(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass67_4.aBoolean172) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass147_5.method4036();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}
}
