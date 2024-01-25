import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public static int anInt7122;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[Lclient!ec;")
	public static final Class81[] aClass81Array2 = new Class81[14];

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6066(@OriginalArg(0) String arg0) {
		return Static596.method8084(arg0, 10);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILclient!paa;B)V")
	public static void method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2) {
		if (arg2.aByte95 == 0) {
			arg2.anInt6642 = arg2.anInt6657;
		} else if (arg2.aByte95 == 1) {
			arg2.anInt6642 = (arg0 - arg2.anInt6595) / 2 + arg2.anInt6657;
		} else if (arg2.aByte95 == 2) {
			arg2.anInt6642 = arg0 - arg2.anInt6657 - arg2.anInt6595;
		} else if (arg2.aByte95 == 3) {
			arg2.anInt6642 = arg0 * arg2.anInt6657 >> 14;
		} else if (arg2.aByte95 == 4) {
			arg2.anInt6642 = (arg0 - arg2.anInt6595) / 2 + (arg0 * arg2.anInt6657 >> 14);
		} else {
			arg2.anInt6642 = arg0 - arg2.anInt6595 - (arg0 * arg2.anInt6657 >> 14);
		}
		if (arg2.aByte96 == 0) {
			arg2.anInt6623 = arg2.anInt6632;
		} else if (arg2.aByte96 == 1) {
			arg2.anInt6623 = (arg1 - arg2.anInt6622) / 2 + arg2.anInt6632;
		} else if (arg2.aByte96 == 2) {
			arg2.anInt6623 = arg1 - arg2.anInt6632 - arg2.anInt6622;
		} else if (arg2.aByte96 == 3) {
			arg2.anInt6623 = arg1 * arg2.anInt6632 >> 14;
		} else if (arg2.aByte96 == 4) {
			arg2.anInt6623 = (arg2.anInt6632 * arg1 >> 14) + (arg1 - arg2.anInt6622) / 2;
		} else {
			arg2.anInt6623 = arg1 - arg2.anInt6622 - (arg2.anInt6632 * arg1 >> 14);
		}
		if (!Static488.aBoolean602 || Static76.method1071(arg2).anInt8108 == 0 && arg2.anInt6635 != 0) {
			return;
		}
		if (arg2.anInt6623 < 0) {
			arg2.anInt6623 = 0;
		} else if (arg2.anInt6623 + arg2.anInt6622 > arg1) {
			arg2.anInt6623 = arg1 - arg2.anInt6622;
		}
		if (arg2.anInt6642 < 0) {
			arg2.anInt6642 = 0;
		} else if (arg2.anInt6595 + arg2.anInt6642 > arg0) {
			arg2.anInt6642 = arg0 - arg2.anInt6595;
			return;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!oq;ILjava/lang/String;Lclient!da;ZLclient!ha;)V")
	public static void method6068(@OriginalArg(0) Class256 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class95 arg4) {
		@Pc(12) boolean local12 = !Static384.aBoolean439 || Static235.method3205();
		if (!local12) {
			return;
		}
		@Pc(34) int local34;
		@Pc(43) int local43;
		if (Static384.aBoolean439 && local12) {
			@Pc(138) Class256 local138 = Static469.aClass256_2;
			@Pc(144) Class62 local144 = arg4.method6956(local138, Static276.aClass329Array1);
			local34 = local138.method5533(250, arg1, null);
			local43 = local138.method5536(local138.anInt6425, 250, arg1, null);
			@Pc(163) int local163 = Static166.aClass329_3.anInt8813;
			@Pc(167) int local167 = local163 + 4;
			local43 += local167 * 2;
			local34 += local167 * 2;
			if (local34 < Static558.anInt9099) {
				local34 = Static558.anInt9099;
			}
			if (Static396.anInt6226 > local43) {
				local43 = Static396.anInt6226;
			}
			@Pc(206) int local206 = Static594.aClass361_11.method8101(Static66.anInt10099, local34) + Static551.anInt9026;
			@Pc(214) int local214 = Static88.aClass306_1.method6899(local43, Static364.anInt5763) + Static250.anInt4005;
			if (Static319.aBoolean356) {
				local206 += Static274.method3801();
				local214 += Static69.method966();
			}
			arg4.method6980(Static8.aClass329_1, false).method6435(Static283.aClass329_7.anInt8813 + local206, local214 + Static283.aClass329_7.anInt8812, local34 - Static283.aClass329_7.anInt8813 * 2, -(Static283.aClass329_7.anInt8812 * 2) + local43, 1, 0, 0);
			arg4.method6980(Static283.aClass329_7, true).method6431(local206, local214);
			Static283.aClass329_7.method7417();
			arg4.method6980(Static283.aClass329_7, true).method6431(local206 + local34 - local163, local214);
			Static283.aClass329_7.method7420();
			arg4.method6980(Static283.aClass329_7, true).method6431(local34 + local206 - local163, -local163 + (local214 - -local43));
			Static283.aClass329_7.method7417();
			arg4.method6980(Static283.aClass329_7, true).method6431(local206, local214 + local43 - local163);
			Static283.aClass329_7.method7420();
			arg4.method6980(Static166.aClass329_3, true).method6439(local206, Static283.aClass329_7.anInt8812 + local214, local163, local43 - Static283.aClass329_7.anInt8812 * 2);
			Static166.aClass329_3.method7424();
			arg4.method6980(Static166.aClass329_3, true).method6439(local206 + Static283.aClass329_7.anInt8813, local214, local34 - Static283.aClass329_7.anInt8813 * 2, local163);
			Static166.aClass329_3.method7424();
			arg4.method6980(Static166.aClass329_3, true).method6439(local206 + local34 - local163, Static283.aClass329_7.anInt8812 + local214, local163, local43 - Static283.aClass329_7.anInt8812 * 2);
			Static166.aClass329_3.method7424();
			arg4.method6980(Static166.aClass329_3, true).method6439(Static283.aClass329_7.anInt8813 + local206, -local163 + local43 + local214, local34 - Static283.aClass329_7.anInt8813 * 2, local163);
			Static166.aClass329_3.method7424();
			local144.method5680(null, 1, local167 + local206, 0, Static609.anInt9822 | 0xFF000000, 0, -1, null, 0, arg1, local167 + local214, 1, null, local34 - local167 * 2, -(local167 * 2) + local43);
			Static252.method3508(local34, local206, local43, local214);
		} else {
			local34 = arg0.method5533(250, arg1, null);
			local43 = arg0.method5537(null, arg1, 250) * 13;
			arg4.aa(6, 6, local34 + 8, 4 + 4 + local43, -16777216, 0);
			arg4.method6997(6, 6, local34 + 4 + 4, local43 + 4 + 4, -1, 0);
			arg2.method5680(null, 1, 10, 0, -1, 0, -1, null, 0, arg1, 10, 1, null, local34, local43);
			Static252.method3508(local34 + 4 + 4, 6, local43 + 4 + 4, 6);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static319.aBoolean356) {
				Static211.method2745();
			} else {
				arg4.method6975();
			}
		} catch (@Pc(457) Exception_Sub1 local457) {
		}
	}
}
