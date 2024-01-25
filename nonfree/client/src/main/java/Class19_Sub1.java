import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!ee;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!b;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!ph;")
	private final Class44_Sub4 aClass44_Sub4_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!kv;Lclient!b;)V")
	public Class19_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class25 arg1) {
		super(arg0);
		this.aClass25_1 = arg1;
		this.method350();
		this.aClass44_Sub4_1 = new Class44_Sub4(super.aClass143_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass44_Sub4_1.method6709();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		if (super.aClass143_Sub2_39.anInt5838 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass143_Sub2_39.anInt5838;
			super.aClass143_Sub2_39.method4930(1);
			Static225.aFloatArray15[3] = local14 * super.aClass143_Sub2_39.aFloat101 + 0.25F;
			Static225.aFloatArray15[2] = local14;
			Static225.aFloatArray15[0] = 0.0F;
			Static225.aFloatArray15[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static225.aFloatArray15, 0);
			OpenGL.glPopMatrix();
			super.aClass143_Sub2_39.method4965((float) super.aClass143_Sub2_39.anInt5838, 0.5F);
			super.aClass143_Sub2_39.method4945(this.aClass44_Sub4_1);
			super.aClass143_Sub2_39.method4930(0);
		}
		this.aClass93_1.method1952('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub2_39.method4940(260, 8448);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		this.aClass93_1.method1952('\u0001');
		if (super.aClass143_Sub2_39.anInt5838 > 0) {
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945((Class44) null);
			super.aClass143_Sub2_39.method4965(0.0F, 1.0F);
			super.aClass143_Sub2_39.method4930(0);
		}
		super.aClass143_Sub2_39.method4940(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	private void method350() {
		this.aClass93_1 = new Class93(super.aClass143_Sub2_39, 2);
		this.aClass93_1.method1950(0);
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4940(7681, 260);
		super.aClass143_Sub2_39.method4947(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass143_Sub2_39.method4930(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass25_1.aBoolean17) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass93_1.method1948();
		this.aClass93_1.method1950(1);
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4940(8448, 8448);
		super.aClass143_Sub2_39.method4947(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass143_Sub2_39.method4930(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass25_1.aBoolean17) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass93_1.method1948();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass25_1.aBoolean17) {
				super.aClass143_Sub2_39.method4945(this.aClass25_1.aClass44_Sub2_1);
				Static225.aFloatArray15[0] = 0.0F;
				Static225.aFloatArray15[3] = (float) (super.aClass143_Sub2_39.anInt5822 % 4000) / 4000.0F;
				Static225.aFloatArray15[1] = 0.0F;
				Static225.aFloatArray15[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static225.aFloatArray15, 0);
			} else {
				@Pc(65) int local65 = super.aClass143_Sub2_39.anInt5822 % 4000 * 16 / 4000;
				super.aClass143_Sub2_39.method4945(this.aClass25_1.aClass44_Sub1Array2[local65]);
			}
		} else if (this.aClass25_1.aBoolean17) {
			super.aClass143_Sub2_39.method4945(this.aClass25_1.aClass44_Sub2_1);
			Static225.aFloatArray15[1] = 0.0F;
			Static225.aFloatArray15[2] = 0.0F;
			Static225.aFloatArray15[0] = 0.0F;
			Static225.aFloatArray15[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static225.aFloatArray15, 0);
		} else {
			super.aClass143_Sub2_39.method4945(this.aClass25_1.aClass44_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}
}
