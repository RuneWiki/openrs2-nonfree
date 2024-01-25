import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mv", name = "Jb", descriptor = "Lclient!gj;")
	public static Class95 aClass95_3;

	@OriginalMember(owner = "client!mv", name = "Fb", descriptor = "I")
	public static int anInt4172 = 0;

	@OriginalMember(owner = "client!mv", name = "Ib", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!mv", name = "Xb", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_158 = new Class214(8, 2);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[[I)V")
	public static void method3341(@OriginalArg(1) int[][] arg0) {
		Static106.anIntArrayArray46 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V")
	public static void method3342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub3_Sub13 local10 = Static397.method4998(6, arg0);
		local10.method3459();
		local10.anInt4301 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg2[local31] += arg4[arg3++];
				@Pc(43) int local43 = arg5++;
				arg2[local43] += arg4[arg3++];
				@Pc(55) int local55 = arg5++;
				arg2[local55] += arg4[arg3++];
				@Pc(67) int local67 = arg5++;
				arg2[local67] += arg4[arg3++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local31 = arg5++;
				arg2[local31] += arg4[arg3++];
			}
			arg3 += arg1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!mv", name = "s", descriptor = "(II)V")
	public static void method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class82 local28 = Static159.aClass82ArrayArrayArray2[local9][arg0][arg1] = Static159.aClass82ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte16--;
				for (@Pc(40) Class146 local40 = local28.aClass146_1; local40 != null; local40 = local40.aClass146_3) {
					@Pc(44) Class20_Sub3 local44 = local40.aClass20_Sub3_1;
					if (local44.aShort85 == arg0 && local44.aShort88 == arg1) {
						local44.aByte89--;
					}
				}
			}
		}
		if (Static159.aClass82ArrayArrayArray2[0][arg0][arg1] == null) {
			Static159.aClass82ArrayArrayArray2[0][arg0][arg1] = new Class82(0, arg0, arg1);
			Static159.aClass82ArrayArrayArray2[0][arg0][arg1].aByte17 = 1;
		}
		Static159.aClass82ArrayArrayArray2[0][arg0][arg1].aClass82_1 = local7;
		Static159.aClass82ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "(B)V")
	public static void method3355() {
		if (!Static223.method2979()) {
			return;
		}
		if (Static270.aStringArray36 == null) {
			Static73.method1173();
		}
		Static132.anInt2264 = 0;
		Static401.aBoolean287 = true;
		try {
			Static276.aClipboard1 = Static389.aClient4.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}
}
