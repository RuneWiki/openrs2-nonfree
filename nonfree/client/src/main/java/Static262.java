import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public static void method3574() {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			Static26.aBooleanArray2[local13] = true;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class165 local13 = local7.aClass165_1; local13 != null; local13 = local13.aClass165_2) {
			@Pc(17) Class6_Sub2 local17 = local13.aClass6_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort82 == arg1 && local17.aShort85 == arg2) {
				Static1.method30(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;B)V")
	public static void method3576(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		Static313.method4325(arg0, -1, arg3, arg1, arg4, null, arg2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
	public static void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(14) int local14 = arg3 - arg2;
		if (local10 == 0) {
			if (local14 != 0) {
				Static26.method530(arg1, arg0, arg3, arg2);
			}
		} else if (local14 == 0) {
			Static322.method4428(arg0, arg4, arg2, arg1);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local10;
			@Pc(51) int local51 = arg2 - (local43 * arg1 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg1 < Static414.anInt7043) {
				local71 = local51 + (local43 * Static414.anInt7043 >> 12);
				local73 = Static414.anInt7043;
			} else if (Static198.anInt3778 >= arg1) {
				local71 = arg2;
				local73 = arg1;
			} else {
				local73 = Static198.anInt3778;
				local71 = local51 + (Static198.anInt3778 * local43 >> 12);
			}
			@Pc(107) int local107;
			@Pc(115) int local115;
			if (arg4 < Static414.anInt7043) {
				local107 = Static414.anInt7043;
				local115 = local51 + (Static414.anInt7043 * local43 >> 12);
			} else if (Static198.anInt3778 < arg4) {
				local107 = Static198.anInt3778;
				local115 = (Static198.anInt3778 * local43 >> 12) + local51;
			} else {
				local115 = arg3;
				local107 = arg4;
			}
			if (Static388.anInt6740 > local71) {
				local73 = (Static388.anInt6740 - local51 << 12) / local43;
				local71 = Static388.anInt6740;
			} else if (local71 > Static387.anInt6727) {
				local71 = Static387.anInt6727;
				local73 = (Static387.anInt6727 - local51 << 12) / local43;
			}
			if (Static388.anInt6740 > local115) {
				local107 = (Static388.anInt6740 - local51 << 12) / local43;
				local115 = Static388.anInt6740;
			} else if (local115 > Static387.anInt6727) {
				local115 = Static387.anInt6727;
				local107 = (Static387.anInt6727 - local51 << 12) / local43;
			}
			Static390.method5263(arg0, local71, local115, local73, local107);
		}
	}
}
