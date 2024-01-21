import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!m;")
	public static Class3_Sub11 aClass3_Sub11_21;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt1935 = -1;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[[[Lclient!se;")
	public static Class65[][][] aClass65ArrayArrayArray1 = new Class65[4][104][104];

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!he;")
	private static Class26 aClass26_960 = Static6.method100("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_958 = aClass26_960;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
	public static int[] anIntArray178 = new int[500];

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_959 = Static6.method100(" )2>");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!vb;Ljava/awt/Component;I)Lclient!ld;")
	public static Class43 method1260(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2948 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class43 local31 = (Class43) Class.forName("Class43_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt2808 = arg0;
			local31.anIntArray337 = new int[(Static31.aBoolean156 ? 2 : 1) * 256];
			local31.method1916(arg2);
			local31.anInt2811 = (arg0 & 0xFFFFFC00) + 1024;
			if (local31.anInt2811 > 16384) {
				local31.anInt2811 = 16384;
			}
			local31.method1923(local31.anInt2811);
			if (Static73.anInt2071 > 0 && Static75.aClass50_1 == null) {
				Static75.aClass50_1 = new Class50();
				Static75.aClass50_1.aClass75_2 = arg1;
				arg1.method2174(Static75.aClass50_1, Static73.anInt2071);
			}
			if (Static75.aClass50_1 != null) {
				if (Static75.aClass50_1.aClass43Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static75.aClass50_1.aClass43Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class43_Sub1 local114 = new Class43_Sub1(arg1, arg3);
				local114.anIntArray337 = new int[(Static31.aBoolean156 ? 2 : 1) * 256];
				local114.anInt2808 = arg0;
				local114.method1916(arg2);
				local114.anInt2811 = 16384;
				local114.method1923(local114.anInt2811);
				if (Static73.anInt2071 > 0 && Static75.aClass50_1 == null) {
					Static75.aClass50_1 = new Class50();
					Static75.aClass50_1.aClass75_2 = arg1;
					arg1.method2174(Static75.aClass50_1, Static73.anInt2071);
				}
				if (Static75.aClass50_1 != null) {
					if (Static75.aClass50_1.aClass43Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static75.aClass50_1.aClass43Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(176) Throwable local176) {
				return new Class43();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1261() {
		anIntArray178 = null;
		aClass26_960 = null;
		aClass65ArrayArrayArray1 = null;
		aClass26_958 = null;
		aClass26_959 = null;
		aClass3_Sub11_21 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIII)I")
	public static int method1262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg0;
			arg0 = local6;
		}
		@Pc(21) int local21 = arg1 & 0x3;
		if (local21 == 0) {
			return arg2;
		} else if (local21 == 1) {
			return 7 + 1 - arg3 - arg4;
		} else if (local21 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	public static void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static63.anInt1934 != 0 && Static63.anInt1934 != 3 || Static102.anInt2770 != 1) {
			return;
		}
		@Pc(28) int local28 = Static59.anInt1803 - arg1 - 25;
		@Pc(35) int local35 = Static19.anInt514 - arg0 - 5;
		if (local28 < 0 || local35 < 0 || local28 >= 146 || local35 >= 151) {
			return;
		}
		local28 -= 73;
		local35 -= 75;
		@Pc(56) int local56 = Static78.anInt2107 + Static52.anInt1614 & 0x7FF;
		@Pc(60) int local60 = Class3_Sub1_Sub4_Sub4.anIntArray391[local56];
		@Pc(68) int local68 = local60 * (Static33.anInt1081 + 256) >> 8;
		@Pc(72) int local72 = Class3_Sub1_Sub4_Sub4.anIntArray392[local56];
		@Pc(80) int local80 = local72 * (Static33.anInt1081 + 256) >> 8;
		@Pc(90) int local90 = local80 * local35 - local28 * local68 >> 11;
		@Pc(101) int local101 = local35 * local68 + local28 * local80 >> 11;
		@Pc(108) int local108 = local101 + Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7;
		@Pc(116) int local116 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 - local90 >> 7;
		@Pc(136) boolean local136 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local116, local108, 0, 0, true, 1, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
		if (!local136) {
			return;
		}
		Static107.aClass3_Sub11_Sub1_3.method992(local28);
		Static107.aClass3_Sub11_Sub1_3.method992(local35);
		Static107.aClass3_Sub11_Sub1_3.method972(Static78.anInt2107);
		Static107.aClass3_Sub11_Sub1_3.method992(57);
		Static107.aClass3_Sub11_Sub1_3.method992(Static52.anInt1614);
		Static107.aClass3_Sub11_Sub1_3.method992(Static33.anInt1081);
		Static107.aClass3_Sub11_Sub1_3.method992(89);
		Static107.aClass3_Sub11_Sub1_3.method972(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733);
		Static107.aClass3_Sub11_Sub1_3.method972(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731);
		Static107.aClass3_Sub11_Sub1_3.method992(Static9.anInt242);
		Static107.aClass3_Sub11_Sub1_3.method992(63);
		return;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1264() {
		if (Static118.aClass76_4 != null) {
			Static118.aClass76_4.method2183();
			Static118.aClass76_4 = null;
		}
		Static102.method1900();
		Static62.aClass69_1.method2052();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static93.aClass4Array1[local18].method80();
		}
		System.gc();
		Static53.method1089();
		Static42.aBoolean70 = false;
		Static4.anInt138 = -1;
		Static78.method1364();
		Static4.method62(10);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILclient!he;)V")
	public static void method1265(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1) {
		Static107.aClass3_Sub11_Sub1_3.method1029(66);
		Static107.aClass3_Sub11_Sub1_3.method975(arg0);
		Static107.aClass3_Sub11_Sub1_3.method1021(arg1.method820());
	}
}
