import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class56_Sub9 extends Class56 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Lclient!wu;")
	private Class269 aClass269_6;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Lclient!go;")
	private final Class96 aClass96_6;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!hu;")
	private final Class13_Sub3 aClass13_Sub3_1;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ht;Lclient!go;)V")
	public Class56_Sub9(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_6 = arg1;
		this.method5091();
		this.aClass13_Sub3_1 = new Class13_Sub3(super.aClass109_Sub1_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass13_Sub3_1.method2620();
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass96_6.aBoolean124) {
				super.aClass109_Sub1_41.method2578(this.aClass96_6.aClass13_Sub2_3);
				Static366.aFloatArray30[2] = 0.0F;
				Static366.aFloatArray30[0] = 0.0F;
				Static366.aFloatArray30[3] = (float) (super.aClass109_Sub1_41.anInt2974 % 4000) / 4000.0F;
				Static366.aFloatArray30[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static366.aFloatArray30, 0);
			} else {
				@Pc(112) int local112 = super.aClass109_Sub1_41.anInt2974 % 4000 * 16 / 4000;
				super.aClass109_Sub1_41.method2578(this.aClass96_6.aClass13_Sub1Array3[local112]);
			}
		} else if (this.aClass96_6.aBoolean124) {
			super.aClass109_Sub1_41.method2578(this.aClass96_6.aClass13_Sub2_3);
			Static366.aFloatArray30[0] = 0.0F;
			Static366.aFloatArray30[2] = 0.0F;
			Static366.aFloatArray30[3] = 0.0F;
			Static366.aFloatArray30[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static366.aFloatArray30, 0);
		} else {
			super.aClass109_Sub1_41.method2578(this.aClass96_6.aClass13_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		if (super.aClass109_Sub1_41.anInt3005 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass109_Sub1_41.anInt3005;
			super.aClass109_Sub1_41.method2564(1);
			Static366.aFloatArray30[2] = local10;
			Static366.aFloatArray30[0] = 0.0F;
			Static366.aFloatArray30[1] = 0.0F;
			Static366.aFloatArray30[3] = super.aClass109_Sub1_41.aFloat46 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static366.aFloatArray30, 0);
			OpenGL.glPopMatrix();
			super.aClass109_Sub1_41.method2590((float) super.aClass109_Sub1_41.anInt3005, 0.5F);
			super.aClass109_Sub1_41.method2578(this.aClass13_Sub3_1);
			super.aClass109_Sub1_41.method2564(0);
		}
		this.aClass269_6.method6088('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		this.aClass269_6.method6088('\u0001');
		if (super.aClass109_Sub1_41.anInt3005 > 0) {
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(null);
			super.aClass109_Sub1_41.method2590(0.0F, 1.0F);
			super.aClass109_Sub1_41.method2564(0);
		}
		super.aClass109_Sub1_41.method2549(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
		super.aClass109_Sub1_41.method2549(260, 8448);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V")
	private void method5091() {
		this.aClass269_6 = new Class269(super.aClass109_Sub1_41, 2);
		this.aClass269_6.method6086(0);
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2549(7681, 260);
		super.aClass109_Sub1_41.method2528(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass109_Sub1_41.method2564(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass96_6.aBoolean124) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass269_6.method6090();
		this.aClass269_6.method6086(1);
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2549(8448, 8448);
		super.aClass109_Sub1_41.method2528(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass109_Sub1_41.method2564(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass96_6.aBoolean124) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass269_6.method6090();
	}
}
