import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
	public static int anInt4063 = 0;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "Lclient!ad;")
	public static Class4 aClass4_15 = new Class4();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z[Lclient!oa;IIII[BIII)V")
	public static void method3105(@OriginalArg(1) Class59[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg4 > 0 && local7 + arg4 < 103 && local11 + arg7 > 0 && local11 + arg7 < 103) {
					arg0[arg2].anIntArrayArray27[arg4 + local7][local11 + arg7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class1_Sub9 local77 = new Class1_Sub9(arg5);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (local84 == arg6 && local88 >= arg1 && local88 < arg1 + 8 && arg3 <= local92 && arg3 + 8 > local92) {
						Static162.method3328(arg2, Static63.method1485(arg8, local92 & 0x7, local88 & 0x7) + arg4, 0, 0, local77, arg7 + Static79.method1803(local92 & 0x7, local88 & 0x7, arg8), arg8);
					} else {
						Static162.method3328(0, -1, 0, 0, local77, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z")
	public static boolean method3106() {
		@Pc(5) Class62 local5 = Static156.aClass62_1;
		synchronized (Static156.aClass62_1) {
			if (Static31.anInt1007 == Static104.anInt2959) {
				return false;
			} else {
				Static38.anInt1337 = Static176.anIntArray423[Static31.anInt1007];
				Static53.anInt1721 = Static127.anIntArray327[Static31.anInt1007];
				Static31.anInt1007 = Static31.anInt1007 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
	public static void method3107() {
		aClass4_15 = null;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)I")
	public static int method3108() {
		return Static45.anInt1480++;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILclient!s;J)V")
	public static void method3109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub4 arg4, @OriginalArg(5) long arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class7 local6 = new Class7();
		local6.aClass1_Sub1_Sub4_1 = arg4;
		local6.anInt287 = arg1 * 128 + 64;
		local6.anInt284 = arg2 * 128 + 64;
		local6.anInt291 = arg3;
		local6.aLong15 = arg5;
		if (Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass7_1 = local6;
	}
}
