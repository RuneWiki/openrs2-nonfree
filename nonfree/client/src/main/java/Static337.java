import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[S")
	public static short[] aShortArray50;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Lclient!rc;")
	public static Class1_Sub40 aClass1_Sub40_2;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "[Lclient!sr;")
	public static Class248_Sub1[] aClass248_Sub1Array2;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int anInt6163 = 0;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!kr;")
	public static final Class196 aClass196_5 = new Class196();

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
	public static int[] anIntArray362 = new int[4];

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	public static int anInt6171 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!vv;)V")
	public static void method5008(@OriginalArg(0) Class11_Sub1 arg0) {
		Static458.aClass78_153.MA(arg0.anInt8902, arg0.anInt8908 + (arg0.method7212() >> 1), arg0.anInt8906, Static400.anIntArray422);
		arg0.anInt8900 = Static400.anIntArray422[0];
		arg0.anInt8909 = Static400.anIntArray422[1];
		arg0.anInt8899 = Static400.anIntArray422[2];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILclient!sea;)Lclient!vn;")
	public static Class352 method5009(@OriginalArg(2) int arg0, @OriginalArg(3) Class308 arg1) {
		@Pc(9) byte[] local9 = arg1.method6569(arg0, 0);
		return local9 == null ? null : new Class352(local9);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!tba;[BB)Lclient!wda;")
	public static Class357 method5013(@OriginalArg(1) Class78_Sub1_Sub2 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static312.anIntArray338, 0);
		if (Static312.anIntArray338[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class357(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
