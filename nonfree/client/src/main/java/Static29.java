import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!g;")
	public static Class2_Sub3_Sub5_Sub1 aClass2_Sub3_Sub5_Sub1_1;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt711;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "[F")
	public static float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!g;Lclient!jd;ILclient!jd;)V")
	public static void method633(@OriginalArg(1) Class2_Sub3_Sub5_Sub1 arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(4) Class84 arg2) {
		Static121.aBoolean198 = true;
		Static90.aClass84_39 = arg2;
		Static126.aClass84_53 = arg1;
		@Pc(27) int local27 = Static126.aClass84_53.method2118() - 1;
		Static13.anInt332 = local27 * 256 + Static126.aClass84_53.method2116(local27);
		Static149.aStringArray13 = new String[] { null, null, Static47.aString55, null, null };
		Static284.aStringArray34 = new String[] { null, null, null, null, Static238.aString238 };
		aClass2_Sub3_Sub5_Sub1_1 = arg0;
	}
}
