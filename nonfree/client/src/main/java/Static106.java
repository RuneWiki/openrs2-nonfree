import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	public static int anInt2329;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	public static int anInt2331;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt2320 = 0;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "[I")
	public static final int[] anIntArray207 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V")
	public static void method2146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg2;
		@Pc(19) int local19 = -arg2;
		@Pc(21) int local21 = -1;
		@Pc(29) int local29 = Static418.method6023(Static398.anInt7144, arg1 + arg2, Static71.anInt4958);
		@Pc(38) int local38 = Static418.method6023(Static398.anInt7144, arg1 - arg2, Static71.anInt4958);
		Static321.method5153(arg3, local38, Static352.anIntArrayArray51[arg0], local29);
		while (local16 > local14) {
			local21 += 2;
			local19 += local21;
			@Pc(72) int local72;
			@Pc(77) int local77;
			@Pc(95) int local95;
			@Pc(104) int local104;
			if (local19 > 0) {
				local16--;
				local19 -= local16 << 1;
				local72 = arg0 - local16;
				local77 = arg0 + local16;
				if (local77 >= Static4.anInt6709 && local72 <= Static492.anInt8451) {
					local95 = Static418.method6023(Static398.anInt7144, local14 + arg1, Static71.anInt4958);
					local104 = Static418.method6023(Static398.anInt7144, arg1 - local14, Static71.anInt4958);
					if (Static492.anInt8451 >= local77) {
						Static321.method5153(arg3, local104, Static352.anIntArrayArray51[local77], local95);
					}
					if (Static4.anInt6709 <= local72) {
						Static321.method5153(arg3, local104, Static352.anIntArrayArray51[local72], local95);
					}
				}
			}
			local14++;
			local72 = arg0 - local14;
			local77 = local14 + arg0;
			if (Static4.anInt6709 <= local77 && local72 <= Static492.anInt8451) {
				local95 = Static418.method6023(Static398.anInt7144, arg1 + local16, Static71.anInt4958);
				local104 = Static418.method6023(Static398.anInt7144, arg1 - local16, Static71.anInt4958);
				if (local77 <= Static492.anInt8451) {
					Static321.method5153(arg3, local104, Static352.anIntArrayArray51[local77], local95);
				}
				if (local72 >= Static4.anInt6709) {
					Static321.method5153(arg3, local104, Static352.anIntArrayArray51[local72], local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public static boolean method2147(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
