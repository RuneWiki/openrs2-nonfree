import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!ne;")
	public static Class2_Sub8_Sub14 aClass2_Sub8_Sub14_8;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	public static int anInt5450;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!ek;")
	public static Class42 aClass42_94;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!ek;")
	public static Class42 aClass42_95;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!en;")
	public static Class44 aClass44_23 = new Class44();

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString188 = "K";

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	public static int anInt5449 = 0;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public static int anInt5452 = 0;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	public static int anInt5454 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!dj;ILclient!ek;Lclient!ek;Z)V")
	public static void method4323(@OriginalArg(0) Class2_Sub8_Sub5_Sub1 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		Static214.aClass42_65 = arg1;
		aClass42_94 = arg2;
		Static273.aBoolean361 = true;
		@Pc(15) int local15 = aClass42_94.method1275() - 1;
		Static105.anInt1095 = aClass42_94.method1269(local15) + local15 * 256;
		Static117.aStringArray22 = new String[] { null, null, null, null, Static230.aString159 };
		Static211.aStringArray32 = new String[] { null, null, Static192.aString136, null, null };
		Static211.aClass2_Sub8_Sub5_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BILclient!ek;)Lclient!bn;")
	public static Class2_Sub8_Sub1 method4324(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1) {
		return Static47.method882(arg1, arg0) ? Static74.method1404() : null;
	}
}
