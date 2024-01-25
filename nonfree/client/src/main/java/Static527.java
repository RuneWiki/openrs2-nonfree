import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "Lclient!aj;")
	public static Class15 aClass15_133;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!bba;)V")
	public static void method7603(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray953 == null && arg0.anIntArray954 == null) {
			return;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < arg0.anIntArray953.length; local22++) {
			@Pc(26) int local26 = -1;
			if (arg0.anIntArray953 != null) {
				local26 = arg0.anIntArray953[local22];
			}
			if (local26 != -1) {
				local20 = false;
				@Pc(84) int local84;
				@Pc(96) int local96;
				@Pc(64) int local64;
				if ((local26 & 0xC0000000) == -1073741824) {
					local64 = local26 & 0xFFFFFFF;
					@Pc(68) int local68 = local64 >> 14;
					@Pc(72) int local72 = local64 & 0x3FFF;
					local84 = arg0.anInt10729 - (local68 - Static287.anInt4910) * 512 - 256;
					local96 = arg0.anInt10731 - (local72 - Static72.anInt1361) * 512 - 256;
				} else if ((local26 & 0x8000) == 0) {
					@Pc(112) Class3_Sub3 local112 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local26);
					if (local112 == null) {
						arg0.method9316(local22, -1);
						continue;
					}
					@Pc(117) Class28_Sub1_Sub1_Sub1_Sub2 local117 = local112.aClass28_Sub1_Sub1_Sub1_Sub2_1;
					local96 = arg0.anInt10731 - local117.anInt10731;
					local84 = arg0.anInt10729 - local117.anInt10729;
				} else {
					local64 = local26 & 0x7FFF;
					@Pc(148) Class28_Sub1_Sub1_Sub1_Sub1 local148 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if (local148 == null) {
						arg0.method9316(local22, -1);
						continue;
					}
					local84 = arg0.anInt10729 - local148.anInt10729;
					local96 = arg0.anInt10731 - local148.anInt10731;
				}
				if (local84 != 0 || local96 != 0) {
					arg0.method9316(local22, (int) (Math.atan2((double) local84, (double) local96) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method9316(local22, -1)) {
				local20 = false;
			}
		}
		if (local20) {
			arg0.anIntArray953 = null;
			arg0.anIntArray954 = null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	public static void method7604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static77.method1438(arg0, arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg0 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(35) int local35 = -((arg1 + 7) / 8);
		@Pc(44) int local44 = -((arg0 + 7) / 8);
		for (@Pc(46) int local46 = local35; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local44; local50 < 0; local50++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local21;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
