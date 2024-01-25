import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Lclient!wl;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!bf;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!gk;Lclient!wl;)V")
	public Class51_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_1 = arg1;
		this.aClass18_1 = new Class18(arg0, 2);
		this.aClass18_1.method718(0);
		super.aClass75_Sub2_39.method2426(1);
		if (this.aClass264_1.aBoolean519) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass75_Sub2_39.method2426(0);
		this.aClass18_1.method723();
		this.aClass18_1.method718(1);
		super.aClass75_Sub2_39.method2426(1);
		if (this.aClass264_1.aBoolean519) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass75_Sub2_39.method2426(0);
		this.aClass18_1.method723();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		this.aClass18_1.method720('\u0000');
		if (this.aClass264_1.aBoolean519) {
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(this.aClass264_1.aClass42_Sub4_2);
			super.aClass75_Sub2_39.method2426(0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		super.aClass75_Sub2_39.method2456(arg0);
		super.aClass75_Sub2_39.method2424(arg1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(41) boolean local41 = (arg0 & 0x80) != 0;
		super.aClass75_Sub2_39.method2426(1);
		if (local41) {
			Static379.aFloatArray15[0] = local33;
			Static379.aFloatArray15[2] = 0.0F;
			Static379.aFloatArray15[1] = 0.0F;
			Static379.aFloatArray15[3] = 0.0F;
		} else {
			Static379.aFloatArray15[0] = 0.0F;
			Static379.aFloatArray15[1] = 0.0F;
			Static379.aFloatArray15[2] = local33;
			Static379.aFloatArray15[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static379.aFloatArray15, 0);
		Static379.aFloatArray15[3] = local14 * (float) super.aClass75_Sub2_39.anInt3079 % 1.0F;
		Static379.aFloatArray15[2] = 0.0F;
		Static379.aFloatArray15[0] = 0.0F;
		Static379.aFloatArray15[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static379.aFloatArray15, 0);
		if (this.aClass264_1.aBoolean519) {
			Static379.aFloatArray15[3] = (float) super.aClass75_Sub2_39.anInt3079 * local25 % 1.0F;
			Static379.aFloatArray15[0] = 0.0F;
			Static379.aFloatArray15[2] = 0.0F;
			Static379.aFloatArray15[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static379.aFloatArray15, 0);
		} else {
			@Pc(134) int local134 = (int) (local25 * 16.0F * (float) super.aClass75_Sub2_39.anInt3079);
			super.aClass75_Sub2_39.method2456(this.aClass264_1.aClass42_Sub1Array4[local134 % 16]);
		}
		super.aClass75_Sub2_39.method2426(0);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		this.aClass18_1.method720('\u0001');
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(null);
		super.aClass75_Sub2_39.method2426(0);
	}
}
