import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qb", name = "zb", descriptor = "Lclient!cs;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z")
	public static boolean method6283(@OriginalArg(1) int arg0) {
		if (Static172.aBooleanArray7[arg0]) {
			return true;
		} else if (Static9.aClass348_7.method7984(arg0)) {
			@Pc(28) int local28 = Static9.aClass348_7.method7981(arg0);
			if (local28 == 0) {
				Static172.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static535.aClass155ArrayArray2[arg0] == null) {
				Static535.aClass155ArrayArray2[arg0] = new Class155[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static535.aClass155ArrayArray2[arg0][local50] == null) {
					@Pc(66) byte[] local66 = Static9.aClass348_7.method7964(local50, arg0);
					if (local66 != null) {
						@Pc(78) Class155 local78 = Static535.aClass155ArrayArray2[arg0][local50] = new Class155();
						local78.anInt4793 = local50 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method3710(new Class4_Sub13(local66));
					}
				}
			}
			Static172.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method6285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static190.method3138(arg1, arg0) || Static448.method7383(arg0, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([[[BIIILclient!r;IIIBIIII)V")
	public static void method6287(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg6 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg3 = 1;
			arg11 = arg11 + 1 & 0x3;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg11 = arg11 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg11 = arg11 + 3 & 0x3;
			arg3 = 8;
		}
		arg4.IA(arg2, arg5, arg7, arg9, arg8, arg1, arg0[arg3 - 1][arg11], arg6, arg10);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public static void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg1, 5);
		local13.method2303();
		local13.anInt2865 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)I")
	public static int method6294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static319.method5001(arg0 - 1, arg1 + -1) + Static319.method5001(arg0 + 1, arg1 - 1) + Static319.method5001(arg0 - 1, arg1 + 1) + Static319.method5001(arg0 + 1, arg1 + 1);
		@Pc(74) int local74 = Static319.method5001(arg0 - 1, arg1) + Static319.method5001(arg0 + 1, arg1) + Static319.method5001(arg0, arg1 - 1) + Static319.method5001(arg0, arg1 + 1);
		@Pc(79) int local79 = Static319.method5001(arg0, arg1);
		return local79 / 4 + local74 / 8 + local44 / 16;
	}
}
