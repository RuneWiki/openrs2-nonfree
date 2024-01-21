import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_578 = Static146.method2172("M");

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!sg;")
	private static Class77 aClass77_584 = Static146.method2172("Take");

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_579 = aClass77_584;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!sg;")
	private static Class77 aClass77_583 = Static146.method2172("Click to switch");

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_580 = aClass77_583;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!sg;")
	private static Class77 aClass77_582 = Static146.method2172("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_581 = aClass77_582;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_585 = Static146.method2172("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method1027() {
		aClass77_582 = null;
		aClass77_581 = null;
		aClass77_585 = null;
		aClass77_580 = null;
		aClass77_584 = null;
		aClass77_583 = null;
		aClass77_579 = null;
		aClass77_578 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!oa;)Lclient!h;")
	public static Class2_Sub1 method1028(@OriginalArg(1) Class2_Sub18 arg0) {
		@Pc(9) int local9 = arg0.method2387();
		@Pc(13) int local13 = arg0.method2387();
		@Pc(17) Class local17 = Static80.method1474(local13);
		try {
			@Pc(25) Class2_Sub1 local25 = (Class2_Sub1) local17.getDeclaredConstructor().newInstance();
			if (local25 != null) {
				local25.anInt4541 = local9;
				local25.anInt4547 = arg0.method2387();
				@Pc(39) int local39 = arg0.method2387();
				for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
					@Pc(47) int local47 = arg0.method2387();
					local25.method2987(arg0, local47);
				}
			}
			local25.method2992();
			return local25;
		} catch (@Pc(62) IllegalAccessException local62) {
			throw new RuntimeException();
		} catch (@Pc(67) InstantiationException local67) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIIII)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg6 < 1 || arg0 > 102 || arg6 > 102) {
			return;
		}
		if (Static92.aBoolean101 && anInt1472 != arg1) {
			return;
		}
		@Pc(31) int local31 = 0;
		if (arg4 == 0) {
			local31 = Static172.aClass60_1.method2077(arg1, arg0, arg6);
		}
		if (arg4 == 1) {
			local31 = Static172.aClass60_1.method2082(arg1, arg0, arg6);
		}
		if (arg4 == 2) {
			local31 = Static172.aClass60_1.method2063(arg1, arg0, arg6);
		}
		if (arg4 == 3) {
			local31 = Static172.aClass60_1.method2072(arg1, arg0, arg6);
		}
		@Pc(86) int local86;
		if (local31 != 0) {
			local86 = Static172.aClass60_1.method2059(arg1, arg0, arg6, local31);
			@Pc(92) int local92 = local31 >> 14 & 0x7FFF;
			@Pc(98) int local98 = local86 >> 6 & 0x3;
			@Pc(102) int local102 = local86 & 0x1F;
			@Pc(113) Class2_Sub2_Sub5 local113;
			if (arg4 == 0) {
				Static172.aClass60_1.method2089(arg1, arg0, arg6);
				local113 = Static121.method2129(local92);
				if (local113.anInt514 != 0) {
					Static27.aClass86Array1[arg1].method2807(arg0, local102, local113.aBoolean28, local98, arg6);
				}
			}
			if (arg4 == 1) {
				Static172.aClass60_1.method2080(arg1, arg0, arg6);
			}
			if (arg4 == 2) {
				Static172.aClass60_1.method2085(arg1, arg0, arg6);
				local113 = Static121.method2129(local92);
				if (arg0 + local113.anInt520 > 103 || arg6 + local113.anInt520 > 103 || local113.anInt538 + arg0 > 103 || local113.anInt538 + arg6 > 103) {
					return;
				}
				if (local113.anInt514 != 0) {
					Static27.aClass86Array1[arg1].method2816(arg0, local113.aBoolean28, arg6, local113.anInt520, local98, local113.anInt538);
				}
			}
			if (arg4 == 3) {
				Static172.aClass60_1.method2068(arg1, arg0, arg6);
				local113 = Static121.method2129(local92);
				if (local113.anInt514 == 1) {
					Static27.aClass86Array1[arg1].method2808(arg6, arg0);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		local86 = arg1;
		if (arg1 < 3 && (Static140.aByteArrayArrayArray6[1][arg0][arg6] & 0x2) == 2) {
			local86 = arg1 + 1;
		}
		Static50.method961(arg0, arg2, arg1, local86, arg5, arg6, Static27.aClass86Array1[arg1], Static172.aClass60_1, arg3);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method1030() {
		Static136.aClass2_Sub9_Sub3_1.method2474();
		Static176.anInt4481 = 1;
		Static3.aClass43_1 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIZ)I")
	public static int method1031(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static50.method962(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method1032(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) Static179.aClass74_13.method2430(); local6 != null; local6 = (Class2_Sub3) Static179.aClass74_13.method2435()) {
			if ((local6.aLong134 >> 48 & 0xFFFFL) == (long) arg0) {
				local6.method3004();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method1033() {
		Static108.anImage3 = null;
		Static108.aFont1 = null;
		Static170.aFontMetrics1 = null;
	}
}
