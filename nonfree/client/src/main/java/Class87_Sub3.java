import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class87_Sub3 extends Class87 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!fa;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!ja;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!on;")
	private final Class81_Sub4 aClass81_Sub4_1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ic;Lclient!ja;)V")
	public Class87_Sub3(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class114 arg1) {
		super(arg0);
		this.aClass114_1 = arg1;
		this.method3432();
		this.aClass81_Sub4_1 = new Class81_Sub4(this.aClass48_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass81_Sub4_1.method4351();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5870(@OriginalArg(0) Class81 arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
	private void method3432() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass72_3 = new Class72(this.aClass48_Sub2_39, 2);
		this.aClass72_3.method1605(0);
		this.aClass48_Sub2_39.method2566(1);
		this.aClass48_Sub2_39.method2563(7681, 260);
		this.aClass48_Sub2_39.method2611(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass48_Sub2_39.method2566(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass114_1.aBoolean250) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass72_3.method1606();
		this.aClass72_3.method1605(1);
		this.aClass48_Sub2_39.method2566(1);
		this.aClass48_Sub2_39.method2563(8448, 8448);
		this.aClass48_Sub2_39.method2611(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass48_Sub2_39.method2566(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass114_1.aBoolean250) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass72_3.method1606();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass114_1.aBoolean250) {
				this.aClass48_Sub2_39.method2573(this.aClass114_1.aClass81_Sub1_2);
				Static186.aFloatArray22[0] = 0.0F;
				Static186.aFloatArray22[1] = 0.0F;
				Static186.aFloatArray22[2] = 0.0F;
				Static186.aFloatArray22[3] = (float) (this.aClass48_Sub2_39.anInt3050 % 4000) / 4000.0F;
				this.aClass48_Sub2_39.anOpengl2.glTexGenfv(8194, 9473, Static186.aFloatArray22, 0);
			} else {
				@Pc(56) int local56 = this.aClass48_Sub2_39.anInt3050 % 4000 * 16 / 4000;
				this.aClass48_Sub2_39.method2573(this.aClass114_1.aClass81_Sub2Array2[local56]);
			}
		} else if (this.aClass114_1.aBoolean250) {
			this.aClass48_Sub2_39.method2573(this.aClass114_1.aClass81_Sub1_2);
			Static186.aFloatArray22[0] = 0.0F;
			Static186.aFloatArray22[1] = 0.0F;
			Static186.aFloatArray22[2] = 0.0F;
			Static186.aFloatArray22[3] = 0.0F;
			this.aClass48_Sub2_39.anOpengl2.glTexGenfv(8194, 9473, Static186.aFloatArray22, 0);
		} else {
			this.aClass48_Sub2_39.method2573(this.aClass114_1.aClass81_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "()V")
	@Override
	public void method5874() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass72_3.method1604('\u0001');
		if (this.aClass48_Sub2_39.anInt3072 > 0) {
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2573(null);
			this.aClass48_Sub2_39.method2571(1.0F, 0.0F);
			this.aClass48_Sub2_39.method2566(0);
		}
		this.aClass48_Sub2_39.method2563(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5872(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass48_Sub2_39.anOpengl2;
		if (this.aClass48_Sub2_39.anInt3072 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass48_Sub2_39.anInt3072;
			this.aClass48_Sub2_39.method2566(1);
			Static186.aFloatArray22[0] = 0.0F;
			Static186.aFloatArray22[1] = 0.0F;
			Static186.aFloatArray22[2] = local14;
			Static186.aFloatArray22[3] = this.aClass48_Sub2_39.aFloat14 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static186.aFloatArray22, 0);
			local3.glPopMatrix();
			this.aClass48_Sub2_39.method2571(0.5F, (float) this.aClass48_Sub2_39.anInt3072);
			this.aClass48_Sub2_39.method2573(this.aClass81_Sub4_1);
			this.aClass48_Sub2_39.method2566(0);
		}
		this.aClass72_3.method1604('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5875(@OriginalArg(0) boolean arg0) {
		this.aClass48_Sub2_39.method2563(260, 8448);
	}
}
