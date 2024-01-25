import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt6370;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public static int anInt6374;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public static int anInt6378;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "[I")
	public static int[] anIntArray816;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
	public static final int[] anIntArray815 = new int[1000];

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_36 = new Class74();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Lclient!gs;")
	public static Class7_Sub1_Sub10 method5371() {
		return Static306.aClass7_Sub1_Sub10_2;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(3, arg0);
		local13.method4790();
		local13.aString363 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5378() {
		@Pc(5) Class103 local5 = Static266.aClass103_54;
		synchronized (Static266.aClass103_54) {
			Static266.aClass103_54.method2684();
		}
		local5 = Static271.aClass103_57;
		synchronized (Static271.aClass103_57) {
			Static271.aClass103_57.method2684();
		}
		local5 = Static228.aClass103_45;
		synchronized (Static228.aClass103_45) {
			Static228.aClass103_45.method2684();
		}
		local5 = Static283.aClass103_60;
		synchronized (Static283.aClass103_60) {
			Static283.aClass103_60.method2684();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method5381(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(10) int local10 = 99; local10 > 0; local10--) {
			Static121.anIntArray365[local10] = Static121.anIntArray365[local10 - 1];
			Static49.anIntArray203[local10] = Static49.anIntArray203[local10 - 1];
			Static206.aStringArray37[local10] = Static206.aStringArray37[local10 - 1];
			Static79.aStringArray19[local10] = Static79.aStringArray19[local10 - 1];
			Static121.aStringArray30[local10] = Static121.aStringArray30[local10 - 1];
			Static89.aStringArray23[local10] = Static89.aStringArray23[local10 - 1];
			Static215.anIntArray586[local10] = Static215.anIntArray586[local10 - 1];
		}
		Static121.anIntArray365[0] = arg4;
		Static206.aStringArray37[0] = arg0;
		Static49.anIntArray203[0] = arg2;
		Static79.aStringArray19[0] = arg3;
		Static121.aStringArray30[0] = arg1;
		Static20.anInt408 = Static34.anInt776;
		Static89.aStringArray23[0] = arg5;
		Static215.anIntArray586[0] = arg6;
		Static172.anInt2672++;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)I")
	public static int method5382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
