import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!kda;")
	public static Class160 aClass160_48;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
	public static void method3846() {
		if (!Static382.aBoolean440) {
			return;
		}
		@Pc(11) Class309 local11 = Static210.method3818(Static323.anInt6116, Static423.anInt8970);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class1_Sub40 local20 = new Class1_Sub40();
			local20.aClass309_10 = local11;
			local20.anObjectArray5 = local11.anObjectArray16;
			Static387.method5838(local20);
		}
		Static151.anInt3437 = -1;
		Static368.anInt6563 = -1;
		Static382.aBoolean440 = false;
		if (local11 != null) {
			Static291.method4908(local11);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ke;")
	public static RuntimeException_Sub1 method3847(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString30 = local12.aString30 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!faa;B)V")
	public static void method3848(@OriginalArg(0) Class47_Sub2_Sub3 arg0) {
		if (arg0 instanceof Class47_Sub2_Sub3_Sub1) {
			@Pc(5) Class47_Sub2_Sub3_Sub1 local5 = (Class47_Sub2_Sub3_Sub1) arg0;
			if (local5.aClass238_1 != null) {
				Static155.method3124(local5, local5.aByte94 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
			}
		} else if (arg0 instanceof Class47_Sub2_Sub3_Sub2) {
			@Pc(26) Class47_Sub2_Sub3_Sub2 local26 = (Class47_Sub2_Sub3_Sub2) arg0;
			Static350.method5566(local26, local26.aByte94 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBII)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
		Static192.aClass1_Sub13_Sub2_1.method3060(Static203.aClass143_7.anInt4449);
		Static192.aClass1_Sub13_Sub2_1.method3060(arg1);
		Static192.aClass1_Sub13_Sub2_1.method3060(arg3);
		Static192.aClass1_Sub13_Sub2_1.method3038(arg0);
		Static192.aClass1_Sub13_Sub2_1.method3038(arg2);
		Static180.anInt3884 = 0;
		Static244.anInt4711 = -3;
		Static165.anInt3646 = 0;
		Static318.anInt6041 = 1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BIII[FFFIIII)V")
	public static void method3850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2 - arg1;
		@Pc(9) int local9 = arg9 - arg0;
		@Pc(13) int local13 = arg7 - arg8;
		@Pc(46) float local46 = arg3[2] * (float) local5 + arg3[0] * (float) local9 + arg3[1] * (float) local13;
		@Pc(67) float local67 = (float) local5 * arg3[5] + (float) local9 * arg3[3] + (float) local13 * arg3[4];
		@Pc(88) float local88 = arg3[7] * (float) local13 + (float) local9 * arg3[6] + arg3[8] * (float) local5;
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local99 *= arg4;
		}
		@Pc(113) float local113 = local67 + arg5 + 0.5F;
		@Pc(134) float local134;
		if (arg6 == 1) {
			local134 = local99;
			local99 = -local113;
			local113 = local134;
		} else if (arg6 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg6 == 3) {
			local134 = local99;
			local99 = local113;
			local113 = -local134;
		}
		Static348.aFloat125 = local113;
		Static205.aFloat92 = local99;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Z")
	public static boolean method3851(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static493.aCharArray7[local12 - 128] != '\u0000';
		}
	}
}
