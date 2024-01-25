import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	public static int anInt1275;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "[[[Lclient!wr;")
	public static Class251[][][] aClass251ArrayArrayArray1;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
	public static final int[] anIntArray272 = new int[13];

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
	public static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)V")
	public static void method1050(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static44.anIntArray182[local3] = Static44.anIntArray182[local3 - 1];
			Static105.anIntArray442[local3] = Static105.anIntArray442[local3 - 1];
			Static40.aStringArray26[local3] = Static40.aStringArray26[local3 - 1];
			Static96.aStringArray55[local3] = Static96.aStringArray55[local3 - 1];
			Static220.aStringArray99[local3] = Static220.aStringArray99[local3 - 1];
			Static321.aStringArray141[local3] = Static321.aStringArray141[local3 - 1];
			Static321.anIntArray1120[local3] = Static321.anIntArray1120[local3 - 1];
		}
		Static44.anIntArray182[0] = arg2;
		Static105.anIntArray442[0] = arg1;
		Static40.aStringArray26[0] = arg3;
		Static96.aStringArray55[0] = arg0;
		Static220.aStringArray99[0] = arg4;
		Static321.anIntArray1120[0] = arg6;
		Class2_Sub4_Sub9.lb++;
		Static321.aStringArray141[0] = arg5;
		Static253.anInt4470 = Static102.anInt2133;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIII)V")
	public static void method1051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = Static93.method1862(arg1, Static40.anInt818, Static138.anInt932);
		@Pc(25) int local25 = Static93.method1862(arg2, Static40.anInt818, Static138.anInt932);
		@Pc(31) int local31 = Static93.method1862(arg4, Static235.anInt4193, Static243.anInt4326);
		@Pc(37) int local37 = Static93.method1862(arg0, Static235.anInt4193, Static243.anInt4326);
		for (@Pc(39) int local39 = local19; local39 <= local25; local39++) {
			Static315.method4662(local37, Static15.anIntArrayArray1[local39], local31, arg3);
		}
	}
}
