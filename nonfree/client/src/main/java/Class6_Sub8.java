import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!cd;")
	private final Class45 aClass45_6;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!hq;")
	private final Class149 aClass149_5;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!dw;Lclient!cd;)V")
	public Class6_Sub8(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class45 arg1) {
		super(arg0);
		this.aClass45_6 = arg1;
		this.aClass149_5 = new Class149(arg0, 2);
		this.aClass149_5.method3800(0);
		super.aClass82_Sub1_41.method2086(1);
		if (this.aClass45_6.aBoolean58) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass82_Sub1_41.method2086(0);
		this.aClass149_5.method3803();
		this.aClass149_5.method3800(1);
		super.aClass82_Sub1_41.method2086(1);
		if (this.aClass45_6.aBoolean58) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass82_Sub1_41.method2086(0);
		this.aClass149_5.method3803();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		super.aClass82_Sub1_41.method2029(arg0);
		super.aClass82_Sub1_41.method2068(arg1);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		this.aClass149_5.method3804('\u0001');
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029((Class94) null);
		super.aClass82_Sub1_41.method2086(0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass82_Sub1_41.method2086(1);
		@Pc(51) boolean local51 = (arg0 & 0x80) != 0;
		if (local51) {
			Static317.aFloatArray68[1] = 0.0F;
			Static317.aFloatArray68[0] = local33;
			Static317.aFloatArray68[2] = 0.0F;
			Static317.aFloatArray68[3] = 0.0F;
		} else {
			Static317.aFloatArray68[3] = 0.0F;
			Static317.aFloatArray68[2] = local33;
			Static317.aFloatArray68[0] = 0.0F;
			Static317.aFloatArray68[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static317.aFloatArray68, 0);
		Static317.aFloatArray68[1] = local33;
		Static317.aFloatArray68[2] = 0.0F;
		Static317.aFloatArray68[3] = local14 * (float) super.aClass82_Sub1_41.anInt2463 % 1.0F;
		Static317.aFloatArray68[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static317.aFloatArray68, 0);
		if (this.aClass45_6.aBoolean58) {
			Static317.aFloatArray68[1] = 0.0F;
			Static317.aFloatArray68[0] = 0.0F;
			Static317.aFloatArray68[2] = 0.0F;
			Static317.aFloatArray68[3] = local25 * (float) super.aClass82_Sub1_41.anInt2463 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static317.aFloatArray68, 0);
		} else {
			@Pc(164) int local164 = (int) ((float) super.aClass82_Sub1_41.anInt2463 * local25 * 16.0F);
			super.aClass82_Sub1_41.method2029(this.aClass45_6.aClass94_Sub2Array1[local164 % 16]);
		}
		super.aClass82_Sub1_41.method2086(0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		this.aClass149_5.method3804('\u0000');
		if (this.aClass45_6.aBoolean58) {
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029(this.aClass45_6.aClass94_Sub3_1);
			super.aClass82_Sub1_41.method2086(0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}
}
