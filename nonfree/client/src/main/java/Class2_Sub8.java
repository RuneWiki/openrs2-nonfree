import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!re;")
	private final Class202 aClass202_6;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Lclient!gs;")
	private final Class98 aClass98_5;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!bv;Lclient!re;)V")
	public Class2_Sub8(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_6 = arg1;
		this.aClass98_5 = new Class98(arg0, 2);
		this.aClass98_5.method2003(0);
		super.aClass30_Sub1_42.method948(1);
		if (this.aClass202_6.aBoolean411) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass30_Sub1_42.method948(0);
		this.aClass98_5.method2004();
		this.aClass98_5.method2003(1);
		super.aClass30_Sub1_42.method948(1);
		if (this.aClass202_6.aBoolean411) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass30_Sub1_42.method948(0);
		this.aClass98_5.method2004();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		this.aClass98_5.method2005('\u0000');
		if (this.aClass202_6.aBoolean411) {
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(this.aClass202_6.aClass1_Sub4_3);
			super.aClass30_Sub1_42.method948(0);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		this.aClass98_5.method2005('\u0001');
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(null);
		super.aClass30_Sub1_42.method948(0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass30_Sub1_42.method948(1);
		if (local44) {
			Static431.aFloatArray26[0] = local36;
			Static431.aFloatArray26[3] = 0.0F;
			Static431.aFloatArray26[1] = 0.0F;
			Static431.aFloatArray26[2] = 0.0F;
		} else {
			Static431.aFloatArray26[2] = local36;
			Static431.aFloatArray26[0] = 0.0F;
			Static431.aFloatArray26[3] = 0.0F;
			Static431.aFloatArray26[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static431.aFloatArray26, 0);
		Static431.aFloatArray26[2] = 0.0F;
		Static431.aFloatArray26[0] = 0.0F;
		Static431.aFloatArray26[1] = local36;
		Static431.aFloatArray26[3] = local14 * (float) super.aClass30_Sub1_42.anInt1244 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static431.aFloatArray26, 0);
		if (this.aClass202_6.aBoolean411) {
			Static431.aFloatArray26[3] = local25 * (float) super.aClass30_Sub1_42.anInt1244 % 1.0F;
			Static431.aFloatArray26[1] = 0.0F;
			Static431.aFloatArray26[2] = 0.0F;
			Static431.aFloatArray26[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static431.aFloatArray26, 0);
		} else {
			@Pc(132) int local132 = (int) ((float) super.aClass30_Sub1_42.anInt1244 * 16.0F * local25);
			super.aClass30_Sub1_42.method916(this.aClass202_6.aClass1_Sub3Array4[local132 % 16]);
		}
		super.aClass30_Sub1_42.method948(0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		super.aClass30_Sub1_42.method916(arg1);
		super.aClass30_Sub1_42.method923(arg0);
	}
}
