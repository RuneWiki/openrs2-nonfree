import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!hd;")
	private Class78 aClass78_5;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Lclient!le;")
	private final Class120 aClass120_4;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Lclient!ok;")
	private final Class19_Sub4 aClass19_Sub4_1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!ks;Lclient!le;)V")
	public Class2_Sub7(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class120 arg1) {
		super(arg0);
		this.aClass120_4 = arg1;
		this.method3771();
		this.aClass19_Sub4_1 = new Class19_Sub4(this.aClass63_Sub1_30, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass19_Sub4_1.method4247();
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_5.method2433('\u0001');
		if (this.aClass63_Sub1_30.anInt3607 > 0) {
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(null);
			this.aClass63_Sub1_30.method3382(1.0F, 0.0F);
			this.aClass63_Sub1_30.method3345(0);
		}
		this.aClass63_Sub1_30.method3356(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass120_4.aBoolean276) {
				this.aClass63_Sub1_30.method3355(this.aClass120_4.aClass19_Sub1_1);
				Static205.aFloatArray25[0] = 0.0F;
				Static205.aFloatArray25[1] = 0.0F;
				Static205.aFloatArray25[2] = 0.0F;
				Static205.aFloatArray25[3] = (float) (this.aClass63_Sub1_30.anInt3603 % 4000) / 4000.0F;
				this.aClass63_Sub1_30.anOpengl1.glTexGenfv(8194, 9473, Static205.aFloatArray25, 0);
			} else {
				@Pc(56) int local56 = this.aClass63_Sub1_30.anInt3603 % 4000 * 16 / 4000;
				this.aClass63_Sub1_30.method3355(this.aClass120_4.aClass19_Sub3Array1[local56]);
			}
		} else if (this.aClass120_4.aBoolean276) {
			this.aClass63_Sub1_30.method3355(this.aClass120_4.aClass19_Sub1_1);
			Static205.aFloatArray25[0] = 0.0F;
			Static205.aFloatArray25[1] = 0.0F;
			Static205.aFloatArray25[2] = 0.0F;
			Static205.aFloatArray25[3] = 0.0F;
			this.aClass63_Sub1_30.anOpengl1.glTexGenfv(8194, 9473, Static205.aFloatArray25, 0);
		} else {
			this.aClass63_Sub1_30.method3355(this.aClass120_4.aClass19_Sub3Array1[0]);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass63_Sub1_30.anOpengl1;
		if (this.aClass63_Sub1_30.anInt3607 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass63_Sub1_30.anInt3607;
			this.aClass63_Sub1_30.method3345(1);
			Static205.aFloatArray25[0] = 0.0F;
			Static205.aFloatArray25[1] = 0.0F;
			Static205.aFloatArray25[2] = local14;
			Static205.aFloatArray25[3] = this.aClass63_Sub1_30.aFloat37 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static205.aFloatArray25, 0);
			local3.glPopMatrix();
			this.aClass63_Sub1_30.method3382(0.5F, (float) this.aClass63_Sub1_30.anInt3607);
			this.aClass63_Sub1_30.method3355(this.aClass19_Sub4_1);
			this.aClass63_Sub1_30.method3345(0);
		}
		this.aClass78_5.method2433('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub1_30.method3356(260, 8448);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "()V")
	private void method3771() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_5 = new Class78(this.aClass63_Sub1_30, 2);
		this.aClass78_5.method2431(0);
		this.aClass63_Sub1_30.method3345(1);
		this.aClass63_Sub1_30.method3356(7681, 260);
		this.aClass63_Sub1_30.method3325(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass63_Sub1_30.method3345(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass120_4.aBoolean276) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass78_5.method2432();
		this.aClass78_5.method2431(1);
		this.aClass63_Sub1_30.method3345(1);
		this.aClass63_Sub1_30.method3356(8448, 8448);
		this.aClass63_Sub1_30.method3325(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass63_Sub1_30.method3345(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass120_4.aBoolean276) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass78_5.method2432();
	}
}
