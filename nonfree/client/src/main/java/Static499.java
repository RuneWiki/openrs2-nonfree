import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "[I")
	public static final int[] anIntArray610 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	public static int anInt9277 = -1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!mca;)V")
	public static void method7533(@OriginalArg(0) Class2_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort120; local2 <= arg0.aShort121; local2++) {
			for (@Pc(6) int local6 = arg0.aShort122; local6 <= arg0.aShort123; local6++) {
				@Pc(16) Class125 local16 = Static580.aClass125ArrayArrayArray3[arg0.aByte103][local2][local6];
				if (local16 != null) {
					@Pc(21) Class302 local21 = local16.aClass302_1;
					@Pc(23) Class302 local23 = null;
					while (local21 != null) {
						if (local21.aClass2_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass302_1 = local21.aClass302_2;
							} else {
								local23.aClass302_2 = local21.aClass302_2;
							}
							local21.method7423();
							break;
						}
						local23 = local21;
						local21 = local21.aClass302_2;
					}
					local16.aByte33 = 0;
					for (@Pc(56) Class302 local56 = local16.aClass302_1; local56 != null; local56 = local56.aClass302_2) {
						local16.aByte33 = (byte) (local16.aByte33 | local56.anInt9079);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(FFFB)I")
	public static int method7535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local26 && local26 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method7539(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static303.aBoolean516) {
			try {
				@Pc(20) Class158 local20 = (Class158) Class.forName("Class158_Sub1").getDeclaredConstructor().newInstance();
				local20.method5021(arg0);
				return local20;
			} catch (@Pc(29) Throwable local29) {
				Static303.aBoolean516 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!jq;IZ)V")
	public static void method7540(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1) {
		if (Static228.anInt4641 >= 50 || (arg0 == null || arg0.anIntArrayArray40 == null || arg0.anIntArrayArray40.length <= arg1 || arg0.anIntArrayArray40[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray40[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		if (arg0.anIntArrayArray40[arg1].length > 1) {
			@Pc(57) int local57 = (int) (Math.random() * (double) arg0.anIntArrayArray40[arg1].length);
			if (local57 > 0) {
				local40 = arg0.anIntArrayArray40[arg1][local57];
			}
		}
		@Pc(72) int local72 = local36 >> 5 & 0x7;
		if (arg0.aBoolean469) {
			Static148.method2905(local72, local40, 0, false, 255);
		} else {
			Static546.method7996(255, local40, local72, 0);
		}
	}
}
