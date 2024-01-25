import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "J")
	public static long aLong232 = 0L;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7291(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static230.aCharArray3[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local50.length() - 1;
					local50.setCharAt(local76, Character.toUpperCase(local50.charAt(local76)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
	public static void method7294(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static2.aClass12_Sub4_Sub7_2 != null) {
			Static97.anInt2272 = Static2.aClass12_Sub4_Sub7_2.anInt3088;
		} else {
			Static97.anInt2272 = -1;
		}
		Static22.anInt9607 = 0;
		Static2.aClass12_Sub4_Sub7_2 = null;
		Static284.aClass73_46 = null;
		Static86.aClass198_3 = null;
		Static2.method4950();
		Static2.aClass73_48.method2014();
		Static287.aClass17_27 = null;
		Static88.aClass17_5 = null;
		Static265.anInt5303 = -1;
		Static443.aClass17_38 = null;
		Static20.aClass17_1 = null;
		Static2.aClass159_3 = null;
		Static407.aClass17_35 = null;
		Static198.aClass84_7 = null;
		Static22.aClass17_46 = null;
		Static168.aClass17_43 = null;
		Static544.anInt9625 = -1;
		Static310.aClass17_44 = null;
		Static2.aClass93_5.method2481();
		Static2.aClass292_3.method7211(64, 64);
		Static2.aClass93_5.method2476(128, 64);
		Static2.aClass155_3.method4067(64);
		Static64.aClass296_10.method7293(64);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZIIZ)V")
	public static void method7296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(19) int local19 = arg2 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(46) int local46 = local19 * (Static371.aShort88 - Static467.aShort101) / 100 + Static467.aShort101;
		if (Static497.aShort111 > local46) {
			local46 = Static497.aShort111;
		} else if (local46 > Static337.aShort86) {
			local46 = Static337.aShort86;
		}
		@Pc(68) int local68 = local46 * 512 * arg2 / (arg1 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(80) short local80;
		if (local68 < Static56.aShort33) {
			local80 = Static56.aShort33;
			local46 = local80 * arg1 * 334 / (arg2 * 512);
			if (Static337.aShort86 < local46) {
				local46 = Static337.aShort86;
				local109 = local46 * 512 * arg2 / (local80 * 334);
				local116 = (arg1 - local109) / 2;
				if (arg4) {
					Static243.aClass42_4.n();
					Static243.aClass42_4.method5866(arg3, local116, arg2, -16777216, arg0);
					Static243.aClass42_4.method5866(arg3, local116, arg2, -16777216, arg1 + arg0 - local116);
				}
				arg0 += local116;
				arg1 -= local116 * 2;
			}
		} else if (Static169.aShort56 < local68) {
			local80 = Static169.aShort56;
			local46 = arg1 * local80 * 334 / (arg2 * 512);
			if (local46 < Static497.aShort111) {
				local46 = Static497.aShort111;
				local109 = arg1 * local80 * 334 / (local46 * 512);
				local116 = (arg2 - local109) / 2;
				if (arg4) {
					Static243.aClass42_4.n();
					Static243.aClass42_4.method5866(arg3, arg1, local116, -16777216, arg0);
					Static243.aClass42_4.method5866(arg2 + arg3 - local116, arg1, local116, -16777216, arg0);
				}
				arg2 -= local116 * 2;
				arg3 += local116;
			}
		}
		Static326.anInt6151 = arg3;
		Static474.anInt8686 = arg0;
		Static106.anInt2440 = (short) arg2;
		Static354.anInt6608 = (short) arg1;
		Static225.anInt4816 = local46 * arg2 / 334;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIILclient!mc;JLclient!pa;)V")
	public static void method7297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class198 arg5, @OriginalArg(7) long arg6, @OriginalArg(8) Class145 arg7) {
		@Pc(16) int local16 = arg1 * arg1 + arg0 * arg0;
		if (arg6 < (long) local16) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg5.anInt5762 / 2, arg5.anInt5715 / 2);
		if (local16 <= local32 * local32) {
			Static294.method4768(arg4, arg0, arg7, arg1, Static70.aClass84Array3[arg3], arg5, arg2);
			return;
		}
		local32 -= 10;
		@Pc(66) int local66;
		if (Static242.anInt4993 == 4) {
			local66 = (int) Static500.aFloat186 & 0x3FFF;
		} else {
			local66 = (int) Static500.aFloat186 + Static432.anInt7990 & 0x3FFF;
		}
		@Pc(77) int local77 = Class12_Sub1_Sub36.anIntArray667[local66];
		@Pc(81) int local81 = Class12_Sub1_Sub36.anIntArray668[local66];
		if (Static242.anInt4993 != 4) {
			local81 = local81 * 256 / (Static339.anInt6470 + 256);
			local77 = local77 * 256 / (Static339.anInt6470 + 256);
		}
		@Pc(110) int local110 = local81 * arg0 + arg1 * local77 >> 15;
		@Pc(121) int local121 = arg1 * local81 - local77 * arg0 >> 15;
		@Pc(127) double local127 = Math.atan2((double) local110, (double) local121);
		@Pc(134) int local134 = (int) ((double) local32 * Math.sin(local127));
		@Pc(141) int local141 = (int) (Math.cos(local127) * (double) local32);
		Static139.aClass84Array4[arg3].method7491((float) local134 + (float) arg4 + (float) arg5.anInt5762 / 2.0F, (float) arg2 + (float) arg5.anInt5715 / 2.0F - (float) local141, 4096, (int) (-local127 / 6.283185307179586D * 65535.0D));
	}
}
