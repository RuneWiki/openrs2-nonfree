import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class69_Sub6 extends Class69 {

	@OriginalMember(owner = "client!lja", name = "m", descriptor = "Lclient!au;")
	private final Class27 aClass27_4;

	@OriginalMember(owner = "client!lja", name = "q", descriptor = "Lclient!kca;")
	private final Class203 aClass203_3;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!ml;Lclient!au;)V")
	public Class69_Sub6(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class27 arg1) {
		super(arg0);
		this.aClass27_4 = arg1;
		this.aClass203_3 = new Class203(arg0, 2);
		this.aClass203_3.method4857(0);
		super.aClass75_Sub3_41.method5775(1);
		if (this.aClass27_4.aBoolean31) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass75_Sub3_41.method5775(0);
		this.aClass203_3.method4854();
		this.aClass203_3.method4857(1);
		super.aClass75_Sub3_41.method5775(1);
		if (this.aClass27_4.aBoolean31) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass75_Sub3_41.method5775(0);
		this.aClass203_3.method4854();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		super.aClass75_Sub3_41.method5774(arg1);
		super.aClass75_Sub3_41.method5787(arg0);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		this.aClass203_3.method4855('\u0001');
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774((Class44) null);
		super.aClass75_Sub3_41.method5775(0);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		this.aClass203_3.method4855('\u0000');
		if (this.aClass27_4.aBoolean31) {
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774(this.aClass27_4.aClass44_Sub3_2);
			super.aClass75_Sub3_41.method5775(0);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass75_Sub3_41.method5775(1);
		@Pc(54) boolean local54 = (arg0 & 0x80) != 0;
		if (local54) {
			Static573.aFloatArray74[1] = 0.0F;
			Static573.aFloatArray74[3] = 0.0F;
			Static573.aFloatArray74[0] = local37;
			Static573.aFloatArray74[2] = 0.0F;
		} else {
			Static573.aFloatArray74[0] = 0.0F;
			Static573.aFloatArray74[3] = 0.0F;
			Static573.aFloatArray74[1] = 0.0F;
			Static573.aFloatArray74[2] = local37;
		}
		OpenGL.glTexGenfv(8192, 9474, Static573.aFloatArray74, 0);
		Static573.aFloatArray74[1] = local37;
		Static573.aFloatArray74[3] = local14 * (float) super.aClass75_Sub3_41.anInt6532 % 1.0F;
		Static573.aFloatArray74[0] = 0.0F;
		Static573.aFloatArray74[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static573.aFloatArray74, 0);
		if (this.aClass27_4.aBoolean31) {
			Static573.aFloatArray74[0] = 0.0F;
			Static573.aFloatArray74[1] = 0.0F;
			Static573.aFloatArray74[3] = local25 * (float) super.aClass75_Sub3_41.anInt6532 % 1.0F;
			Static573.aFloatArray74[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static573.aFloatArray74, 0);
		} else {
			@Pc(148) int local148 = (int) ((float) super.aClass75_Sub3_41.anInt6532 * local25 * 16.0F);
			super.aClass75_Sub3_41.method5774(this.aClass27_4.aClass44_Sub1Array2[local148 % 16]);
		}
		super.aClass75_Sub3_41.method5775(0);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}
}
