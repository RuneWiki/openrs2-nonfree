import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt5792;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString190 = "white:";

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt5795 = 1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4467(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg0 ? 32768 : 0;
		@Pc(32) int local32 = local23 + (arg0 ? Static138.anInt2605 : Static16.anInt403);
		for (@Pc(34) int local34 = local23; local34 < local32; local34++) {
			@Pc(45) Class1_Sub2_Sub18 local45 = Static263.method4060(local34);
			if (local45.aBoolean399 && local45.method3996().toLowerCase().indexOf(local11) != -1) {
				if (local17 >= 50) {
					Static189.aShortArray83 = null;
					Static292.anInt5805 = -1;
					return;
				}
				if (local8.length <= local17) {
					@Pc(81) short[] local81 = new short[local8.length * 2];
					for (@Pc(83) int local83 = 0; local83 < local17; local83++) {
						local81[local83] = local8[local83];
					}
					local8 = local81;
				}
				local8[local17++] = (short) local34;
			}
		}
		Static292.anInt5805 = local17;
		Static116.anInt2204 = 0;
		@Pc(117) String[] local117 = new String[Static292.anInt5805];
		Static189.aShortArray83 = local8;
		for (@Pc(121) int local121 = 0; local121 < Static292.anInt5805; local121++) {
			local117[local121] = Static263.method4060(local8[local121]).method3996();
		}
		Static297.method4542(local117, Static189.aShortArray83);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII[[I)I")
	public static int method4468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4) {
		@Pc(34) int local34 = arg4[arg1][arg2] * (128 - arg0) + arg4[arg1 + 1][arg2] * arg0 >> 7;
		@Pc(60) int local60 = arg4[arg1 + 1][arg2 + 1] * arg0 + arg4[arg1][arg2 + 1] * (128 - arg0) >> 7;
		return local60 * arg3 + local34 * (128 - arg3) >> 7;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!sm;)V")
	public static void method4471(@OriginalArg(1) Class1_Sub8 arg0) {
		if (arg0.aClass1_Sub22_5 != null) {
			arg0.aClass1_Sub22_5.anInt3752 = 0;
		}
		arg0.aBoolean419 = false;
		for (@Pc(19) Class1_Sub8 local19 = arg0.method4208(); local19 != null; local19 = arg0.method4206()) {
			method4471(local19);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)J")
	public static long method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass125_1 == null ? 0L : local7.aClass125_1.aLong118;
	}
}
