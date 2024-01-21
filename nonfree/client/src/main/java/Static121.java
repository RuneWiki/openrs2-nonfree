import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_819 = Static181.method2795("Login");

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!qe;")
	public static Class83 aClass83_816 = aClass83_819;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public static int anInt2740 = 0;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_818 = Static181.method2795("Players");

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!qe;")
	public static Class83 aClass83_817 = aClass83_818;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt2747 = 0;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[I")
	public static final int[] anIntArray274 = new int[200];

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	public static int anInt2748 = -1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method2085(@OriginalArg(0) Class5 arg0) {
		if (Static100.anInt2309 == arg0.anInt141) {
			Static124.aBooleanArray16[arg0.anInt155] = true;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBIII)V")
	public static void method2089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static22.method438(arg1 + arg3, arg2, arg3 - arg1, Static14.anIntArrayArray18[arg0]);
		@Pc(16) int local16 = 0;
		@Pc(22) int local22 = arg1;
		@Pc(31) int local31 = -arg1;
		@Pc(33) int local33 = -1;
		while (local16 < local22) {
			local16++;
			local33 += 2;
			local31 += local33;
			if (local31 >= 0) {
				local22--;
				local31 -= local22 << 1;
				@Pc(59) int[] local59 = Static14.anIntArrayArray18[local22 + arg0];
				@Pc(65) int[] local65 = Static14.anIntArrayArray18[arg0 - local22];
				@Pc(69) int local69 = local16 + arg3;
				@Pc(74) int local74 = arg3 - local16;
				Static22.method438(local69, arg2, local74, local59);
				Static22.method438(local69, arg2, local74, local65);
			}
			@Pc(90) int local90 = local22 + arg3;
			@Pc(95) int local95 = arg3 - local22;
			@Pc(101) int[] local101 = Static14.anIntArrayArray18[arg0 + local16];
			@Pc(108) int[] local108 = Static14.anIntArrayArray18[arg0 - local16];
			Static22.method438(local90, arg2, local95, local101);
			Static22.method438(local90, arg2, local95, local108);
		}
	}
}
