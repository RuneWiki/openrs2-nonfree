import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class60_Sub5 extends Class60 {

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "Lclient!qda;")
	private Class266 aClass266_3;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Lclient!dk;")
	private final Class69 aClass69_5;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lclient!wf;")
	private final Class51_Sub4 aClass51_Sub4_1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!jaa;Lclient!dk;)V")
	public Class60_Sub5(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass69_5 = arg1;
		this.method4850();
		this.aClass51_Sub4_1 = new Class51_Sub4(super.aClass14_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass51_Sub4_1.method7739();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		if (super.aClass14_Sub3_42.anInt4593 > 0) {
			@Pc(18) float local18 = -0.5F / (float) super.aClass14_Sub3_42.anInt4593;
			super.aClass14_Sub3_42.method3917(1);
			Static254.aFloatArray58[2] = local18;
			Static254.aFloatArray58[3] = local18 * super.aClass14_Sub3_42.aFloat105 + 0.25F;
			Static254.aFloatArray58[0] = 0.0F;
			Static254.aFloatArray58[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static254.aFloatArray58, 0);
			OpenGL.glPopMatrix();
			super.aClass14_Sub3_42.method3957(0.5F, (float) super.aClass14_Sub3_42.anInt4593);
			super.aClass14_Sub3_42.method3985(this.aClass51_Sub4_1);
			super.aClass14_Sub3_42.method3917(0);
		}
		this.aClass266_3.method5987('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass69_5.aBoolean127) {
				super.aClass14_Sub3_42.method3985(this.aClass69_5.aClass51_Sub2_1);
				Static254.aFloatArray58[1] = 0.0F;
				Static254.aFloatArray58[0] = 0.0F;
				Static254.aFloatArray58[2] = 0.0F;
				Static254.aFloatArray58[3] = (float) (super.aClass14_Sub3_42.anInt4557 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static254.aFloatArray58, 0);
			} else {
				@Pc(71) int local71 = super.aClass14_Sub3_42.anInt4557 % 4000 * 16 / 4000;
				super.aClass14_Sub3_42.method3985(this.aClass69_5.aClass51_Sub1Array1[local71]);
			}
		} else if (this.aClass69_5.aBoolean127) {
			super.aClass14_Sub3_42.method3985(this.aClass69_5.aClass51_Sub2_1);
			Static254.aFloatArray58[3] = 0.0F;
			Static254.aFloatArray58[2] = 0.0F;
			Static254.aFloatArray58[1] = 0.0F;
			Static254.aFloatArray58[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static254.aFloatArray58, 0);
		} else {
			super.aClass14_Sub3_42.method3985(this.aClass69_5.aClass51_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	private void method4850() {
		this.aClass266_3 = new Class266(super.aClass14_Sub3_42, 2);
		this.aClass266_3.method5983(0);
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3976(7681, 260);
		super.aClass14_Sub3_42.method3966(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass14_Sub3_42.method3917(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass69_5.aBoolean127) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass266_3.method5989();
		this.aClass266_3.method5983(1);
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3976(8448, 8448);
		super.aClass14_Sub3_42.method3966(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass14_Sub3_42.method3917(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass69_5.aBoolean127) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass266_3.method5989();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub3_42.method3976(260, 8448);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		this.aClass266_3.method5987('\u0001');
		if (super.aClass14_Sub3_42.anInt4593 > 0) {
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(null);
			super.aClass14_Sub3_42.method3957(1.0F, 0.0F);
			super.aClass14_Sub3_42.method3917(0);
		}
		super.aClass14_Sub3_42.method3976(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
