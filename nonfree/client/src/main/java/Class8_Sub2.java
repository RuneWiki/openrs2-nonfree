import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "Lclient!ml;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "Lclient!h;")
	private final Class122 aClass122_1;

	@OriginalMember(owner = "client!bga", name = "n", descriptor = "Lclient!vi;")
	private final Class16_Sub3 aClass16_Sub3_1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!en;Lclient!h;)V")
	public Class8_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class122 arg1) {
		super(arg0);
		this.aClass122_1 = arg1;
		this.method665();
		this.aClass16_Sub3_1 = new Class16_Sub3(super.aClass90_Sub1_38, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass16_Sub3_1.method7702();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		if (super.aClass90_Sub1_38.anInt2455 > 0) {
			@Pc(18) float local18 = -0.5F / (float) super.aClass90_Sub1_38.anInt2455;
			super.aClass90_Sub1_38.method2069(1);
			Static259.aFloatArray41[3] = local18 * super.aClass90_Sub1_38.aFloat47 + 0.25F;
			Static259.aFloatArray41[2] = local18;
			Static259.aFloatArray41[1] = 0.0F;
			Static259.aFloatArray41[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static259.aFloatArray41, 0);
			OpenGL.glPopMatrix();
			super.aClass90_Sub1_38.method2106((float) super.aClass90_Sub1_38.anInt2455, 0.5F);
			super.aClass90_Sub1_38.method2126(this.aClass16_Sub3_1);
			super.aClass90_Sub1_38.method2069(0);
		}
		this.aClass204_1.method4982('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
	private void method665() {
		this.aClass204_1 = new Class204(super.aClass90_Sub1_38, 2);
		this.aClass204_1.method4985(0);
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2120(260, 7681);
		super.aClass90_Sub1_38.method2119(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass90_Sub1_38.method2069(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass122_1.aBoolean288) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass204_1.method4987();
		this.aClass204_1.method4985(1);
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2120(8448, 8448);
		super.aClass90_Sub1_38.method2119(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass90_Sub1_38.method2069(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass122_1.aBoolean288) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass204_1.method4987();
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		this.aClass204_1.method4982('\u0001');
		if (super.aClass90_Sub1_38.anInt2455 > 0) {
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(null);
			super.aClass90_Sub1_38.method2106(0.0F, 1.0F);
			super.aClass90_Sub1_38.method2069(0);
		}
		super.aClass90_Sub1_38.method2120(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass122_1.aBoolean288) {
				super.aClass90_Sub1_38.method2126(this.aClass122_1.aClass16_Sub2_3);
				Static259.aFloatArray41[0] = 0.0F;
				Static259.aFloatArray41[2] = 0.0F;
				Static259.aFloatArray41[1] = 0.0F;
				Static259.aFloatArray41[3] = (float) (super.aClass90_Sub1_38.anInt2434 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static259.aFloatArray41, 0);
			} else {
				@Pc(63) int local63 = super.aClass90_Sub1_38.anInt2434 % 4000 * 16 / 4000;
				super.aClass90_Sub1_38.method2126(this.aClass122_1.aClass16_Sub1Array2[local63]);
			}
		} else if (this.aClass122_1.aBoolean288) {
			super.aClass90_Sub1_38.method2126(this.aClass122_1.aClass16_Sub2_3);
			Static259.aFloatArray41[3] = 0.0F;
			Static259.aFloatArray41[2] = 0.0F;
			Static259.aFloatArray41[1] = 0.0F;
			Static259.aFloatArray41[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static259.aFloatArray41, 0);
		} else {
			super.aClass90_Sub1_38.method2126(this.aClass122_1.aClass16_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub1_38.method2120(8448, 260);
	}
}
