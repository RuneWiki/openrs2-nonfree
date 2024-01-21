import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!tb;")
	public static Class44 aClass44_14;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!oa;")
	private static Class56 aClass56_379 = Static33.method650("Loading sprites )2 ");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_376 = aClass56_379;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!oa;")
	private static Class56 aClass56_380 = Static33.method650("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_377 = aClass56_380;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt763 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_378 = Static33.method650("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt766 = 0;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_381 = Static33.method650("Handel)4Duell");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method537() {
		aClass56_380 = null;
		aClass56_381 = null;
		aClass56_376 = null;
		aClass44_14 = null;
		aClass56_379 = null;
		aClass56_378 = null;
		aClass56_377 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static44.anIntArrayArray10[local3][local7] = 0;
				Static9.anIntArrayArray2[local3][local7] = 99999999;
			}
		}
		Static44.anIntArrayArray10[arg2][arg9] = 99;
		Static9.anIntArrayArray2[arg2][arg9] = 0;
		local7 = arg2;
		@Pc(56) int local56 = arg9;
		@Pc(58) byte local58 = 0;
		@Pc(60) int local60 = 0;
		Static24.anIntArray49[0] = arg2;
		@Pc(66) boolean local66 = false;
		@Pc(69) int local69 = local58 + 1;
		Static73.anIntArray165[0] = arg9;
		@Pc(74) int local74 = Static24.anIntArray49.length;
		@Pc(79) int[][] local79 = Static115.aClass81Array1[Static94.anInt2470].anIntArrayArray29;
		@Pc(183) int local183;
		while (local69 != local60) {
			local7 = Static24.anIntArray49[local60];
			local56 = Static73.anIntArray165[local60];
			local60 = (local60 + 1) % local74;
			if (arg7 == local7 && arg6 == local56) {
				local66 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static115.aClass81Array1[Static94.anInt2470].method2009(local56, arg1, arg6, arg7, arg3 - 1, local7)) {
					local66 = true;
					break;
				}
				if (arg3 < 10 && Static115.aClass81Array1[Static94.anInt2470].method2000(arg3 - 1, arg1, arg7, local56, local7, arg6)) {
					local66 = true;
					break;
				}
			}
			if (arg10 != 0 && arg4 != 0 && Static115.aClass81Array1[Static94.anInt2470].method2006(arg10, local7, arg8, arg6, arg4, arg7, local56)) {
				local66 = true;
				break;
			}
			local183 = Static9.anIntArrayArray2[local7][local56] + 1;
			if (local7 > 0 && Static44.anIntArrayArray10[local7 - 1][local56] == 0 && (local79[local7 - 1][local56] & 0x1280108) == 0) {
				Static24.anIntArray49[local69] = local7 - 1;
				Static73.anIntArray165[local69] = local56;
				Static44.anIntArrayArray10[local7 - 1][local56] = 2;
				local69 = (local69 + 1) % local74;
				Static9.anIntArrayArray2[local7 - 1][local56] = local183;
			}
			if (local7 < 103 && Static44.anIntArrayArray10[local7 + 1][local56] == 0 && (local79[local7 + 1][local56] & 0x1280180) == 0) {
				Static24.anIntArray49[local69] = local7 + 1;
				Static73.anIntArray165[local69] = local56;
				Static44.anIntArrayArray10[local7 + 1][local56] = 8;
				Static9.anIntArrayArray2[local7 + 1][local56] = local183;
				local69 = (local69 + 1) % local74;
			}
			if (local56 > 0 && Static44.anIntArrayArray10[local7][local56 - 1] == 0 && (local79[local7][local56 - 1] & 0x1280102) == 0) {
				Static24.anIntArray49[local69] = local7;
				Static73.anIntArray165[local69] = local56 - 1;
				local69 = (local69 + 1) % local74;
				Static44.anIntArrayArray10[local7][local56 - 1] = 1;
				Static9.anIntArrayArray2[local7][local56 - 1] = local183;
			}
			if (local56 < 103 && Static44.anIntArrayArray10[local7][local56 + 1] == 0 && (local79[local7][local56 + 1] & 0x1280120) == 0) {
				Static24.anIntArray49[local69] = local7;
				Static73.anIntArray165[local69] = local56 + 1;
				Static44.anIntArrayArray10[local7][local56 + 1] = 4;
				local69 = (local69 + 1) % local74;
				Static9.anIntArrayArray2[local7][local56 + 1] = local183;
			}
			if (local7 > 0 && local56 > 0 && Static44.anIntArrayArray10[local7 - 1][local56 - 1] == 0 && (local79[local7 - 1][local56 - 1] & 0x128010E) == 0 && (local79[local7 - 1][local56] & 0x1280108) == 0 && (local79[local7][local56 - 1] & 0x1280102) == 0) {
				Static24.anIntArray49[local69] = local7 - 1;
				Static73.anIntArray165[local69] = local56 - 1;
				local69 = (local69 + 1) % local74;
				Static44.anIntArrayArray10[local7 - 1][local56 - 1] = 3;
				Static9.anIntArrayArray2[local7 - 1][local56 - 1] = local183;
			}
			if (local7 < 103 && local56 > 0 && Static44.anIntArrayArray10[local7 + 1][local56 - 1] == 0 && (local79[local7 + 1][local56 - 1] & 0x1280183) == 0 && (local79[local7 + 1][local56] & 0x1280180) == 0 && (local79[local7][local56 - 1] & 0x1280102) == 0) {
				Static24.anIntArray49[local69] = local7 + 1;
				Static73.anIntArray165[local69] = local56 - 1;
				local69 = (local69 + 1) % local74;
				Static44.anIntArrayArray10[local7 + 1][local56 - 1] = 9;
				Static9.anIntArrayArray2[local7 + 1][local56 - 1] = local183;
			}
			if (local7 > 0 && local56 < 103 && Static44.anIntArrayArray10[local7 - 1][local56 + 1] == 0 && (local79[local7 - 1][local56 + 1] & 0x1280138) == 0 && (local79[local7 - 1][local56] & 0x1280108) == 0 && (local79[local7][local56 + 1] & 0x1280120) == 0) {
				Static24.anIntArray49[local69] = local7 - 1;
				Static73.anIntArray165[local69] = local56 + 1;
				local69 = (local69 + 1) % local74;
				Static44.anIntArrayArray10[local7 - 1][local56 + 1] = 6;
				Static9.anIntArrayArray2[local7 - 1][local56 + 1] = local183;
			}
			if (local7 < 103 && local56 < 103 && Static44.anIntArrayArray10[local7 + 1][local56 + 1] == 0 && (local79[local7 + 1][local56 + 1] & 0x12801E0) == 0 && (local79[local7 + 1][local56] & 0x1280180) == 0 && (local79[local7][local56 + 1] & 0x1280120) == 0) {
				Static24.anIntArray49[local69] = local7 + 1;
				Static73.anIntArray165[local69] = local56 + 1;
				local69 = (local69 + 1) % local74;
				Static44.anIntArrayArray10[local7 + 1][local56 + 1] = 12;
				Static9.anIntArrayArray2[local7 + 1][local56 + 1] = local183;
			}
		}
		Static32.anInt956 = 0;
		@Pc(788) int local788;
		@Pc(794) int local794;
		@Pc(800) int local800;
		if (!local66) {
			if (!arg5) {
				return false;
			}
			local183 = 1000;
			local788 = 100;
			for (local794 = arg7 - 10; local794 <= arg7 + 10; local794++) {
				for (local800 = arg6 - 10; local800 <= arg6 + 10; local800++) {
					if (local794 >= 0 && local800 >= 0 && local794 < 104 && local800 < 104 && Static9.anIntArrayArray2[local794][local800] < 100) {
						@Pc(833) int local833 = 0;
						@Pc(835) int local835 = 0;
						if (local800 < arg6) {
							local835 = arg6 - local800;
						} else if (local800 > arg6 + arg4 - 1) {
							local835 = local800 + 1 - arg6 - arg4;
						}
						if (local794 < arg7) {
							local833 = arg7 - local794;
						} else if (arg10 + arg7 - 1 < local794) {
							local833 = local794 + 1 - arg10 - arg7;
						}
						@Pc(910) int local910 = local833 * local833 + local835 * local835;
						if (local183 > local910 || local910 == local183 && local788 > Static9.anIntArrayArray2[local794][local800]) {
							local183 = local910;
							local56 = local800;
							local7 = local794;
							local788 = Static9.anIntArrayArray2[local794][local800];
						}
					}
				}
			}
			if (local183 == 1000) {
				return false;
			}
			if (arg2 == local7 && arg9 == local56) {
				return false;
			}
			Static32.anInt956 = 1;
		}
		@Pc(986) byte local986 = 0;
		Static24.anIntArray49[0] = local7;
		local60 = local986 + 1;
		Static73.anIntArray165[0] = local56;
		local183 = local788 = Static44.anIntArrayArray10[local7][local56];
		while (local7 != arg2 || arg9 != local56) {
			if (local183 != local788) {
				Static24.anIntArray49[local60] = local7;
				local788 = local183;
				Static73.anIntArray165[local60++] = local56;
			}
			if ((local183 & 0x2) != 0) {
				local7++;
			} else if ((local183 & 0x8) != 0) {
				local7--;
			}
			if ((local183 & 0x1) != 0) {
				local56++;
			} else if ((local183 & 0x4) != 0) {
				local56--;
			}
			local183 = Static44.anIntArrayArray10[local7][local56];
		}
		if (local60 > 0) {
			local74 = local60--;
			if (local74 > 25) {
				local74 = 25;
			}
			@Pc(1085) int local1085 = Static24.anIntArray49[local60];
			local794 = Static73.anIntArray165[local60];
			if (arg0 == 0) {
				Static111.aClass3_Sub2_Sub1_4.method325(237);
				Static111.aClass3_Sub2_Sub1_4.method303(local74 + local74 + 3);
			}
			if (arg0 == 1) {
				Static111.aClass3_Sub2_Sub1_4.method325(54);
				Static111.aClass3_Sub2_Sub1_4.method303(local74 + local74 + 17);
			}
			if (arg0 == 2) {
				Static111.aClass3_Sub2_Sub1_4.method325(100);
				Static111.aClass3_Sub2_Sub1_4.method303(local74 + local74 + 3);
			}
			Static111.aClass3_Sub2_Sub1_4.method289(local794 + Static57.anInt1618);
			Static111.aClass3_Sub2_Sub1_4.method290(local1085 + Static18.anInt497);
			Static111.aClass3_Sub2_Sub1_4.method292(Static71.aBooleanArray8[82] ? 1 : 0);
			Static75.anInt2022 = Static73.anIntArray165[0];
			Static38.anInt1028 = Static24.anIntArray49[0];
			for (local800 = 1; local800 < local74; local800++) {
				local60--;
				Static111.aClass3_Sub2_Sub1_4.method292(Static24.anIntArray49[local60] - local1085);
				Static111.aClass3_Sub2_Sub1_4.method295(Static73.anIntArray165[local60] - local794);
			}
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
