import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class67_Sub5 extends Class67 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!cq;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!c;")
	private final Class31 aClass31_2;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!jb;")
	private final Class81_Sub2 aClass81_Sub2_1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!cg;Lclient!c;)V")
	public Class67_Sub5(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass31_2 = arg1;
		this.method3616();
		this.aClass81_Sub2_1 = new Class81_Sub2(this.aClass37_Sub1_27, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass81_Sub2_1.method2871();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_4.method948('\u0001');
		if (this.aClass37_Sub1_27.anInt654 > 0) {
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(null);
			this.aClass37_Sub1_27.method786(1.0F, 0.0F);
			this.aClass37_Sub1_27.method759(0);
		}
		this.aClass37_Sub1_27.method735(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass31_2.aBoolean45) {
				this.aClass37_Sub1_27.method767(this.aClass31_2.aClass81_Sub3_2);
				Static194.aFloatArray17[0] = 0.0F;
				Static194.aFloatArray17[1] = 0.0F;
				Static194.aFloatArray17[2] = 0.0F;
				Static194.aFloatArray17[3] = (float) (this.aClass37_Sub1_27.anInt638 % 4000) / 4000.0F;
				this.aClass37_Sub1_27.anOpengl1.glTexGenfv(8194, 9473, Static194.aFloatArray17, 0);
			} else {
				@Pc(56) int local56 = this.aClass37_Sub1_27.anInt638 % 4000 * 16 / 4000;
				this.aClass37_Sub1_27.method767(this.aClass31_2.aClass81_Sub4Array2[local56]);
			}
		} else if (this.aClass31_2.aBoolean45) {
			this.aClass37_Sub1_27.method767(this.aClass31_2.aClass81_Sub3_2);
			Static194.aFloatArray17[0] = 0.0F;
			Static194.aFloatArray17[1] = 0.0F;
			Static194.aFloatArray17[2] = 0.0F;
			Static194.aFloatArray17[3] = 0.0F;
			this.aClass37_Sub1_27.anOpengl1.glTexGenfv(8194, 9473, Static194.aFloatArray17, 0);
		} else {
			this.aClass37_Sub1_27.method767(this.aClass31_2.aClass81_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_27.anOpengl1;
		if (this.aClass37_Sub1_27.anInt654 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass37_Sub1_27.anInt654;
			this.aClass37_Sub1_27.method759(1);
			Static194.aFloatArray17[0] = 0.0F;
			Static194.aFloatArray17[1] = 0.0F;
			Static194.aFloatArray17[2] = local14;
			Static194.aFloatArray17[3] = this.aClass37_Sub1_27.aFloat11 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static194.aFloatArray17, 0);
			local3.glPopMatrix();
			this.aClass37_Sub1_27.method786(0.5F, (float) this.aClass37_Sub1_27.anInt654);
			this.aClass37_Sub1_27.method767(this.aClass81_Sub2_1);
			this.aClass37_Sub1_27.method759(0);
		}
		this.aClass45_4.method948('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	private void method3616() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_4 = new Class45(this.aClass37_Sub1_27, 2);
		this.aClass45_4.method947(0);
		this.aClass37_Sub1_27.method759(1);
		this.aClass37_Sub1_27.method735(7681, 260);
		this.aClass37_Sub1_27.method732(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass37_Sub1_27.method759(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass31_2.aBoolean45) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass45_4.method949();
		this.aClass45_4.method947(1);
		this.aClass37_Sub1_27.method759(1);
		this.aClass37_Sub1_27.method735(8448, 8448);
		this.aClass37_Sub1_27.method732(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass37_Sub1_27.method759(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass31_2.aBoolean45) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass45_4.method949();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
		this.aClass37_Sub1_27.method735(260, 8448);
	}
}
