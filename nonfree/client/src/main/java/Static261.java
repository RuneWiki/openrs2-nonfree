import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	public static int anInt4995;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public static void method4514() {
		@Pc(12) Class2_Sub52 local12 = Static311.method5098(Static362.aClass341_92, Static125.aClass179_1);
		local12.aClass2_Sub8_Sub2_2.method5170(0);
		Static38.method791(local12);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class27 local13 = local7.aClass27_3; local13 != null; local13 = local13.aClass27_1) {
			@Pc(17) Class15_Sub3_Sub3 local17 = local13.aClass15_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort62 == arg1 && local17.aShort64 == arg2) {
				Static395.method6570(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)J")
	public static long method4516() {
		return Static596.aClass98_1.method9616();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(14) Class2_Sub1_Sub5 local14 = Static653.method9595(3, (long) arg0);
		local14.method2486();
		local14.aString33 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4519(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static524.method8169(Static49.method991(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
