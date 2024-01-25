import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
	public static int anInt8300 = -1;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lclient!bn;")
	public static final Class37 aClass37_8 = new Class37("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString98 = null;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILclient!fe;ILclient!mp;IIIIII)V")
	public static void method7425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class103 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class236 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static300.anInt9851 = arg0;
		Static512.anInt9125 = arg1;
		Static655.aClass67_3 = null;
		Static623.aClass67_2 = null;
		Static29.anInt500 = arg8;
		Static367.anInt6940 = arg9;
		Static576.aClass103_11 = arg2;
		Static598.aClass236_11 = arg4;
		Static221.anInt4514 = arg5;
		Static315.aClass67_1 = null;
		Static560.anInt9730 = arg3;
		Static144.anInt2713 = arg6;
		Static573.anInt10002 = arg7;
		Static35.anInt596 = arg10;
		Static638.method9416();
		Static349.aBoolean512 = true;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZIIIILclient!gga;)V")
	public static void method7426(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class124 arg2) {
		Static632.anInt10931 = 0;
		Static264.anInt5034 = arg1;
		Static311.anInt5615 = 1;
		Static131.anInt2515 = arg0;
		Static151.aClass2_Sub26_Sub3_5 = null;
		Static337.aClass124_71 = arg2;
		Static138.aBoolean196 = false;
		Static530.anInt9738 = 2;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!m;)Ljava/lang/String;")
	public static String method7429(@OriginalArg(1) Class2_Sub1_Sub13 arg0) {
		if (arg0.aString81 == null || arg0.aString81.length() == 0) {
			return arg0.aString82 == null || arg0.aString82.length() <= 0 ? arg0.aString83 : arg0.aString83 + Static205.aClass134_32.method3906(Static204.anInt8130) + arg0.aString82;
		} else if (arg0.aString82 == null || arg0.aString82.length() <= 0) {
			return arg0.aString83 + Static205.aClass134_32.method3906(Static204.anInt8130) + arg0.aString81;
		} else {
			return arg0.aString83 + Static205.aClass134_32.method3906(Static204.anInt8130) + arg0.aString82 + Static205.aClass134_32.method3906(Static204.anInt8130) + arg0.aString81;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
	public static void method7430(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(14, (long) arg0);
		local9.method2489();
	}
}
