import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	public static int anInt10179;

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "[I")
	public static final int[] anIntArray589 = new int[64];

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "[I")
	public static final int[] anIntArray590 = new int[6];

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	public static int anInt10180 = 1;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;)V")
	public static void method8495(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class5_Sub16 local6 = Static444.method6617();
		local6.aClass5_Sub15_Sub2_1.method3651(Static304.aClass208_7.anInt5598);
		local6.aClass5_Sub15_Sub2_1.method3660(0);
		@Pc(21) int local21 = local6.aClass5_Sub15_Sub2_1.anInt4144;
		local6.aClass5_Sub15_Sub2_1.method3660(644);
		@Pc(30) int[] local30 = Static539.method7462(local6);
		@Pc(34) int local34 = local6.aClass5_Sub15_Sub2_1.anInt4144;
		local6.aClass5_Sub15_Sub2_1.method3680(arg3);
		local6.aClass5_Sub15_Sub2_1.method3660(Static312.anInt5547);
		local6.aClass5_Sub15_Sub2_1.method3680(arg2);
		local6.aClass5_Sub15_Sub2_1.method3648(Static55.aLong47);
		local6.aClass5_Sub15_Sub2_1.method3651(Static259.anInt4113);
		local6.aClass5_Sub15_Sub2_1.method3651(Static591.aClass174_7.anInt4124);
		Static654.method8343(local6.aClass5_Sub15_Sub2_1);
		@Pc(71) String local71 = Static577.aString98;
		local6.aClass5_Sub15_Sub2_1.method3651(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass5_Sub15_Sub2_1.method3680(local71);
		}
		local6.aClass5_Sub15_Sub2_1.method3651(arg0);
		local6.aClass5_Sub15_Sub2_1.method3651(arg1 ? 1 : 0);
		local6.aClass5_Sub15_Sub2_1.anInt4144 += 7;
		local6.aClass5_Sub15_Sub2_1.method3687(local30, local34, local6.aClass5_Sub15_Sub2_1.anInt4144);
		local6.aClass5_Sub15_Sub2_1.method3644(local6.aClass5_Sub15_Sub2_1.anInt4144 - local21);
		Static479.method7038(local6);
		Static59.anInt6271 = -3;
		Static123.anInt2148 = 0;
		Static572.anInt9353 = 1;
		Static456.anInt7922 = 0;
		if (arg0 < 13) {
			Static418.aBoolean512 = true;
			Static493.method7182();
		}
	}
}
