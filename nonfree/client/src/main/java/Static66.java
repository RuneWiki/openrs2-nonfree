import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public static int anInt1741 = 0;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
	public static final int[] anIntArray102 = new int[1024];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public static int method1371() {
		try {
			if (Static5.anInt245 == 0) {
				if (Static449.method6552() - 5000L < Static159.aLong168) {
					return 0;
				}
				Static212.aClass122_4 = Static45.aClass209_127.method4688(Static426.anInt7595, Static338.aString48);
				Static138.aLong138 = Static449.method6552();
				Static5.anInt245 = 1;
			}
			if (Static449.method6552() > Static138.aLong138 + 30000L) {
				return Static53.method1207(1000);
			}
			@Pc(73) int local73;
			@Pc(105) int local105;
			if (Static5.anInt245 == 1) {
				if (Static212.aClass122_4.anInt3557 == 2) {
					return Static53.method1207(1001);
				}
				if (Static212.aClass122_4.anInt3557 != 1) {
					return -1;
				}
				Static177.aClass73_6 = new Class73((Socket) Static212.aClass122_4.anObject7, Static45.aClass209_127);
				Static212.aClass122_4 = null;
				local73 = 0;
				if (Static425.aBoolean363) {
					local73 = Static220.anInt3988;
				}
				Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
				Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_9.anInt6416);
				Static109.aClass6_Sub1_Sub1_5.method6461(local73);
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static141.method1127();
				local105 = Static177.aClass73_6.method1874();
				Static141.method1127();
				if (local105 != 0) {
					return Static53.method1207(local105);
				}
				Static5.anInt245 = 2;
			}
			if (Static5.anInt245 == 2) {
				if (Static177.aClass73_6.method1872() < 2) {
					return -1;
				}
				Static362.anInt6441 = Static177.aClass73_6.method1874();
				Static362.anInt6441 <<= 0x8;
				Static362.anInt6441 += Static177.aClass73_6.method1874();
				Static219.aByteArray49 = new byte[Static362.anInt6441];
				Static294.anInt5209 = 0;
				Static5.anInt245 = 3;
			}
			if (Static5.anInt245 != 3) {
				return -1;
			}
			local73 = Static177.aClass73_6.method1872();
			if (local73 < 1) {
				return -1;
			}
			if (local73 > Static362.anInt6441 - Static294.anInt5209) {
				local73 = Static362.anInt6441 - Static294.anInt5209;
			}
			Static177.aClass73_6.method1877(local73, Static219.aByteArray49, Static294.anInt5209);
			Static294.anInt5209 += local73;
			if (Static294.anInt5209 < Static362.anInt6441) {
				return -1;
			} else if (Static324.method4674(Static219.aByteArray49)) {
				Static266.aClass152_Sub1Array2 = new Class152_Sub1[Static63.anInt1715];
				local105 = 0;
				for (@Pc(214) int local214 = Static301.anInt5335; local214 <= Static383.anInt6838; local214++) {
					@Pc(220) Class152_Sub1 local220 = Static101.method1830(local214);
					if (local220 != null) {
						Static266.aClass152_Sub1Array2[local105++] = local220;
					}
				}
				Static91.aClass6_Sub30_2 = null;
				Static302.anInt5365 = 0;
				Static177.aClass73_6.method1875();
				Static183.anInt4661 = 0;
				Static219.aByteArray49 = null;
				Static177.aClass73_6 = null;
				Static5.anInt245 = 0;
				Static159.aLong168 = Static449.method6552();
				return 0;
			} else {
				return Static53.method1207(1002);
			}
		} catch (@Pc(256) IOException local256) {
			return Static53.method1207(1003);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
	public static void method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static298.method4405(Static62.anIntArrayArray7[arg3], arg1, arg0 + arg2, arg0 + -arg2);
		@Pc(32) int local32 = -1;
		while (local9 > local7) {
			local32 += 2;
			local7++;
			local12 += local32;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static62.anIntArrayArray7[arg3 + local9];
				@Pc(65) int[] local65 = Static62.anIntArrayArray7[arg3 - local9];
				@Pc(69) int local69 = arg0 + local7;
				@Pc(74) int local74 = arg0 - local7;
				Static298.method4405(local59, arg1, local69, local74);
				Static298.method4405(local65, arg1, local69, local74);
			}
			@Pc(90) int local90 = arg0 + local9;
			@Pc(95) int local95 = arg0 - local9;
			@Pc(102) int[] local102 = Static62.anIntArrayArray7[arg3 + local7];
			@Pc(109) int[] local109 = Static62.anIntArrayArray7[arg3 - local7];
			Static298.method4405(local102, arg1, local90, local95);
			Static298.method4405(local109, arg1, local90, local95);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!he;Lclient!he;)V")
	public static void method1374(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		Static289.aClass100_54 = arg0;
		Static150.aClass100_24 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static175.anIntArrayArrayArray8[arg0][local16][local20] == -Static354.anInt6329) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static62.anInt1705) + 1;
			@Pc(142) int local142 = (arg3 << Static62.anInt1705) + 2;
			@Pc(151) int local151 = Static55.aClass86Array1[arg0].method6594(arg1, arg3) + arg5;
			if (!Static75.method1489(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static62.anInt1705) - 1;
			if (!Static75.method1489(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static62.anInt1705) - 1;
			if (!Static75.method1489(local20, local151, local177)) {
				return false;
			} else if (Static75.method1489(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static411.method6068(arg0, arg1, arg3)) {
			local16 = arg1 << Static62.anInt1705;
			local20 = arg3 << Static62.anInt1705;
			return Static75.method1489(local16 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg3) + arg5, local20 + 1) && Static75.method1489(local16 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg3) + arg5, local20 + 1) && Static75.method1489(local16 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg3 + 1) + arg5, local20 + Static168.anInt3377 - 1) && Static75.method1489(local16 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg3 + 1) + arg5, local20 + Static168.anInt3377 - 1);
		} else {
			return false;
		}
	}
}
