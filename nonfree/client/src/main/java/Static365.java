import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "Lclient!oh;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
	public static int anInt6941;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Lclient!vi;")
	public static final Class357 aClass357_2 = new Class357(16);

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public static int anInt6937 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Z")
	public static boolean method5961(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([BBII)I")
	public static int method5964(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg2; local9++) {
			local7 = Class245.anIntArray451[(local7 ^ arg0[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)V")
	public static void method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static556.method8018(13, arg0);
		local12.method3608();
		local12.anInt4062 = arg1;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!uea;Lclient!ha;Lclient!bm;I)V")
	public static void method5966(@OriginalArg(0) Class3_Sub49 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class36 arg2) {
		@Pc(14) Class24 local14 = arg2.method1407(arg1);
		if (local14 == null) {
			return;
		}
		@Pc(20) int local20 = local14.method8558();
		if (local14.method8578() > local20) {
			local20 = local14.method8578();
		}
		@Pc(36) int local36 = arg0.anInt9438;
		@Pc(39) int local39 = arg0.anInt9440;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(82) int local82;
		if (arg2.aString5 != null) {
			local41 = Static607.aClass282_15.method7136(null, arg2.aString5, Static609.aStringArray38, null);
			for (local59 = 0; local59 < local41; local59++) {
				@Pc(65) String local65 = Static609.aStringArray38[local59];
				if (local59 < local41 - 1) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local82 = Static357.aClass172_6.method4403(local65);
				if (local82 > local43) {
					local43 = local82;
				}
			}
			local45 = Static357.aClass172_6.method4399() * local41 + Static357.aClass172_6.method4402() / 2;
		}
		local59 = arg0.anInt9438 + local20 / 2;
		@Pc(116) int local116 = arg0.anInt9440;
		if (local36 < local20 + Static110.anInt3018) {
			local36 = Static110.anInt3018;
			local59 = local20 / 2 + Static110.anInt3018 + local43 / 2 + 10 + 5;
		} else if (local36 > Static110.anInt3017 - local20) {
			local59 = Static110.anInt3017 - local43 / 2 - local20 / 2 - 5 - 10;
			local36 = Static110.anInt3017 - local20;
		}
		if (local39 < Static110.anInt3016 + local20) {
			local116 = Static110.anInt3016 + local20 / 2 + 10;
			local39 = Static110.anInt3016;
		} else if (Static110.anInt3021 - local20 < local39) {
			local39 = Static110.anInt3021 - local20;
			local116 = Static110.anInt3021 - local45 - local20 / 2 - 10;
		}
		local82 = (int) (Math.atan2((double) (local36 - arg0.anInt9438), (double) (local39 - arg0.anInt9440)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local14.method8568((float) local36 + (float) local20 / 2.0F, (float) local39 + (float) local20 / 2.0F, 4096, local82);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		if (arg2.aString5 != null) {
			local261 = local116;
			local259 = local59 - local43 / 2 - 5;
			local265 = local41 * Static357.aClass172_6.method4399() + local116 + 3;
			local263 = local259 + local43 + 10;
			if (arg2.anInt1353 != 0) {
				arg1.method7528(local259, local265 - local116, local263 + -local259, local116, arg2.anInt1353);
			}
			if (arg2.anInt1346 != 0) {
				arg1.method7513(local259, local116, local265 - local116, -local259 + local263, arg2.anInt1346);
			}
			for (@Pc(336) int local336 = 0; local336 < local41; local336++) {
				@Pc(342) String local342 = Static609.aStringArray38[local336];
				if (local336 < local41 - 1) {
					local342 = local342.substring(0, local342.length() - 4);
				}
				Static357.aClass172_6.method4398(arg1, local342, local59, local116, arg2.anInt1335);
				local116 += Static357.aClass172_6.method4399();
			}
		}
		if (arg2.anInt1339 == -1 && arg2.aString5 == null) {
			return;
		}
		local20 >>= 0x1;
		@Pc(390) Class3_Sub33 local390 = new Class3_Sub33(arg0);
		local390.anInt5141 = local259;
		local390.anInt5137 = local263;
		local390.anInt5139 = local36 - local20;
		local390.anInt5135 = local261;
		local390.anInt5140 = local39 - local20;
		local390.anInt5134 = local36 + local20;
		local390.anInt5143 = local265;
		local390.anInt5138 = local39 + local20;
		Static566.aClass223_60.method5868(local390);
	}
}
