import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
	public static int anInt3130;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "Lclient!tb;")
	public static Class44 aClass44_70;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1718 = Static33.method650("Loading title screen )2 ");

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!n;")
	public static Class52 aClass52_57 = new Class52(64);

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1719 = Static33.method650("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1720 = aClass56_1718;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1721 = Static33.method650(" ");

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "[J")
	public static long[] aLongArray36 = new long[200];

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
	public static int anInt3131 = 0;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1722 = Static33.method650(": ");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
	public static void method2021() {
		aClass44_70 = null;
		aClass56_1719 = null;
		aClass56_1721 = null;
		aClass56_1718 = null;
		aClass52_57 = null;
		aClass56_1720 = null;
		aClass56_1722 = null;
		aLongArray36 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tb;I)I")
	public static int method2022(@OriginalArg(0) Class44 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1141(Static61.aClass56_951, Static52.aClass56_847)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static65.aClass56_986)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static40.aClass56_624)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static77.aClass56_1723)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static95.aClass56_1346)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static45.aClass56_707)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static21.aClass56_301)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static21.aClass56_298)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static76.aClass56_1112)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static106.aClass56_1453)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static31.aClass56_501)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static114.aClass56_1568)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static125.aClass56_1730)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static11.aClass56_170)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static57.aClass56_893)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static97.aClass56_1397)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static36.aClass56_570)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static18.aClass56_238)) {
			local5++;
		}
		if (arg0.method1141(Static61.aClass56_951, Static71.aClass56_1047)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)V")
	public static void method2023(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg0);
		local10.anInt413 = arg0.length - 2;
		Static59.anInt1711 = local10.method276();
		Static51.anIntArray103 = new int[Static59.anInt1711];
		Static116.aByteArrayArray10 = new byte[Static59.anInt1711][];
		Static76.anIntArray179 = new int[Static59.anInt1711];
		Static47.anIntArray96 = new int[Static59.anInt1711];
		Static69.anIntArray161 = new int[Static59.anInt1711];
		local10.anInt413 = arg0.length - Static59.anInt1711 * 8 - 7;
		Static84.anInt2277 = local10.method276();
		Static64.anInt1829 = local10.method276();
		@Pc(67) int local67 = (local10.method270() & 0xFF) + 1;
		for (@Pc(69) int local69 = 0; local69 < Static59.anInt1711; local69++) {
			Static47.anIntArray96[local69] = local10.method276();
		}
		for (@Pc(87) int local87 = 0; local87 < Static59.anInt1711; local87++) {
			Static69.anIntArray161[local87] = local10.method276();
		}
		for (@Pc(101) int local101 = 0; local101 < Static59.anInt1711; local101++) {
			Static51.anIntArray103[local101] = local10.method276();
		}
		for (@Pc(115) int local115 = 0; local115 < Static59.anInt1711; local115++) {
			Static76.anIntArray179[local115] = local10.method276();
		}
		local10.anInt413 = arg0.length + 3 - Static59.anInt1711 * 8 - local67 * 3 - 7;
		Static69.anIntArray163 = new int[local67];
		for (@Pc(149) int local149 = 1; local149 < local67; local149++) {
			Static69.anIntArray163[local149] = local10.method264();
			if (Static69.anIntArray163[local149] == 0) {
				Static69.anIntArray163[local149] = 1;
			}
		}
		local10.anInt413 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static59.anInt1711; local177++) {
			@Pc(183) int local183 = Static76.anIntArray179[local177];
			@Pc(187) int local187 = Static51.anIntArray103[local177];
			@Pc(191) int local191 = local183 * local187;
			@Pc(194) byte[] local194 = new byte[local191];
			Static116.aByteArrayArray10[local177] = local194;
			@Pc(202) int local202 = local10.method270();
			@Pc(211) int local211;
			if (local202 == 0) {
				for (local211 = 0; local211 < local191; local211++) {
					local194[local211] = local10.method265();
				}
			} else if (local202 == 1) {
				for (local211 = 0; local211 < local187; local211++) {
					for (@Pc(215) int local215 = 0; local215 < local183; local215++) {
						local194[local187 * local215 + local211] = local10.method265();
					}
				}
			}
		}
	}
}
