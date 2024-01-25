import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
	public static int anInt6188 = -1;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ub;Z)V")
	public static void method5263(@OriginalArg(0) Class1_Sub4 arg0) {
		if (Static175.aBoolean289) {
			Static526.aClass124Array2[Static526.aClass124Array2.length - 1].method3123(arg0);
		} else {
			Static437.method6787(arg0, Static514.aClass4_Sub24Array6);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIIZLclient!n;)V")
	public static void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class225 arg3) {
		@Pc(12) int local12 = arg3.anInt6529;
		if (arg3.aByte70 == 0) {
			arg3.anInt6529 = arg3.anInt6503;
		} else if (arg3.aByte70 == 1) {
			arg3.anInt6529 = arg1 - arg3.anInt6503;
		} else if (arg3.aByte70 == 2) {
			arg3.anInt6529 = arg1 * arg3.anInt6503 >> 14;
		}
		@Pc(54) int local54 = arg3.anInt6521;
		if (arg3.aByte71 == 0) {
			arg3.anInt6521 = arg3.anInt6523;
		} else if (arg3.aByte71 == 1) {
			arg3.anInt6521 = arg0 - arg3.anInt6523;
		} else if (arg3.aByte71 == 2) {
			arg3.anInt6521 = arg3.anInt6523 * arg0 >> 14;
		}
		if (arg3.aByte70 == 4) {
			arg3.anInt6529 = arg3.anInt6521 * arg3.anInt6486 / arg3.anInt6504;
		}
		if (arg3.aByte71 == 4) {
			arg3.anInt6521 = arg3.anInt6504 * arg3.anInt6529 / arg3.anInt6486;
		}
		if (Static57.aBoolean43 && (Static69.method1180(arg3).anInt156 != 0 || arg3.anInt6508 == 0)) {
			if (arg3.anInt6521 < 5 && arg3.anInt6529 < 5) {
				arg3.anInt6521 = 5;
				arg3.anInt6529 = 5;
			} else {
				if (arg3.anInt6521 <= 0) {
					arg3.anInt6521 = 5;
				}
				if (arg3.anInt6529 <= 0) {
					arg3.anInt6529 = 5;
				}
			}
		}
		if (arg3.anInt6491 == Static452.anInt8509) {
			Static320.aClass225_29 = arg3;
		}
		if (arg2 && arg3.anObjectArray4 != null && (local12 != arg3.anInt6529 || local54 != arg3.anInt6521)) {
			@Pc(200) Class4_Sub25 local200 = new Class4_Sub25();
			local200.anObjectArray1 = arg3.anObjectArray4;
			local200.aClass225_21 = arg3;
			Static525.aClass244_59.method5960(local200);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!n;)V")
	public static void method5265(@OriginalArg(1) Class225 arg0) {
		if (arg0.anInt6491 != Static230.anInt4189) {
			return;
		}
		if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78 == null) {
			arg0.anInt6488 = 0;
			arg0.anInt6544 = 0;
			return;
		}
		arg0.anInt6525 = 150;
		arg0.anInt6548 = (int) (Math.sin((double) Static106.anInt2418 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6488 = Static411.anInt7797;
		arg0.anInt6538 = 5;
		arg0.anInt6544 = Static49.method636(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78);
		arg0.anInt6541 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8398;
		arg0.anInt6510 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8409;
		arg0.anInt6512 = 0;
		arg0.anInt6530 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8386;
		@Pc(78) Class365 local78 = arg0.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(arg0.anInt6510);
		if (local78 != null) {
			Static594.method8374(arg0.anInt6541, local78);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIB)Z")
	public static boolean method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static262.aByteArrayArrayArray16[1].length && arg1 < Static262.aByteArrayArrayArray16[1][arg0].length) {
			return (Static262.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
