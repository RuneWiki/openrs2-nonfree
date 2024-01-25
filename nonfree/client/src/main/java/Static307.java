import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_63 = new Class103(64);

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([[IILclient!pe;IZ)V")
	public static void method4977(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(4) boolean arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(18) int[][] local18;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0 == null) {
				local18 = null;
			} else {
				local18 = new int[Static15.anInt287 + 1][Static325.anInt6173 + 1];
				for (local30 = 0; local30 <= Static325.anInt6173; local30++) {
					for (local34 = 0; local34 <= Static15.anInt287; local34++) {
						local18[local34][local30] = Static23.anIntArrayArrayArray15[local12][local34][local30] - arg0[local34][local30];
					}
				}
			}
			local30 = 0;
			local34 = 0;
			if (!arg3) {
				if (Static140.aBoolean228) {
					local34 = 8;
				}
				if (Static325.aBoolean452) {
					local30 = 2;
				}
				if (Static336.anInt4180 != 0) {
					local30 |= 0x1;
					if (local12 == 0 || Static194.anInt1874 >= 96) {
						local34 |= 0x10;
					}
				}
			}
			if (Static325.aBoolean452) {
				local34 |= 0x7;
			}
			@Pc(126) Class8 local126 = arg2.method5426(Static15.anInt287, Static325.anInt6173, Static23.anIntArrayArrayArray15[local12], local18, local30, local34);
			Static198.method3545(local12, local126);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!pe;ILclient!ac;ILclient!tj;Lclient!oo;I)V")
	public static void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(5) Class7_Sub37 arg4, @OriginalArg(6) Class155 arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg4.anInt5842 - arg6 / 2 - 5;
		@Pc(22) int local22 = arg0 + 2;
		if (arg5.anInt4660 != 0) {
			arg1.method5477(local22, local18, arg0 + arg3.method52() * arg2 + 1 - local22, arg6 + 10, arg5.anInt4660);
		}
		if (arg5.anInt4687 != 0) {
			arg1.method5454(local18, local22, arg5.anInt4687, arg3.method52() * arg2 + arg0 + 1 - local22, arg6 + 10);
		}
		@Pc(79) int local79 = arg5.anInt4664;
		if (arg4.aBoolean426 && arg5.anInt4672 != -1) {
			local79 = arg5.anInt4672;
		}
		for (@Pc(91) int local91 = 0; local91 < arg2; local91++) {
			@Pc(96) String local96 = Static96.aStringArray25[local91];
			if (local91 < arg2 - 1) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg3.method55(arg1, local96, arg4.anInt5842, arg0, local79);
			arg0 += arg3.method52();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method4980() {
		Static77.aClass103_18.method2678();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public static void method4981(@OriginalArg(1) int arg0) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(12, arg0);
		local13.method4788();
	}
}
