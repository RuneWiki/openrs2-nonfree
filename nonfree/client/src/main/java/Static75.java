import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	public static int anInt1690;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Lclient!sc;")
	private static Class107 aClass107_491 = Static231.method3737("Created gameworld");

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_492 = aClass107_491;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	public static int anInt1699 = 0;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public static void method1335() {
		Static8.anInt259 = 0;
		Static40.aBoolean81 = false;
		Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
		Static13.anInt317 = -1;
		Static114.anInt2522 = 0;
		Static176.anInt3812 = -1;
		Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
		Static184.anInt4144 = 0;
		Static18.anInt382 = -1;
		Static200.anInt3496 = -1;
		Static24.anInt450 = 0;
		Static25.anInt490 = 0;
		Static207.anInt4426 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static198.aClass5_Sub5_Sub1Array1.length; local35++) {
			if (Static198.aClass5_Sub5_Sub1Array1[local35] != null) {
				Static198.aClass5_Sub5_Sub1Array1[local35].anInt3025 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static33.aClass5_Sub5_Sub2Array1.length; local53++) {
			if (Static33.aClass5_Sub5_Sub2Array1[local53] != null) {
				Static33.aClass5_Sub5_Sub2Array1[local53].anInt3025 = -1;
			}
		}
		Static13.method330();
		Static61.anInt1480 = 1;
		Static52.method1046(30);
		for (@Pc(86) int local86 = 0; local86 < 100; local86++) {
			Static39.aBooleanArray5[local86] = true;
		}
		Static123.aClass120_15.method3560();
		Static98.method1669();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[Lclient!jc;III[BZIIII)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(21) int local21;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (local21 = 0; local21 < 8; local21++) {
				if (arg8 + local17 > 0 && arg8 + local17 < 103 && local21 + arg6 > 0 && arg6 + local21 < 103) {
					arg1[arg2].anIntArrayArray24[arg8 + local17][local21 + arg6] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(92) Class1_Sub26 local92 = new Class1_Sub26(arg4);
		for (local21 = 0; local21 < 4; local21++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					if (arg7 == local21 && local98 >= arg3 && arg3 + 8 > local98 && local102 >= arg0 && local102 < arg0 + 8) {
						Static3.method2856(Static118.method2047(arg5, local102 & 0x7, local98 & 0x7) + arg8, 0, arg2, 0, arg5, arg6 + Static22.method416(arg5, local102 & 0x7, local98 & 0x7), local92);
					} else {
						Static3.method2856(-1, 0, 0, 0, 0, -1, local92);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)I")
	public static int method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg2;
			arg2 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg0;
		} else {
			return 1 + 7 - arg2 - arg3;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lclient!sc;")
	public static Class107 method1338(@OriginalArg(0) int arg0) {
		return Static168.aClass107Array21[arg0].method3095() > 0 ? Static149.method2437(new Class107[] { Static210.aClass107Array28[arg0], Static20.aClass107_607, Static168.aClass107Array21[arg0] }) : Static210.aClass107Array28[arg0];
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIII)I")
	public static int method1339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static221.aByteArrayArrayArray14[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static221.aByteArrayArrayArray14[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
