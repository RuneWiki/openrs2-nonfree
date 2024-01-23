import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_27;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!ic;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ek;Lclient!ek;Lclient!ek;I)V")
	public static void method1739(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2) {
		Static203.aClass42_62 = arg0;
		Static67.aClass42_18 = arg2;
		Static275.aClass42_95 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ml;III)V")
	public static void method1740(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub13 local12;
		if (arg2 < Static38.anInt954) {
			local12 = Static52.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass191_1 != null && local12.aClass191_1.aClass15_10.method4278()) {
				arg0.method4279(local12.aClass191_1.aClass15_10, 128, 0, 0, true);
			}
		}
		if (arg3 < Static38.anInt954) {
			local12 = Static52.aClass2_Sub13ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass191_1 != null && local12.aClass191_1.aClass15_10.method4278()) {
				arg0.method4279(local12.aClass191_1.aClass15_10, 0, 0, 128, true);
			}
		}
		if (arg2 < Static38.anInt954 && arg3 < Static232.anInt4680) {
			local12 = Static52.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass191_1 != null && local12.aClass191_1.aClass15_10.method4278()) {
				arg0.method4279(local12.aClass191_1.aClass15_10, 128, 0, 128, true);
			}
		}
		if (arg2 < Static38.anInt954 && arg3 > 0) {
			local12 = Static52.aClass2_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass191_1 != null && local12.aClass191_1.aClass15_10.method4278()) {
				arg0.method4279(local12.aClass191_1.aClass15_10, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method1741() {
		Static175.aClass157_33.method4033();
		Static215.aClass157_36.method4033();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1742() {
		Static11.aClass157_5.method4033();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method1743() {
		Static269.anInt5272 = 0;
		Static160.aByte21 = 0;
		Static34.aBoolean52 = false;
		Static180.anInt3906 = 0;
		Static302.anInt5847 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static64.anIntArray134[arg0] = arg1;
		@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) Static164.aClass101_12.method2867((long) arg0);
		if (local18 == null) {
			local18 = new Class2_Sub11(Static221.method3670() + 500L);
			Static164.aClass101_12.method2860(local18, (long) arg0);
		} else {
			local18.aLong43 = Static221.method3670() + 500L;
		}
	}
}
