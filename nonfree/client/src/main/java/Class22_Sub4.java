import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!iia", name = "z", descriptor = "Lclient!tf;")
	private final Class336 aClass336_4;

	@OriginalMember(owner = "client!iia", name = "t", descriptor = "Lclient!ik;")
	private final Class164 aClass164_3;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!lf;Lclient!tf;)V")
	public Class22_Sub4(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_4 = arg1;
		this.aClass164_3 = new Class164(arg0, 2);
		this.aClass164_3.method3846(0);
		super.aClass95_Sub3_37.method4900(1);
		if (this.aClass336_4.aBoolean645) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass95_Sub3_37.method4900(0);
		this.aClass164_3.method3848();
		this.aClass164_3.method3846(1);
		super.aClass95_Sub3_37.method4900(1);
		if (this.aClass336_4.aBoolean645) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass95_Sub3_37.method4900(0);
		this.aClass164_3.method3848();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) float local18 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(29) float local29 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(40) float local40 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(48) boolean local48 = (arg1 & 0x80) != 0;
		super.aClass95_Sub3_37.method4900(1);
		if (local48) {
			Static55.aFloatArray6[2] = 0.0F;
			Static55.aFloatArray6[0] = local40;
			Static55.aFloatArray6[1] = 0.0F;
			Static55.aFloatArray6[3] = 0.0F;
		} else {
			Static55.aFloatArray6[0] = 0.0F;
			Static55.aFloatArray6[2] = local40;
			Static55.aFloatArray6[1] = 0.0F;
			Static55.aFloatArray6[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static55.aFloatArray6, 0);
		Static55.aFloatArray6[2] = 0.0F;
		Static55.aFloatArray6[3] = local18 * (float) super.aClass95_Sub3_37.anInt5751 % 1.0F;
		Static55.aFloatArray6[0] = 0.0F;
		Static55.aFloatArray6[1] = local40;
		OpenGL.glTexGenfv(8193, 9474, Static55.aFloatArray6, 0);
		if (this.aClass336_4.aBoolean645) {
			Static55.aFloatArray6[0] = 0.0F;
			Static55.aFloatArray6[2] = 0.0F;
			Static55.aFloatArray6[3] = (float) super.aClass95_Sub3_37.anInt5751 * local29 % 1.0F;
			Static55.aFloatArray6[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static55.aFloatArray6, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass95_Sub3_37.anInt5751 * 16.0F * local29);
			super.aClass95_Sub3_37.method4864(this.aClass336_4.aClass10_Sub2Array4[local136 % 16]);
		}
		super.aClass95_Sub3_37.method4900(0);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		this.aClass164_3.method3843('\u0000');
		if (this.aClass336_4.aBoolean645) {
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864(this.aClass336_4.aClass10_Sub1_1);
			super.aClass95_Sub3_37.method4900(0);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		this.aClass164_3.method3843('\u0001');
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864((Class10) null);
		super.aClass95_Sub3_37.method4900(0);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub3_37.method4864(arg0);
		super.aClass95_Sub3_37.method4870(arg1);
	}
}
