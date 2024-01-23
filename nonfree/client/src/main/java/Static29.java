import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!nk;")
	public static Class121 aClass121_15;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "I")
	public static volatile int anInt511 = 0;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Z")
	public static boolean aBoolean19 = true;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	public static int anInt517 = 0;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(JBZ)V")
	public static void method472(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static72.anInt5402 >= 100) {
			Static243.method4744(Static315.aString312, 0, "");
			return;
		}
		@Pc(24) String local24 = Static113.method2021(arg0);
		@Pc(26) int local26;
		for (local26 = 0; local26 < Static72.anInt5402; local26++) {
			if (aLongArray3[local26] == arg0) {
				Static243.method4744(local24 + Static239.aString247, 0, "");
				return;
			}
		}
		for (local26 = 0; local26 < Static120.anInt2510; local26++) {
			if (arg0 == Static204.aLongArray10[local26]) {
				Static243.method4744(Static4.aString6 + local24 + Static115.aString137, 0, "");
				return;
			}
		}
		if (local24.equals(Static90.aClass15_Sub5_Sub2_2.aString336)) {
			Static243.method4744(Static245.aString258, 0, "");
			return;
		}
		aLongArray3[Static72.anInt5402] = arg0;
		Static314.aStringArray2[Static72.anInt5402] = Static307.method4640(arg0);
		Static279.aBooleanArray22[Static72.anInt5402++] = arg1;
		Static70.anInt1491 = Static86.anInt1698;
		Static127.aClass1_Sub14_Sub1_3.method1408(40);
		Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[ZZZIILclient!wb;I[I[[FI[[IB[[FI[[FIII[[IZZ)V")
	public static void method473(@OriginalArg(1) boolean[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub31 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float[][] arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) int arg17, @OriginalArg(19) int[][] arg18, @OriginalArg(20) boolean arg19, @OriginalArg(21) boolean arg20) {
		@Pc(21) int local21 = (arg1 ? 255 : 0) + (arg15 << 8);
		@Pc(31) int local31 = (arg2 ? 255 : 0) + (arg16 << 8);
		@Pc(41) int local41 = (arg20 ? 255 : 0) + (arg4 << 8);
		@Pc(51) int local51 = (arg19 ? 255 : 0) + (arg6 << 8);
		@Pc(57) int[] local57 = new int[arg7.length / 2];
		for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
			@Pc(73) int local73 = arg7[local59 + local59];
			@Pc(81) int local81 = arg7[local59 + local59 + 1];
			@Pc(93) int[][] local93 = arg18 == null || arg0 == null || !arg0[local59] ? arg10 : arg18;
			local57[local59] = Static240.method3687(arg12, arg11, local21, arg14, local73, local93, local31, local41, arg8, (float) arg3, arg17, arg5, false, local81, arg18, local51, arg9);
		}
		arg5.method4607(arg13, arg17, arg9, local57, null, false);
	}
}
