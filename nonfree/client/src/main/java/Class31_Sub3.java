import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!an;")
	private final Class19 aClass19_2;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!bfa;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!lea;Lclient!an;)V")
	public Class31_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class19 arg1) {
		super(arg0);
		this.aClass19_2 = arg1;
		this.aClass30_1 = new Class30(arg0, 2);
		this.aClass30_1.method944(0);
		super.aClass101_Sub2_43.method5627(1);
		if (this.aClass19_2.aBoolean25) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass101_Sub2_43.method5627(0);
		this.aClass30_1.method941();
		this.aClass30_1.method944(1);
		super.aClass101_Sub2_43.method5627(1);
		if (this.aClass19_2.aBoolean25) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass101_Sub2_43.method5627(0);
		this.aClass30_1.method941();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub2_43.method5690(arg0);
		super.aClass101_Sub2_43.method5681(arg1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		this.aClass30_1.method940('\u0000');
		if (this.aClass19_2.aBoolean25) {
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690(this.aClass19_2.aClass50_Sub1_3);
			super.aClass101_Sub2_43.method5627(0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		this.aClass30_1.method940('\u0001');
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690((Class50) null);
		super.aClass101_Sub2_43.method5627(0);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass101_Sub2_43.method5627(1);
		@Pc(52) boolean local52 = (arg0 & 0x80) != 0;
		if (local52) {
			Static296.aFloatArray31[0] = local36;
			Static296.aFloatArray31[1] = 0.0F;
			Static296.aFloatArray31[3] = 0.0F;
			Static296.aFloatArray31[2] = 0.0F;
		} else {
			Static296.aFloatArray31[2] = local36;
			Static296.aFloatArray31[3] = 0.0F;
			Static296.aFloatArray31[0] = 0.0F;
			Static296.aFloatArray31[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static296.aFloatArray31, 0);
		Static296.aFloatArray31[2] = 0.0F;
		Static296.aFloatArray31[0] = 0.0F;
		Static296.aFloatArray31[1] = local36;
		Static296.aFloatArray31[3] = (float) super.aClass101_Sub2_43.anInt6314 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static296.aFloatArray31, 0);
		if (this.aClass19_2.aBoolean25) {
			Static296.aFloatArray31[0] = 0.0F;
			Static296.aFloatArray31[1] = 0.0F;
			Static296.aFloatArray31[2] = 0.0F;
			Static296.aFloatArray31[3] = local25 * (float) super.aClass101_Sub2_43.anInt6314 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static296.aFloatArray31, 0);
		} else {
			@Pc(140) int local140 = (int) ((float) super.aClass101_Sub2_43.anInt6314 * local25 * 16.0F);
			super.aClass101_Sub2_43.method5690(this.aClass19_2.aClass50_Sub4Array1[local140 % 16]);
		}
		super.aClass101_Sub2_43.method5627(0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}
}
