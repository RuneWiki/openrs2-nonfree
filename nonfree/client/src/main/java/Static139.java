import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public static int anInt3024;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
	public static boolean aBoolean224;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public static int anInt3029;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public static int anInt3026 = 0;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([II)[I")
	public static int[] method2337(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) int[] local12 = new int[arg0.length];
			Static304.method2606(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class71 local4 = Static164.method2829(arg5, arg3);
		if (local4 != null && local4.anObjectArray15 != null) {
			@Pc(14) Class1_Sub14 local14 = new Class1_Sub14();
			local14.anObjectArray1 = local4.anObjectArray15;
			local14.aClass71_8 = local4;
			Static188.method3144(local14);
		}
		Static54.anInt1188 = arg1;
		Static125.aBoolean209 = true;
		Static291.anInt5525 = arg3;
		Static90.anInt2022 = arg5;
		Static10.anInt246 = arg4;
		Static13.anInt260 = arg0;
		Static254.anInt4981 = arg2;
		Static160.method2779(local4);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method2339() {
		@Pc(14) Class1_Sub8 local14;
		for (local14 = (Class1_Sub8) Static185.aClass61_20.method1835(); local14 != null; local14 = (Class1_Sub8) Static185.aClass61_20.method1836()) {
			if (local14.aBoolean29) {
				local14.method364();
			}
		}
		for (local14 = (Class1_Sub8) Static264.aClass61_28.method1835(); local14 != null; local14 = (Class1_Sub8) Static264.aClass61_28.method1836()) {
			if (local14.aBoolean29) {
				local14.method364();
			}
		}
	}
}
