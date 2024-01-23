import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString328 = "flash2:";

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBI)I")
	public static int method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static174.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static174.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4365() {
		@Pc(31) String local31;
		if (Static69.anInt1334 == 1 && Static300.anInt5638 < 2) {
			local31 = Static194.aString321 + Static45.aString55 + Static313.aString372 + " ->";
		} else if (Static135.aBoolean177 && Static300.anInt5638 < 2) {
			local31 = Static155.aString140 + Static45.aString55 + Static69.aString81 + " ->";
		} else if (Static60.aBoolean68 && Static54.aBooleanArray4[81] && Static300.anInt5638 > 2) {
			local31 = Static190.method3005(Static300.anInt5638 - 2);
		} else {
			local31 = Static190.method3005(Static300.anInt5638 - 1);
		}
		if (Static300.anInt5638 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static300.anInt5638 - 2) + Static128.aString148;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!fg;Lclient!ho;)V")
	public static void method4366(@OriginalArg(1) Class4_Sub3_Sub7 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(5) Class56_Sub1 local5 = arg1.method1809();
		if (local5 == null) {
			return;
		}
		@Pc(16) int local16 = local5.anInt3408;
		if (local5.anInt3413 > local5.anInt3408) {
			local16 = local5.anInt3413;
		}
		@Pc(27) int local27 = arg0.anInt1766;
		@Pc(30) int local30 = arg0.anInt1764;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(49) int local49;
		@Pc(77) int local77;
		if (arg1.aString131 != null) {
			local32 = Static32.aClass4_Sub3_Sub5_1.method2286(arg1.aString131, null, Static200.aStringArray24);
			for (local49 = 0; local49 < local32; local49++) {
				@Pc(56) String local56 = Static200.aStringArray24[local49];
				if (local32 - 1 > local49) {
					local56 = local56.substring(0, local56.length() - 4);
				}
				local77 = Static172.aClass108_5.method2333(local56);
				if (local34 < local77) {
					local34 = local77;
				}
			}
			local36 = (local32 - 1) * Static172.aClass108_5.method2339() + Static172.aClass108_5.method2335() / 2;
		}
		local49 = arg0.anInt1766;
		if (Static121.anInt2969 + local16 > local27) {
			local27 = local16 + Static121.anInt2969;
			local49 = local34 / 2 + local16 / 2 + Static121.anInt2969 + local16 + 5;
		} else if (Static121.anInt2970 - local16 < local27) {
			local49 = Static121.anInt2970 - local16 - local16 / 2 - local34 / 2 - 5;
			local27 = Static121.anInt2970 - local16;
		}
		@Pc(167) int local167 = arg0.anInt1764 - local36 / 2;
		if (local30 < local16 + Static121.anInt2968) {
			local30 = Static121.anInt2968 + local16;
			local167 = local16 / 2 + local16 + Static121.anInt2968 + Static172.aClass108_5.method2339();
		} else if (Static121.anInt2971 - local16 < local30) {
			local167 = Static121.anInt2971 - local16 - local16 / 2 - local36;
			local30 = Static121.anInt2971 - local16;
		}
		@Pc(218) int local218 = -2;
		@Pc(220) int local220 = -2;
		local16 >>= 0x1;
		@Pc(226) int local226 = -2;
		local77 = (int) (Math.atan2((double) (local27 - arg0.anInt1766), (double) (local30 - arg0.anInt1764)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(252) int local252 = -2;
		local5.method1314(local5.anInt3412 << 3, local5.anInt3410 << 3, local16 + (local27 << 4), local16 + (local30 << 4), local77);
		if (arg1.aString131 != null) {
			local220 = local167 - Static172.aClass108_5.method2335() - 3;
			local218 = local49 - local34 / 2 - 5;
			local252 = local32 * Static172.aClass108_5.method2339() + local220;
			local226 = local34 + local218 + 10;
			if (arg1.anInt2274 != 0) {
				Static270.method4250(local218, local220, local226 - local218, -local220 + local252, arg1.anInt2274, arg1.anInt2274 >>> 24);
			}
			if (arg1.anInt2280 != 0) {
				Static270.method4258(local218, local220, local226 - local218, -local220 + local252, arg1.anInt2280, arg1.anInt2280 >>> 24);
			}
			for (@Pc(353) int local353 = 0; local353 < local32; local353++) {
				@Pc(364) String local364 = Static200.aStringArray24[local353];
				if (local353 < local32 - 1) {
					local364 = local364.substring(0, local364.length() - 4);
				}
				Static172.aClass108_5.method2337(local364, local49, local167, arg1.anInt2286);
				local167 += Static172.aClass108_5.method2339();
			}
		}
		if ((Static286.anInt5358 <= local27 - local16 || local27 + local16 <= Static286.anInt5358 || Static312.anInt6042 <= local30 - local16 || Static312.anInt6042 >= local30 + local16) && (Static286.anInt5358 <= local218 || local226 <= Static286.anInt5358 || local220 >= Static312.anInt6042 || Static312.anInt6042 >= local252)) {
			return;
		}
		if (arg1.aStringArray15[4] != null) {
			Static84.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[4], (short) 1011, -1);
		}
		if (arg1.aStringArray15[3] != null) {
			Static84.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[3], (short) 1003, -1);
		}
		if (arg1.aStringArray15[2] != null) {
			Static84.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[2], (short) 1008, -1);
		}
		if (arg1.aStringArray15[1] != null) {
			Static84.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[1], (short) 1002, -1);
		}
		if (arg1.aStringArray15[0] != null) {
			Static84.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[0], (short) 1012, -1);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
	public static int method4368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(21) int local21 = arg2 - 1 & arg1;
		@Pc(25) int local25 = arg0 / arg2;
		@Pc(31) int local31 = arg2 - 1 & arg0;
		@Pc(36) int local36 = Static127.method1954(local25, local7);
		@Pc(43) int local43 = Static127.method1954(local25, local7 + 1);
		@Pc(50) int local50 = Static127.method1954(local25 + 1, local7);
		@Pc(59) int local59 = Static127.method1954(local25 + 1, local7 + 1);
		@Pc(66) int local66 = Static36.method562(arg2, local43, local36, local21);
		@Pc(73) int local73 = Static36.method562(arg2, local59, local50, local21);
		return Static36.method562(arg2, local73, local66, local31);
	}
}
