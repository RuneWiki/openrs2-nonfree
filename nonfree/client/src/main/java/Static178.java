import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array12;

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array22 = new Class81[200];

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1413 = Static120.method2057(":assist:");

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1415 = Static120.method2057("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!vg", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1416 = aClass81_1415;

	@OriginalMember(owner = "client!vg", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1417 = Static120.method2057("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public static void method3074() {
		aClass1_Sub8_5 = null;
		aClass81_1415 = null;
		aClass1_Sub2_Sub2_Sub4Array12 = null;
		aClass81_1413 = null;
		aClass81Array22 = null;
		aClass81_1417 = null;
		aByteArrayArray10 = null;
		aClass81_1416 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[B[Lclient!gf;IIIII)V")
	public static void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class28[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg2 + local3 > 0 && arg2 + local3 < 103 && local7 + arg1 > 0 && local7 + arg1 < 103) {
					arg4[arg5].anIntArrayArray8[local3 + arg2][arg1 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Class1_Sub8 local79 = new Class1_Sub8(arg3);
		for (@Pc(85) int local85 = 0; local85 < 4; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
					if (local85 == arg7 && local89 >= arg0 && arg0 + 8 > local89 && arg8 <= local93 && local93 < arg8 + 8) {
						Static75.method1329(arg6, 0, 0, arg2 + Static33.method714(arg6, local89 & 0x7, local93 & 0x7), arg1 + Static119.method2036(arg6, local89 & 0x7, local93 & 0x7), local79, arg5);
					} else {
						Static75.method1329(0, 0, 0, -1, -1, local79, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZILclient!rh;)V")
	public static void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class77 arg2) {
		if (Static31.aClass77_5 != null || Static149.aBoolean145 || (arg2 == null || Static117.method3135(arg2) == null)) {
			return;
		}
		Static31.aClass77_5 = arg2;
		Static6.aClass77_3 = Static117.method3135(arg2);
		Static67.aBoolean66 = false;
		Static10.anInt229 = arg0;
		Static132.anInt2863 = 0;
		Static151.anInt3425 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!tg;)I")
	private static int method3077(@OriginalArg(1) Class81 arg0) {
		if (Static125.anInt2756 == 1) {
			return 7;
		} else if (arg0.method2796(Static43.aClass81_379)) {
			return 1;
		} else if (arg0.method2796(Static110.aClass81_910)) {
			return 1;
		} else if (arg0.method2796(Static141.aClass81_251)) {
			return 2;
		} else if (arg0.method2796(Static74.aClass81_612)) {
			return 2;
		} else if (arg0.method2796(Static142.aClass81_1111)) {
			return 3;
		} else if (arg0.method2796(Static166.aClass81_1349)) {
			return 4;
		} else if (arg0.method2796(Static46.aClass81_403)) {
			return 4;
		} else if (arg0.method2796(Static104.aClass81_804)) {
			return 5;
		} else if (arg0.method2796(Static136.aClass81_1049)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	public static void method3078() {
		try {
			if (Static40.aClass37_1 == null) {
				Static40.aClass37_1 = new Class37(Static86.aClass68_2, Static127.method2169(new Class81[] { Static95.aClass81_732, Static149.aClass81_1210, Static160.aClass81_1306 }).method2822());
			} else {
				@Pc(15) byte[] local15 = Static40.aClass37_1.method1255();
				if (local15 != null) {
					@Pc(22) Class1_Sub8 local22 = new Class1_Sub8(local15);
					Static83.anInt1888 = local22.method359();
					Static163.aClass89Array1 = new Class89[Static83.anInt1888];
					for (@Pc(31) int local31 = 0; local31 < Static83.anInt1888; local31++) {
						@Pc(41) Class89 local41 = Static163.aClass89Array1[local31] = new Class89();
						@Pc(45) int local45 = local22.method359();
						local41.aBoolean166 = (local45 & 0x8000) != 0;
						local41.anInt4054 = local45 & 0x7FFF;
						local41.aClass81_1424 = local22.method344();
						local41.anInt4056 = local22.method332();
						local41.anInt4055 = local31;
						local41.anInt4053 = method3077(local41.aClass81_1424);
					}
					Static112.method1965(Static163.aClass89Array1.length - 1, Static163.aClass89Array1, 0, Static143.anIntArray333, Static74.anIntArray161);
					Static45.aBoolean43 = true;
					Static40.aClass37_1 = null;
					return;
				}
			}
		} catch (@Pc(125) Exception local125) {
			local125.printStackTrace();
			Static40.aClass37_1 = null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
	public static void method3080() {
		for (@Pc(15) Class1_Sub23 local15 = (Class1_Sub23) Static70.aClass30_11.method1115(); local15 != null; local15 = (Class1_Sub23) Static70.aClass30_11.method1125()) {
			if (local15.anInt3735 == -1) {
				local15.anInt3737 = 0;
				Static132.method2251(local15);
			} else {
				local15.method3134();
			}
		}
	}
}
