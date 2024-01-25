import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	public static int anInt3954;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
	public static final int[] anIntArray500 = new int[13];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)Lclient!gi;")
	public static Class91 method3258(@OriginalArg(1) int arg0) {
		@Pc(10) Class91 local10 = (Class91) Static3.aClass227_1.method4863((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static162.aClass230_45.method4985(arg0, 1);
		local10 = new Class91();
		local10.anInt2093 = arg0;
		if (local20 != null) {
			local10.method1735(new Class1_Sub33(local20));
		}
		local10.method1738();
		if (local10.anInt2091 == 2 && Static218.aClass77_28.method1368((long) arg0) == null) {
			Static218.aClass77_28.method1370((long) arg0, new Class1_Sub30(Static43.anInt868));
			Static239.aClass91Array1[Static43.anInt868++] = local10;
		}
		Static3.aClass227_1.method4865(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)I")
	public static int method3260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static229.aClass42Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static92.anInt1675 - 1 < local11 || Static262.anInt6340 - 1 < local15) {
			return 0;
		}
		@Pc(52) int local52 = arg0;
		if (arg0 < 3 && (Static373.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
			local52 = arg0 + 1;
		}
		return Static229.aClass42Array3[local52].method3043(arg2, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg0 && arg6 == arg1 && arg3 == arg2 && arg7 == arg5) {
			Static34.method520(arg7, arg2, arg1, arg4, arg0);
			return;
		}
		@Pc(19) int local19 = arg0;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg0 * 3;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(54) int local54 = local33 + arg2 - local41 - arg0;
		@Pc(64) int local64 = arg7 + local37 - arg1 - local45;
		@Pc(75) int local75 = local41 + local25 - local33 - local33;
		@Pc(83) int local83 = local29 + local45 - local37 - local37;
		@Pc(88) int local88 = local33 - local25;
		@Pc(93) int local93 = local37 - local29;
		for (@Pc(95) int local95 = 128; local95 <= 4096; local95 += 128) {
			@Pc(103) int local103 = local95 * local95 >> 12;
			@Pc(109) int local109 = local103 * local95 >> 12;
			@Pc(113) int local113 = local109 * local54;
			@Pc(117) int local117 = local64 * local109;
			@Pc(121) int local121 = local103 * local75;
			@Pc(125) int local125 = local103 * local83;
			@Pc(129) int local129 = local95 * local88;
			@Pc(133) int local133 = local93 * local95;
			@Pc(143) int local143 = (local121 + local113 + local129 >> 12) + arg0;
			@Pc(153) int local153 = arg1 + (local133 + local125 + local117 >> 12);
			Static34.method520(local153, local143, local21, arg4, local19);
			local21 = local153;
			local19 = local143;
		}
	}
}
