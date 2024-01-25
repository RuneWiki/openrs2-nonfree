import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Lclient!al;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!bq;")
	private final Class41 aClass41_1;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!uca;Lclient!al;)V")
	public Class42_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class14 arg1) {
		super(arg0);
		this.aClass14_1 = arg1;
		this.aClass41_1 = new Class41(arg0, 2);
		this.aClass41_1.method823(0);
		super.aClass162_Sub3_44.method6947(1);
		if (this.aClass14_1.aBoolean25) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass162_Sub3_44.method6947(0);
		this.aClass41_1.method822();
		this.aClass41_1.method823(1);
		super.aClass162_Sub3_44.method6947(1);
		if (this.aClass14_1.aBoolean25) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass162_Sub3_44.method6947(0);
		this.aClass41_1.method822();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		this.aClass41_1.method821('\u0000');
		if (this.aClass14_1.aBoolean25) {
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(this.aClass14_1.aClass3_Sub4_1);
			super.aClass162_Sub3_44.method6947(0);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(31) float local31 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(42) float local42 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass162_Sub3_44.method6947(1);
		@Pc(58) boolean local58 = (arg1 & 0x80) != 0;
		if (local58) {
			Static558.aFloatArray72[2] = 0.0F;
			Static558.aFloatArray72[3] = 0.0F;
			Static558.aFloatArray72[1] = 0.0F;
			Static558.aFloatArray72[0] = local42;
		} else {
			Static558.aFloatArray72[2] = local42;
			Static558.aFloatArray72[1] = 0.0F;
			Static558.aFloatArray72[0] = 0.0F;
			Static558.aFloatArray72[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static558.aFloatArray72, 0);
		Static558.aFloatArray72[0] = 0.0F;
		Static558.aFloatArray72[3] = (float) super.aClass162_Sub3_44.anInt8686 * local14 % 1.0F;
		Static558.aFloatArray72[1] = local42;
		Static558.aFloatArray72[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static558.aFloatArray72, 0);
		if (this.aClass14_1.aBoolean25) {
			Static558.aFloatArray72[0] = 0.0F;
			Static558.aFloatArray72[3] = local31 * (float) super.aClass162_Sub3_44.anInt8686 % 1.0F;
			Static558.aFloatArray72[2] = 0.0F;
			Static558.aFloatArray72[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static558.aFloatArray72, 0);
		} else {
			@Pc(171) int local171 = (int) (local31 * (float) super.aClass162_Sub3_44.anInt8686 * 16.0F);
			super.aClass162_Sub3_44.method6911(this.aClass14_1.aClass3_Sub1Array1[local171 % 16]);
		}
		super.aClass162_Sub3_44.method6947(0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		this.aClass41_1.method821('\u0001');
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(null);
		super.aClass162_Sub3_44.method6947(0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass162_Sub3_44.method6911(arg1);
		super.aClass162_Sub3_44.method6953(arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}
}
