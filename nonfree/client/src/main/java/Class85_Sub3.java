import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class85_Sub3 extends Class85 {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "Lclient!qm;")
	private Class285 aClass285_2;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "Lclient!ud;")
	private final Class329 aClass329_1;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!cp;")
	private final Class46_Sub1 aClass46_Sub1_1;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!lj;Lclient!ud;)V")
	public Class85_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_1 = arg1;
		this.method2541();
		this.aClass46_Sub1_1 = new Class46_Sub1(super.aClass78_Sub3_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass46_Sub1_1.method1164();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass329_1.aBoolean670) {
				super.aClass78_Sub3_37.method4535(this.aClass329_1.aClass46_Sub3_2);
				Static7.aFloatArray1[0] = 0.0F;
				Static7.aFloatArray1[3] = (float) (super.aClass78_Sub3_37.anInt5559 % 4000) / 4000.0F;
				Static7.aFloatArray1[1] = 0.0F;
				Static7.aFloatArray1[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static7.aFloatArray1, 0);
			} else {
				@Pc(72) int local72 = super.aClass78_Sub3_37.anInt5559 % 4000 * 16 / 4000;
				super.aClass78_Sub3_37.method4535(this.aClass329_1.aClass46_Sub2Array3[local72]);
			}
		} else if (this.aClass329_1.aBoolean670) {
			super.aClass78_Sub3_37.method4535(this.aClass329_1.aClass46_Sub3_2);
			Static7.aFloatArray1[0] = 0.0F;
			Static7.aFloatArray1[1] = 0.0F;
			Static7.aFloatArray1[2] = 0.0F;
			Static7.aFloatArray1[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static7.aFloatArray1, 0);
		} else {
			super.aClass78_Sub3_37.method4535(this.aClass329_1.aClass46_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		this.aClass285_2.method6136('\u0001');
		if (super.aClass78_Sub3_37.anInt5578 > 0) {
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(null);
			super.aClass78_Sub3_37.method4511(1.0F, 0.0F);
			super.aClass78_Sub3_37.method4549(0);
		}
		super.aClass78_Sub3_37.method4539(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		if (super.aClass78_Sub3_37.anInt5578 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass78_Sub3_37.anInt5578;
			super.aClass78_Sub3_37.method4549(1);
			Static7.aFloatArray1[2] = local17;
			Static7.aFloatArray1[1] = 0.0F;
			Static7.aFloatArray1[3] = local17 * super.aClass78_Sub3_37.aFloat154 + 0.25F;
			Static7.aFloatArray1[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static7.aFloatArray1, 0);
			OpenGL.glPopMatrix();
			super.aClass78_Sub3_37.method4511(0.5F, (float) super.aClass78_Sub3_37.anInt5578);
			super.aClass78_Sub3_37.method4535(this.aClass46_Sub1_1);
			super.aClass78_Sub3_37.method4549(0);
		}
		this.aClass285_2.method6136('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V")
	private void method2541() {
		this.aClass285_2 = new Class285(super.aClass78_Sub3_37, 2);
		this.aClass285_2.method6137(0);
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4539(7681, 260);
		super.aClass78_Sub3_37.method4493(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass78_Sub3_37.method4549(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass329_1.aBoolean670) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass285_2.method6133();
		this.aClass285_2.method6137(1);
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4539(8448, 8448);
		super.aClass78_Sub3_37.method4493(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass78_Sub3_37.method4549(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass329_1.aBoolean670) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass285_2.method6133();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub3_37.method4539(260, 8448);
	}
}
