import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "Lclient!jq;")
	private final Class135 aClass135_2;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Lclient!cs;")
	private final Class49 aClass49_3;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ih;Lclient!jq;)V")
	public Class100_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_2 = arg1;
		this.aClass49_3 = new Class49(arg0, 2);
		this.aClass49_3.method1154(0);
		super.aClass106_Sub2_43.method2881(1);
		if (this.aClass135_2.aBoolean251) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass106_Sub2_43.method2881(0);
		this.aClass49_3.method1151();
		this.aClass49_3.method1154(1);
		super.aClass106_Sub2_43.method2881(1);
		if (this.aClass135_2.aBoolean251) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass106_Sub2_43.method2881(0);
		this.aClass49_3.method1151();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		super.aClass106_Sub2_43.method2912(arg1);
		super.aClass106_Sub2_43.method2851(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		this.aClass49_3.method1153('\u0000');
		if (this.aClass135_2.aBoolean251) {
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(this.aClass135_2.aClass8_Sub4_1);
			super.aClass106_Sub2_43.method2881(0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass106_Sub2_43.method2881(1);
		if (local44) {
			Static339.aFloatArray26[1] = 0.0F;
			Static339.aFloatArray26[2] = 0.0F;
			Static339.aFloatArray26[3] = 0.0F;
			Static339.aFloatArray26[0] = local33;
		} else {
			Static339.aFloatArray26[0] = 0.0F;
			Static339.aFloatArray26[3] = 0.0F;
			Static339.aFloatArray26[1] = 0.0F;
			Static339.aFloatArray26[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static339.aFloatArray26, 0);
		Static339.aFloatArray26[1] = local33;
		Static339.aFloatArray26[3] = local14 * (float) super.aClass106_Sub2_43.anInt3735 % 1.0F;
		Static339.aFloatArray26[0] = 0.0F;
		Static339.aFloatArray26[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static339.aFloatArray26, 0);
		if (this.aClass135_2.aBoolean251) {
			Static339.aFloatArray26[3] = (float) super.aClass106_Sub2_43.anInt3735 * local25 % 1.0F;
			Static339.aFloatArray26[1] = 0.0F;
			Static339.aFloatArray26[2] = 0.0F;
			Static339.aFloatArray26[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static339.aFloatArray26, 0);
		} else {
			@Pc(140) int local140 = (int) (local25 * 16.0F * (float) super.aClass106_Sub2_43.anInt3735);
			super.aClass106_Sub2_43.method2912(this.aClass135_2.aClass8_Sub1Array1[local140 % 16]);
		}
		super.aClass106_Sub2_43.method2881(0);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		this.aClass49_3.method1153('\u0001');
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2912(null);
		super.aClass106_Sub2_43.method2881(0);
	}
}
