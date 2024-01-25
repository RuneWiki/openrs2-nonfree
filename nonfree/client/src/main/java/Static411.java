import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "[J")
	public static long[] aLongArray13;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "Lclient!oh;")
	public static Class273 aClass273_12;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
	public static int anInt6731;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method6030(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class273 local10 = Static147.method2144(arg2, arg3);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray15 != null) {
			@Pc(21) Class2_Sub36 local21 = new Class2_Sub36();
			local21.aString58 = arg1;
			local21.anObjectArray2 = local10.anObjectArray15;
			local21.anInt5078 = arg0;
			local21.aClass273_6 = local10;
			Static484.method6919(local21);
		}
		if (Static357.anInt5722 != 11 || !Static91.method1412(local10).method3016(arg0 - 1)) {
			return;
		}
		@Pc(68) Class2_Sub33 local68;
		if (arg0 == 1) {
			local68 = Static592.method8154(Static271.aClass349_67, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 2) {
			local68 = Static592.method8154(Static703.aClass349_159, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 3) {
			local68 = Static592.method8154(Static279.aClass349_69, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 4) {
			local68 = Static592.method8154(Static672.aClass349_153, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 5) {
			local68 = Static592.method8154(Static442.aClass349_101, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 6) {
			local68 = Static592.method8154(Static698.aClass349_157, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 7) {
			local68 = Static592.method8154(Static94.aClass349_30, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 8) {
			local68 = Static592.method8154(Static42.aClass349_15, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 9) {
			local68 = Static592.method8154(Static12.aClass349_4, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
		if (arg0 == 10) {
			local68 = Static592.method8154(Static523.aClass349_92, Static487.aClass221_2.aClass48_1);
			Static703.method9411(arg3, arg2, local68, local10.anInt7415);
			Static487.aClass221_2.method5173(local68);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)Z")
	public static boolean method6031(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
