import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class56_Sub4 extends Class56 {

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!me;")
	private final Class190 aClass190_2;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Lclient!ub;")
	private final Class291 aClass291_3;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ad;Lclient!me;)V")
	public Class56_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class190 arg1) {
		super(arg0);
		this.aClass190_2 = arg1;
		this.aClass291_3 = new Class291(arg0, 2);
		this.aClass291_3.method7121(0);
		super.aClass5_Sub1_39.method397(1);
		if (this.aClass190_2.aBoolean385) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass5_Sub1_39.method397(0);
		this.aClass291_3.method7124();
		this.aClass291_3.method7121(1);
		super.aClass5_Sub1_39.method397(1);
		if (this.aClass190_2.aBoolean385) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass5_Sub1_39.method397(0);
		this.aClass291_3.method7124();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		this.aClass291_3.method7122('\u0001');
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method423(null);
		super.aClass5_Sub1_39.method397(0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		this.aClass291_3.method7122('\u0000');
		if (this.aClass190_2.aBoolean385) {
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(this.aClass190_2.aClass11_Sub2_3);
			super.aClass5_Sub1_39.method397(0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass5_Sub1_39.method423(arg1);
		super.aClass5_Sub1_39.method416(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) float local19 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(30) float local30 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(41) float local41 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass5_Sub1_39.method397(1);
		@Pc(54) boolean local54 = (arg0 & 0x80) != 0;
		if (local54) {
			Static214.aFloatArray36[3] = 0.0F;
			Static214.aFloatArray36[0] = local41;
			Static214.aFloatArray36[2] = 0.0F;
			Static214.aFloatArray36[1] = 0.0F;
		} else {
			Static214.aFloatArray36[1] = 0.0F;
			Static214.aFloatArray36[0] = 0.0F;
			Static214.aFloatArray36[2] = local41;
			Static214.aFloatArray36[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static214.aFloatArray36, 0);
		Static214.aFloatArray36[3] = local19 * (float) super.aClass5_Sub1_39.anInt377 % 1.0F;
		Static214.aFloatArray36[1] = local41;
		Static214.aFloatArray36[2] = 0.0F;
		Static214.aFloatArray36[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static214.aFloatArray36, 0);
		if (this.aClass190_2.aBoolean385) {
			Static214.aFloatArray36[1] = 0.0F;
			Static214.aFloatArray36[3] = local30 * (float) super.aClass5_Sub1_39.anInt377 % 1.0F;
			Static214.aFloatArray36[0] = 0.0F;
			Static214.aFloatArray36[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static214.aFloatArray36, 0);
		} else {
			@Pc(167) int local167 = (int) (local30 * (float) super.aClass5_Sub1_39.anInt377 * 16.0F);
			super.aClass5_Sub1_39.method423(this.aClass190_2.aClass11_Sub1Array3[local167 % 16]);
		}
		super.aClass5_Sub1_39.method397(0);
	}
}
