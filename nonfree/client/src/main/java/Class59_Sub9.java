import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class59_Sub9 extends Class59 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!vh;")
	private Class365 aClass365_6;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!lha;")
	private final Class213 aClass213_6;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Lclient!afa;")
	private final Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!bi;Lclient!lha;)V")
	public Class59_Sub9(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_6 = arg1;
		this.method8594();
		this.aClass10_Sub1_1 = new Class10_Sub1(super.aClass13_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass10_Sub1_1.method144();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	private void method8594() {
		this.aClass365_6 = new Class365(super.aClass13_Sub2_43, 2);
		this.aClass365_6.method8546(0);
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1045(7681, 260);
		super.aClass13_Sub2_43.method1021(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass13_Sub2_43.method1093(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass213_6.aBoolean413) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass365_6.method8549();
		this.aClass365_6.method8546(1);
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1045(8448, 8448);
		super.aClass13_Sub2_43.method1021(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass13_Sub2_43.method1093(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass213_6.aBoolean413) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass365_6.method8549();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass213_6.aBoolean413) {
				super.aClass13_Sub2_43.method1096(this.aClass213_6.aClass10_Sub4_2);
				Static388.aFloatArray54[0] = 0.0F;
				Static388.aFloatArray54[1] = 0.0F;
				Static388.aFloatArray54[2] = 0.0F;
				Static388.aFloatArray54[3] = (float) (super.aClass13_Sub2_43.anInt1076 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static388.aFloatArray54, 0);
			} else {
				@Pc(106) int local106 = super.aClass13_Sub2_43.anInt1076 % 4000 * 16 / 4000;
				super.aClass13_Sub2_43.method1096(this.aClass213_6.aClass10_Sub2Array3[local106]);
			}
		} else if (this.aClass213_6.aBoolean413) {
			super.aClass13_Sub2_43.method1096(this.aClass213_6.aClass10_Sub4_2);
			Static388.aFloatArray54[0] = 0.0F;
			Static388.aFloatArray54[1] = 0.0F;
			Static388.aFloatArray54[2] = 0.0F;
			Static388.aFloatArray54[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static388.aFloatArray54, 0);
		} else {
			super.aClass13_Sub2_43.method1096(this.aClass213_6.aClass10_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub2_43.method1045(260, 8448);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		if (super.aClass13_Sub2_43.anInt1088 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass13_Sub2_43.anInt1088;
			super.aClass13_Sub2_43.method1093(1);
			Static388.aFloatArray54[2] = local14;
			Static388.aFloatArray54[1] = 0.0F;
			Static388.aFloatArray54[3] = local14 * super.aClass13_Sub2_43.aFloat15 + 0.25F;
			Static388.aFloatArray54[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static388.aFloatArray54, 0);
			OpenGL.glPopMatrix();
			super.aClass13_Sub2_43.method1036(0.5F, (float) super.aClass13_Sub2_43.anInt1088);
			super.aClass13_Sub2_43.method1096(this.aClass10_Sub1_1);
			super.aClass13_Sub2_43.method1093(0);
		}
		this.aClass365_6.method8548('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		this.aClass365_6.method8548('\u0001');
		if (super.aClass13_Sub2_43.anInt1088 > 0) {
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096((Class10) null);
			super.aClass13_Sub2_43.method1036(1.0F, 0.0F);
			super.aClass13_Sub2_43.method1093(0);
		}
		super.aClass13_Sub2_43.method1045(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
