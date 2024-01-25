import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jo", name = "gb", descriptor = "I")
	public static int anInt3651;

	@OriginalMember(owner = "client!jo", name = "ub", descriptor = "I")
	public static int anInt3662 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method2968() {
		if (Static419.anInt7044 < 0) {
			return;
		}
		@Pc(9) long local9 = Static21.method458();
		Static419.anInt7044 = (int) ((long) Static419.anInt7044 + Static59.aLong44 - local9);
		if (Static419.anInt7044 > 0) {
			@Pc(26) int local26 = (Static419.anInt7044 << 8) / Static162.anInt3246;
			@Pc(30) int local30 = 255 - local26;
			@Pc(35) float local35 = (float) local26 / 255.0F;
			Static179.anInt3514 = ((Static253.anInt4753 & 0xFF00FF) * local26 + (Static239.aClass22_1.anInt562 & 0xFF00FF) * local30 & 0xFF00FF00) + (local26 * (Static253.anInt4753 & 0xFF00) + (Static239.aClass22_1.anInt562 & 0xFF00) * local30 & 0xFF0000) >>> 8;
			@Pc(72) float local72 = 1.0F - local35;
			Static152.anInt3143 = ((Static239.aClass22_1.anInt557 & 0xFF00FF) * local30 + local26 * (Static187.anInt3618 & 0xFF00FF) & 0xFF00FF00) + ((Static239.aClass22_1.anInt557 & 0xFF00) * local30 + local26 * (Static187.anInt3618 & 0xFF00) & 0xFF0000) >>> 8;
			Static75.aFloat22 = local72 * (Static239.aClass22_1.aFloat7 - Static60.aFloat21) + Static60.aFloat21;
			Static276.aFloat72 = Static68.aFloat77 + local72 * (Static239.aClass22_1.aFloat9 - Static68.aFloat77);
			Static336.aFloat82 = Static243.aFloat69 + (Static239.aClass22_1.aFloat8 - Static243.aFloat69) * local72;
			Static210.anInt4100 = local26 * Static436.anInt7190 + Static239.aClass22_1.anInt565 * local30 >> 8;
			Static345.aFloat83 = (Static239.aClass22_1.aFloat10 - Static159.aFloat58) * local72 + Static159.aFloat58;
			Static202.aFloat63 = (Static239.aClass22_1.aFloat11 - Static109.aFloat70) * local72 + Static109.aFloat70;
			Static154.aFloat56 = Static199.aFloat61 + (Static239.aClass22_1.aFloat6 - Static199.aFloat61) * local72;
			if (Static198.aClass155_3 != Static239.aClass22_1.aClass155_1) {
				Static273.aClass155_4 = Static195.aClass49_5.method4443(Static198.aClass155_3, Static239.aClass22_1.aClass155_1, local72, Static273.aClass155_4);
			}
		} else {
			Static276.aFloat72 = Static239.aClass22_1.aFloat9;
			Static273.aClass155_4 = Static239.aClass22_1.aClass155_1;
			Static202.aFloat63 = Static239.aClass22_1.aFloat11;
			Static179.anInt3514 = Static239.aClass22_1.anInt562;
			Static152.anInt3143 = Static239.aClass22_1.anInt557;
			Static419.anInt7044 = -1;
			Static345.aFloat83 = Static239.aClass22_1.aFloat10;
			Static75.aFloat22 = Static239.aClass22_1.aFloat7;
			Static336.aFloat82 = Static239.aClass22_1.aFloat8;
			Static154.aFloat56 = Static239.aClass22_1.aFloat6;
			Static210.anInt4100 = Static239.aClass22_1.anInt565;
		}
		Static59.aLong44 = local9;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
	public static void method2972(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg0, 5);
		local8.method4545();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ya;Lclient!cu;ILclient!bm;IILclient!hq;)V")
	public static void method2976(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(4) Class28 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub18 arg6) {
		@Pc(20) int local20 = arg6.anInt3145 - arg4 / 2 - 5;
		@Pc(24) int local24 = arg0 + 2;
		if (arg2.anInt1228 != 0) {
			arg1.method4480(local20, arg4 + 10, arg2.anInt1228, local24, arg0 + arg3.method528() * arg5 + 1 - local24);
		}
		if (arg2.anInt1211 != 0) {
			arg1.method4415(arg5 * arg3.method528() + arg0 + 1 - local24, local24, arg4 + 10, local20, arg2.anInt1211);
		}
		@Pc(75) int local75 = arg2.anInt1214;
		if (arg6.aBoolean243 && arg2.anInt1196 != -1) {
			local75 = arg2.anInt1196;
		}
		for (@Pc(87) int local87 = 0; local87 < arg5; local87++) {
			@Pc(93) String local93 = Static300.aStringArray38[local87];
			if (arg5 - 1 > local87) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg3.method529(arg1, local93, arg6.anInt3145, arg0, local75);
			arg0 += arg3.method528();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Z")
	public static boolean method2983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static108.method1999(arg0, arg1) | (arg1 & 0x40000) != 0 || Static117.method2084(arg1, arg0);
	}
}
