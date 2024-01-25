import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "C")
	public static char aChar10;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!dp;")
	public static Class53 aClass53_151;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!nk;")
	public static final Class143 aClass143_15 = new Class143();

	@OriginalMember(owner = "client!k", name = "i", descriptor = "J")
	public static long aLong213 = 0L;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "[Lclient!kf;")
	public static final Class6_Sub2_Sub9[] aClass6_Sub2_Sub9Array9 = new Class6_Sub2_Sub9[14];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method5548(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static160.anIntArray360[local7] = Static160.anIntArray360[local7 - 1];
			Static113.anIntArray284[local7] = Static113.anIntArray284[local7 - 1];
			Static175.aStringArray20[local7] = Static175.aStringArray20[local7 - 1];
			Static304.aStringArray37[local7] = Static304.aStringArray37[local7 - 1];
			Static346.aStringArray43[local7] = Static346.aStringArray43[local7 - 1];
			Static204.aStringArray25[local7] = Static204.aStringArray25[local7 - 1];
			Static1.anIntArray1[local7] = Static1.anIntArray1[local7 - 1];
		}
		Static160.anIntArray360[0] = arg2;
		Static113.anIntArray284[0] = arg4;
		Static175.aStringArray20[0] = arg6;
		Static304.aStringArray37[0] = arg1;
		Static346.aStringArray43[0] = arg5;
		Static1.anIntArray1[0] = arg3;
		Static204.aStringArray25[0] = arg0;
		Static14.anInt254++;
		Static88.anInt1622 = Static234.anInt36;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static17.anInt6198 = arg0 - Static307.anInt1200;
		Static192.anInt3645 = arg1 - Static307.anInt1195;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZ)V")
	public static void method5550(@OriginalArg(3) boolean arg0) {
		Static76.anInt2851 = 2;
		Static16.aBoolean25 = arg0;
		Static22.anInt358 = 22050;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method5551() {
		Static147.method2881((long) Static76.anInt2853, Static289.aClass81_7);
		if (Static62.anInt1131 != -1) {
			Static172.method3366(Static62.anInt1131);
		}
		for (@Pc(24) int local24 = 0; local24 < Static25.anInt504; local24++) {
			if (Static103.aBooleanArray18[local24]) {
				Static120.aBooleanArray20[local24] = true;
			}
			Static162.aBooleanArray23[local24] = Static103.aBooleanArray18[local24];
			Static103.aBooleanArray18[local24] = false;
		}
		Static268.anInt5004 = Static76.anInt2853;
		if (Static289.aClass81_7.method2988()) {
			Static115.aBoolean185 = true;
		}
		Static10.aClass132_2 = null;
		if (Static62.anInt1131 != -1) {
			Static25.anInt504 = 0;
			Static7.method148();
		}
		Static289.aClass81_7.method3032();
		Static66.method1125(Static211.anInt3858);
		Static133.anInt2448 = 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method5552() {
		@Pc(1) Class70 local1 = Static126.aClass70_40;
		synchronized (Static126.aClass70_40) {
			Static126.aClass70_40.method1399();
		}
		local1 = Static108.aClass70_34;
		synchronized (Static108.aClass70_34) {
			Static108.aClass70_34.method1399();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method5553(@OriginalArg(1) Class81 arg0) {
		if (Static201.aBoolean284) {
			Static200.method3641(arg0);
		} else {
			Static176.method3408(arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([III[IB)V")
	public static void method5554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local28;
		@Pc(42) int local42 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local42;
		for (@Pc(54) int local54 = arg1; local54 < arg2; local54++) {
			if (arg0[local54] < (local54 & 0x1) + local28) {
				@Pc(69) int local69 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24] = local69;
				@Pc(83) int local83 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local83;
			}
		}
		arg0[arg2] = arg0[local24];
		arg0[local24] = local28;
		arg3[arg2] = arg3[local24];
		arg3[local24] = local42;
		method5554(arg0, arg1, local24 - 1, arg3);
		method5554(arg0, local24 + 1, arg2, arg3);
	}
}
