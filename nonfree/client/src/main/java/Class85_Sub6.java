import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class85_Sub6 extends Class85 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!ud;")
	private final Class329 aClass329_3;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!qm;")
	private final Class285 aClass285_5;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!lj;Lclient!ud;)V")
	public Class85_Sub6(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_3 = arg1;
		this.aClass285_5 = new Class285(arg0, 2);
		this.aClass285_5.method6137(0);
		super.aClass78_Sub3_37.method4549(1);
		if (this.aClass329_3.aBoolean670) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass78_Sub3_37.method4549(0);
		this.aClass285_5.method6133();
		this.aClass285_5.method6137(1);
		super.aClass78_Sub3_37.method4549(1);
		if (this.aClass329_3.aBoolean670) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass78_Sub3_37.method4549(0);
		this.aClass285_5.method6133();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		this.aClass285_5.method6136('\u0001');
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(null);
		super.aClass78_Sub3_37.method4549(0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		this.aClass285_5.method6136('\u0000');
		if (this.aClass329_3.aBoolean670) {
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(this.aClass329_3.aClass46_Sub3_3);
			super.aClass78_Sub3_37.method4549(0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		super.aClass78_Sub3_37.method4549(1);
		if (local47) {
			Static159.aFloatArray31[1] = 0.0F;
			Static159.aFloatArray31[0] = local36;
			Static159.aFloatArray31[3] = 0.0F;
			Static159.aFloatArray31[2] = 0.0F;
		} else {
			Static159.aFloatArray31[0] = 0.0F;
			Static159.aFloatArray31[2] = local36;
			Static159.aFloatArray31[1] = 0.0F;
			Static159.aFloatArray31[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static159.aFloatArray31, 0);
		Static159.aFloatArray31[2] = 0.0F;
		Static159.aFloatArray31[1] = local36;
		Static159.aFloatArray31[3] = (float) super.aClass78_Sub3_37.anInt5559 * local14 % 1.0F;
		Static159.aFloatArray31[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static159.aFloatArray31, 0);
		if (this.aClass329_3.aBoolean670) {
			Static159.aFloatArray31[2] = 0.0F;
			Static159.aFloatArray31[3] = local25 * (float) super.aClass78_Sub3_37.anInt5559 % 1.0F;
			Static159.aFloatArray31[0] = 0.0F;
			Static159.aFloatArray31[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static159.aFloatArray31, 0);
		} else {
			@Pc(167) int local167 = (int) ((float) super.aClass78_Sub3_37.anInt5559 * local25 * 16.0F);
			super.aClass78_Sub3_37.method4535(this.aClass329_3.aClass46_Sub2Array4[local167 % 16]);
		}
		super.aClass78_Sub3_37.method4549(0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		super.aClass78_Sub3_37.method4535(arg1);
		super.aClass78_Sub3_37.method4534(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}
}
