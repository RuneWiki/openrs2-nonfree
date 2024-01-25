import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class30_Sub7 extends Class30 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!p;")
	private Class178 aClass178_5;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!vq;")
	private final Class239 aClass239_4;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!wq;")
	private final Class15_Sub4 aClass15_Sub4_1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!nm;Lclient!vq;)V")
	public Class30_Sub7(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class239 arg1) {
		super(arg0);
		this.aClass239_4 = arg1;
		this.method4848();
		this.aClass15_Sub4_1 = new Class15_Sub4(this.aClass164_Sub1_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass15_Sub4_1.method5562();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
	@Override
	public void method4846(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass164_Sub1_39.anOpengl1;
		if (this.aClass164_Sub1_39.anInt4074 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass164_Sub1_39.anInt4074;
			this.aClass164_Sub1_39.method3584(1);
			Static340.aFloatArray29[0] = 0.0F;
			Static340.aFloatArray29[1] = 0.0F;
			Static340.aFloatArray29[2] = local14;
			Static340.aFloatArray29[3] = this.aClass164_Sub1_39.aFloat43 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static340.aFloatArray29, 0);
			local3.glPopMatrix();
			this.aClass164_Sub1_39.method3631(0.5F, (float) this.aClass164_Sub1_39.anInt4074);
			this.aClass164_Sub1_39.method3603(this.aClass15_Sub4_1);
			this.aClass164_Sub1_39.method3584(0);
		}
		this.aClass178_5.method4029('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	@Override
	public void method4844(@OriginalArg(0) boolean arg0) {
		this.aClass164_Sub1_39.method3629(260, 8448);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass239_4.aBoolean563) {
				this.aClass164_Sub1_39.method3603(this.aClass239_4.aClass15_Sub3_2);
				Static340.aFloatArray29[0] = 0.0F;
				Static340.aFloatArray29[1] = 0.0F;
				Static340.aFloatArray29[2] = 0.0F;
				Static340.aFloatArray29[3] = (float) (this.aClass164_Sub1_39.anInt4059 % 4000) / 4000.0F;
				this.aClass164_Sub1_39.anOpengl1.glTexGenfv(8194, 9473, Static340.aFloatArray29, 0);
			} else {
				@Pc(56) int local56 = this.aClass164_Sub1_39.anInt4059 % 4000 * 16 / 4000;
				this.aClass164_Sub1_39.method3603(this.aClass239_4.aClass15_Sub2Array4[local56]);
			}
		} else if (this.aClass239_4.aBoolean563) {
			this.aClass164_Sub1_39.method3603(this.aClass239_4.aClass15_Sub3_2);
			Static340.aFloatArray29[0] = 0.0F;
			Static340.aFloatArray29[1] = 0.0F;
			Static340.aFloatArray29[2] = 0.0F;
			Static340.aFloatArray29[3] = 0.0F;
			this.aClass164_Sub1_39.anOpengl1.glTexGenfv(8194, 9473, Static340.aFloatArray29, 0);
		} else {
			this.aClass164_Sub1_39.method3603(this.aClass239_4.aClass15_Sub2Array4[0]);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ap;)V")
	@Override
	public void method4847(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()V")
	@Override
	public void method4842() {
		@Pc(3) opengl local3 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass178_5.method4029('\u0001');
		if (this.aClass164_Sub1_39.anInt4074 > 0) {
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3603(null);
			this.aClass164_Sub1_39.method3631(1.0F, 0.0F);
			this.aClass164_Sub1_39.method3584(0);
		}
		this.aClass164_Sub1_39.method3629(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "()V")
	private void method4848() {
		@Pc(3) opengl local3 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass178_5 = new Class178(this.aClass164_Sub1_39, 2);
		this.aClass178_5.method4028(0);
		this.aClass164_Sub1_39.method3584(1);
		this.aClass164_Sub1_39.method3629(7681, 260);
		this.aClass164_Sub1_39.method3571(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass164_Sub1_39.method3584(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass239_4.aBoolean563) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass178_5.method4030();
		this.aClass178_5.method4028(1);
		this.aClass164_Sub1_39.method3584(1);
		this.aClass164_Sub1_39.method3629(8448, 8448);
		this.aClass164_Sub1_39.method3571(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass164_Sub1_39.method3584(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass239_4.aBoolean563) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass178_5.method4030();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "()Z")
	@Override
	public boolean method4843() {
		return true;
	}
}
