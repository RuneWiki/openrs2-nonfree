import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "[I")
	public static int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "[I")
	public static final int[] anIntArray499 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!r;)V")
	public static void method5481(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		if (!Static32.aBoolean54) {
			Static123.anInt2786 = 0;
			return;
		}
		if (Static395.aBoolean589) {
			Static420.aLong197 = Static426.aClass25_1.method4035();
		}
		Static145.anInt3068 = 0;
		Static49.anInt1059 = 0;
		Static41.anInt968 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static566.anInt9122 = (int) ((float) local25[3] / 3.0F);
		Static217.anInt4277 = (int) ((float) local25[2] / 3.0F);
		arg1.method7158(Static23.anIntArray56);
		if ((int) ((float) Static23.anIntArray56[0] / 3.0F) != Static28.anInt683 || Static91.anInt2280 != (int) ((float) Static23.anIntArray56[1] / 3.0F)) {
			Static91.anInt2280 = (int) ((float) Static23.anIntArray56[1] / 3.0F);
			Static28.anInt683 = (int) ((float) Static23.anIntArray56[0] / 3.0F);
			Static571.anIntArray639 = new int[Static28.anInt683 * Static91.anInt2280];
			Static35.anInt839 = Static28.anInt683 >> 1;
			Static449.anInt7389 = Static91.anInt2280 >> 1;
		}
		Static511.aClass109_6 = arg1.method7140();
		Static123.anInt2786 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static333.anInt5940; local102++) {
			Static374.method5524(Static476.aClass241Array35[local102], arg1, arg0);
		}
		for (@Pc(125) int local125 = 0; local125 < Static236.anInt4467; local125++) {
			Static374.method5524(Static436.aClass241Array30[local125], arg1, arg0);
		}
		for (@Pc(140) int local140 = 0; local140 < Static227.anInt4402; local140++) {
			Static374.method5524(Static477.aClass241Array33[local140], arg1, arg0);
		}
		Static151.anInt3128 = 0;
		if (Static123.anInt2786 > 0) {
			@Pc(164) int local164 = Static571.anIntArray639.length;
			@Pc(171) int local171 = local164 - local164 & 0x7;
			@Pc(173) int local173 = 0;
			while (local171 > local173) {
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
			}
			while (local164 > local173) {
				Static571.anIntArray639[local173++] = Integer.MAX_VALUE;
			}
			Static437.anInt7278 = 1;
			for (@Pc(232) int local232 = 0; local232 < Static123.anInt2786; local232++) {
				@Pc(238) Class241 local238 = Static466.aClass241Array37[local232];
				Static21.method439(local238.aShortArray218[3], local238.aShortArray216[3], local238.aShortArray217[3], local238.aShortArray216[0], local238.aShortArray216[1], local238.aShortArray217[1], local238.aShortArray218[1], local238.aShortArray218[0], local238.aShortArray217[0]);
				Static21.method439(local238.aShortArray218[3], local238.aShortArray216[3], local238.aShortArray217[3], local238.aShortArray216[1], local238.aShortArray216[2], local238.aShortArray217[2], local238.aShortArray218[2], local238.aShortArray218[1], local238.aShortArray217[1]);
			}
			Static437.anInt7278 = 2;
		}
		if (Static395.aBoolean589) {
			Static453.aLong210 = Static426.aClass25_1.method4035() - Static420.aLong197;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!i;)V")
	public static void method5484(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		Static29.aClass139Array6[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBII)I")
	public static int method5487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - arg1;
		return ((local35 * (arg2 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg2 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}
}
