import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!ol;")
	public static Class159 aClass159_2;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
	public static final int[] anIntArray122 = new int[4];

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt1686 = 0;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
	public static final int[] anIntArray123 = new int[14];

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt1688 = 0;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	public static int anInt1692 = 0;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method1716() {
		Static245.aClass11_82.method215(5);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lclient!ne;")
	public static Class146 method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class146 local7 = Static273.method4632(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass146Array2 == null || local7.aClass146Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass146Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method1718(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) String local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) short local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg0; local47++) {
			if (local21 == null || arg1[local47] != null && arg1[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(72) String local72 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local72;
				@Pc(86) short local86 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local86;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method1718(local17 - 1, arg1, arg2, arg3);
		method1718(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ne;I)V")
	public static void method1720(@OriginalArg(0) Class146 arg0) {
		@Pc(6) int local6 = arg0.anInt4198;
		if (local6 == 324) {
			if (Static29.anInt4704 == -1) {
				Static29.anInt4704 = arg0.anInt4174;
				Static201.anInt4056 = arg0.anInt4150;
			}
			if (Static189.aClass83_5.aBoolean179) {
				arg0.anInt4174 = Static29.anInt4704;
			} else {
				arg0.anInt4174 = Static201.anInt4056;
			}
		} else if (local6 == 325) {
			if (Static29.anInt4704 == -1) {
				Static29.anInt4704 = arg0.anInt4174;
				Static201.anInt4056 = arg0.anInt4150;
			}
			if (Static189.aClass83_5.aBoolean179) {
				arg0.anInt4174 = Static201.anInt4056;
			} else {
				arg0.anInt4174 = Static29.anInt4704;
			}
		} else if (local6 == 327) {
			arg0.anInt4165 = 150;
			arg0.anInt4190 = (int) (Math.sin((double) Static153.anInt3257 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt4169 = 5;
			arg0.anInt4179 = -1;
		} else if (local6 == 328) {
			if (Static173.aClass10_Sub3_Sub3_Sub2_1.aString224 == null) {
				arg0.anInt4179 = 0;
				arg0.anInt4204 = 0;
			} else {
				arg0.anInt4165 = 150;
				arg0.anInt4190 = (int) (Math.sin((double) Static153.anInt3257 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4169 = 5;
				arg0.anInt4179 = 2047;
				arg0.anInt4204 = Static164.method3267(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224);
				arg0.anInt4155 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5959;
				arg0.anInt4147 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5966;
				arg0.anInt4202 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5939;
				arg0.anInt4201 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!jg;)Ljava/lang/String;")
	public static String method1721(@OriginalArg(1) Class14_Sub4 arg0) {
		return Static304.method5310(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)V")
	public static void method1722(@OriginalArg(1) int arg0) {
		Static273.anInt5198 = -1;
		Static41.anInt983 = arg0;
		Static273.anInt5198 = -1;
		Static22.method502();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!n;I)V")
	public static void method1723(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.aClass10_Sub3_Sub3_1 = null;
		if (Static312.anInt6027 < 20) {
			Static86.aClass126_2.method3401(arg0);
			Static312.anInt6027++;
		}
	}
}
