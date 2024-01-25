import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class104_Sub8 extends Class104 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "Lclient!um;")
	private final Class319 aClass319_5;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "Lclient!gq;")
	private final Class121 aClass121_4;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!ap;Lclient!um;)V")
	public Class104_Sub8(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_5 = arg1;
		this.aClass121_4 = new Class121(arg0, 2);
		this.aClass121_4.method3523(0);
		super.aClass9_Sub2_40.method806(1);
		if (this.aClass319_5.aBoolean683) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass9_Sub2_40.method806(0);
		this.aClass121_4.method3524();
		this.aClass121_4.method3523(1);
		super.aClass9_Sub2_40.method806(1);
		if (this.aClass319_5.aBoolean683) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass9_Sub2_40.method806(0);
		this.aClass121_4.method3524();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		super.aClass9_Sub2_40.method814(arg1);
		super.aClass9_Sub2_40.method822(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) float local20 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(31) float local31 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(42) float local42 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass9_Sub2_40.method806(1);
		@Pc(55) boolean local55 = (arg0 & 0x80) != 0;
		if (local55) {
			Static384.aFloatArray55[3] = 0.0F;
			Static384.aFloatArray55[0] = local42;
			Static384.aFloatArray55[2] = 0.0F;
			Static384.aFloatArray55[1] = 0.0F;
		} else {
			Static384.aFloatArray55[3] = 0.0F;
			Static384.aFloatArray55[1] = 0.0F;
			Static384.aFloatArray55[0] = 0.0F;
			Static384.aFloatArray55[2] = local42;
		}
		OpenGL.glTexGenfv(8192, 9474, Static384.aFloatArray55, 0);
		Static384.aFloatArray55[2] = 0.0F;
		Static384.aFloatArray55[1] = local42;
		Static384.aFloatArray55[3] = local20 * (float) super.aClass9_Sub2_40.anInt810 % 1.0F;
		Static384.aFloatArray55[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static384.aFloatArray55, 0);
		if (this.aClass319_5.aBoolean683) {
			Static384.aFloatArray55[3] = (float) super.aClass9_Sub2_40.anInt810 * local31 % 1.0F;
			Static384.aFloatArray55[1] = 0.0F;
			Static384.aFloatArray55[2] = 0.0F;
			Static384.aFloatArray55[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static384.aFloatArray55, 0);
		} else {
			@Pc(138) int local138 = (int) (local31 * 16.0F * (float) super.aClass9_Sub2_40.anInt810);
			super.aClass9_Sub2_40.method814(this.aClass319_5.aClass132_Sub1Array2[local138 % 16]);
		}
		super.aClass9_Sub2_40.method806(0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		this.aClass121_4.method3522('\u0001');
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method814(null);
		super.aClass9_Sub2_40.method806(0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		this.aClass121_4.method3522('\u0000');
		if (this.aClass319_5.aBoolean683) {
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(this.aClass319_5.aClass132_Sub2_1);
			super.aClass9_Sub2_40.method806(0);
		}
	}
}
