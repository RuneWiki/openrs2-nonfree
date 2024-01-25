import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!tm;")
	private Class239 aClass239_1;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!ai;")
	private final Class9 aClass9_2;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!qv;")
	private final Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!da;Lclient!ai;)V")
	public Class29_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class9 arg1) {
		super(arg0);
		this.aClass9_2 = arg1;
		this.method857();
		this.aClass4_Sub4_1 = new Class4_Sub4(super.aClass50_Sub1_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass4_Sub4_1.method4587();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		if (super.aClass50_Sub1_37.anInt1426 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass50_Sub1_37.anInt1426;
			super.aClass50_Sub1_37.method1300(1);
			Static302.aFloatArray29[2] = local17;
			Static302.aFloatArray29[1] = 0.0F;
			Static302.aFloatArray29[3] = local17 * super.aClass50_Sub1_37.aFloat26 + 0.25F;
			Static302.aFloatArray29[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static302.aFloatArray29, 0);
			OpenGL.glPopMatrix();
			super.aClass50_Sub1_37.method1313(0.5F, (float) super.aClass50_Sub1_37.anInt1426);
			super.aClass50_Sub1_37.method1295(this.aClass4_Sub4_1);
			super.aClass50_Sub1_37.method1300(0);
		}
		this.aClass239_1.method5224('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass9_2.aBoolean7) {
				super.aClass50_Sub1_37.method1295(this.aClass9_2.aClass4_Sub3_2);
				Static302.aFloatArray29[2] = 0.0F;
				Static302.aFloatArray29[3] = (float) (super.aClass50_Sub1_37.anInt1403 % 4000) / 4000.0F;
				Static302.aFloatArray29[1] = 0.0F;
				Static302.aFloatArray29[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static302.aFloatArray29, 0);
			} else {
				@Pc(28) int local28 = super.aClass50_Sub1_37.anInt1403 % 4000 * 16 / 4000;
				super.aClass50_Sub1_37.method1295(this.aClass9_2.aClass4_Sub1Array2[local28]);
			}
		} else if (this.aClass9_2.aBoolean7) {
			super.aClass50_Sub1_37.method1295(this.aClass9_2.aClass4_Sub3_2);
			Static302.aFloatArray29[1] = 0.0F;
			Static302.aFloatArray29[3] = 0.0F;
			Static302.aFloatArray29[2] = 0.0F;
			Static302.aFloatArray29[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static302.aFloatArray29, 0);
		} else {
			super.aClass50_Sub1_37.method1295(this.aClass9_2.aClass4_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		this.aClass239_1.method5224('\u0001');
		if (super.aClass50_Sub1_37.anInt1426 > 0) {
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(null);
			super.aClass50_Sub1_37.method1313(1.0F, 0.0F);
			super.aClass50_Sub1_37.method1300(0);
		}
		super.aClass50_Sub1_37.method1316(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
		super.aClass50_Sub1_37.method1316(260, 8448);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	private void method857() {
		this.aClass239_1 = new Class239(super.aClass50_Sub1_37, 2);
		this.aClass239_1.method5221(0);
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1316(7681, 260);
		super.aClass50_Sub1_37.method1309(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass50_Sub1_37.method1300(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass9_2.aBoolean7) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass239_1.method5222();
		this.aClass239_1.method5221(1);
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1316(8448, 8448);
		super.aClass50_Sub1_37.method1309(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass50_Sub1_37.method1300(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass9_2.aBoolean7) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass239_1.method5222();
	}
}
