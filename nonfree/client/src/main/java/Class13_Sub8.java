import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!tu", name = "v", descriptor = "Lclient!cn;")
	private Class51 aClass51_5;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "Lclient!ln;")
	private final Class184 aClass184_5;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!kba;")
	private final Class73_Sub2 aClass73_Sub2_1;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!uq;Lclient!ln;)V")
	public Class13_Sub8(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_5 = arg1;
		this.method6610();
		this.aClass73_Sub2_1 = new Class73_Sub2(super.aClass122_Sub3_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass73_Sub2_1.method4173();
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	private void method6610() {
		this.aClass51_5 = new Class51(super.aClass122_Sub3_40, 2);
		this.aClass51_5.method1250(0);
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6853(7681, 260);
		super.aClass122_Sub3_40.method6899(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass122_Sub3_40.method6932(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass184_5.aBoolean371) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass51_5.method1253();
		this.aClass51_5.method1250(1);
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6853(8448, 8448);
		super.aClass122_Sub3_40.method6899(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass122_Sub3_40.method6932(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass184_5.aBoolean371) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass51_5.method1253();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		this.aClass51_5.method1248('\u0001');
		if (super.aClass122_Sub3_40.anInt8430 > 0) {
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(null);
			super.aClass122_Sub3_40.method6861(1.0F, 0.0F);
			super.aClass122_Sub3_40.method6932(0);
		}
		super.aClass122_Sub3_40.method6853(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass184_5.aBoolean371) {
				super.aClass122_Sub3_40.method6850(this.aClass184_5.aClass73_Sub3_3);
				Static86.aFloatArray4[3] = (float) (super.aClass122_Sub3_40.anInt8419 % 4000) / 4000.0F;
				Static86.aFloatArray4[0] = 0.0F;
				Static86.aFloatArray4[2] = 0.0F;
				Static86.aFloatArray4[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static86.aFloatArray4, 0);
			} else {
				@Pc(59) int local59 = super.aClass122_Sub3_40.anInt8419 % 4000 * 16 / 4000;
				super.aClass122_Sub3_40.method6850(this.aClass184_5.aClass73_Sub1Array3[local59]);
			}
		} else if (this.aClass184_5.aBoolean371) {
			super.aClass122_Sub3_40.method6850(this.aClass184_5.aClass73_Sub3_3);
			Static86.aFloatArray4[0] = 0.0F;
			Static86.aFloatArray4[2] = 0.0F;
			Static86.aFloatArray4[1] = 0.0F;
			Static86.aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static86.aFloatArray4, 0);
		} else {
			super.aClass122_Sub3_40.method6850(this.aClass184_5.aClass73_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		if (super.aClass122_Sub3_40.anInt8430 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass122_Sub3_40.anInt8430;
			super.aClass122_Sub3_40.method6932(1);
			Static86.aFloatArray4[0] = 0.0F;
			Static86.aFloatArray4[1] = 0.0F;
			Static86.aFloatArray4[3] = local13 * super.aClass122_Sub3_40.aFloat172 + 0.25F;
			Static86.aFloatArray4[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static86.aFloatArray4, 0);
			OpenGL.glPopMatrix();
			super.aClass122_Sub3_40.method6861(0.5F, (float) super.aClass122_Sub3_40.anInt8430);
			super.aClass122_Sub3_40.method6850(this.aClass73_Sub2_1);
			super.aClass122_Sub3_40.method6932(0);
		}
		this.aClass51_5.method1248('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub3_40.method6853(260, 8448);
	}
}
