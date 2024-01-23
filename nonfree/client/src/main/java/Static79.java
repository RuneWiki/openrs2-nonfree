import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	public static int anInt1908;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "Lclient!r;")
	public static Class73 aClass73_3;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public static int anInt1900 = 127;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Lclient!kh;")
	private static Class60 aClass60_614 = Static200.method3116("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_613 = aClass60_614;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public static int anInt1905 = 0;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "[J")
	public static long[] aLongArray5 = new long[1000];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method1400() {
		for (@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) Static10.aClass33_1.method1067(); local10 != null; local10 = (Class1_Sub11) Static10.aClass33_1.method1070()) {
			@Pc(15) int local15 = local10.anInt1626;
			if (Static199.method3112(local15)) {
				@Pc(23) Class6[] local23 = Static82.aClass6ArrayArray1[local15];
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < local23.length; local27++) {
					if (local23[local27] != null) {
						local25 = local23[local27].aBoolean13;
						break;
					}
				}
				if (!local25) {
					@Pc(51) int local51 = (int) local10.aLong150;
					@Pc(55) Class6 local55 = Static107.method1857(local51);
					if (local55 != null) {
						Static57.method1068(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method1401(@OriginalArg(0) Class60 arg0) {
		if (Static152.anInt3414 >= 2) {
			@Pc(17) int local17;
			@Pc(38) int local38;
			if (arg0.method1805(Static185.aClass60_1339)) {
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				@Pc(28) Runtime local28 = Runtime.getRuntime();
				local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static13.method239(null, Static34.method611(new Class60[] { Static202.aClass60_1472, Static40.method681(local38), Static64.aClass60_505 }), 0);
			}
			if (arg0.method1805(Static47.aClass60_358)) {
				Static126.method2128();
			}
			if (arg0.method1805(Static138.aClass60_1082)) {
				Static9.aBoolean249 = true;
			}
			if (arg0.method1805(Static152.aClass60_1177)) {
				Static9.aBoolean249 = false;
			}
			arg0.method1805(Static42.aClass60_315);
			arg0.method1805(Static162.aClass60_1625);
			if (arg0.method1805(Static135.aClass60_1012)) {
				for (local17 = 0; local17 < 4; local17++) {
					for (@Pc(106) int local106 = 1; local106 < 103; local106++) {
						for (local38 = 1; local38 < 103; local38++) {
							Static153.aClass3Array1[local17].anIntArrayArray1[local106][local38] = 0;
						}
					}
				}
			}
			if (arg0.method1838(Static176.aClass60_258) && Static27.anInt645 != 0) {
				Static9.method3249(arg0.method1818(6).method1841());
			}
			if (arg0.method1805(Static124.aClass60_935) && Static27.anInt645 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1838(Static12.aClass60_106)) {
				Static84.anInt1466 = arg0.method1818(12).method1814().method1841();
				Static13.method239(null, Static34.method611(new Class60[] { Static93.aClass60_703, Static40.method681(Static84.anInt1466) }), 0);
			}
			if (arg0.method1805(Static89.aClass60_678)) {
				Static94.aBoolean118 = true;
			}
		}
		Static96.aClass1_Sub9_Sub1_3.method953(175);
		Static96.aClass1_Sub9_Sub1_3.method899(arg0.method1835() - 1);
		Static96.aClass1_Sub9_Sub1_3.method924(arg0.method1818(2));
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static199.method3112(arg4)) {
			Static11.method3529(arg6, arg0, arg3, -1, arg5, arg2, arg1, Static82.aClass6ArrayArray1[arg4]);
		}
	}
}
