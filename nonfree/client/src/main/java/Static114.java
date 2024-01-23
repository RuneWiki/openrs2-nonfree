import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt2505;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public static int anInt2509;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public static int anInt2520;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!vb;")
	public static Class120 aClass120_13 = new Class120();

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!sc;")
	private static Class107 aClass107_677 = Static231.method3737("cyan:");

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_676 = aClass107_677;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_678 = Static231.method3737("unzap");

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!sc;")
	public static Class107 aClass107_679 = Static231.method3737("p12_full");

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_680 = aClass107_677;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Lclient!ka;")
	public static Class64_Sub1 aClass64_Sub1_2 = null;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "Lclient!sc;")
	public static Class107 aClass107_681 = Static231.method3737("leuchten2:");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0--;
		if (local3 > 25) {
			local3 = 25;
		}
		@Pc(23) int local23 = Static157.anIntArray302[arg0];
		@Pc(27) int local27 = Static11.anIntArray34[arg0];
		if (arg1 == 0) {
			Static193.aClass1_Sub26_Sub1_2.method3000(42);
			Static193.aClass1_Sub26_Sub1_2.method2967(local3 + local3 + 3);
		}
		if (arg1 == 1) {
			Static193.aClass1_Sub26_Sub1_2.method3000(163);
			Static193.aClass1_Sub26_Sub1_2.method2967(local3 + local3 + 17);
		}
		if (arg1 == 2) {
			Static193.aClass1_Sub26_Sub1_2.method3000(75);
			Static193.aClass1_Sub26_Sub1_2.method2967(local3 + local3 + 3);
		}
		Static193.aClass1_Sub26_Sub1_2.method2967(Static132.aBooleanArray19[82] ? 1 : 0);
		Static184.anInt4144 = Static157.anIntArray302[0];
		Static95.anInt2072 = Static11.anIntArray34[0];
		for (@Pc(109) int local109 = 1; local109 < local3; local109++) {
			arg0--;
			Static193.aClass1_Sub26_Sub1_2.method2954(Static157.anIntArray302[arg0] - local23);
			Static193.aClass1_Sub26_Sub1_2.method2974(Static11.anIntArray34[arg0] - local27);
		}
		Static193.aClass1_Sub26_Sub1_2.method2966(Static36.anInt764 + local23);
		Static193.aClass1_Sub26_Sub1_2.method2988(local27 + Static152.anInt3377);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
	public static void method1974(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static231.anInt4994 >= 100 && Static130.anInt2837 != 1 || Static231.anInt4994 >= 200) {
			Static136.method2282(Static47.aClass107_316, 0, Static63.aClass107_427);
			return;
		}
		@Pc(35) Class107 local35 = Static19.method382(arg0).method3092();
		for (@Pc(37) int local37 = 0; local37 < Static231.anInt4994; local37++) {
			if (arg0 == Static18.aLongArray1[local37]) {
				Static136.method2282(Static149.method2437(new Class107[] { local35, Static67.aClass107_440 }), 0, Static63.aClass107_427);
				return;
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static174.anInt3793; local77++) {
			if (Static201.aLongArray7[local77] == arg0) {
				Static136.method2282(Static149.method2437(new Class107[] { Static16.aClass107_131, local35, Static123.aClass107_728 }), 0, Static63.aClass107_427);
				return;
			}
		}
		if (local35.method3071(Static204.aClass5_Sub5_Sub1_2.aClass107_351)) {
			Static136.method2282(Static2.aClass107_39, 0, Static63.aClass107_427);
			return;
		}
		Static178.aClass107Array23[Static231.anInt4994] = local35;
		Static18.aLongArray1[Static231.anInt4994] = arg0;
		Static196.anIntArray351[Static231.anInt4994] = 0;
		Static149.aClass107Array17[Static231.anInt4994] = Static63.aClass107_427;
		Static151.anIntArray292[Static231.anInt4994] = 0;
		Static211.aBooleanArray27[Static231.anInt4994] = false;
		Static82.anInt1779 = Static218.anInt4760;
		Static231.anInt4994++;
		Static193.aClass1_Sub26_Sub1_2.method3000(140);
		Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public static void method1975() {
		Static218.aClass61_87.method1689();
		Static116.aClass61_47.method1689();
		Static95.aClass61_34.method1689();
	}
}
