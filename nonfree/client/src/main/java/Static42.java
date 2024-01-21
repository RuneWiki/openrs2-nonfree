import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt931;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt935;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 aClass1_Sub1_Sub5_Sub2_2;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_613 = Static69.method1153("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!rd;")
	private static Class64 aClass64_614 = Static69.method1153("Add friend");

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_615 = Static69.method1153(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt930 = 0;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_616 = aClass64_614;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt936 = 0;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!rd;")
	private static Class64 aClass64_617 = Static69.method1153("glow2:");

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_618 = aClass64_617;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method696() {
		aClass64_614 = null;
		aClass64_616 = null;
		aClass64_613 = null;
		aClass1_Sub1_Sub5_Sub2_2 = null;
		aClass64_618 = null;
		aClass64_617 = null;
		aClass64_615 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!tb;")
	public static Class1_Sub1_Sub15 method697(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub15 local10 = (Class1_Sub1_Sub15) Static26.aClass19_26.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static19.aClass41_11.method1062(9, arg0);
		local10 = new Class1_Sub1_Sub15();
		local10.anInt2306 = arg0;
		if (local20 != null) {
			local10.method1649(new Class1_Sub6(local20));
		}
		local10.method1655();
		Static26.aClass19_26.method409(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method698() {
		Static39.anInt914 = 0;
		Static70.anInt1581 = 0;
		Static74.method1234();
		Static27.method671();
		Static52.method2082();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static70.anInt1581; local22++) {
			local28 = Static83.anIntArray286[local22];
			if (Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local28].anInt2377 != Static15.anInt471) {
				Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local28].aClass1_Sub1_Sub15_1 = null;
				Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local28] = null;
			}
		}
		if (Static62.anInt1454 != Static64.aClass1_Sub6_Sub1_2.anInt2574) {
			throw new RuntimeException("gnp1 pos:" + Static64.aClass1_Sub6_Sub1_2.anInt2574 + " psize:" + Static62.anInt1454);
		}
		for (local28 = 0; local28 < Static64.anInt1488; local28++) {
			if (Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static13.anIntArray65[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static64.anInt1488);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method699() {
		Static50.aClass19_46.method416();
		Static113.aClass19_66.method416();
	}
}
