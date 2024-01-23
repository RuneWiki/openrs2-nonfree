import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "Lclient!hc;")
	public static Class51 aClass51_75;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "Lclient!hc;")
	public static Class51 aClass51_76;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public static volatile int anInt4989 = 0;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
	public static void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub16 local28 = Static142.aClass1_Sub16ArrayArrayArray4[local9][arg0][arg1] = Static142.aClass1_Sub16ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt2924--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt2929; local38++) {
					@Pc(44) Class47 local44 = local28.aClass47Array1[local38];
					if ((local44.aLong73 >> 29 & 0x3L) == 2L && local44.anInt2146 == arg0 && local44.anInt2148 == arg1) {
						local44.anInt2159--;
					}
				}
			}
		}
		if (Static142.aClass1_Sub16ArrayArrayArray4[0][arg0][arg1] == null) {
			Static142.aClass1_Sub16ArrayArrayArray4[0][arg0][arg1] = new Class1_Sub16(0, arg0, arg1);
		}
		Static142.aClass1_Sub16ArrayArrayArray4[0][arg0][arg1].aClass1_Sub16_1 = local7;
		Static142.aClass1_Sub16ArrayArrayArray4[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)I")
	public static int method3784(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!sa;III)V")
	public static void method3786(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub16 local12;
		if (arg2 < Static94.anInt4252) {
			local12 = Static142.aClass1_Sub16ArrayArrayArray4[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass148_1 != null && local12.aClass148_1.aClass9_10.method3597()) {
				arg0.method3596(local12.aClass148_1.aClass9_10, 128, 0, 0, true);
			}
		}
		if (arg3 < Static94.anInt4252) {
			local12 = Static142.aClass1_Sub16ArrayArrayArray4[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass148_1 != null && local12.aClass148_1.aClass9_10.method3597()) {
				arg0.method3596(local12.aClass148_1.aClass9_10, 0, 0, 128, true);
			}
		}
		if (arg2 < Static94.anInt4252 && arg3 < Static239.anInt5153) {
			local12 = Static142.aClass1_Sub16ArrayArrayArray4[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass148_1 != null && local12.aClass148_1.aClass9_10.method3597()) {
				arg0.method3596(local12.aClass148_1.aClass9_10, 128, 0, 128, true);
			}
		}
		if (arg2 < Static94.anInt4252 && arg3 > 0) {
			local12 = Static142.aClass1_Sub16ArrayArrayArray4[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass148_1 != null && local12.aClass148_1.aClass9_10.method3597()) {
				arg0.method3596(local12.aClass148_1.aClass9_10, 128, 0, -128, true);
			}
		}
	}
}
