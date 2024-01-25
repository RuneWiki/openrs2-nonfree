import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!taa;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!nda;")
	private final Class251 aClass251_2;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!gia;Lclient!taa;)V")
	public Class43_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class349 arg1) {
		super(arg0);
		this.aClass349_1 = arg1;
		this.aClass251_2 = new Class251(arg0, 2);
		this.aClass251_2.method6187(0);
		super.aClass67_Sub2_41.method3268(1);
		if (this.aClass349_1.aBoolean709) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass67_Sub2_41.method3268(0);
		this.aClass251_2.method6183();
		this.aClass251_2.method6187(1);
		super.aClass67_Sub2_41.method3268(1);
		if (this.aClass349_1.aBoolean709) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass67_Sub2_41.method3268(0);
		this.aClass251_2.method6183();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		this.aClass251_2.method6186('\u0000');
		if (this.aClass349_1.aBoolean709) {
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234(this.aClass349_1.aClass245_Sub3_3);
			super.aClass67_Sub2_41.method3268(0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		this.aClass251_2.method6186('\u0001');
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234((Class245) null);
		super.aClass67_Sub2_41.method3268(0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		super.aClass67_Sub2_41.method3234(arg1);
		super.aClass67_Sub2_41.method3255(arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(46) boolean local46 = (arg1 & 0x80) != 0;
		super.aClass67_Sub2_41.method3268(1);
		if (local46) {
			Static133.aFloatArray35[1] = 0.0F;
			Static133.aFloatArray35[3] = 0.0F;
			Static133.aFloatArray35[0] = local37;
			Static133.aFloatArray35[2] = 0.0F;
		} else {
			Static133.aFloatArray35[2] = local37;
			Static133.aFloatArray35[1] = 0.0F;
			Static133.aFloatArray35[0] = 0.0F;
			Static133.aFloatArray35[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static133.aFloatArray35, 0);
		Static133.aFloatArray35[1] = local37;
		Static133.aFloatArray35[0] = 0.0F;
		Static133.aFloatArray35[3] = (float) super.aClass67_Sub2_41.anInt3876 * local14 % 1.0F;
		Static133.aFloatArray35[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static133.aFloatArray35, 0);
		if (this.aClass349_1.aBoolean709) {
			Static133.aFloatArray35[0] = 0.0F;
			Static133.aFloatArray35[1] = 0.0F;
			Static133.aFloatArray35[3] = local25 * (float) super.aClass67_Sub2_41.anInt3876 % 1.0F;
			Static133.aFloatArray35[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static133.aFloatArray35, 0);
		} else {
			@Pc(138) int local138 = (int) ((float) super.aClass67_Sub2_41.anInt3876 * 16.0F * local25);
			super.aClass67_Sub2_41.method3234(this.aClass349_1.aClass245_Sub2Array4[local138 % 16]);
		}
		super.aClass67_Sub2_41.method3268(0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
	}
}
