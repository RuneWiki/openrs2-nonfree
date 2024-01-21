import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "F", descriptor = "Lclient!c;")
	public static Class10 aClass10_32;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public static int anInt2968 = 0;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "Lclient!od;")
	public static Class60 aClass60_1150 = Static41.method597("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!we", name = "N", descriptor = "Lclient!od;")
	public static Class60 aClass60_1151 = Static41.method597("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	public static int anInt2971 = -2;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
	public static int[] anIntArray347 = new int[100];

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_1152 = Static41.method597("Wordpack geladen)3");

	@OriginalMember(owner = "client!we", name = "W", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!we", name = "X", descriptor = "Lclient!od;")
	public static Class60 aClass60_1153 = Static41.method597("Konfig geladen)3");

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method1999() {
		aClass60_1151 = null;
		aClass60_1152 = null;
		aClass60_1150 = null;
		aClass60_1153 = null;
		aClass10_32 = null;
		anIntArray347 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method2000(@OriginalArg(1) Class4_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anInt1446 == Static118.anInt2741 || arg0.anInt1408 == -1 || arg0.anInt1411 != 0 || arg0.anInt1424 + 1 > Static7.method63(arg0.anInt1408).anIntArray218[arg0.anInt1409]) {
			@Pc(42) int local42 = arg0.anInt1446 - arg0.anInt1425;
			@Pc(48) int local48 = Static118.anInt2741 - arg0.anInt1425;
			@Pc(59) int local59 = arg0.anInt1400 * 128 + arg0.anInt1434 * 64;
			@Pc(69) int local69 = arg0.anInt1427 * 128 + arg0.anInt1434 * 64;
			arg0.anInt1440 = (local48 * local69 + (local42 - local48) * local59) / local42;
			@Pc(94) int local94 = arg0.anInt1404 * 128 + arg0.anInt1434 * 64;
			@Pc(104) int local104 = arg0.anInt1434 * 64 + arg0.anInt1417 * 128;
			arg0.anInt1407 = (local94 * (local42 - local48) + local104 * local48) / local42;
		}
		if (arg0.anInt1441 == 0) {
			arg0.anInt1414 = 1024;
		}
		if (arg0.anInt1441 == 1) {
			arg0.anInt1414 = 1536;
		}
		if (arg0.anInt1441 == 2) {
			arg0.anInt1414 = 0;
		}
		arg0.anInt1387 = 0;
		if (arg0.anInt1441 == 3) {
			arg0.anInt1414 = 512;
		}
		arg0.anInt1415 = arg0.anInt1414;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII[B[Lclient!ge;I)V")
	public static void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) Class28[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg5 > 0 && local7 + arg5 < 103 && arg3 + local11 > 0 && local11 + arg3 < 103) {
					arg7[arg1].anIntArrayArray28[local7 + arg5][local11 + arg3] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(78) Class4_Sub9 local78 = new Class4_Sub9(arg6);
		for (@Pc(86) int local86 = 0; local86 < 4; local86++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					if (local86 == arg4 && arg0 <= local90 && local90 < arg0 + 8 && arg2 <= local94 && local94 < arg2 + 8) {
						Static43.method619(Static110.method1819(arg8, local90 & 0x7, local94 & 0x7) + arg5, local78, 0, arg3 + Static28.method1354(arg8, local94 & 0x7, local90 & 0x7), arg1, 0, arg8);
					} else {
						Static43.method619(-1, local78, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}
}
