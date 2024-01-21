import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "R", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!a", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_10 = Static81.method1507("Nehmen");

	@OriginalMember(owner = "client!a", name = "V", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_3 = new Class86(128);

	@OriginalMember(owner = "client!a", name = "W", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_11 = Static81.method1507("Click to switch");

	@OriginalMember(owner = "client!a", name = "X", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_12 = Static81.method1507("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_13 = aClass24_11;

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_14 = Static81.method1507("welle:");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBII)V")
	public static void method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub10 local8 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg3);
		if (local8 == null) {
			local8 = new Class1_Sub10();
			Static49.aClass57_12.method1874(local8, (long) arg3);
		}
		if (arg0 >= local8.anIntArray170.length) {
			@Pc(30) int[] local30 = new int[arg0 + 1];
			@Pc(35) int[] local35 = new int[arg0 + 1];
			for (@Pc(37) int local37 = 0; local37 < local8.anIntArray170.length; local37++) {
				local30[local37] = local8.anIntArray170[local37];
				local35[local37] = local8.anIntArray171[local37];
			}
			for (@Pc(67) int local67 = local8.anIntArray170.length; local67 < arg0; local67++) {
				local30[local67] = -1;
				local35[local67] = 0;
			}
			local8.anIntArray170 = local30;
			local8.anIntArray171 = local35;
		}
		local8.anIntArray170[arg0] = arg1;
		local8.anIntArray171[arg0] = arg2;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(II)V")
	public static void method49(@OriginalArg(1) int arg0) {
		if (Static110.method1903(arg0)) {
			Static14.method309(Static4.aClass98ArrayArray3[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(JB)V")
	public static void method51(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static105.anInt2367 >= 100 && Static25.anInt665 != 1 || Static105.anInt2367 >= 200) {
			Static200.method3377(Static169.aClass24_1086, 0, Static85.aClass24_1000);
			return;
		}
		@Pc(37) Class24 local37 = Static35.method3219(arg0).method761();
		for (@Pc(39) int local39 = 0; local39 < Static105.anInt2367; local39++) {
			if (arg0 == Static145.aLongArray28[local39]) {
				Static200.method3377(Static63.method1281(new Class24[] { local37, Static140.aClass24_932 }), 0, Static85.aClass24_1000);
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static34.anInt921; local75++) {
			if (Static135.aLongArray25[local75] == arg0) {
				Static200.method3377(Static63.method1281(new Class24[] { Static65.aClass24_469, local37, Static36.aClass24_236 }), 0, Static85.aClass24_1000);
				return;
			}
		}
		if (local37.method755(Static87.aClass5_Sub2_Sub1_1.aClass24_173)) {
			Static200.method3377(Static162.aClass24_1047, 0, Static85.aClass24_1000);
			return;
		}
		Static152.aClass24Array22[Static105.anInt2367] = local37;
		Static145.aLongArray28[Static105.anInt2367] = arg0;
		Static34.anIntArray80[Static105.anInt2367] = 0;
		Static110.aClass24Array17[Static105.anInt2367] = Static85.aClass24_1000;
		Static55.anIntArray119[Static105.anInt2367] = 0;
		Static127.anInt2781 = Static60.anInt3643;
		Static105.anInt2367++;
		Static176.aClass1_Sub7_Sub1_34.method2808(129);
		Static176.aClass1_Sub7_Sub1_34.method2801(arg0);
	}
}
