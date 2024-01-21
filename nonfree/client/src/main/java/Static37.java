import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "Z")
	public static boolean aBoolean44;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Lclient!lf;")
	public static Class7 aClass7_7;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	public static int anInt1049;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!qc;")
	public static Class66 aClass66_7 = new Class66(4096);

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Lclient!fc;")
	private static Class25 aClass25_429 = Static78.method1313("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_428 = aClass25_429;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "[I")
	public static int[] anIntArray195 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public static int anInt1050 = 0;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_430 = Static78.method1313(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Lclient!fc;")
	private static Class25 aClass25_432 = Static78.method1313("Malformed login packet)3");

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_431 = aClass25_432;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!fc;")
	private static Class25 aClass25_434 = Static78.method1313("Examine");

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!fc;")
	public static Class25 aClass25_433 = aClass25_434;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!oc;BII)Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 method856(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static109.method1749(arg1, arg2, arg0) ? Static66.method1133() : null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!oc;I)[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] method857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		return Static109.method1749(arg0, arg1, arg2) ? Static103.method1962() : null;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method858() {
		Static59.anInt1356 = 0;
		Static25.anInt719 = 0;
		Static15.method361();
		Static23.method556();
		Static85.method1413();
		Static39.method894();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static25.anInt719; local19++) {
			local25 = Static28.anIntArray151[local19];
			if (Static60.anInt1366 != Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local25].anInt2794) {
				Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local25] = null;
			}
		}
		if (Static35.aClass1_Sub5_Sub1_1.anInt792 != Static110.anInt2558) {
			throw new RuntimeException("gpp1 pos:" + Static35.aClass1_Sub5_Sub1_1.anInt792 + " psize:" + Static110.anInt2558);
		}
		for (local25 = 0; local25 < Static96.anInt2797; local25++) {
			if (Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static96.anInt2797);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method859() {
		aClass25_433 = null;
		aClass25_430 = null;
		aClass25_431 = null;
		aFont1 = null;
		aClass7_7 = null;
		aClass66_7 = null;
		anIntArray195 = null;
		aClass25_432 = null;
		aClass25_428 = null;
		aClass25_429 = null;
		aClass25_434 = null;
		anIntArrayArray10 = null;
	}
}
