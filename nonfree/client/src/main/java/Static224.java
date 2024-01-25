import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_62 = new Class194(55, 4);

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_60 = new Class198(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "S")
	public static short aShort41 = 1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public static void method2950() {
		for (@Pc(12) int local12 = 0; local12 < Static277.aClass196ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static277.aClass196ArrayArray1[local12].length; local16++) {
				Static277.aClass196ArrayArray1[local12][local16] = Static66.aClass196_1;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIIIII)V")
	public static void method2951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static391.method5106(Static356.anInt5817, arg0, Static3.anInt46);
		@Pc(17) int local17 = Static391.method5106(Static356.anInt5817, arg3, Static3.anInt46);
		@Pc(27) int local27 = Static391.method5106(Static3.anInt45, arg5, Static112.anInt1900);
		@Pc(33) int local33 = Static391.method5106(Static3.anInt45, arg4, Static112.anInt1900);
		@Pc(41) int local41 = Static391.method5106(Static356.anInt5817, arg0 + arg1, Static3.anInt46);
		@Pc(49) int local49 = Static391.method5106(Static356.anInt5817, arg3 - arg1, Static3.anInt46);
		for (@Pc(51) int local51 = local11; local51 < local41; local51++) {
			Static291.method3606(local33, Static133.anIntArrayArray15[local51], arg2, local27);
		}
		for (@Pc(71) int local71 = local17; local71 > local49; local71--) {
			Static291.method3606(local33, Static133.anIntArrayArray15[local71], arg2, local27);
		}
		@Pc(97) int local97 = Static391.method5106(Static3.anInt45, arg1 + arg5, Static112.anInt1900);
		@Pc(106) int local106 = Static391.method5106(Static3.anInt45, arg4 - arg1, Static112.anInt1900);
		for (@Pc(108) int local108 = local41; local108 <= local49; local108++) {
			@Pc(114) int[] local114 = Static133.anIntArrayArray15[local108];
			Static291.method3606(local97, local114, arg2, local27);
			Static291.method3606(local33, local114, arg2, local106);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!bc;IIIII)V")
	public static void method2953(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6451 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static76.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class111 local35 = Static68.aClass111Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt6451; local37++) {
							if (arg0.aClass5_Sub19Array2[local37] == local35.aClass5_Sub19_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass5_Sub19Array2[arg0.anInt6451++] = local35.aClass5_Sub19_2;
						if (arg0.anInt6451 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt6451; local7 < 4; local7++) {
			arg0.aClass5_Sub19Array2[local7] = null;
		}
	}
}
