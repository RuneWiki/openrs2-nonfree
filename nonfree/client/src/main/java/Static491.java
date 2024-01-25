import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
	public static void method6670() {
		Static391.aClass130_42.method3541();
		Static406.aClass130_44.method3541();
		@Pc(21) int local21;
		for (@Pc(16) Class3_Sub44 local16 = (Class3_Sub44) Static187.aClass130_15.method3543(); local16 != null; local16 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			local21 = local16.anInt7685;
			if (local21 < 1000) {
				local16.method7812();
				if (local21 == 51 || local21 == 6 || local21 == 20 || local21 == 44 || local21 == 12 || local21 == 5 || local21 == 57) {
					Static406.aClass130_44.method3548(local16);
				} else {
					Static391.aClass130_42.method3548(local16);
				}
			}
		}
		Static391.aClass130_42.method3549(Static187.aClass130_15);
		Static406.aClass130_44.method3549(Static187.aClass130_15);
		if (Static151.anInt3123 <= 1) {
			Static99.aClass3_Sub44_2 = null;
		} else if (Static522.aBoolean641 && Static478.aClass127_1.method3276(81) && Static151.anInt3123 > 2) {
			Static99.aClass3_Sub44_2 = (Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286.aClass3_286;
		} else {
			Static99.aClass3_Sub44_2 = (Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286;
		}
		local21 = -1;
		@Pc(130) Class3_Sub24 local130 = (Class3_Sub24) Static205.aClass130_20.method3543();
		if (local130 != null) {
			local21 = local130.method7746();
		}
		if (!Static255.aBoolean352) {
			if (local21 == 0 && (Static451.anInt7402 == 1 && Static151.anInt3123 > 2 || Static325.method5045())) {
				local21 = 2;
			}
			if (local21 == 2 && Static151.anInt3123 > 0 && local130 != null) {
				if (Static265.aClass203_82 == null && Static366.anInt6302 == 0) {
					Static4.method57(local130.method7748(), local130.method7751());
				} else {
					Static114.anInt2640 = 2;
				}
			}
			if (local21 == 0 && Static151.anInt3123 > 0) {
				Static455.method6315();
			}
			if (Static265.aClass203_82 != null || Static366.anInt6302 != 0) {
				return;
			}
			Static114.anInt2640 = 0;
			Static106.aClass3_Sub44_3 = null;
			return;
		}
		@Pc(146) int local146;
		@Pc(150) int local150;
		if (local21 == -1) {
			local146 = Static563.aClass156_1.method5689();
			local150 = Static563.aClass156_1.method5690();
			if (local146 < Static50.anInt1065 - 10 || local146 > Static324.anInt5822 + Static50.anInt1065 + 10 || local150 < Static343.anInt6039 - 10 || local150 > Static32.anInt717 + Static343.anInt6039 + 10) {
				Static47.method788();
			}
		}
		if (local21 != 0) {
			return;
		}
		local146 = Static50.anInt1065;
		local150 = Static343.anInt6039;
		@Pc(192) int local192 = Static324.anInt5822;
		@Pc(196) int local196 = local130.method7748();
		@Pc(200) int local200 = local130.method7751();
		@Pc(202) int local202 = -1;
		@Pc(221) int local221;
		for (@Pc(204) int local204 = 0; local204 < Static151.anInt3123; local204++) {
			if (Static490.aBoolean625) {
				local221 = (Static151.anInt3123 - local204 - 1) * 16 + local150 + 33;
				if (local196 > local146 && local196 < local192 + local146 && local200 > local221 - 13 && local200 < local221 + 4) {
					local202 = local204;
				}
			} else {
				local221 = local150 + (-local204 + (Static151.anInt3123 - 1)) * 16 + 31;
				if (local146 < local196 && local196 < local146 + local192 && local221 - 13 < local200 && local221 + 3 > local200) {
					local202 = local204;
				}
			}
		}
		if (local202 != -1) {
			local221 = 0;
			@Pc(302) Class179 local302 = new Class179(Static187.aClass130_15);
			for (@Pc(307) Class3_Sub44 local307 = (Class3_Sub44) local302.method4380(); local307 != null; local307 = (Class3_Sub44) local302.method4382()) {
				if (local221 == local202) {
					Static377.method5583(local200, local196, local307);
				}
				local221++;
			}
		}
		Static47.method788();
		return;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BIII)V")
	public static void method6671(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(20) int local20 = arg2 - arg3 >> 2;
		arg0 += arg3;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg2 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg0 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
