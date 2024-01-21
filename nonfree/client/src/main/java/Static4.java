import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_104 = Static169.method2903("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
	public static int anInt298 = 0;

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_105 = Static169.method2903("rect_debug=");

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
	public static int anInt299 = 0;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_106 = Static169.method2903("Freie Welt");

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "[I")
	public static int[] anIntArray44 = new int[128];

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_107 = Static169.method2903("ams");

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_108 = Static169.method2903("<col=c0ff00>");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V")
	public static void method160() {
		aClass1_Sub1_Sub12_Sub1Array1 = null;
		aClass23_104 = null;
		aClass23_108 = null;
		anIntArray44 = null;
		aClass23_106 = null;
		aClass30_Sub1_1 = null;
		aClass23_105 = null;
		aClass23_107 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
	public static void method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = 2048 - arg1 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg5 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(43) int local43;
		if (local6 != 0) {
			local29 = Class1_Sub1_Sub12_Sub2.anIntArray417[local6];
			local33 = Class1_Sub1_Sub12_Sub2.anIntArray416[local6];
			local43 = local29 * 0 - arg0 * local33 >> 16;
			local23 = local33 * 0 + local29 * arg0 >> 16;
			local19 = local43;
		}
		if (local17 != 0) {
			local29 = Class1_Sub1_Sub12_Sub2.anIntArray417[local17];
			local33 = Class1_Sub1_Sub12_Sub2.anIntArray416[local17];
			local43 = local29 * 0 + local23 * local33 >> 16;
			local23 = local23 * local29 - local33 * 0 >> 16;
			local21 = local43;
		}
		Static46.anInt4326 = arg1;
		Static29.anInt886 = arg5;
		Static166.anInt4090 = arg2 - local23;
		Static162.anInt3999 = arg4 - local21;
		Static163.anInt4011 = arg3 - local19;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	public static void method162() {
		if (Static109.aClass60_10 != null || Static133.aClass60_12 != null) {
			return;
		}
		@Pc(18) int local18 = Static163.anInt4012;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(78) int local78;
		if (Static164.aBoolean201) {
			if (local18 != 1) {
				local25 = Static163.anInt4014;
				local27 = Static96.anInt2484;
				if (local25 < Static94.anInt2451 - 10 || local25 > Static141.anInt3598 + Static94.anInt2451 + 10 || local27 < Static112.anInt2868 - 10 || local27 > Static27.anInt864 + Static112.anInt2868 + 10) {
					Static164.aBoolean201 = false;
					Static176.method2991(Static94.anInt2451, Static27.anInt864, Static112.anInt2868, Static141.anInt3598);
				}
			}
			if (local18 == 1) {
				local25 = Static94.anInt2451;
				local78 = Static141.anInt3598;
				local27 = Static112.anInt2868;
				@Pc(82) int local82 = Static38.anInt1049;
				@Pc(84) int local84 = Static165.anInt4054;
				@Pc(86) int local86 = -1;
				for (@Pc(88) int local88 = 0; local88 < Static38.anInt1037; local88++) {
					@Pc(103) int local103 = (Static38.anInt1037 - local88 - 1) * 15 + local27 + 31;
					if (local82 > local25 && local82 < local25 + local78 && local103 - 13 < local84 && local103 + 3 > local84) {
						local86 = local88;
					}
				}
				if (local86 != -1) {
					Static103.method1767(local86);
				}
				Static164.aBoolean201 = false;
				Static176.method2991(Static94.anInt2451, Static27.anInt864, Static112.anInt2868, Static141.anInt3598);
				return;
			}
			return;
		}
		if (local18 == 1 && Static38.anInt1037 > 0) {
			local25 = Static37.anIntArray124[Static38.anInt1037 - 1];
			if (local25 == 37 || local25 == 21 || local25 == 22 || local25 == 47 || local25 == 16 || local25 == 2 || local25 == 8 || local25 == 35 || local25 == 44 || local25 == 25 || local25 == 23 || local25 == 1006) {
				local27 = Static104.anIntArray354[Static38.anInt1037 - 1];
				local78 = Static153.anIntArray506[Static38.anInt1037 - 1];
				@Pc(226) Class60 local226 = Static111.method1964(local78);
				if (Static27.method497(Static170.method475(local226)) || Static37.method594(Static170.method475(local226))) {
					Static80.anInt2161 = 0;
					Static15.aBoolean21 = false;
					if (Static109.aClass60_10 != null) {
						Static39.method659(Static109.aClass60_10);
					}
					Static109.aClass60_10 = Static111.method1964(local78);
					Static144.anInt3641 = local27;
					Static171.anInt4154 = Static38.anInt1049;
					Static149.anInt3741 = Static165.anInt4054;
					Static39.method659(Static109.aClass60_10);
					return;
				}
			}
		}
		if (local18 == 1 && (Static90.anInt2406 == 1 && Static38.anInt1037 > 2 || Static88.method1548(Static38.anInt1037 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static38.anInt1037 > 0) {
			Static103.method1767(Static38.anInt1037 - 1);
		}
		if (local18 != 2 || Static38.anInt1037 <= 0) {
			return;
		}
		Static91.method1598();
	}
}
