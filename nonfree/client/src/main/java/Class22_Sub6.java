import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!wm;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!qf;")
	private final Class163 aClass163_3;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!kl;")
	private final Class18_Sub3 aClass18_Sub3_1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!hj;Lclient!qf;)V")
	public Class22_Sub6(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class163 arg1) {
		super(arg0);
		this.aClass163_3 = arg1;
		this.method5183();
		this.aClass18_Sub3_1 = new Class18_Sub3(this.aClass2_Sub1_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass18_Sub3_1.method3200();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	@Override
	public void method5716(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_41.anOpengl1;
		if (this.aClass2_Sub1_41.anInt2444 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass2_Sub1_41.anInt2444;
			this.aClass2_Sub1_41.method2373(1);
			Static308.aFloatArray29[0] = 0.0F;
			Static308.aFloatArray29[1] = 0.0F;
			Static308.aFloatArray29[2] = local14;
			Static308.aFloatArray29[3] = this.aClass2_Sub1_41.aFloat56 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static308.aFloatArray29, 0);
			local3.glPopMatrix();
			this.aClass2_Sub1_41.method2365(0.5F, (float) this.aClass2_Sub1_41.anInt2444);
			this.aClass2_Sub1_41.method2376(this.aClass18_Sub3_1);
			this.aClass2_Sub1_41.method2373(0);
		}
		this.aClass218_5.method5676('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		this.aClass2_Sub1_41.method2351(260, 8448);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
	private void method5183() {
		@Pc(3) opengl local3 = this.aClass2_Sub1_41.anOpengl1;
		this.aClass218_5 = new Class218(this.aClass2_Sub1_41, 2);
		this.aClass218_5.method5674(0);
		this.aClass2_Sub1_41.method2373(1);
		this.aClass2_Sub1_41.method2351(7681, 260);
		this.aClass2_Sub1_41.method2372(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass2_Sub1_41.method2373(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass163_3.aBoolean408) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass218_5.method5675();
		this.aClass218_5.method5674(1);
		this.aClass2_Sub1_41.method2373(1);
		this.aClass2_Sub1_41.method2351(8448, 8448);
		this.aClass2_Sub1_41.method2372(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass2_Sub1_41.method2373(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass163_3.aBoolean408) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass218_5.method5675();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass163_3.aBoolean408) {
				this.aClass2_Sub1_41.method2376(this.aClass163_3.aClass18_Sub4_2);
				Static308.aFloatArray29[0] = 0.0F;
				Static308.aFloatArray29[1] = 0.0F;
				Static308.aFloatArray29[2] = 0.0F;
				Static308.aFloatArray29[3] = (float) (this.aClass2_Sub1_41.anInt2408 % 4000) / 4000.0F;
				this.aClass2_Sub1_41.anOpengl1.glTexGenfv(8194, 9473, Static308.aFloatArray29, 0);
			} else {
				@Pc(56) int local56 = this.aClass2_Sub1_41.anInt2408 % 4000 * 16 / 4000;
				this.aClass2_Sub1_41.method2376(this.aClass163_3.aClass18_Sub1Array2[local56]);
			}
		} else if (this.aClass163_3.aBoolean408) {
			this.aClass2_Sub1_41.method2376(this.aClass163_3.aClass18_Sub4_2);
			Static308.aFloatArray29[0] = 0.0F;
			Static308.aFloatArray29[1] = 0.0F;
			Static308.aFloatArray29[2] = 0.0F;
			Static308.aFloatArray29[3] = 0.0F;
			this.aClass2_Sub1_41.anOpengl1.glTexGenfv(8194, 9473, Static308.aFloatArray29, 0);
		} else {
			this.aClass2_Sub1_41.method2376(this.aClass163_3.aClass18_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!nj;)V")
	@Override
	public void method5718(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	@Override
	public void method5717() {
		@Pc(3) opengl local3 = this.aClass2_Sub1_41.anOpengl1;
		this.aClass218_5.method5676('\u0001');
		if (this.aClass2_Sub1_41.anInt2444 > 0) {
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2376(null);
			this.aClass2_Sub1_41.method2365(1.0F, 0.0F);
			this.aClass2_Sub1_41.method2373(0);
		}
		this.aClass2_Sub1_41.method2351(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}
}
