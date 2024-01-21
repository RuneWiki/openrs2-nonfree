import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public static int anInt573;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static final int anInt574 = 50;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
	public static final int[] anIntArray77 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_195 = Static120.method1824("wave:");

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_189 = aClass80_195;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
	public static final int[] anIntArray78 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_190 = Static120.method1824("Please enter your username)3");

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_191 = Static120.method1824("(U0a )2 via: ");

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_192 = Static120.method1824("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_193 = Static120.method1824("Please try again)3");

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
	public static final int[] anIntArray79 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
	public static final int[] anIntArray80 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
	public static final int[] anIntArray81 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public static int anInt576 = -1;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!af;")
	public static final Class5 aClass5_7 = new Class5(128);

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Lclient!rd;")
	public static Class80 aClass80_194 = aClass80_193;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array6 = new Class80[anInt574];

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
	public static final int[] anIntArray82 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_196 = aClass80_195;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
	public static final int[] anIntArray83 = new int[anInt574];

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "Lclient!rd;")
	public static Class80 aClass80_197 = aClass80_190;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Lclient!lg;")
	public static Class3_Sub1_Sub11 method400(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub1_Sub11 local12 = (Class3_Sub1_Sub11) Static170.aClass5_53.method139((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static48.aClass1_Sub1_6.method60(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub11();
		@Pc(43) Class3_Sub17 local43 = new Class3_Sub17(local22);
		local43.anInt2923 = local43.aByteArray40.length - 2;
		@Pc(54) int local54 = local43.method2111();
		@Pc(65) int local65 = local43.aByteArray40.length - local54 - 2 - 12;
		local43.anInt2923 = local65;
		@Pc(72) int local72 = local43.method2132();
		local12.anInt2177 = local43.method2111();
		local12.anInt2175 = local43.method2111();
		local12.anInt2173 = local43.method2111();
		local12.anInt2172 = local43.method2111();
		@Pc(96) int local96 = local43.method2107();
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local96 > 0) {
			local12.aClass54Array1 = new Class54[local96];
			for (local104 = 0; local104 < local96; local104++) {
				local110 = local43.method2111();
				@Pc(117) Class54 local117 = new Class54(Static129.method1945(local110));
				local12.aClass54Array1[local104] = local117;
				while (local110-- > 0) {
					@Pc(128) int local128 = local43.method2132();
					@Pc(132) int local132 = local43.method2132();
					local117.method1494((long) local128, new Class3_Sub11(local132));
				}
			}
		}
		local43.anInt2923 = 0;
		local12.aClass80_880 = local43.method2117();
		local104 = 0;
		local12.aClass80Array15 = new Class80[local72];
		local12.anIntArray300 = new int[local72];
		local12.anIntArray298 = new int[local72];
		while (local65 > local43.anInt2923) {
			local110 = local43.method2111();
			if (local110 == 3) {
				local12.aClass80Array15[local104] = local43.method2102();
			} else if (local110 >= 100 || local110 == 21 || local110 == 38 || local110 == 39) {
				local12.anIntArray300[local104] = local43.method2107();
			} else {
				local12.anIntArray300[local104] = local43.method2132();
			}
			local12.anIntArray298[local104++] = local110;
		}
		Static170.aClass5_53.method145(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lclient!kh;")
	public static Class51 method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass51_1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!nc;IIIIII)V")
	public static void method404(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray339.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray339[local5] - Static87.anInt1818;
			local20 = arg0.anIntArray350[local5] - Static95.anInt3659;
			local27 = arg0.anIntArray351[local5] - Static143.anInt3081;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray344 != null) {
				Static119.anIntArray352[local5] = local37;
				Static119.anIntArray341[local5] = local59;
				Static119.anIntArray347[local5] = local69;
			}
			Static119.anIntArray345[local5] = Static65.anInt1422 + (local37 << 9) / local69;
			Static119.anIntArray349[local5] = Static65.anInt1416 + (local59 << 9) / local69;
		}
		Static65.anInt1420 = 0;
		local3 = arg0.anIntArray343.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray343[local13];
			local27 = arg0.anIntArray346[local13];
			local37 = arg0.anIntArray342[local13];
			@Pc(142) int local142 = Static119.anIntArray345[local20];
			@Pc(146) int local146 = Static119.anIntArray345[local27];
			@Pc(150) int local150 = Static119.anIntArray345[local37];
			@Pc(154) int local154 = Static119.anIntArray349[local20];
			@Pc(158) int local158 = Static119.anIntArray349[local27];
			@Pc(162) int local162 = Static119.anIntArray349[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static86.aBoolean69 && Static121.method1831(Static2.anInt82, Static51.anInt1132, local154, local158, local162, local142, local146, local150)) {
					Static103.anInt2178 = arg5;
					Static125.anInt2695 = arg6;
				}
				Static65.aBoolean59 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static65.anInt1417 || local146 > Static65.anInt1417 || local150 > Static65.anInt1417) {
					Static65.aBoolean59 = true;
				}
				if (arg0.anIntArray344 == null || arg0.anIntArray344[local13] == -1) {
					if (arg0.anIntArray348[local13] != 12345678) {
						Static65.method955(local154, local158, local162, local142, local146, local150, arg0.anIntArray348[local13], arg0.anIntArray340[local13], arg0.anIntArray338[local13]);
					}
				} else if (Static193.aBoolean174) {
					@Pc(363) int local363 = Static65.anInterface1_2.method2650(arg0.anIntArray344[local13]);
					Static65.method955(local154, local158, local162, local142, local146, local150, Static113.method1746(local363, arg0.anIntArray348[local13]), Static113.method1746(local363, arg0.anIntArray340[local13]), Static113.method1746(local363, arg0.anIntArray338[local13]));
				} else if (arg0.aBoolean103) {
					Static65.method968(local154, local158, local162, local142, local146, local150, arg0.anIntArray348[local13], arg0.anIntArray340[local13], arg0.anIntArray338[local13], Static119.anIntArray352[0], Static119.anIntArray352[1], Static119.anIntArray352[3], Static119.anIntArray341[0], Static119.anIntArray341[1], Static119.anIntArray341[3], Static119.anIntArray347[0], Static119.anIntArray347[1], Static119.anIntArray347[3], arg0.anIntArray344[local13]);
				} else {
					Static65.method968(local154, local158, local162, local142, local146, local150, arg0.anIntArray348[local13], arg0.anIntArray340[local13], arg0.anIntArray338[local13], Static119.anIntArray352[local20], Static119.anIntArray352[local27], Static119.anIntArray352[local37], Static119.anIntArray341[local20], Static119.anIntArray341[local27], Static119.anIntArray341[local37], Static119.anIntArray347[local20], Static119.anIntArray347[local27], Static119.anIntArray347[local37], arg0.anIntArray344[local13]);
				}
			}
		}
	}
}
