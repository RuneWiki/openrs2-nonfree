import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!to", name = "T", descriptor = "Lclient!vn;")
	public static Class360 aClass360_1;

	@OriginalMember(owner = "client!to", name = "mb", descriptor = "Lclient!ts;")
	public static Class3_Sub48 aClass3_Sub48_30;

	@OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
	public static int anInt9439;

	@OriginalMember(owner = "client!to", name = "ob", descriptor = "I")
	public static int anInt9440;

	@OriginalMember(owner = "client!to", name = "cb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!to", name = "jb", descriptor = "Lclient!us;")
	public static final Class344 aClass344_116 = new Class344(80, 0);

	@OriginalMember(owner = "client!to", name = "kb", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_12 = null;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!gba;IZLclient!qca;Lclient!ha;)Z")
	public static boolean method7798(@OriginalArg(1) Class3_Sub22 arg0, @OriginalArg(4) Class269 arg1, @OriginalArg(5) Class33 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray511 != null) {
			local9 = Static361.anInt2220 + (arg0.anInt4124 + arg1.anInt8172 - Static361.anInt2224) * (-Static361.anInt2220 + Static361.anInt2231) / (Static361.anInt2221 - Static361.anInt2224);
			local7 = Static361.anInt2220 + (arg0.anInt4124 + arg1.anInt8143 - Static361.anInt2224) * (Static361.anInt2231 - Static361.anInt2220) / (Static361.anInt2221 - Static361.anInt2224);
			local13 = Static361.anInt2227 - (Static361.anInt2227 - Static361.anInt2222) * (arg0.anInt4117 + arg1.anInt8164 - Static361.anInt2225) / (Static361.anInt2223 - Static361.anInt2225);
			local11 = Static361.anInt2227 - (arg1.anInt8147 + arg0.anInt4117 - Static361.anInt2225) * (Static361.anInt2227 - Static361.anInt2222) / (Static361.anInt2223 - Static361.anInt2225);
		}
		@Pc(100) Class5 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(113) int local113 = 0;
		if (arg1.anInt8151 != -1) {
			if (arg0.aBoolean356 && arg1.anInt8169 != -1) {
				local100 = arg1.method6798(true, arg2);
			} else {
				local100 = arg1.method6798(false, arg2);
			}
			if (local100 != null) {
				local102 = arg0.anInt4119 - (local100.method7589() + 1 >> 1);
				local104 = arg0.anInt4119 + (local100.method7589() + 1 >> 1);
				if (local7 > local102) {
					local7 = local102;
				}
				local106 = arg0.anInt4116 - (local100.method7585() + 1 >> 1);
				if (local104 > local9) {
					local9 = local104;
				}
				local113 = arg0.anInt4116 + (local100.method7585() + 1 >> 1);
				if (local106 < local11) {
					local11 = local106;
				}
				if (local113 > local13) {
					local13 = local113;
				}
			}
		}
		@Pc(213) Class29 local213 = null;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(311) int local311;
		if (arg1.aString90 != null) {
			local213 = Static304.method5175(arg1.anInt8148);
			if (local213 != null) {
				local215 = Static89.aClass315_7.method7573(null, null, Static346.aStringArray28, arg1.aString90);
				local217 = arg1.anInt8162 * (Static361.anInt2231 - Static361.anInt2220) / (Static361.anInt2221 - Static361.anInt2224) + arg0.anInt4119;
				local219 = arg0.anInt4116 - (Static361.anInt2227 - Static361.anInt2222) * arg1.anInt8171 / (Static361.anInt2223 - Static361.anInt2225);
				if (local100 == null) {
					local219 -= local213.method734() * local215 / 2;
				} else {
					local219 -= (local100.method7585() >> 1) + local213.method732() * local215;
				}
				for (local311 = 0; local311 < local215; local311++) {
					@Pc(317) String local317 = Static346.aStringArray28[local311];
					if (local311 < local215 - 1) {
						local317 = local317.substring(0, local317.length() - 4);
					}
					@Pc(338) int local338 = local213.method731(local317);
					if (local221 < local338) {
						local221 = local338;
					}
				}
				local223 = local217 - local221 / 2;
				if (local7 > local223) {
					local7 = local223;
				}
				local225 = local217 + local221 / 2;
				if (local9 < local225) {
					local9 = local225;
				}
				local227 = local219;
				if (local227 < local11) {
					local11 = local227;
				}
				local229 = local219 + local215 * local213.method732();
				if (local229 > local13) {
					local13 = local229;
				}
			}
		}
		if (local9 < Static361.anInt2220 || Static361.anInt2231 < local7 || local13 < Static361.anInt2222 || Static361.anInt2227 < local11) {
			return true;
		}
		Static361.method2174(arg2, arg0, arg1);
		if (local100 != null) {
			if (Static473.anInt8493 > 0 && (Static128.anInt3197 != -1 && arg0.anInt4123 == Static128.anInt3197 || Static134.anInt3480 != -1 && Static134.anInt3480 == arg1.anInt8161)) {
				if (Static479.anInt8544 > 50) {
					local311 = (100 - Static479.anInt8544) * 2;
				} else {
					local311 = Static479.anInt8544 * 2;
				}
				@Pc(489) int local489 = local311 << 24 | 0xFFFF00;
				arg2.method6210(arg0.anInt4116, local489, arg0.anInt4119, local100.method7588() / 2 + 7);
				arg2.method6210(arg0.anInt4116, local489, arg0.anInt4119, local100.method7588() / 2 + 5);
				arg2.method6210(arg0.anInt4116, local489, arg0.anInt4119, local100.method7588() / 2 + 3);
				arg2.method6210(arg0.anInt4116, local489, arg0.anInt4119, local100.method7588() / 2 + 1);
				arg2.method6210(arg0.anInt4116, local489, arg0.anInt4119, local100.method7588() / 2);
			}
			local100.method7577(arg0.anInt4119 - (local100.method7589() >> 1), arg0.anInt4116 - (local100.method7585() >> 1));
		}
		if (arg1.aString90 != null && local213 != null) {
			Static441.method6695(arg0, local215, local213, local219, local221, local217, arg1, arg2);
		}
		if (arg1.anInt8151 != -1 || arg1.aString90 != null) {
			@Pc(602) Class3_Sub42 local602 = new Class3_Sub42(arg0);
			local602.anInt9025 = local225;
			local602.anInt9030 = local113;
			local602.anInt9029 = local229;
			local602.anInt9031 = local223;
			local602.anInt9033 = local102;
			local602.anInt9027 = local227;
			local602.anInt9026 = local104;
			local602.anInt9024 = local106;
			Static529.aClass276_54.method6906(local602);
		}
		return false;
	}

	@OriginalMember(owner = "client!to", name = "g", descriptor = "(B)V")
	public static void method7799() {
		Static560.anInt9560 = 0;
		@Pc(23) int local23 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 >> 9) + Static446.anInt8090;
		@Pc(30) int local30 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 >> 9) + Static124.anInt3150;
		if (local23 >= 3053 && local23 <= 3156 && local30 >= 3056 && local30 <= 3136) {
			Static560.anInt9560 = 1;
		}
		if (local23 >= 3072 && local23 <= 3118 && local30 >= 9492 && local30 <= 9535) {
			Static560.anInt9560 = 1;
		}
		if (Static560.anInt9560 == 1 && local23 >= 3139 && local23 <= 3199 && local30 >= 3008 && local30 <= 3062) {
			Static560.anInt9560 = 0;
		}
	}
}
