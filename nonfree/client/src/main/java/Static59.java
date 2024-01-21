import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!na;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public static int anInt1824;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_14;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!fe;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
	public static int[] anIntArray194 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_1847 = Static94.method1596("Ignorieren");

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
	public static int anInt1826 = 0;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!a;")
	public static Class1 aClass1_1848 = Static94.method1596("title)3jpg");

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "[I")
	public static int[] anIntArray195 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1266() {
		@Pc(3) Class1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < Static37.anInt1346; local5++) {
			if (Static84.aClass1Array20[local5].method11(Static77.aClass1_2163) != -1) {
				local3 = Static84.aClass1Array20[local5].method1(Static84.aClass1Array20[local5].method11(Static77.aClass1_2163));
				break;
			}
		}
		if (local3 == null) {
			Static41.method965();
			return;
		}
		@Pc(44) int local44 = Static77.anInt2065;
		@Pc(46) int local46 = Static32.anInt1230;
		if (local44 > 190) {
			local44 = 190;
		}
		@Pc(55) int local55 = Static5.anInt404;
		@Pc(57) int local57 = Static17.anInt772;
		if (local46 < 0) {
			local46 = 0;
		}
		Static92.method1120(local46, local57, local44, local55, 6116423);
		Static92.method1120(local46 + 1, local57 - -1, local44 - 2, 16, 0);
		Static92.method1129(local46 + 1, local57 + 18, local44 - 2, local55 + -19, 0);
		Static97.aClass2_Sub1_Sub2_Sub1_3.method368(local3, local46 + 3, local57 + 14, 6116423, false);
		@Pc(111) int local111 = Static22.anInt930;
		@Pc(113) int local113 = Static84.anInt2248;
		if (Static18.anInt835 == 0) {
			local111 -= 4;
			local113 -= 4;
		}
		if (Static18.anInt835 == 1) {
			local111 -= 553;
			local113 -= 205;
		}
		if (Static18.anInt835 == 2) {
			local113 -= 357;
			local111 -= 17;
		}
		for (@Pc(134) int local134 = 0; local134 < Static37.anInt1346; local134++) {
			@Pc(149) int local149 = local57 + (Static37.anInt1346 + -1 + -local134) * 15 + 31;
			@Pc(153) Class1 local153 = Static84.aClass1Array20[local134];
			@Pc(155) int local155 = 16777215;
			if (local153.method38(local3)) {
				local153 = local153.method19(0, local153.method10() - local3.method10());
				if (local153.method38(Static77.aClass1_2166)) {
					local153 = local153.method19(0, local153.method10() - Static77.aClass1_2166.method10());
				}
			}
			if (local46 < local111 && local111 < local46 + local44 && local149 - 13 < local113 && local149 + 3 > local113) {
				local155 = 16776960;
			}
			Static97.aClass2_Sub1_Sub2_Sub1_3.method368(local153, local46 + 3, local149, local155, true);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public static void method1267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		@Pc(17) Class2_Sub1_Sub15 local17 = (Class2_Sub1_Sub15) Static44.aClass25_2.method991(local11);
		if (local17 != null) {
			Static32.aClass30_2.method1233(local17);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	public static int method1268() {
		return Static76.anInt2062++;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method1269() {
		anIntArray195 = null;
		aClass29_1 = null;
		aClass1_1847 = null;
		aClass1_1848 = null;
		anIntArray194 = null;
		aClass2_Sub3_Sub1_2 = null;
		aClass8_Sub1_14 = null;
	}
}
