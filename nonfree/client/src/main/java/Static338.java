import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!dh;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "[Lclient!ho;")
	public static Class133_Sub1[] aClass133_Sub1Array2 = new Class133_Sub1[0];

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_34 = new Class10(8);

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "[I")
	public static final int[] anIntArray468 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "[S")
	private static final short[] aShortArray190 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "[S")
	private static final short[] aShortArray191 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "[S")
	private static final short[] aShortArray192 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "[[S")
	public static final short[][] aShortArrayArray59 = new short[][] { aShortArray190, aShortArray191, aShortArray192 };

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JI)V")
	public static void method5165(@OriginalArg(0) long arg0) {
		@Pc(6) Class3_Sub34 local6 = Static17.method293();
		local6.aClass3_Sub11_Sub1_2.method3079(Static115.aClass92_8.anInt2893);
		local6.aClass3_Sub11_Sub1_2.method3124(arg0);
		local6.aClass3_Sub11_Sub1_2.method3079(Static131.anInt2839);
		Static131.method2572(local6);
		Static268.anInt5017 = 0;
		Static221.anInt5801 = 0;
		Static144.anInt3061 = 1;
		Static5.anInt98 = -3;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5167(@OriginalArg(1) String arg0) {
		if (Class141.aString54.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class141.aString54.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class141.aString54.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
