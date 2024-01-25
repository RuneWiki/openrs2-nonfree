import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	public static int anInt501;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "I")
	public static int anInt499 = 0;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "Z")
	public static volatile boolean aBoolean37 = false;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_2 = new Class166(64);

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
	public static void method416(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local30;
		for (@Pc(42) int local42 = arg0; local42 < arg3; local42++) {
			if ((long) (local42 & 0x1) + local16 > arg1[local42]) {
				@Pc(63) long local63 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local63;
				@Pc(77) Object local77 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local77;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg3] = arg2[local12];
		arg2[local12] = local30;
		method416(arg0, arg1, arg2, local12 - 1);
		method416(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)V")
	public static void method417(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static111.aClass63_3 = Static358.method1965(Static257.aCanvas4, Static329.anInterface9_6, arg1, Static359.aClass111_5, Static131.anInt2686 * 2);
		} else {
			if (arg0) {
				Static111.aClass63_3 = Static358.method1965(Static257.aCanvas4, Static329.anInterface9_6, 0, Static359.aClass111_5, 0);
				Static111.aClass63_3.method2020(0);
				@Pc(20) Class136 local20 = Static230.method3732(Static208.anInt3820, Static120.aClass171_35);
				@Pc(29) Class9 local29 = Static111.aClass63_3.method2034(local20, Static397.method2332(Static263.aClass171_64, Static208.anInt3820));
				Static108.method4606(local29, true, Static55.aClass32_21.method701(Static107.anInt2498));
				Static111.aClass63_3.method2049();
				Static316.method4706();
				Static111.aClass63_3.method2050();
			}
			try {
				Static111.aClass63_3 = Static358.method1965(Static257.aCanvas4, Static329.anInterface9_6, arg1, Static359.aClass111_5, Static131.anInt2686 * 2);
			} catch (@Pc(56) Throwable local56) {
				arg1 = 0;
				Static111.aClass63_3 = Static358.method1965(Static257.aCanvas4, Static329.anInterface9_6, 0, Static359.aClass111_5, 0);
			}
		}
		if (Static111.aClass63_3.method1966()) {
			@Pc(89) Class2_Sub20 local89 = Static111.aClass63_3.method2037();
			Static111.aClass63_3.method2014(local89);
		}
		Static62.anInt1261 = arg1;
		Static214.method3576();
		if (!Static111.aClass63_3.method2013()) {
			Static295.anInt5086 = 1;
		}
		Static111.aClass63_3.method2004(Static295.anInt5086);
		Static111.aClass63_3.method2044(0);
		Static18.aClass44_1 = Static111.aClass63_3.method1995();
		Static348.aClass44_5 = Static111.aClass63_3.method1995();
		@Pc(124) int local124 = (int) ((double) Static246.anInt4374 * 34.46D);
		if (Static111.aClass63_3.method1979()) {
			local124 += 128;
		}
		Static111.aClass63_3.method2047(50, local124);
		Static111.aClass63_3.method1997(!Static6.aBoolean21);
		if (Static111.aClass63_3.method1994()) {
			Static3.method78(Static262.aBoolean340);
		}
		Static141.method2665(Static185.anInt3485 >> 3, Static246.anInt4374 >> 3, Static111.aClass63_3);
		Static181.method5324();
		Static64.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)I")
	public static int method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg2 : arg1;
		@Pc(31) int local31 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg2 : arg0;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local31 : -local31);
	}
}
