import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZ)V")
	public static void method6780(@OriginalArg(1) boolean arg0) {
		Static439.method6528();
		if (!Static80.method1260(Static469.anInt7883)) {
			return;
		}
		Static294.anInt4739++;
		if (Static294.anInt4739 < 50 && !arg0) {
			return;
		}
		Static294.anInt4739 = 0;
		if (!Static156.aBoolean236 && Static487.aClass30_2 != null) {
			@Pc(47) Class5_Sub40 local47 = Static25.method507(Static98.aClass208_2, Static389.aClass181_54);
			Static612.method8496(local47);
			try {
				Static483.method6971();
			} catch (@Pc(56) IOException local56) {
				Static156.aBoolean236 = true;
			}
		}
		Static439.method6528();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method6785(@OriginalArg(1) Class126 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static144.aBoolean196) {
			local7 = Static577.method8147();
			local9 = Static601.method8395();
		}
		arg0.KA(local7, local9, Static254.anInt4283 + local7, local9 + 350);
		arg0.aa(local7, local9, Static254.anInt4283, 350, Static109.anInt1732 << 24 | 0x332277, 1);
		Static354.method5603(local7 + Static254.anInt4283, local7, local9 + 350, local9);
		@Pc(54) int local54 = 350 / Static135.anInt2215;
		@Pc(62) int local62;
		if (Static496.anInt8473 > 0) {
			local62 = 346 - Static135.anInt2215 - 4;
			@Pc(72) int local72 = local54 * local62 / (Static496.anInt8473 + local54 - 1);
			@Pc(74) int local74 = 4;
			if (Static496.anInt8473 > 1) {
				local74 = (local62 - local72) * (-Static64.anInt1040 + Static496.anInt8473 + -1) / (Static496.anInt8473 - 1) + 4;
			}
			arg0.aa(Static254.anInt4283 + local7 - 16, local74 + local9, 12, local72, Static109.anInt1732 << 24 | 0x332277, 2);
			for (@Pc(115) int local115 = Static64.anInt1040; local115 < local54 + Static64.anInt1040 && local115 < Static496.anInt8473; local115++) {
				@Pc(124) String[] local124 = Static132.method1987(Static276.aStringArray39[local115], '\b');
				@Pc(133) int local133 = (Static254.anInt4283 - 16 - 8) / local124.length;
				for (@Pc(135) int local135 = 0; local135 < local124.length; local135++) {
					@Pc(143) int local143 = local133 * local135 + 8;
					arg0.KA(local143 + local7, local9, local133 + local7 + local143 - 8, local9 - -350);
					Static437.aClass6_11.method7214(local7 + local143, Static10.method190(local124[local135]), local9 + 350 - Static220.anInt3792 - Static530.aClass298_13.anInt8040 - Static135.anInt2215 * (local115 - Static64.anInt1040) - 2, -16777216, -1);
				}
			}
		}
		Static288.aClass6_8.method7221(-1, Static254.anInt4283 + local7 - 25, -16777216, local9 + 330, "Build: 640");
		arg0.KA(local7, local9, local7 + Static254.anInt4283, local9 + 350);
		arg0.method7033(local9 + 350 - Static220.anInt3792, Static254.anInt4283, local7, -1);
		Static471.aClass6_12.method7214(local7 + 10, "--> " + Static10.method190(Static1.aString102), local9 + 349 - Static457.aClass298_11.anInt8040, -16777216, -1);
		if (!Static292.aBoolean386) {
			return;
		}
		local62 = -1;
		if (Static235.anInt3998 % 30 > 15) {
			local62 = 16777215;
		}
		arg0.method7059(local62, 12, local9 + 339 - Static457.aClass298_11.anInt8040, Static457.aClass298_11.method6965("--> " + Static10.method190(Static1.aString102).substring(0, Static237.anInt4012)) + (local7 - -10));
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IC)Z")
	public static boolean method6787(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
