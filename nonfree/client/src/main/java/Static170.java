import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	public static int anInt3279;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_58 = new Class256("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_72 = new Class81(99, 8);

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_73 = new Class81(26, 14);

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V")
	public static void method2635(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static426.aClass2_Sub20_Sub1_2.method2501(Static193.anInt3787) >= 15) {
				@Pc(16) int local16 = Static426.aClass2_Sub20_Sub1_2.method2505(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static4.aClass4_Sub2_Sub2_Sub2Array1[local16] == null) {
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local16] = new Class4_Sub2_Sub2_Sub2();
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local16].anInt6456 = local16;
						local21 = true;
					}
					@Pc(42) Class4_Sub2_Sub2_Sub2 local42 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local16];
					Static312.anIntArray202[Static391.anInt6867++] = local16;
					local42.anInt6508 = Static164.anInt3206;
					if (local42.aClass215_1 != null && local42.aClass215_1.method4799()) {
						Static246.method3808(local42);
					}
					local42.method5135(Static417.aClass234_2.method5362(Static426.aClass2_Sub20_Sub1_2.method2505(14)));
					@Pc(79) int local79 = Static426.aClass2_Sub20_Sub1_2.method2505(2);
					@Pc(90) int local90 = (Static426.aClass2_Sub20_Sub1_2.method2505(3) + 4 & 0x2A600007) << 11;
					@Pc(95) int local95 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
					if (local95 == 1) {
						Static19.anIntArray29[Static379.anInt6725++] = local16;
					}
					@Pc(113) int local113 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
					@Pc(120) int local120;
					if (arg0) {
						local120 = Static426.aClass2_Sub20_Sub1_2.method2505(8);
						if (local120 > 127) {
							local120 -= 256;
						}
					} else {
						local120 = Static426.aClass2_Sub20_Sub1_2.method2505(5);
						if (local120 > 15) {
							local120 -= 32;
						}
					}
					@Pc(144) int local144;
					if (arg0) {
						local144 = Static426.aClass2_Sub20_Sub1_2.method2505(8);
						if (local144 > 127) {
							local144 -= 256;
						}
					} else {
						local144 = Static426.aClass2_Sub20_Sub1_2.method2505(5);
						if (local144 > 15) {
							local144 -= 32;
						}
					}
					local42.method5117(local42.aClass215_1.anInt5998);
					local42.anInt6462 = local42.aClass215_1.anInt6004 << 3;
					if (local42.anInt6462 == 0) {
						local42.method5122(0);
					} else if (local21) {
						local42.method5122(local90);
					}
					local42.method5132(local113 == 1, Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0] + local120, local42.method5118(), local144 + Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0], local79);
					if (local42.aClass215_1.method4799()) {
						Static354.method4965(null, null, local42, local42.anIntArray436[0], 0, local42.aByte92, local42.anIntArray437[0]);
					}
					continue;
				}
			}
			Static426.aClass2_Sub20_Sub1_2.method2506();
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2636(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static220.anInt4206; local11++) {
			if (arg0.equalsIgnoreCase(Static432.aStringArray43[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static306.aStringArray29[local11])) {
				return true;
			}
		}
		return false;
	}
}
