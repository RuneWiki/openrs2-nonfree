import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt1810;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_965 = Static33.method650("Friends");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_960 = aClass56_965;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt1803 = 0;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_961 = Static33.method650(" )2> @whi@");

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!oa;")
	private static Class56 aClass56_962 = Static33.method650("Password: ");

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_963 = aClass56_962;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_964 = Static33.method650("welle:");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBILclient!ed;I)V")
	public static void method1204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		if (Static106.anInt2625 >= 50 || Static126.anInt3091 == 0 || (arg2.anIntArray57 == null || arg1 >= arg2.anIntArray57.length)) {
			return;
		}
		@Pc(30) int local30 = arg2.anIntArray57[arg1];
		if (local30 == 0) {
			return;
		}
		@Pc(40) int local40 = local30 >> 8;
		@Pc(46) int local46 = local30 >> 4 & 0x7;
		@Pc(55) int local55 = local30 & 0xF;
		Static53.anIntArray106[Static106.anInt2625] = local40;
		@Pc(65) int local65 = (arg0 - 64) / 128;
		Static40.anIntArray69[Static106.anInt2625] = local46;
		Static12.anIntArray26[Static106.anInt2625] = 0;
		@Pc(79) int local79 = (arg3 - 64) / 128;
		Static23.aClass73Array1[Static106.anInt2625] = null;
		Static113.anIntArray288[Static106.anInt2625] = (local65 << 16) + (local79 << 8) + local55;
		Static106.anInt2625++;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!kd;Lclient!ve;I)V")
	public static void method1206(@OriginalArg(1) Class44_Sub1 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class37 local9 = Static45.aClass37_8;
		synchronized (Static45.aClass37_8) {
			for (@Pc(16) Class3_Sub15 local16 = (Class3_Sub15) Static45.aClass37_8.method989(); local16 != null; local16 = (Class3_Sub15) Static45.aClass37_8.method990()) {
				if (local16.aLong94 == (long) arg2 && arg1 == local16.aClass80_4 && local16.anInt2514 == 0) {
					local7 = local16.aByteArray33;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(74) byte[] local74 = arg1.method1959(arg2);
			arg0.method1171(arg1, local74, arg2, true);
		} else {
			arg0.method1171(arg1, local7, arg2, true);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!wb;)V")
	public static void method1207(@OriginalArg(1) Class3_Sub1_Sub2_Sub4 arg0) {
		arg0.anInt3186 = arg0.anInt3162;
		if (arg0.anInt3146 == 0) {
			arg0.anInt3172 = 0;
			return;
		}
		if (arg0.anInt3149 != -1 && arg0.anInt3144 == 0) {
			@Pc(34) Class3_Sub1_Sub4 local34 = Static41.method770(arg0.anInt3149);
			if (arg0.anInt3191 > 0 && local34.anInt860 == 0) {
				arg0.anInt3172++;
				return;
			}
			if (arg0.anInt3191 <= 0 && local34.anInt865 == 0) {
				arg0.anInt3172++;
				return;
			}
		}
		@Pc(72) int local72 = arg0.anInt3196;
		@Pc(75) int local75 = arg0.anInt3187;
		@Pc(91) int local91 = arg0.anIntArray332[arg0.anInt3146 - 1] * 128 + arg0.anInt3190 * 64;
		@Pc(115) int local115 = arg0.anIntArray336[arg0.anInt3146 - 1] * 128 + arg0.anInt3190 * 64;
		if (local91 - local75 > 256 || local91 - local75 < -256 || local115 - local72 > 256 || local115 - local72 < -256) {
			arg0.anInt3196 = local115;
			arg0.anInt3187 = local91;
			return;
		}
		if (local75 < local91) {
			if (local115 > local72) {
				arg0.anInt3183 = 1280;
			} else if (local115 >= local72) {
				arg0.anInt3183 = 1536;
			} else {
				arg0.anInt3183 = 1792;
			}
		} else if (local91 < local75) {
			if (local72 < local115) {
				arg0.anInt3183 = 768;
			} else if (local72 <= local115) {
				arg0.anInt3183 = 512;
			} else {
				arg0.anInt3183 = 256;
			}
		} else if (local115 > local72) {
			arg0.anInt3183 = 1024;
		} else if (local115 < local72) {
			arg0.anInt3183 = 0;
		}
		@Pc(233) int local233 = arg0.anInt3183 - arg0.anInt3156 & 0x7FF;
		@Pc(236) int local236 = arg0.anInt3174;
		if (local233 > 1024) {
			local233 -= 2048;
		}
		if (local233 >= -256 && local233 <= 256) {
			local236 = arg0.anInt3154;
		} else if (local233 >= 256 && local233 < 768) {
			local236 = arg0.anInt3164;
		} else if (local233 >= -768 && local233 <= -256) {
			local236 = arg0.anInt3160;
		}
		@Pc(277) boolean local277 = true;
		if (local236 == -1) {
			local236 = arg0.anInt3154;
		}
		arg0.anInt3186 = local236;
		@Pc(289) int local289 = 4;
		if (arg0 instanceof Class3_Sub1_Sub2_Sub4_Sub2) {
			local277 = ((Class3_Sub1_Sub2_Sub4_Sub2) arg0).aClass3_Sub1_Sub17_1.aBoolean156;
		}
		if (local277) {
			if (arg0.anInt3156 != arg0.anInt3183 && arg0.anInt3197 == -1 && arg0.anInt3188 != 0) {
				local289 = 2;
			}
			if (arg0.anInt3146 > 2) {
				local289 = 6;
			}
			if (arg0.anInt3146 > 3) {
				local289 = 8;
			}
			if (arg0.anInt3172 > 0 && arg0.anInt3146 > 1) {
				arg0.anInt3172--;
				local289 = 8;
			}
		} else {
			if (arg0.anInt3146 > 1) {
				local289 = 6;
			}
			if (arg0.anInt3146 > 2) {
				local289 = 8;
			}
			if (arg0.anInt3172 > 0 && arg0.anInt3146 > 1) {
				arg0.anInt3172--;
				local289 = 8;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt3146 - 1]) {
			local289 <<= 0x1;
		}
		if (local289 >= 8 && arg0.anInt3186 == arg0.anInt3154 && arg0.anInt3173 != -1) {
			arg0.anInt3186 = arg0.anInt3173;
		}
		if (local72 < local115) {
			arg0.anInt3196 += local289;
			if (local115 < arg0.anInt3196) {
				arg0.anInt3196 = local115;
			}
		} else if (local72 > local115) {
			arg0.anInt3196 -= local289;
			if (arg0.anInt3196 < local115) {
				arg0.anInt3196 = local115;
			}
		}
		if (local91 > local75) {
			arg0.anInt3187 += local289;
			if (local91 < arg0.anInt3187) {
				arg0.anInt3187 = local91;
			}
		} else if (local91 < local75) {
			arg0.anInt3187 -= local289;
			if (local91 > arg0.anInt3187) {
				arg0.anInt3187 = local91;
			}
		}
		if (arg0.anInt3187 == local91 && arg0.anInt3196 == local115) {
			if (arg0.anInt3191 > 0) {
				arg0.anInt3191--;
			}
			arg0.anInt3146--;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1208() {
		aClass56_964 = null;
		aClass56_963 = null;
		aClass56_961 = null;
		aClass56_965 = null;
		aClass56_960 = null;
		aClass56_962 = null;
	}
}
