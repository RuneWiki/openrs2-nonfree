import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class100_Sub9 extends Class100 {

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "Lclient!cs;")
	private Class49 aClass49_6;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "Lclient!jq;")
	private final Class135 aClass135_6;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "Lclient!fh;")
	private final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!ih;Lclient!jq;)V")
	public Class100_Sub9(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_6 = arg1;
		this.method6162();
		this.aClass8_Sub2_1 = new Class8_Sub2(super.aClass106_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass8_Sub2_1.method1870();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass135_6.aBoolean251) {
				super.aClass106_Sub2_43.method2912(this.aClass135_6.aClass8_Sub4_2);
				Static122.aFloatArray14[0] = 0.0F;
				Static122.aFloatArray14[3] = (float) (super.aClass106_Sub2_43.anInt3735 % 4000) / 4000.0F;
				Static122.aFloatArray14[1] = 0.0F;
				Static122.aFloatArray14[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static122.aFloatArray14, 0);
			} else {
				@Pc(57) int local57 = super.aClass106_Sub2_43.anInt3735 % 4000 * 16 / 4000;
				super.aClass106_Sub2_43.method2912(this.aClass135_6.aClass8_Sub1Array2[local57]);
			}
		} else if (this.aClass135_6.aBoolean251) {
			super.aClass106_Sub2_43.method2912(this.aClass135_6.aClass8_Sub4_2);
			Static122.aFloatArray14[3] = 0.0F;
			Static122.aFloatArray14[1] = 0.0F;
			Static122.aFloatArray14[0] = 0.0F;
			Static122.aFloatArray14[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static122.aFloatArray14, 0);
		} else {
			super.aClass106_Sub2_43.method2912(this.aClass135_6.aClass8_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
		super.aClass106_Sub2_43.method2923(260, 8448);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	private void method6162() {
		this.aClass49_6 = new Class49(super.aClass106_Sub2_43, 2);
		this.aClass49_6.method1154(0);
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2923(7681, 260);
		super.aClass106_Sub2_43.method2915(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass106_Sub2_43.method2881(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass135_6.aBoolean251) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass49_6.method1151();
		this.aClass49_6.method1154(1);
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2923(8448, 8448);
		super.aClass106_Sub2_43.method2915(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass106_Sub2_43.method2881(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass135_6.aBoolean251) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass49_6.method1151();
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		this.aClass49_6.method1153('\u0001');
		if (super.aClass106_Sub2_43.anInt3773 > 0) {
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(null);
			super.aClass106_Sub2_43.method2890(0.0F, 1.0F);
			super.aClass106_Sub2_43.method2881(0);
		}
		super.aClass106_Sub2_43.method2923(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		if (super.aClass106_Sub2_43.anInt3773 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass106_Sub2_43.anInt3773;
			super.aClass106_Sub2_43.method2881(1);
			Static122.aFloatArray14[1] = 0.0F;
			Static122.aFloatArray14[2] = local17;
			Static122.aFloatArray14[3] = local17 * super.aClass106_Sub2_43.aFloat44 + 0.25F;
			Static122.aFloatArray14[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static122.aFloatArray14, 0);
			OpenGL.glPopMatrix();
			super.aClass106_Sub2_43.method2890((float) super.aClass106_Sub2_43.anInt3773, 0.5F);
			super.aClass106_Sub2_43.method2912(this.aClass8_Sub2_1);
			super.aClass106_Sub2_43.method2881(0);
		}
		this.aClass49_6.method1153('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
	}
}
