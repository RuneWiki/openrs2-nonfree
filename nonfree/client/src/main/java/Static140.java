import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	public static int anInt2757;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
	public static int anInt2753 = -1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIB)V")
	public static void method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static312.anInt5850 <= arg1 - arg2 && Static214.anInt4216 >= arg1 + arg2 && arg0 - arg2 >= Static240.anInt1319 && arg0 + arg2 <= Static59.anInt1155) {
			Static120.method1925(arg0, arg3, arg1, arg2);
		} else {
			Static14.method204(arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
	public static int method2232() {
		if (Static61.aBoolean100) {
			return 0;
		} else if (Static62.method1046()) {
			return Static106.aBoolean159 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)Z")
	public static boolean method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static290.anIntArrayArrayArray16[arg0][arg1][arg2];
		if (local7 == -Static68.anInt1344) {
			return false;
		} else if (local7 == Static68.anInt1344) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static271.method4002(local22 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg2], local26 + 1) && Static271.method4002(local22 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg2], local26 + 1) && Static271.method4002(local22 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static271.method4002(local22 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static290.anIntArrayArrayArray16[arg0][arg1][arg2] = Static68.anInt1344;
				return true;
			} else {
				Static290.anIntArrayArrayArray16[arg0][arg1][arg2] = -Static68.anInt1344;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method2234() {
		Static4.method50(Static157.anInt3329);
		@Pc(17) int local17 = (Static290.anInt5497 >> 3) + (Static243.anInt5653 >> 10);
		@Pc(26) int local26 = (Static105.anInt2016 >> 10) + (Static118.anInt2409 >> 3);
		Static206.aByteArrayArray12 = new byte[18][];
		Static278.anIntArray487 = new int[18];
		Static254.aByteArrayArray14 = new byte[18][];
		Static156.aByteArrayArray10 = new byte[18][];
		Static272.anIntArray469 = new int[18];
		Static274.anIntArray473 = new int[18];
		Static90.aByteArrayArray13 = new byte[18][];
		Static70.aByteArrayArray3 = new byte[18][];
		Static272.anIntArrayArray41 = new int[18][4];
		Static302.anIntArray522 = new int[18];
		Static274.anIntArray472 = new int[18];
		Static53.anIntArray89 = new int[18];
		@Pc(73) int local73 = 0;
		@Pc(79) int local79;
		for (local79 = (local17 - 6) / 8; local79 <= (local17 + 6) / 8; local79++) {
			for (@Pc(96) int local96 = (local26 - 6) / 8; local96 <= (local26 + 6) / 8; local96++) {
				@Pc(110) int local110 = (local79 << 8) + local96;
				Static278.anIntArray487[local73] = local110;
				Static274.anIntArray473[local73] = Static124.aClass138_40.method3331("m" + local79 + "_" + local96);
				Static53.anIntArray89[local73] = Static124.aClass138_40.method3331("l" + local79 + "_" + local96);
				Static274.anIntArray472[local73] = Static124.aClass138_40.method3331("n" + local79 + "_" + local96);
				Static302.anIntArray522[local73] = Static124.aClass138_40.method3331("um" + local79 + "_" + local96);
				Static272.anIntArray469[local73] = Static124.aClass138_40.method3331("ul" + local79 + "_" + local96);
				if (Static274.anIntArray472[local73] == -1) {
					Static274.anIntArray473[local73] = -1;
					Static53.anIntArray89[local73] = -1;
					Static302.anIntArray522[local73] = -1;
					Static272.anIntArray469[local73] = -1;
				}
				local73++;
			}
		}
		for (local79 = local73; local79 < Static274.anIntArray472.length; local79++) {
			Static274.anIntArray472[local79] = -1;
			Static274.anIntArray473[local79] = -1;
			Static53.anIntArray89[local79] = -1;
			Static302.anIntArray522[local79] = -1;
			Static272.anIntArray469[local79] = -1;
		}
		Static295.method4396(8, true, local17, false, 8, 0, local26);
	}
}
