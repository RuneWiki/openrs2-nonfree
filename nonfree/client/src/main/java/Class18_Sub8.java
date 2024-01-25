import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class18_Sub8 extends Class18 {

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "Lclient!rj;")
	private Class303 aClass303_5;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!fa;")
	private final Class101 aClass101_5;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!gw;")
	private final Class65_Sub3 aClass65_Sub3_1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!ep;Lclient!fa;)V")
	public Class18_Sub8(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class101 arg1) {
		super(arg0);
		this.aClass101_5 = arg1;
		this.method4838();
		this.aClass65_Sub3_1 = new Class65_Sub3(super.aClass95_Sub1_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass65_Sub3_1.method2821();
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		this.aClass303_5.method6856('\u0001');
		if (super.aClass95_Sub1_39.anInt2540 > 0) {
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(null);
			super.aClass95_Sub1_39.method2084(0.0F, 1.0F);
			super.aClass95_Sub1_39.method2098(0);
		}
		super.aClass95_Sub1_39.method2105(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub1_39.method2105(260, 8448);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass101_5.aBoolean204) {
				super.aClass95_Sub1_39.method2077(this.aClass101_5.aClass65_Sub2_2);
				Static374.aFloatArray27[1] = 0.0F;
				Static374.aFloatArray27[3] = (float) (super.aClass95_Sub1_39.anInt2513 % 4000) / 4000.0F;
				Static374.aFloatArray27[2] = 0.0F;
				Static374.aFloatArray27[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static374.aFloatArray27, 0);
			} else {
				@Pc(22) int local22 = super.aClass95_Sub1_39.anInt2513 % 4000 * 16 / 4000;
				super.aClass95_Sub1_39.method2077(this.aClass101_5.aClass65_Sub1Array1[local22]);
			}
		} else if (this.aClass101_5.aBoolean204) {
			super.aClass95_Sub1_39.method2077(this.aClass101_5.aClass65_Sub2_2);
			Static374.aFloatArray27[0] = 0.0F;
			Static374.aFloatArray27[3] = 0.0F;
			Static374.aFloatArray27[1] = 0.0F;
			Static374.aFloatArray27[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static374.aFloatArray27, 0);
		} else {
			super.aClass95_Sub1_39.method2077(this.aClass101_5.aClass65_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	private void method4838() {
		this.aClass303_5 = new Class303(super.aClass95_Sub1_39, 2);
		this.aClass303_5.method6859(0);
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2105(7681, 260);
		super.aClass95_Sub1_39.method2101(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass95_Sub1_39.method2098(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass101_5.aBoolean204) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass303_5.method6857();
		this.aClass303_5.method6859(1);
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2105(8448, 8448);
		super.aClass95_Sub1_39.method2101(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass95_Sub1_39.method2098(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass101_5.aBoolean204) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass303_5.method6857();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		if (super.aClass95_Sub1_39.anInt2540 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass95_Sub1_39.anInt2540;
			super.aClass95_Sub1_39.method2098(1);
			Static374.aFloatArray27[1] = 0.0F;
			Static374.aFloatArray27[3] = local17 * super.aClass95_Sub1_39.aFloat41 + 0.25F;
			Static374.aFloatArray27[2] = local17;
			Static374.aFloatArray27[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static374.aFloatArray27, 0);
			OpenGL.glPopMatrix();
			super.aClass95_Sub1_39.method2084((float) super.aClass95_Sub1_39.anInt2540, 0.5F);
			super.aClass95_Sub1_39.method2077(this.aClass65_Sub3_1);
			super.aClass95_Sub1_39.method2098(0);
		}
		this.aClass303_5.method6856('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
