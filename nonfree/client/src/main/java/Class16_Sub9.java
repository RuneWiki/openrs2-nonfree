import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class16_Sub9 extends Class16 {

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Lclient!mm;")
	private final Class162 aClass162_6;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!gw;")
	private final Class94 aClass94_5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!tt;Lclient!mm;)V")
	public Class16_Sub9(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_6 = arg1;
		this.aClass94_5 = new Class94(arg0, 2);
		this.aClass94_5.method2130(0);
		super.aClass200_Sub2_36.method5319(1);
		if (this.aClass162_6.aBoolean276) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass200_Sub2_36.method5319(0);
		this.aClass94_5.method2133();
		this.aClass94_5.method2130(1);
		super.aClass200_Sub2_36.method5319(1);
		if (this.aClass162_6.aBoolean276) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass200_Sub2_36.method5319(0);
		this.aClass94_5.method2133();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass200_Sub2_36.method5319(1);
		if (local47) {
			Static30.aFloatArray2[3] = 0.0F;
			Static30.aFloatArray2[2] = 0.0F;
			Static30.aFloatArray2[1] = 0.0F;
			Static30.aFloatArray2[0] = local36;
		} else {
			Static30.aFloatArray2[0] = 0.0F;
			Static30.aFloatArray2[1] = 0.0F;
			Static30.aFloatArray2[3] = 0.0F;
			Static30.aFloatArray2[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static30.aFloatArray2, 0);
		Static30.aFloatArray2[0] = 0.0F;
		Static30.aFloatArray2[2] = 0.0F;
		Static30.aFloatArray2[3] = local14 * (float) super.aClass200_Sub2_36.anInt6720 % 1.0F;
		Static30.aFloatArray2[1] = local36;
		OpenGL.glTexGenfv(8193, 9474, Static30.aFloatArray2, 0);
		if (this.aClass162_6.aBoolean276) {
			Static30.aFloatArray2[1] = 0.0F;
			Static30.aFloatArray2[2] = 0.0F;
			Static30.aFloatArray2[0] = 0.0F;
			Static30.aFloatArray2[3] = (float) super.aClass200_Sub2_36.anInt6720 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static30.aFloatArray2, 0);
		} else {
			@Pc(140) int local140 = (int) ((float) super.aClass200_Sub2_36.anInt6720 * local25 * 16.0F);
			super.aClass200_Sub2_36.method5312(this.aClass162_6.aClass31_Sub1Array2[local140 % 16]);
		}
		super.aClass200_Sub2_36.method5319(0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		super.aClass200_Sub2_36.method5312(arg1);
		super.aClass200_Sub2_36.method5297(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		this.aClass94_5.method2132('\u0001');
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5312(null);
		super.aClass200_Sub2_36.method5319(0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		this.aClass94_5.method2132('\u0000');
		if (this.aClass162_6.aBoolean276) {
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(this.aClass162_6.aClass31_Sub2_3);
			super.aClass200_Sub2_36.method5319(0);
		}
	}
}
