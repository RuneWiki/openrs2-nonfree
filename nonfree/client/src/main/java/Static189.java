import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public static int anInt3385;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_31 = new Class181(4, 1);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3005(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static240.method3661(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local6 <= local20 - 1 || Static240.method3661(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(66) byte[] local66 = new byte[local26];
		Static582.method8171(local66, arg0, 0);
		return local66;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	public static void method3006() {
		@Pc(3) Class363[] local3 = Class175.aClass363Array1;
		synchronized (Class175.aClass363Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class175.aClass363Array1.length; local7++) {
				Class175.aClass363Array1[local7] = new Class363();
				Static494.anIntArray664[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!kb;IIIIBIIIII)Z")
	public static boolean method3007(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg4;
		@Pc(14) int local14 = arg5;
		@Pc(23) int local23 = arg4 - 64;
		@Pc(27) int local27 = arg5 - 64;
		Static608.anIntArrayArray61[64][64] = 99;
		Static151.anIntArrayArray14[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static9.anIntArray13[0] = arg4;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static84.anIntArray110[0] = arg5;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray21;
		while (local50 != local47) {
			local12 = Static9.anIntArray13[local47];
			local14 = Static84.anIntArray110[local47];
			@Pc(69) int local69 = local14 - local27;
			@Pc(74) int local74 = local12 - local23;
			local47 = local47 + 1 & 0xFFF;
			@Pc(86) int local86 = local12 - arg0.anInt4545;
			@Pc(91) int local91 = local14 - arg0.anInt4560;
			if (arg3 == -4) {
				if (arg2 == local12 && arg7 == local14) {
					Static30.anInt607 = local14;
					Static142.anInt8583 = local12;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static409.method6259(1, arg8, local14, arg7, 1, arg1, arg2, local12)) {
					Static30.anInt607 = local14;
					Static142.anInt8583 = local12;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg0.method4173(1, arg1, arg8, arg7, local12, arg2, arg9, 1, local14)) {
					Static142.anInt8583 = local12;
					Static30.anInt607 = local14;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg0.method4168(arg2, arg1, 1, arg7, local14, arg8, local12, arg9)) {
					Static142.anInt8583 = local12;
					Static30.anInt607 = local14;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg0.method4175(arg6, local14, arg3, 1, arg2, local12, arg7)) {
					Static142.anInt8583 = local12;
					Static30.anInt607 = local14;
					return true;
				}
			} else if (arg0.method4167(1, arg6, arg3, local12, arg7, arg2, local14)) {
				Static30.anInt607 = local14;
				Static142.anInt8583 = local12;
				return true;
			}
			@Pc(244) int local244 = Static151.anIntArrayArray14[local74][local69] + 1;
			if (local74 > 0 && Static608.anIntArrayArray61[local74 - 1][local69] == 0 && (local55[local86 - 1][local91] & 0x42240000) == 0) {
				Static9.anIntArray13[local50] = local12 - 1;
				Static84.anIntArray110[local50] = local14;
				Static608.anIntArrayArray61[local74 - 1][local69] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local74 - 1][local69] = local244;
			}
			if (local74 < 127 && Static608.anIntArrayArray61[local74 + 1][local69] == 0 && (local55[local86 + 1][local91] & 0x60240000) == 0) {
				Static9.anIntArray13[local50] = local12 + 1;
				Static84.anIntArray110[local50] = local14;
				Static608.anIntArrayArray61[local74 + 1][local69] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local74 + 1][local69] = local244;
			}
			if (local69 > 0 && Static608.anIntArrayArray61[local74][local69 - 1] == 0 && (local55[local86][local91 - 1] & 0x40A40000) == 0) {
				Static9.anIntArray13[local50] = local12;
				Static84.anIntArray110[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local74][local69 - 1] = 1;
				Static151.anIntArrayArray14[local74][local69 - 1] = local244;
			}
			if (local69 < 127 && Static608.anIntArrayArray61[local74][local69 + 1] == 0 && (local55[local86][local91 + 1] & 0x48240000) == 0) {
				Static9.anIntArray13[local50] = local12;
				Static84.anIntArray110[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local74][local69 + 1] = 4;
				Static151.anIntArrayArray14[local74][local69 + 1] = local244;
			}
			if (local74 > 0 && local69 > 0 && Static608.anIntArrayArray61[local74 - 1][local69 - 1] == 0 && (local55[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local55[local86 - 1][local91] & 0x42240000) == 0 && (local55[local86][local91 - 1] & 0x40A40000) == 0) {
				Static9.anIntArray13[local50] = local12 - 1;
				Static84.anIntArray110[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local74 - 1][local69 - 1] = 3;
				Static151.anIntArrayArray14[local74 - 1][local69 - 1] = local244;
			}
			if (local74 < 127 && local69 > 0 && Static608.anIntArrayArray61[local74 + 1][local69 - 1] == 0 && (local55[local86 + 1][local91 - 1] & 0x60E40000) == 0 && (local55[local86 + 1][local91] & 0x60240000) == 0 && (local55[local86][local91 - 1] & 0x40A40000) == 0) {
				Static9.anIntArray13[local50] = local12 + 1;
				Static84.anIntArray110[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local74 + 1][local69 - 1] = 9;
				Static151.anIntArrayArray14[local74 + 1][local69 - 1] = local244;
			}
			if (local74 > 0 && local69 < 127 && Static608.anIntArrayArray61[local74 - 1][local69 + 1] == 0 && (local55[local86 - 1][local91 + 1] & 0x4E240000) == 0 && (local55[local86 - 1][local91] & 0x42240000) == 0 && (local55[local86][local91 + 1] & 0x48240000) == 0) {
				Static9.anIntArray13[local50] = local12 - 1;
				Static84.anIntArray110[local50] = local14 + 1;
				Static608.anIntArrayArray61[local74 - 1][local69 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local74 - 1][local69 + 1] = local244;
			}
			if (local74 < 127 && local69 < 127 && Static608.anIntArrayArray61[local74 + 1][local69 + 1] == 0 && (local55[local86 + 1][local91 + 1] & 0x78240000) == 0 && (local55[local86 + 1][local91] & 0x60240000) == 0 && (local55[local86][local91 + 1] & 0x48240000) == 0) {
				Static9.anIntArray13[local50] = local12 + 1;
				Static84.anIntArray110[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local74 + 1][local69 + 1] = 12;
				Static151.anIntArrayArray14[local74 + 1][local69 + 1] = local244;
			}
		}
		Static30.anInt607 = local14;
		Static142.anInt8583 = local12;
		return false;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIZIB)V")
	public static void method3008(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static347.method8140(arg3, arg0, arg1, arg2, Static106.aClass166_Sub1Array1.length - 1, 0);
		Static635.anInt10309 = 0;
		Static339.aClass5_Sub44_2 = null;
	}
}
