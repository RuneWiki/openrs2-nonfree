import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!ln;")
	private final Class184 aClass184_1;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Lclient!cn;")
	private final Class51 aClass51_3;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!uq;Lclient!ln;)V")
	public Class13_Sub3(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_1 = arg1;
		this.aClass51_3 = new Class51(arg0, 2);
		this.aClass51_3.method1250(0);
		super.aClass122_Sub3_40.method6932(1);
		if (this.aClass184_1.aBoolean371) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass122_Sub3_40.method6932(0);
		this.aClass51_3.method1253();
		this.aClass51_3.method1250(1);
		super.aClass122_Sub3_40.method6932(1);
		if (this.aClass184_1.aBoolean371) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass122_Sub3_40.method6932(0);
		this.aClass51_3.method1253();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		this.aClass51_3.method1248('\u0001');
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(null);
		super.aClass122_Sub3_40.method6932(0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		this.aClass51_3.method1248('\u0000');
		if (this.aClass184_1.aBoolean371) {
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(this.aClass184_1.aClass73_Sub3_2);
			super.aClass122_Sub3_40.method6932(0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass122_Sub3_40.method6932(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static138.aFloatArray6[2] = 0.0F;
			Static138.aFloatArray6[1] = 0.0F;
			Static138.aFloatArray6[3] = 0.0F;
			Static138.aFloatArray6[0] = local33;
		} else {
			Static138.aFloatArray6[1] = 0.0F;
			Static138.aFloatArray6[0] = 0.0F;
			Static138.aFloatArray6[2] = local33;
			Static138.aFloatArray6[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static138.aFloatArray6, 0);
		Static138.aFloatArray6[2] = 0.0F;
		Static138.aFloatArray6[1] = local33;
		Static138.aFloatArray6[0] = 0.0F;
		Static138.aFloatArray6[3] = (float) super.aClass122_Sub3_40.anInt8419 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static138.aFloatArray6, 0);
		if (this.aClass184_1.aBoolean371) {
			Static138.aFloatArray6[2] = 0.0F;
			Static138.aFloatArray6[1] = 0.0F;
			Static138.aFloatArray6[3] = local25 * (float) super.aClass122_Sub3_40.anInt8419 % 1.0F;
			Static138.aFloatArray6[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static138.aFloatArray6, 0);
		} else {
			@Pc(168) int local168 = (int) ((float) super.aClass122_Sub3_40.anInt8419 * 16.0F * local25);
			super.aClass122_Sub3_40.method6850(this.aClass184_1.aClass73_Sub1Array2[local168 % 16]);
		}
		super.aClass122_Sub3_40.method6932(0);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		super.aClass122_Sub3_40.method6850(arg0);
		super.aClass122_Sub3_40.method6875(arg1);
	}
}
