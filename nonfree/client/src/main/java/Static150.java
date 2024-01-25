import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "J")
	public static long aLong96 = -1L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!br;ZI)V")
	public static void method3012(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt708 == 0 ? arg0.anInt740 : arg0.anInt708;
		@Pc(25) int local25 = arg0.anInt761 == 0 ? arg0.anInt758 : arg0.anInt761;
		Static52.method1029(local25, arg1, arg0.anInt728, local15, Static271.aClass21ArrayArray1[arg0.anInt728 >> 16]);
		if (arg0.aClass21Array1 != null) {
			Static52.method1029(local25, arg1, arg0.anInt728, local15, arg0.aClass21Array1);
		}
		@Pc(58) Class4_Sub25 local58 = (Class4_Sub25) Static270.aClass43_29.method1273((long) arg0.anInt728);
		if (local58 != null) {
			Static144.method2969(arg1, local58.anInt3695, local15, local25);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!tj;Lclient!tj;ILclient!tj;Lclient!mn;)Z")
	public static boolean method3014(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(3) Class193 arg2, @OriginalArg(4) Class4_Sub1_Sub4 arg3) {
		Static229.aClass4_Sub1_Sub4_3 = arg3;
		Static193.aClass193_74 = arg1;
		Static243.aClass193_97 = arg0;
		Static158.aClass193_59 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
	public static void method3015() {
		Static24.aClass198_22.method5202(5);
		Static105.aClass198_90.method5202(5);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public static void method3016() {
		Static348.aClass6_1.method4659();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static305.aLongArray10[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static277.aLongArray6[local24] = 0L;
		}
		Static305.anInt6789 = 0;
	}
}
