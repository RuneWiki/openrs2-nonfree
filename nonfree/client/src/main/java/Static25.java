import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!qj;")
	public static Class165 aClass165_8;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!kq;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
	public static final int[] anIntArray83 = new int[1024];

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
	public static final int[] anIntArray84 = new int[14];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg7 == arg0 && arg6 == arg8 && arg2 == arg4) {
			Static316.method5327(arg1, arg3, arg8, arg0, arg2);
			return;
		}
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg4 * 3;
		@Pc(71) int local71 = local50 + arg8 - local58 - arg1;
		@Pc(80) int local80 = local54 + arg2 - arg0 - local62;
		@Pc(89) int local89 = local58 + local42 - local50 - local50;
		@Pc(99) int local99 = local46 + local62 - local54 - local54;
		@Pc(104) int local104 = local50 - local42;
		@Pc(109) int local109 = local54 - local46;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local119 * local111 >> 12;
			@Pc(129) int local129 = local125 * local71;
			@Pc(133) int local133 = local80 * local125;
			@Pc(137) int local137 = local89 * local119;
			@Pc(141) int local141 = local119 * local99;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local111 * local109;
			@Pc(160) int local160 = (local129 + local137 + local145 >> 12) + arg1;
			@Pc(171) int local171 = arg0 + (local149 + local133 + local141 >> 12);
			Static316.method5327(local36, arg3, local160, local38, local171);
			local36 = local160;
			local38 = local171;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
	public static void method754(@OriginalArg(1) int arg0) {
		Static344.aClass140_169 = new Class140(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(BII)V")
	public static void method755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class186 local9 = Static152.aClass186ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static108.anInt2198 = local9.anInt5486;
			Static199.anInt4062 = local9.anInt5495;
			Static44.anInt963 = local9.anInt5496;
		}
		Static38.method3470();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILclient!jj;II)V")
	public static void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class5_Sub3_Sub3 arg3) {
		Static217.method3972(arg2, arg0, arg1, 0, arg3.anInt5050, arg3.anInt5047);
	}
}
