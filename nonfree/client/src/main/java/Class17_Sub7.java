import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class17_Sub7 extends Class17 {

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "Lclient!uo;")
	private final Class249 aClass249_5;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Lclient!rn;")
	private final Class213 aClass213_6;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!kd;Lclient!uo;)V")
	public Class17_Sub7(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_5 = arg1;
		this.aClass213_6 = new Class213(arg0, 2);
		this.aClass213_6.method4858(0);
		super.aClass39_Sub2_41.method3221(1);
		if (this.aClass249_5.aBoolean456) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass39_Sub2_41.method3221(0);
		this.aClass213_6.method4862();
		this.aClass213_6.method4858(1);
		super.aClass39_Sub2_41.method3221(1);
		if (this.aClass249_5.aBoolean456) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass39_Sub2_41.method3221(0);
		this.aClass213_6.method4862();
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		this.aClass213_6.method4857('\u0001');
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(null);
		super.aClass39_Sub2_41.method3221(0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub2_41.method3203(arg0);
		super.aClass39_Sub2_41.method3162(arg1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		this.aClass213_6.method4857('\u0000');
		if (this.aClass249_5.aBoolean456) {
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(this.aClass249_5.aClass3_Sub4_1);
			super.aClass39_Sub2_41.method3221(0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass39_Sub2_41.method3221(1);
		if (local44) {
			Static315.aFloatArray24[0] = local33;
			Static315.aFloatArray24[3] = 0.0F;
			Static315.aFloatArray24[2] = 0.0F;
			Static315.aFloatArray24[1] = 0.0F;
		} else {
			Static315.aFloatArray24[0] = 0.0F;
			Static315.aFloatArray24[1] = 0.0F;
			Static315.aFloatArray24[3] = 0.0F;
			Static315.aFloatArray24[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static315.aFloatArray24, 0);
		Static315.aFloatArray24[0] = 0.0F;
		Static315.aFloatArray24[2] = 0.0F;
		Static315.aFloatArray24[1] = local33;
		Static315.aFloatArray24[3] = local14 * (float) super.aClass39_Sub2_41.anInt3776 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static315.aFloatArray24, 0);
		if (this.aClass249_5.aBoolean456) {
			Static315.aFloatArray24[2] = 0.0F;
			Static315.aFloatArray24[0] = 0.0F;
			Static315.aFloatArray24[1] = 0.0F;
			Static315.aFloatArray24[3] = (float) super.aClass39_Sub2_41.anInt3776 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static315.aFloatArray24, 0);
		} else {
			@Pc(162) int local162 = (int) ((float) super.aClass39_Sub2_41.anInt3776 * 16.0F * local25);
			super.aClass39_Sub2_41.method3203(this.aClass249_5.aClass3_Sub2Array4[local162 % 16]);
		}
		super.aClass39_Sub2_41.method3221(0);
	}
}
