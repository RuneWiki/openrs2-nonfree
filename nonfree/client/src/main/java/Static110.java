import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	public static void method1855(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = Static71.anInt1457;
		@Pc(12) int local12 = Static248.anInt4865;
		@Pc(14) int local14 = Static153.anInt3111;
		@Pc(16) int local16 = Static254.anInt4974;
		@Pc(18) int local18 = Static56.anInt1258;
		@Pc(21) int local21 = (int) Static276.aFloat156;
		if (local21 < Static134.anInt2667 / 256) {
			local21 = Static134.anInt2667 / 256;
		}
		if (Static278.aBooleanArray35[4] && Static139.anIntArray229[4] + 128 > local21) {
			local21 = Static139.anIntArray229[4] + 128;
		}
		@Pc(64) int local64 = Static259.anInt5087 + (int) Static126.aFloat73 & 0x7FF;
		Static98.method1587(local21, arg0, Static81.anInt1698, local21 * 3 + 600, local64, Static58.method2504(Static72.aClass13_Sub5_Sub1_1.anInt5294, Static72.aClass13_Sub5_Sub1_1.anInt5334, Static222.anInt4467) - 50, Static153.anInt3107);
		if (local10 == Static71.anInt1457 && Static153.anInt3111 == local14 && local12 == Static248.anInt4865 && Static254.anInt4974 == local16 && local18 == Static56.anInt1258) {
			Static99.anInt1946 = 1;
			return;
		}
		Static237.anInt4705 = 10;
		Static158.anInt3234 = 10;
		Static158.anInt3240 = 10;
		Static288.anInt5628 = 10;
		if (Static71.anInt1457 > local10) {
			local10 += Static158.anInt3234 + (Static71.anInt1457 - local10) * Static158.anInt3240 / 1000;
			if (local10 < Static71.anInt1457) {
				Static71.anInt1457 = local10;
			}
		}
		if (local10 > Static71.anInt1457) {
			local10 -= Static158.anInt3234 + Static158.anInt3240 * (local10 - Static71.anInt1457) / 1000;
			if (Static71.anInt1457 < local10) {
				Static71.anInt1457 = local10;
			}
		}
		if (local12 < Static248.anInt4865) {
			local12 += Static158.anInt3240 * (Static248.anInt4865 - local12) / 1000 + Static158.anInt3234;
			if (local12 < Static248.anInt4865) {
				Static248.anInt4865 = local12;
			}
		}
		if (local12 > Static248.anInt4865) {
			local12 -= Static158.anInt3234 + Static158.anInt3240 * (local12 - Static248.anInt4865) / 1000;
			if (local12 > Static248.anInt4865) {
				Static248.anInt4865 = local12;
			}
		}
		if (Static153.anInt3111 > local14) {
			local14 += (Static153.anInt3111 - local14) * Static158.anInt3240 / 1000 + Static158.anInt3234;
			if (Static153.anInt3111 > local14) {
				Static153.anInt3111 = local14;
			}
		}
		if (Static254.anInt4974 > local16) {
			local16 += (Static254.anInt4974 - local16) * Static288.anInt5628 / 1000 + Static237.anInt4705;
			if (local16 < Static254.anInt4974) {
				Static254.anInt4974 = local16;
			}
		}
		@Pc(275) int local275 = Static56.anInt1258 - local18;
		if (Static153.anInt3111 < local14) {
			local14 -= Static158.anInt3240 * (local14 - Static153.anInt3111) / 1000 + Static158.anInt3234;
			if (Static153.anInt3111 < local14) {
				Static153.anInt3111 = local14;
			}
		}
		if (local275 > 1024) {
			local275 -= 2048;
		}
		if (local275 < -1024) {
			local275 += 2048;
		}
		if (local275 > 0) {
			local18 += Static237.anInt4705 + Static288.anInt5628 * local275 / 1000;
			local18 &= 0x7FF;
		}
		if (local275 < 0) {
			local18 -= Static237.anInt4705 + -local275 * Static288.anInt5628 / 1000;
			local18 &= 0x7FF;
		}
		if (Static254.anInt4974 < local16) {
			local16 -= Static237.anInt4705 + Static288.anInt5628 * (local16 - Static254.anInt4974) / 1000;
			if (Static254.anInt4974 < local16) {
				Static254.anInt4974 = local16;
			}
		}
		@Pc(380) int local380 = Static56.anInt1258 - local18;
		if (local380 > 1024) {
			local380 -= 2048;
		}
		if (local380 < -1024) {
			local380 += 2048;
		}
		if (local380 >= 0 || local275 <= 0 || local380 > 0 && local275 < 0) {
			Static56.anInt1258 = local18;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lclient!p;")
	public static Class127 method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class127 local14 = local7.aClass127_1;
			local7.aClass127_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method1857(@OriginalArg(1) Class22 arg0) {
		Static44.anInt922 = arg0.method661("titlebg");
		Static180.anInt3625 = arg0.method661("logo");
	}
}
