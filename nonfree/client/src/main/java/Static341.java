import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	public static int anInt6056;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "[I")
	public static final int[] anIntArray532 = new int[2048];

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	public static int anInt6053 = 0;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "[S")
	public static final short[] aShortArray75 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIIII)V")
	public static void method4736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static387.anInt6727 || Static388.anInt6740 > arg4) {
			return;
		}
		@Pc(19) boolean local19;
		if (arg1 < Static414.anInt7043) {
			arg1 = Static414.anInt7043;
			local19 = false;
		} else if (arg1 <= Static198.anInt3778) {
			local19 = true;
		} else {
			local19 = false;
			arg1 = Static198.anInt3778;
		}
		@Pc(38) boolean local38;
		if (Static414.anInt7043 > arg3) {
			arg3 = Static414.anInt7043;
			local38 = false;
		} else if (Static198.anInt3778 < arg3) {
			local38 = false;
			arg3 = Static198.anInt3778;
		} else {
			local38 = true;
		}
		if (Static388.anInt6740 > arg0) {
			arg0 = Static388.anInt6740;
		} else {
			Static335.method4533(arg3, arg2, arg1, Static162.anIntArrayArray58[arg0++]);
		}
		if (Static387.anInt6727 < arg4) {
			arg4 = Static387.anInt6727;
		} else {
			Static335.method4533(arg3, arg2, arg1, Static162.anIntArrayArray58[arg4--]);
		}
		@Pc(91) int local91;
		if (local19 && local38) {
			for (local91 = arg0; local91 <= arg4; local91++) {
				@Pc(131) int[] local131 = Static162.anIntArrayArray58[local91];
				local131[arg1] = local131[arg3] = arg2;
			}
		} else if (local19) {
			for (local91 = arg0; local91 <= arg4; local91++) {
				Static162.anIntArrayArray58[local91][arg1] = arg2;
			}
		} else if (local38) {
			for (local91 = arg0; local91 <= arg4; local91++) {
				Static162.anIntArrayArray58[local91][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ns;Lclient!ns;Lclient!qa;B)V")
	public static void method4737(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class30 arg2) {
		Static26.aClass215_1 = Static437.method5652(Static240.anInt4396, arg0);
		Static162.aClass105_6 = arg2.method4690(Static26.aClass215_1, Static464.method4784(arg1, Static240.anInt4396));
		Static254.aClass215_7 = Static437.method5652(Static68.anInt4584, arg0);
		Static390.aClass105_7 = arg2.method4690(Static254.aClass215_7, Static464.method4784(arg1, Static68.anInt4584));
		Static266.aClass215_8 = Static437.method5652(Static220.anInt5563, arg0);
		Static245.aClass105_4 = arg2.method4690(Static266.aClass215_8, Static464.method4784(arg1, Static220.anInt5563));
	}
}
