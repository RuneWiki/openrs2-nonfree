import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
	public static int anInt2863;

	@OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "F")
	public static float aFloat31 = 0.0F;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	public static void method2485() {
		if (Static537.aClass325_25 != null) {
			Static313.aClass163_1 = new Class163();
			Static313.aClass163_1.method3937(Static361.aLong183, Static537.aClass325_25.aClass101_62.method2841(Static126.anInt2904), Static537.aClass325_25.anInt9605, Static537.aClass325_25);
			Static433.aThread3 = new Thread(Static313.aClass163_1, "");
			Static433.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBILclient!tc;)V")
	public static void method2486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class305 arg2) {
		Static260.aClass305_6 = arg2;
		Static572.anInt10083 = arg0;
		Static206.anInt8799 = arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIZBLclient!tc;)V")
	public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class305 arg3) {
		@Pc(6) int local6 = arg3.anInt9242;
		@Pc(9) int local9 = arg3.anInt9160;
		if (arg3.aByte101 == 0) {
			arg3.anInt9242 = arg3.anInt9202;
		} else if (arg3.aByte101 == 1) {
			arg3.anInt9242 = arg1 - arg3.anInt9202;
		} else if (arg3.aByte101 == 2) {
			arg3.anInt9242 = arg1 * arg3.anInt9202 >> 14;
		}
		if (arg3.aByte99 == 0) {
			arg3.anInt9160 = arg3.anInt9162;
		} else if (arg3.aByte99 == 1) {
			arg3.anInt9160 = arg0 - arg3.anInt9162;
		} else if (arg3.aByte99 == 2) {
			arg3.anInt9160 = arg3.anInt9162 * arg0 >> 14;
		}
		if (arg3.aByte101 == 4) {
			arg3.anInt9242 = arg3.anInt9158 * arg3.anInt9160 / arg3.anInt9163;
		}
		if (arg3.aByte99 == 4) {
			arg3.anInt9160 = arg3.anInt9242 * arg3.anInt9163 / arg3.anInt9158;
		}
		if (Static230.aBoolean352 && (Static68.method1694(arg3).anInt1877 != 0 || arg3.anInt9211 == 0)) {
			if (arg3.anInt9160 < 5 && arg3.anInt9242 < 5) {
				arg3.anInt9160 = 5;
				arg3.anInt9242 = 5;
			} else {
				if (arg3.anInt9160 <= 0) {
					arg3.anInt9160 = 5;
				}
				if (arg3.anInt9242 <= 0) {
					arg3.anInt9242 = 5;
				}
			}
		}
		if (arg3.anInt9218 == Static58.anInt1503) {
			Static528.aClass305_13 = arg3;
		}
		if (arg2 && arg3.anObjectArray24 != null && (local6 != arg3.anInt9242 || arg3.anInt9160 != local9)) {
			@Pc(181) Class3_Sub38 local181 = new Class3_Sub38();
			local181.aClass305_11 = arg3;
			local181.anObjectArray4 = arg3.anObjectArray24;
			Static319.aClass183_40.method4792(local181);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!fd;)Lclient!rr;")
	public static Class288 method2488(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(12) Class288 local12 = new Class288();
		local12.anInt8665 = arg0.method6535();
		local12.aClass3_Sub4_Sub16_1 = Static25.aClass189_1.method4916(local12.anInt8665);
		return local12;
	}
}
