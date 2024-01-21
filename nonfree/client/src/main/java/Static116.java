import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!r;")
	private static Class61 aClass61_912 = Static129.method2060("Jun");

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_913 = Static129.method2060("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_914 = Static129.method2060("Oct");

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!r;")
	private static Class61 aClass61_915 = Static129.method2060("Hidden");

	@OriginalMember(owner = "client!te", name = "B", descriptor = "Lclient!r;")
	private static Class61 aClass61_924 = Static129.method2060("green:");

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_916 = aClass61_924;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!r;")
	private static Class61 aClass61_917 = Static129.method2060("Jan");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!r;")
	private static Class61 aClass61_918 = Static129.method2060("Dec");

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!r;")
	private static Class61 aClass61_919 = Static129.method2060("Feb");

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_920 = Static129.method2060("Aug");

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_921 = aClass61_924;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!r;")
	private static Class61 aClass61_930 = Static129.method2060("Mar");

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!r;")
	private static Class61 aClass61_923 = Static129.method2060("Apr");

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Lclient!r;")
	private static Class61 aClass61_926 = Static129.method2060("May");

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!r;")
	private static Class61 aClass61_929 = Static129.method2060("Jul");

	@OriginalMember(owner = "client!te", name = "G", descriptor = "Lclient!r;")
	private static Class61 aClass61_925 = Static129.method2060("Sep");

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!r;")
	private static Class61 aClass61_922 = Static129.method2060("Nov");

	@OriginalMember(owner = "client!te", name = "x", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array20 = new Class61[] { aClass61_917, aClass61_919, aClass61_930, aClass61_923, aClass61_926, aClass61_912, aClass61_929, aClass61_920, aClass61_925, aClass61_914, aClass61_922, aClass61_918 };

	@OriginalMember(owner = "client!te", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_927 = Static129.method2060("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Lclient!r;")
	public static Class61 aClass61_928 = aClass61_915;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "I")
	public static int anInt3008 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[Lclient!ke;I)V")
	public static void method1884(@OriginalArg(1) Class5_Sub11[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class5_Sub11 local18 = arg0[local12];
			if (local18 != null && local18.anInt1681 == arg1 && (!local18.aBoolean66 || !Static79.method1300(local18))) {
				if (local18.anInt1669 == 0) {
					if (!local18.aBoolean66 && Static79.method1300(local18) && local18 != Static127.aClass5_Sub11_14) {
						continue;
					}
					method1884(arg0, local18.anInt1614);
					if (local18.aClass5_Sub11Array1 != null) {
						method1884(local18.aClass5_Sub11Array1, local18.anInt1614);
					}
					@Pc(69) Class5_Sub13 local69 = (Class5_Sub13) Static28.aClass20_3.method656((long) local18.anInt1614);
					if (local69 != null) {
						Static43.method768(local69.anInt2013);
					}
				}
				if (local18.anInt1669 == 6) {
					@Pc(99) int local99;
					if (local18.anInt1625 != -1 || local18.anInt1629 != -1) {
						@Pc(94) boolean local94 = Static105.method2171(local18);
						if (local94) {
							local99 = local18.anInt1629;
						} else {
							local99 = local18.anInt1625;
						}
						if (local99 != -1) {
							@Pc(111) Class5_Sub2_Sub17 local111 = Static106.method1769(local99);
							local18.anInt1672 += Static8.anInt198;
							while (local111.anIntArray396[local18.anInt1617] < local18.anInt1672) {
								local18.anInt1672 -= local111.anIntArray396[local18.anInt1617];
								local18.anInt1617++;
								if (local18.anInt1617 >= local111.anIntArray391.length) {
									local18.anInt1617 -= local111.anInt3228;
									if (local18.anInt1617 < 0 || local18.anInt1617 >= local111.anIntArray391.length) {
										local18.anInt1617 = 0;
									}
								}
								Static24.method505(local18);
							}
						}
					}
					if (local18.anInt1677 != 0 && !local18.aBoolean66) {
						@Pc(188) int local188 = local18.anInt1677 >> 16;
						local99 = local18.anInt1677 << 16 >> 16;
						@Pc(199) int local199 = local188 * Static8.anInt198;
						local99 *= Static8.anInt198;
						local18.anInt1647 = local18.anInt1647 + local199 & 0x7FF;
						local18.anInt1671 = local99 + local18.anInt1671 & 0x7FF;
						Static24.method505(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(JI)V")
	public static void method1885(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static114.anInt2962 >= 100) {
			Static91.method1596(Static96.aClass61_746, Static115.aClass61_907, 0);
			return;
		}
		@Pc(29) Class61 local29 = Static111.method1831(arg0).method1701();
		for (@Pc(31) int local31 = 0; local31 < Static114.anInt2962; local31++) {
			if (arg0 == Static68.aLongArray3[local31]) {
				Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { local29, Static23.aClass61_216 }), 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static45.anInt1203; local66++) {
			if (arg0 == Static70.aLongArray4[local66]) {
				Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { Static87.aClass61_682, local29, Static120.aClass61_950 }), 0);
				return;
			}
		}
		if (local29.method1736(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877)) {
			Static91.method1596(Static96.aClass61_746, Static64.aClass61_812, 0);
			return;
		}
		Static68.aLongArray3[Static114.anInt2962] = arg0;
		Static104.aClass61Array18[Static114.anInt2962++] = Static111.method1831(arg0);
		Static95.anInt2443 = Static66.anInt1592;
		Static1.aClass5_Sub14_Sub1_1.method1489(226);
		Static1.aClass5_Sub14_Sub1_1.method1464(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ff;Lclient!ff;ZZLclient!df;)V")
	public static void method1886(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class5_Sub2_Sub1_Sub1_Sub1 arg3) {
		Static68.aClass26_10 = arg0;
		Static38.aBoolean54 = arg2;
		Static50.aClass26_5 = arg1;
		Static50.aClass26_5.method1031(10);
		Static57.aClass5_Sub2_Sub1_Sub1_Sub1_2 = arg3;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)Z")
	public static boolean method1887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub2_Sub16 local12 = Static43.method767(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local12.method1962(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1888() {
		aClass61_917 = null;
		aClass61_930 = null;
		aClass61_919 = null;
		aClass61_929 = null;
		aClass61_914 = null;
		aClass61_913 = null;
		aClass61_925 = null;
		aClass61_927 = null;
		aClass61_926 = null;
		aClass61_923 = null;
		aClass61_916 = null;
		aShortArrayArray6 = null;
		aClass61_915 = null;
		aClass61Array20 = null;
		aClass61_920 = null;
		aClass61_921 = null;
		aClass61_922 = null;
		aClass61_918 = null;
		aClass61_928 = null;
		aClass61_912 = null;
		aClass61_924 = null;
	}
}
