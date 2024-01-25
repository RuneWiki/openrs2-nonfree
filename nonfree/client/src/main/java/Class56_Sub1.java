import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!ub;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "Lclient!me;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!ut;")
	private final Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!ad;Lclient!me;)V")
	public Class56_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class190 arg1) {
		super(arg0);
		this.aClass190_1 = arg1;
		this.method1825();
		this.aClass11_Sub3_1 = new Class11_Sub3(super.aClass5_Sub1_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass11_Sub3_1.method7212();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		this.aClass291_1.method7122('\u0001');
		if (super.aClass5_Sub1_39.anInt398 > 0) {
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(null);
			super.aClass5_Sub1_39.method408(1.0F, 0.0F);
			super.aClass5_Sub1_39.method397(0);
		}
		super.aClass5_Sub1_39.method448(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_39.method448(8448, 260);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass190_1.aBoolean385) {
				super.aClass5_Sub1_39.method423(this.aClass190_1.aClass11_Sub2_2);
				Static473.aFloatArray68[2] = 0.0F;
				Static473.aFloatArray68[3] = (float) (super.aClass5_Sub1_39.anInt377 % 4000) / 4000.0F;
				Static473.aFloatArray68[0] = 0.0F;
				Static473.aFloatArray68[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static473.aFloatArray68, 0);
			} else {
				@Pc(104) int local104 = super.aClass5_Sub1_39.anInt377 % 4000 * 16 / 4000;
				super.aClass5_Sub1_39.method423(this.aClass190_1.aClass11_Sub1Array4[local104]);
			}
		} else if (this.aClass190_1.aBoolean385) {
			super.aClass5_Sub1_39.method423(this.aClass190_1.aClass11_Sub2_2);
			Static473.aFloatArray68[3] = 0.0F;
			Static473.aFloatArray68[2] = 0.0F;
			Static473.aFloatArray68[1] = 0.0F;
			Static473.aFloatArray68[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static473.aFloatArray68, 0);
		} else {
			super.aClass5_Sub1_39.method423(this.aClass190_1.aClass11_Sub1Array4[0]);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	private void method1825() {
		this.aClass291_1 = new Class291(super.aClass5_Sub1_39, 2);
		this.aClass291_1.method7121(0);
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method448(260, 7681);
		super.aClass5_Sub1_39.method419(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass5_Sub1_39.method397(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass190_1.aBoolean385) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass291_1.method7124();
		this.aClass291_1.method7121(1);
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method448(8448, 8448);
		super.aClass5_Sub1_39.method419(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass5_Sub1_39.method397(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass190_1.aBoolean385) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass291_1.method7124();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		if (super.aClass5_Sub1_39.anInt398 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass5_Sub1_39.anInt398;
			super.aClass5_Sub1_39.method397(1);
			Static473.aFloatArray68[0] = 0.0F;
			Static473.aFloatArray68[3] = super.aClass5_Sub1_39.aFloat24 * local10 + 0.25F;
			Static473.aFloatArray68[1] = 0.0F;
			Static473.aFloatArray68[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static473.aFloatArray68, 0);
			OpenGL.glPopMatrix();
			super.aClass5_Sub1_39.method408(0.5F, (float) super.aClass5_Sub1_39.anInt398);
			super.aClass5_Sub1_39.method423(this.aClass11_Sub3_1);
			super.aClass5_Sub1_39.method397(0);
		}
		this.aClass291_1.method7122('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
