import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class75_Sub7 extends Class75 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "Lclient!pm;")
	private final Class256 aClass256_6;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!uj;")
	private final Class328 aClass328_5;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!ji;Lclient!pm;)V")
	public Class75_Sub7(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class256 arg1) {
		super(arg0);
		this.aClass256_6 = arg1;
		this.aClass328_5 = new Class328(arg0, 2);
		this.aClass328_5.method7870(0);
		super.aClass15_Sub3_42.method4458(1);
		if (this.aClass256_6.aBoolean664) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass15_Sub3_42.method4458(0);
		this.aClass328_5.method7868();
		this.aClass328_5.method7870(1);
		super.aClass15_Sub3_42.method4458(1);
		if (this.aClass256_6.aBoolean664) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass15_Sub3_42.method4458(0);
		this.aClass328_5.method7868();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		this.aClass328_5.method7872('\u0001');
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4377(null);
		super.aClass15_Sub3_42.method4458(0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass15_Sub3_42.method4458(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static130.aFloatArray9[0] = local36;
			Static130.aFloatArray9[3] = 0.0F;
			Static130.aFloatArray9[1] = 0.0F;
			Static130.aFloatArray9[2] = 0.0F;
		} else {
			Static130.aFloatArray9[3] = 0.0F;
			Static130.aFloatArray9[2] = local36;
			Static130.aFloatArray9[1] = 0.0F;
			Static130.aFloatArray9[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static130.aFloatArray9, 0);
		Static130.aFloatArray9[1] = local36;
		Static130.aFloatArray9[3] = (float) super.aClass15_Sub3_42.anInt5325 * local14 % 1.0F;
		Static130.aFloatArray9[0] = 0.0F;
		Static130.aFloatArray9[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static130.aFloatArray9, 0);
		if (this.aClass256_6.aBoolean664) {
			Static130.aFloatArray9[2] = 0.0F;
			Static130.aFloatArray9[3] = local25 * (float) super.aClass15_Sub3_42.anInt5325 % 1.0F;
			Static130.aFloatArray9[0] = 0.0F;
			Static130.aFloatArray9[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static130.aFloatArray9, 0);
		} else {
			@Pc(132) int local132 = (int) ((float) super.aClass15_Sub3_42.anInt5325 * local25 * 16.0F);
			super.aClass15_Sub3_42.method4377(this.aClass256_6.aClass11_Sub2Array4[local132 % 16]);
		}
		super.aClass15_Sub3_42.method4458(0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		this.aClass328_5.method7872('\u0000');
		if (this.aClass256_6.aBoolean664) {
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(this.aClass256_6.aClass11_Sub4_3);
			super.aClass15_Sub3_42.method4458(0);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass15_Sub3_42.method4377(arg1);
		super.aClass15_Sub3_42.method4432(arg0);
	}
}
