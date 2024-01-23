import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!sc;")
	public static Class107 aClass107_263 = Static231.method3737("<)4col>");

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public static int anInt784 = 100;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Z")
	public static boolean method715(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!jb;IB)Lclient!pg;")
	public static Class64 method716(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		return Static23.method421(arg0, arg1) ? Static76.method1341() : null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(11) int local11 = arg3;
		@Pc(15) int local15 = arg4 - arg1;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(23) int local23 = arg4 * arg4;
		@Pc(27) int local27 = arg3 * arg3;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local27 << 1;
		@Pc(39) int local39 = local23 << 1;
		@Pc(43) int local43 = local19 * local19;
		@Pc(47) int local47 = local43 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = local19 << 1;
		@Pc(59) int local59 = arg3 << 1;
		@Pc(69) int local69 = (1 - local59) * local23 + local35;
		@Pc(78) int local78 = local27 - local39 * (local59 - 1);
		@Pc(99) int local99 = local43 - (local55 - 1) * local51;
		@Pc(109) int local109 = (1 - local55) * local31 + local47;
		@Pc(113) int local113 = local23 << 2;
		@Pc(117) int local117 = local31 << 2;
		@Pc(121) int local121 = local27 << 2;
		@Pc(125) int local125 = local43 << 2;
		@Pc(129) int local129 = local35 * 3;
		@Pc(135) int local135 = (local59 - 3) * local39;
		@Pc(139) int local139 = local47 * 3;
		@Pc(145) int local145 = (local55 - 3) * local51;
		@Pc(147) int local147 = local121;
		@Pc(153) int local153 = (arg3 - 1) * local113;
		@Pc(155) int local155 = local125;
		@Pc(161) int local161 = local117 * (local19 - 1);
		@Pc(165) int[] local165 = Static231.anIntArrayArray44[arg2];
		Static162.method2605(local165, arg6 - arg4, arg0, arg6 - local15);
		Static162.method2605(local165, arg6 - local15, arg5, local15 + arg6);
		Static162.method2605(local165, local15 + arg6, arg0, arg4 + arg6);
		while (local11 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local129;
					local3++;
					local78 += local147;
					local129 += local121;
					local147 += local121;
				}
			}
			@Pc(240) boolean local240 = local11 <= local19;
			if (local240) {
				if (local109 < 0) {
					while (local109 < 0) {
						local5++;
						local109 += local139;
						local99 += local155;
						local139 += local125;
						local155 += local125;
					}
				}
				if (local99 < 0) {
					local99 += local155;
					local155 += local125;
					local5++;
					local109 += local139;
					local139 += local125;
				}
				local99 += -local145;
				local109 += -local161;
				local145 -= local117;
				local161 -= local117;
			}
			local11--;
			if (local78 < 0) {
				local3++;
				local69 += local129;
				local129 += local121;
				local78 += local147;
				local147 += local121;
			}
			@Pc(333) int local333 = arg2 - local11;
			@Pc(337) int local337 = arg6 + local3;
			@Pc(342) int local342 = arg6 - local3;
			@Pc(346) int local346 = local11 + arg2;
			local78 += -local135;
			if (local240) {
				@Pc(376) int local376 = arg6 - local5;
				@Pc(381) int local381 = arg6 + local5;
				Static162.method2605(Static231.anIntArrayArray44[local333], local342, arg0, local376);
				Static162.method2605(Static231.anIntArrayArray44[local333], local376, arg5, local381);
				Static162.method2605(Static231.anIntArrayArray44[local333], local381, arg0, local337);
				Static162.method2605(Static231.anIntArrayArray44[local346], local342, arg0, local376);
				Static162.method2605(Static231.anIntArrayArray44[local346], local376, arg5, local381);
				Static162.method2605(Static231.anIntArrayArray44[local346], local381, arg0, local337);
			} else {
				Static162.method2605(Static231.anIntArrayArray44[local333], local342, arg0, local337);
				Static162.method2605(Static231.anIntArrayArray44[local346], local342, arg0, local337);
			}
			local69 += -local153;
			local135 -= local113;
			local153 -= local113;
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method718() {
		if (Static37.anInt769 > 0) {
			Static14.method334();
		} else {
			Static66.aClass82_1 = Static167.aClass82_3;
			Static167.aClass82_3 = null;
			Static52.method1046(40);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BII)I")
	public static int method720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static6.method2294(0, arg1, arg0);
	}
}
