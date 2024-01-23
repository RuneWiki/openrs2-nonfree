import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public static int anInt937;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!s;")
	public static Class156 aClass156_3;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!ph;")
	public static Class138 aClass138_10;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public static int anInt935 = 0;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
	public static int anInt952 = -1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILclient!id;IZLclient!ef;Lclient!gi;)V")
	public static void method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class1_Sub11 arg5, @OriginalArg(7) Class1_Sub1_Sub10 arg6) {
		@Pc(7) Class133 local7 = null;
		if (arg3.anInt2200 == 0) {
			if ((double) Static58.aFloat31 == 3.0D) {
				local7 = Static152.aClass133_6;
			}
			if ((double) Static58.aFloat31 == 4.0D) {
				local7 = Static61.aClass133_2;
			}
			if ((double) Static58.aFloat31 == 6.0D) {
				local7 = Static263.aClass133_7;
			}
			if ((double) Static58.aFloat31 >= 8.0D) {
				local7 = Static136.aClass133_4;
			}
		} else if (arg3.anInt2200 == 1) {
			if ((double) Static58.aFloat31 == 3.0D) {
				local7 = Static263.aClass133_7;
			}
			if ((double) Static58.aFloat31 == 4.0D) {
				local7 = Static136.aClass133_4;
			}
			if ((double) Static58.aFloat31 == 6.0D) {
				local7 = Static263.aClass133_8;
			}
			if ((double) Static58.aFloat31 >= 8.0D) {
				local7 = Static7.aClass133_1;
			}
		} else if (arg3.anInt2200 == 2) {
			if ((double) Static58.aFloat31 == 3.0D) {
				local7 = Static263.aClass133_8;
			}
			if ((double) Static58.aFloat31 == 4.0D) {
				local7 = Static7.aClass133_1;
			}
			if ((double) Static58.aFloat31 == 6.0D) {
				local7 = Static145.aClass133_5;
			}
			if ((double) Static58.aFloat31 >= 8.0D) {
				local7 = Static117.aClass133_3;
			}
		}
		if (local7 == null) {
			return;
		}
		@Pc(120) int local120 = arg3.anInt2208;
		if (arg6.aBoolean126 && arg3.anInt2190 != -1) {
			local120 = arg3.anInt2190;
		}
		@Pc(139) int local139 = Static289.aClass1_Sub1_Sub12_4.method4418(arg3.aString84, null, Static70.aStringArray13);
		@Pc(142) int local142 = arg6.anInt1637;
		if (arg4) {
			local142 -= local139 * local7.method3271() / 2;
		} else {
			local142 -= arg1 + local7.method3268() * (local139 - 1) + local7.method3271() / 2;
		}
		@Pc(178) int local178 = local142 - local7.method3271();
		local142 += local7.method3271() / 2;
		@Pc(187) int local187 = 0;
		@Pc(189) int local189;
		@Pc(222) int local222;
		for (local189 = 0; local189 < local139; local189++) {
			@Pc(200) String local200 = Static70.aStringArray13[local189];
			if (local189 < local139 - 1) {
				local200 = local200.substring(0, local200.length() - 4);
			}
			local222 = local7.method3267(local200);
			if (local187 < local222) {
				local187 = local222;
			}
		}
		@Pc(239) int local239 = local178 + 2;
		arg5.anInt1106 = arg2 + local178;
		arg5.anInt1109 = arg0 + arg6.anInt1632 - local187 / 2;
		arg5.anInt1116 = local187 / 2 + arg6.anInt1632 + arg0;
		arg5.anInt1118 = local139 * local7.method3268() + local178 + arg2;
		local189 = arg6.anInt1632 - local187 / 2 - 5;
		if (arg3.anInt2210 != 0) {
			Static41.method728(local189, local239, local187 + 10, local178 - -(local139 * local7.method3268()) - (local239 + -1), arg3.anInt2210, arg3.anInt2210 >>> 24);
		}
		if (arg3.anInt2197 != 0) {
			Static41.method727(local189, local239, local187 + 10, local178 + 1 - -(local7.method3268() * local139) + -local239, arg3.anInt2197, arg3.anInt2197 >>> 24);
		}
		for (local222 = 0; local222 < local139; local222++) {
			@Pc(351) String local351 = Static70.aStringArray13[local222];
			if (local139 - 1 > local222) {
				local351 = local351.substring(0, local351.length() - 4);
			}
			@Pc(373) int local373 = local7.method3267(local351);
			if (local373 > local187) {
				local187 = local373;
			}
			local7.method3270(local351, arg6.anInt1632, local142, local120);
			local142 += local7.method3268();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method856(@OriginalArg(1) Class143 arg0) {
		Static309.aClass143_1 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;")
	public static String method865(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		@Pc(26) boolean local26 = false;
		if (arg2 < 0L) {
			local26 = true;
			arg2 = -arg2;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		@Pc(61) int local61;
		@Pc(67) int local67;
		if (arg1 > 0) {
			for (local61 = 0; local61 < arg1; local61++) {
				local67 = (int) arg2;
				arg2 /= 10L;
				local43.append((char) (local67 + 48 - (int) arg2 * 10));
			}
			local43.append(local7);
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		local61 = 0;
		while (true) {
			local67 = (int) arg2;
			arg2 /= 10L;
			local43.append((char) (local67 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local26) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg0) {
				local61++;
				if (local61 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}
}
