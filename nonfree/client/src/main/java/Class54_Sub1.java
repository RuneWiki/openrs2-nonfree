import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!fr;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!mk;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!dq;")
	private final Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ge;Lclient!mk;)V")
	public Class54_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_1 = arg1;
		this.method1065();
		this.aClass28_Sub2_1 = new Class28_Sub2(this.aClass81_Sub1_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass28_Sub2_1.method1052();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
		this.aClass81_Sub1_37.method1965(260, 8448);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass135_1.aBoolean278) {
				this.aClass81_Sub1_37.method2022(this.aClass135_1.aClass28_Sub4_2);
				Static64.aFloatArray2[0] = 0.0F;
				Static64.aFloatArray2[1] = 0.0F;
				Static64.aFloatArray2[2] = 0.0F;
				Static64.aFloatArray2[3] = (float) (this.aClass81_Sub1_37.anInt1804 % 4000) / 4000.0F;
				this.aClass81_Sub1_37.anOpengl1.glTexGenfv(8194, 9473, Static64.aFloatArray2, 0);
			} else {
				@Pc(56) int local56 = this.aClass81_Sub1_37.anInt1804 % 4000 * 16 / 4000;
				this.aClass81_Sub1_37.method2022(this.aClass135_1.aClass28_Sub3Array3[local56]);
			}
		} else if (this.aClass135_1.aBoolean278) {
			this.aClass81_Sub1_37.method2022(this.aClass135_1.aClass28_Sub4_2);
			Static64.aFloatArray2[0] = 0.0F;
			Static64.aFloatArray2[1] = 0.0F;
			Static64.aFloatArray2[2] = 0.0F;
			Static64.aFloatArray2[3] = 0.0F;
			this.aClass81_Sub1_37.anOpengl1.glTexGenfv(8194, 9473, Static64.aFloatArray2, 0);
		} else {
			this.aClass81_Sub1_37.method2022(this.aClass135_1.aClass28_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_1.method1586('\u0001');
		if (this.aClass81_Sub1_37.anInt1810 > 0) {
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(null);
			this.aClass81_Sub1_37.method1987(1.0F, 0.0F);
			this.aClass81_Sub1_37.method1953(0);
		}
		this.aClass81_Sub1_37.method1965(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "()V")
	private void method1065() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_1 = new Class76(this.aClass81_Sub1_37, 2);
		this.aClass76_1.method1585(0);
		this.aClass81_Sub1_37.method1953(1);
		this.aClass81_Sub1_37.method1965(7681, 260);
		this.aClass81_Sub1_37.method1986(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass81_Sub1_37.method1953(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass135_1.aBoolean278) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass76_1.method1584();
		this.aClass76_1.method1585(1);
		this.aClass81_Sub1_37.method1953(1);
		this.aClass81_Sub1_37.method1965(8448, 8448);
		this.aClass81_Sub1_37.method1986(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass81_Sub1_37.method1953(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass135_1.aBoolean278) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass76_1.method1584();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_37.anOpengl1;
		if (this.aClass81_Sub1_37.anInt1810 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass81_Sub1_37.anInt1810;
			this.aClass81_Sub1_37.method1953(1);
			Static64.aFloatArray2[0] = 0.0F;
			Static64.aFloatArray2[1] = 0.0F;
			Static64.aFloatArray2[2] = local14;
			Static64.aFloatArray2[3] = this.aClass81_Sub1_37.aFloat37 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static64.aFloatArray2, 0);
			local3.glPopMatrix();
			this.aClass81_Sub1_37.method1987(0.5F, (float) this.aClass81_Sub1_37.anInt1810);
			this.aClass81_Sub1_37.method2022(this.aClass28_Sub2_1);
			this.aClass81_Sub1_37.method1953(0);
		}
		this.aClass76_1.method1586('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}
}
