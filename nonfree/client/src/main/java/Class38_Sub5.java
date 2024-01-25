import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!hl;")
	private final Class100 aClass100_4;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!hq;")
	private final Class102 aClass102_3;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!nq;Lclient!hl;)V")
	public Class38_Sub5(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class100 arg1) {
		super(arg0);
		this.aClass100_4 = arg1;
		this.aClass102_3 = new Class102(arg0, 2);
		this.aClass102_3.method2513(0);
		super.aClass167_Sub1_42.method3993(1);
		if (this.aClass100_4.aBoolean215) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass167_Sub1_42.method3993(0);
		this.aClass102_3.method2510();
		this.aClass102_3.method2513(1);
		super.aClass167_Sub1_42.method3993(1);
		if (this.aClass100_4.aBoolean215) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass167_Sub1_42.method3993(0);
		this.aClass102_3.method2510();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		super.aClass167_Sub1_42.method4028(arg0);
		super.aClass167_Sub1_42.method3998(arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		this.aClass102_3.method2512('\u0000');
		if (this.aClass100_4.aBoolean215) {
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(this.aClass100_4.aClass137_Sub2_1);
			super.aClass167_Sub1_42.method3993(0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		this.aClass102_3.method2512('\u0001');
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(null);
		super.aClass167_Sub1_42.method3993(0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass167_Sub1_42.method3993(1);
		if (local44) {
			Static86.aFloatArray7[0] = local33;
			Static86.aFloatArray7[3] = 0.0F;
			Static86.aFloatArray7[1] = 0.0F;
			Static86.aFloatArray7[2] = 0.0F;
		} else {
			Static86.aFloatArray7[2] = local33;
			Static86.aFloatArray7[1] = 0.0F;
			Static86.aFloatArray7[3] = 0.0F;
			Static86.aFloatArray7[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static86.aFloatArray7, 0);
		Static86.aFloatArray7[3] = (float) super.aClass167_Sub1_42.anInt4890 * local14 % 1.0F;
		Static86.aFloatArray7[2] = 0.0F;
		Static86.aFloatArray7[0] = 0.0F;
		Static86.aFloatArray7[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static86.aFloatArray7, 0);
		if (this.aClass100_4.aBoolean215) {
			Static86.aFloatArray7[1] = 0.0F;
			Static86.aFloatArray7[3] = local25 * (float) super.aClass167_Sub1_42.anInt4890 % 1.0F;
			Static86.aFloatArray7[2] = 0.0F;
			Static86.aFloatArray7[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static86.aFloatArray7, 0);
		} else {
			@Pc(170) int local170 = (int) (local25 * (float) super.aClass167_Sub1_42.anInt4890 * 16.0F);
			super.aClass167_Sub1_42.method4028(this.aClass100_4.aClass137_Sub1Array2[local170 % 16]);
		}
		super.aClass167_Sub1_42.method3993(0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}
}
