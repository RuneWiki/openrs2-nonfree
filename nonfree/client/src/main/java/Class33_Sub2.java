import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!hi;")
	private Class86 aClass86_3;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!gk;")
	private final Class78 aClass78_2;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!el;")
	private final Class60_Sub1 aClass60_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!mm;Lclient!gk;)V")
	public Class33_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class78 arg1) {
		super(arg0);
		this.aClass78_2 = arg1;
		this.method934();
		this.aClass60_Sub1_1 = new Class60_Sub1(this.aClass55_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass60_Sub1_1.method1396();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()Z")
	@Override
	public boolean method6041() {
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6042(@OriginalArg(0) boolean arg0) {
		this.aClass55_Sub1_42.method3709(260, 8448);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass78_2.aBoolean145) {
				this.aClass55_Sub1_42.method3677(this.aClass78_2.aClass60_Sub3_1);
				Static59.aFloatArray3[0] = 0.0F;
				Static59.aFloatArray3[1] = 0.0F;
				Static59.aFloatArray3[2] = 0.0F;
				Static59.aFloatArray3[3] = (float) (this.aClass55_Sub1_42.anInt3999 % 4000) / 4000.0F;
				this.aClass55_Sub1_42.anOpengl1.glTexGenfv(8194, 9473, Static59.aFloatArray3, 0);
			} else {
				@Pc(56) int local56 = this.aClass55_Sub1_42.anInt3999 % 4000 * 16 / 4000;
				this.aClass55_Sub1_42.method3677(this.aClass78_2.aClass60_Sub4Array2[local56]);
			}
		} else if (this.aClass78_2.aBoolean145) {
			this.aClass55_Sub1_42.method3677(this.aClass78_2.aClass60_Sub3_1);
			Static59.aFloatArray3[0] = 0.0F;
			Static59.aFloatArray3[1] = 0.0F;
			Static59.aFloatArray3[2] = 0.0F;
			Static59.aFloatArray3[3] = 0.0F;
			this.aClass55_Sub1_42.anOpengl1.glTexGenfv(8194, 9473, Static59.aFloatArray3, 0);
		} else {
			this.aClass55_Sub1_42.method3677(this.aClass78_2.aClass60_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
	@Override
	public void method6046(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass55_Sub1_42.anOpengl1;
		if (this.aClass55_Sub1_42.anInt4030 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass55_Sub1_42.anInt4030;
			this.aClass55_Sub1_42.method3693(1);
			Static59.aFloatArray3[0] = 0.0F;
			Static59.aFloatArray3[1] = 0.0F;
			Static59.aFloatArray3[2] = local14;
			Static59.aFloatArray3[3] = this.aClass55_Sub1_42.aFloat49 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static59.aFloatArray3, 0);
			local3.glPopMatrix();
			this.aClass55_Sub1_42.method3648(0.5F, (float) this.aClass55_Sub1_42.anInt4030);
			this.aClass55_Sub1_42.method3677(this.aClass60_Sub1_1);
			this.aClass55_Sub1_42.method3693(0);
		}
		this.aClass86_3.method2106('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!t;)V")
	@Override
	public void method6045(@OriginalArg(0) Class60 arg0) {
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "()V")
	@Override
	public void method6043() {
		@Pc(3) opengl local3 = this.aClass55_Sub1_42.anOpengl1;
		this.aClass86_3.method2106('\u0001');
		if (this.aClass55_Sub1_42.anInt4030 > 0) {
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3677(null);
			this.aClass55_Sub1_42.method3648(1.0F, 0.0F);
			this.aClass55_Sub1_42.method3693(0);
		}
		this.aClass55_Sub1_42.method3709(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "()V")
	private void method934() {
		@Pc(3) opengl local3 = this.aClass55_Sub1_42.anOpengl1;
		this.aClass86_3 = new Class86(this.aClass55_Sub1_42, 2);
		this.aClass86_3.method2104(0);
		this.aClass55_Sub1_42.method3693(1);
		this.aClass55_Sub1_42.method3709(7681, 260);
		this.aClass55_Sub1_42.method3684(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass55_Sub1_42.method3693(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass78_2.aBoolean145) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass86_3.method2105();
		this.aClass86_3.method2104(1);
		this.aClass55_Sub1_42.method3693(1);
		this.aClass55_Sub1_42.method3709(8448, 8448);
		this.aClass55_Sub1_42.method3684(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass55_Sub1_42.method3693(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass78_2.aBoolean145) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass86_3.method2105();
	}
}
