import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!eq;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!im;")
	private final Class91 aClass91_2;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!wb;")
	private final Class124_Sub4 aClass124_Sub4_1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ao;Lclient!im;)V")
	public Class35_Sub4(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_2 = arg1;
		this.method2651();
		this.aClass124_Sub4_1 = new Class124_Sub4(this.aClass4_Sub1_35, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass124_Sub4_1.method5905();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	@Override
	public void method5200(@OriginalArg(0) boolean arg0) {
		this.aClass4_Sub1_35.method580(260, 8448);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	@Override
	public void method5195(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass4_Sub1_35.anOpengl1;
		if (this.aClass4_Sub1_35.anInt334 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass4_Sub1_35.anInt334;
			this.aClass4_Sub1_35.method600(1);
			Static132.aFloatArray12[0] = 0.0F;
			Static132.aFloatArray12[1] = 0.0F;
			Static132.aFloatArray12[2] = local14;
			Static132.aFloatArray12[3] = this.aClass4_Sub1_35.aFloat19 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static132.aFloatArray12, 0);
			local3.glPopMatrix();
			this.aClass4_Sub1_35.method538(0.5F, (float) this.aClass4_Sub1_35.anInt334);
			this.aClass4_Sub1_35.method602(this.aClass124_Sub4_1);
			this.aClass4_Sub1_35.method600(0);
		}
		this.aClass57_3.method1809('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Z")
	@Override
	public boolean method5199() {
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!lp;)V")
	@Override
	public void method5196(@OriginalArg(0) Class124 arg0) {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	@Override
	public void method5197() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_35.anOpengl1;
		this.aClass57_3.method1809('\u0001');
		if (this.aClass4_Sub1_35.anInt334 > 0) {
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method602(null);
			this.aClass4_Sub1_35.method538(1.0F, 0.0F);
			this.aClass4_Sub1_35.method600(0);
		}
		this.aClass4_Sub1_35.method580(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	@Override
	public void method5198(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass91_2.aBoolean249) {
				this.aClass4_Sub1_35.method602(this.aClass91_2.aClass124_Sub1_2);
				Static132.aFloatArray12[0] = 0.0F;
				Static132.aFloatArray12[1] = 0.0F;
				Static132.aFloatArray12[2] = 0.0F;
				Static132.aFloatArray12[3] = (float) (this.aClass4_Sub1_35.anInt319 % 4000) / 4000.0F;
				this.aClass4_Sub1_35.anOpengl1.glTexGenfv(8194, 9473, Static132.aFloatArray12, 0);
			} else {
				@Pc(56) int local56 = this.aClass4_Sub1_35.anInt319 % 4000 * 16 / 4000;
				this.aClass4_Sub1_35.method602(this.aClass91_2.aClass124_Sub2Array2[local56]);
			}
		} else if (this.aClass91_2.aBoolean249) {
			this.aClass4_Sub1_35.method602(this.aClass91_2.aClass124_Sub1_2);
			Static132.aFloatArray12[0] = 0.0F;
			Static132.aFloatArray12[1] = 0.0F;
			Static132.aFloatArray12[2] = 0.0F;
			Static132.aFloatArray12[3] = 0.0F;
			this.aClass4_Sub1_35.anOpengl1.glTexGenfv(8194, 9473, Static132.aFloatArray12, 0);
		} else {
			this.aClass4_Sub1_35.method602(this.aClass91_2.aClass124_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
	private void method2651() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_35.anOpengl1;
		this.aClass57_3 = new Class57(this.aClass4_Sub1_35, 2);
		this.aClass57_3.method1811(0);
		this.aClass4_Sub1_35.method600(1);
		this.aClass4_Sub1_35.method580(7681, 260);
		this.aClass4_Sub1_35.method590(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass4_Sub1_35.method600(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass91_2.aBoolean249) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass57_3.method1810();
		this.aClass57_3.method1811(1);
		this.aClass4_Sub1_35.method600(1);
		this.aClass4_Sub1_35.method580(8448, 8448);
		this.aClass4_Sub1_35.method590(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass4_Sub1_35.method600(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass91_2.aBoolean249) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass57_3.method1810();
	}
}
