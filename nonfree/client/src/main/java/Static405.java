import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Lclient!dj;")
	public static Class66 aClass66_8;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!dn;")
	public static Class69 aClass69_77;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_106 = new Class252(60, 11);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static452.method6975(Static119.anInt2469, arg3 + arg0, Static325.anInt6148);
		@Pc(34) int local34 = Static452.method6975(Static119.anInt2469, arg0 - arg3, Static325.anInt6148);
		Static313.method5430(local26, arg2, Static143.anIntArrayArray33[arg1], local34);
		while (local13 > local11) {
			local18 += 2;
			local16 += local18;
			@Pc(66) int local66;
			@Pc(71) int local71;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local66 = arg1 - local13;
				local71 = arg1 + local13;
				if (Static94.anInt2057 <= local71 && Static187.anInt3872 >= local66) {
					local85 = Static452.method6975(Static119.anInt2469, local11 + arg0, Static325.anInt6148);
					local94 = Static452.method6975(Static119.anInt2469, arg0 - local11, Static325.anInt6148);
					if (local71 <= Static187.anInt3872) {
						Static313.method5430(local85, arg2, Static143.anIntArrayArray33[local71], local94);
					}
					if (Static94.anInt2057 <= local66) {
						Static313.method5430(local85, arg2, Static143.anIntArrayArray33[local66], local94);
					}
				}
			}
			local11++;
			local66 = arg1 - local11;
			local71 = local11 + arg1;
			if (local71 >= Static94.anInt2057 && Static187.anInt3872 >= local66) {
				local85 = Static452.method6975(Static119.anInt2469, arg0 + local13, Static325.anInt6148);
				local94 = Static452.method6975(Static119.anInt2469, arg0 - local13, Static325.anInt6148);
				if (Static187.anInt3872 >= local71) {
					Static313.method5430(local85, arg2, Static143.anIntArrayArray33[local71], local94);
				}
				if (Static94.anInt2057 <= local66) {
					Static313.method5430(local85, arg2, Static143.anIntArrayArray33[local66], local94);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII[B)V")
	public static void method6455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		arg1 += arg0;
		@Pc(23) int local23 = arg2 - arg0 >> 2;
		while (true) {
			local23--;
			if (local23 < 0) {
				local23 = arg2 - arg0 & 0x3;
				while (true) {
					local23--;
					if (local23 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(28) int local28 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg3[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			arg1 = local38 + 1;
			arg3[local38] = 1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method6457(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) char local8 = ',';
		@Pc(10) char local10 = '.';
		if (arg2 == 0) {
			local10 = ',';
			local8 = '.';
		}
		if (arg2 == 2) {
			local10 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local25 = true;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(43) int local43;
		@Pc(48) int local48;
		if (arg3 > 0) {
			for (local43 = 0; local43 < arg3; local43++) {
				local48 = (int) arg0;
				arg0 /= 10L;
				local39.append((char) (local48 + 48 - (int) arg0 * 10));
			}
			local39.append(local8);
		}
		local43 = 0;
		while (true) {
			local48 = (int) arg0;
			arg0 /= 10L;
			local39.append((char) (local48 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg1) {
				local43++;
				if (local43 % 3 == 0) {
					local39.append(local10);
				}
			}
		}
	}
}
