import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "Lclient!pj;")
	public static final Class287 aClass287_5 = new Class287();

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "Lclient!c;")
	public static final Class51 aClass51_34 = new Class51(1, 2);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!qp;IIILclient!hga;Lclient!ha;)Z")
	public static boolean method9124(@OriginalArg(0) Class14_Sub39 arg0, @OriginalArg(4) Class152 arg1, @OriginalArg(5) Class144 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(16) int local16 = Integer.MIN_VALUE;
		@Pc(18) int local18 = Integer.MAX_VALUE;
		@Pc(20) int local20 = Integer.MIN_VALUE;
		if (arg1.anIntArray221 != null) {
			local16 = (arg1.anInt4293 + arg0.anInt8788 - Static224.anInt1294) * (Static224.anInt1296 - Static224.anInt1288) / (Static224.anInt1289 - Static224.anInt1294) + Static224.anInt1288;
			local18 = Static224.anInt1297 - (arg0.anInt8790 + arg1.anInt4324 - Static224.anInt1299) * (Static224.anInt1297 - Static224.anInt1293) / (Static224.anInt1290 - Static224.anInt1299);
			local20 = Static224.anInt1297 - (Static224.anInt1297 - Static224.anInt1293) * (arg0.anInt8790 + (arg1.anInt4309 - Static224.anInt1299)) / (Static224.anInt1290 - Static224.anInt1299);
			local7 = Static224.anInt1288 + (arg1.anInt4301 + arg0.anInt8788 - Static224.anInt1294) * (-Static224.anInt1288 + Static224.anInt1296) / (Static224.anInt1289 - Static224.anInt1294);
		}
		@Pc(108) Class45 local108 = null;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg1.anInt4322 != -1) {
			if (arg0.aBoolean620 && arg1.anInt4317 != -1) {
				local108 = arg1.method3805(arg2, true);
			} else {
				local108 = arg1.method3805(arg2, false);
			}
			if (local108 != null) {
				local110 = arg0.anInt8787 - (local108.method7508() + 1 >> 1);
				if (local110 < local7) {
					local7 = local110;
				}
				local112 = arg0.anInt8787 + (local108.method7508() + 1 >> 1);
				local114 = arg0.anInt8786 - (local108.method7504() + 1 >> 1);
				if (local16 < local112) {
					local16 = local112;
				}
				if (local18 > local114) {
					local18 = local114;
				}
				local116 = arg0.anInt8786 + (local108.method7504() + 1 >> 1);
				if (local20 < local116) {
					local20 = local116;
				}
			}
		}
		@Pc(222) Class228 local222 = null;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(238) int local238 = 0;
		@Pc(317) int local317;
		if (arg1.aString43 != null) {
			local222 = Static529.method7841(arg1.anInt4318);
			if (local222 != null) {
				local224 = Static343.aClass350_4.method8354(Static555.aStringArray40, (int[]) null, (Class45[]) null, arg1.aString43);
				local228 = arg0.anInt8786 - arg1.anInt4316 * (Static224.anInt1297 - Static224.anInt1293) / (Static224.anInt1290 - Static224.anInt1299);
				local226 = (Static224.anInt1296 - Static224.anInt1288) * arg1.anInt4294 / (Static224.anInt1289 - Static224.anInt1294) + arg0.anInt8787;
				if (local108 == null) {
					local228 -= local224 * local222.method5506() / 2;
				} else {
					local228 -= (local108.method7504() >> 1) + local224 * local222.method5505();
				}
				for (local317 = 0; local317 < local224; local317++) {
					@Pc(323) String local323 = Static555.aStringArray40[local317];
					if (local224 - 1 > local317) {
						local323 = local323.substring(0, local323.length() - 4);
					}
					@Pc(344) int local344 = local222.method5504(local323);
					if (local344 > local230) {
						local230 = local344;
					}
				}
				local232 = local226 - local230 / 2;
				if (local7 > local232) {
					local7 = local232;
				}
				local234 = local230 / 2 + local226;
				if (local234 > local16) {
					local16 = local234;
				}
				local236 = local228;
				if (local18 > local236) {
					local18 = local236;
				}
				local238 = local224 * local222.method5505() + local228;
				if (local238 > local20) {
					local20 = local238;
				}
			}
		}
		if (local16 < Static224.anInt1288 || Static224.anInt1296 < local7 || local20 < Static224.anInt1293 || local18 > Static224.anInt1297) {
			return true;
		}
		Static224.method1309(arg2, arg0, arg1);
		if (local108 != null) {
			if (Static70.anInt1087 > 0 && (Static474.anInt8161 != -1 && arg0.anInt8785 == Static474.anInt8161 || Static417.anInt7161 != -1 && arg1.anInt4296 == Static417.anInt7161)) {
				if (Static349.anInt5983 > 50) {
					local317 = 200 - Static349.anInt5983 * 2;
				} else {
					local317 = Static349.anInt5983 * 2;
				}
				@Pc(512) int local512 = local317 << 24 | 0xFFFF00;
				arg2.method6910(arg0.anInt8787, local108.method7510() / 2 + 7, arg0.anInt8786, local512);
				arg2.method6910(arg0.anInt8787, local108.method7510() / 2 + 5, arg0.anInt8786, local512);
				arg2.method6910(arg0.anInt8787, local108.method7510() / 2 + 3, arg0.anInt8786, local512);
				arg2.method6910(arg0.anInt8787, local108.method7510() / 2 + 1, arg0.anInt8786, local512);
				arg2.method6910(arg0.anInt8787, local108.method7510() / 2, arg0.anInt8786, local512);
			}
			local108.method7488(arg0.anInt8787 - (local108.method7508() >> 1), arg0.anInt8786 - (local108.method7504() >> 1));
		}
		if (arg1.aString43 != null && local222 != null) {
			Static530.method7848(local222, arg2, local230, local228, local224, arg1, arg0, local226);
		}
		if (arg1.anInt4322 != -1 || arg1.aString43 != null) {
			@Pc(630) Class14_Sub55 local630 = new Class14_Sub55(arg0);
			local630.anInt10874 = local112;
			local630.anInt10867 = local114;
			local630.anInt10872 = local232;
			local630.anInt10880 = local234;
			local630.anInt10870 = local116;
			local630.anInt10876 = local110;
			local630.anInt10873 = local238;
			local630.anInt10877 = local236;
			Static216.aClass32_31.method582(local630);
		}
		return false;
	}
}
