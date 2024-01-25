import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!aa;")
	public static Class2 aClass2_8;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_45 = new Class26(64);

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_30 = new Class58(8);

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
	public static final int[] anIntArray393 = new int[50];

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method4419() {
		Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
		Static4.anInt23 = 0;
		Static172.anInt3428 = 0;
		Static196.anInt4002 = -1;
		Static34.anInt635 = -1;
		Static153.anInt2900 = -1;
		Static315.anInt6163 = 0;
		Static246.aClass11_Sub25_Sub1_3.anInt6076 = 0;
		Static132.anInt2475 = -1;
		Static303.method4306();
		Static165.method2682();
		for (@Pc(31) int local31 = 0; local31 < Static105.aClass67_Sub3_Sub3_Sub2Array1.length; local31++) {
			if (Static105.aClass67_Sub3_Sub3_Sub2Array1[local31] != null) {
				Static105.aClass67_Sub3_Sub3_Sub2Array1[local31].anInt5023 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static356.aClass67_Sub3_Sub3_Sub1Array1.length; local53++) {
			if (Static356.aClass67_Sub3_Sub3_Sub1Array1[local53] != null) {
				Static356.aClass67_Sub3_Sub3_Sub1Array1[local53].anInt5023 = -1;
			}
		}
		Static289.method4816();
		Static81.anInt1498 = 1;
		Static284.method4731(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static292.aBooleanArray22[local84] = true;
		}
		Static53.method800();
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public static void method4421() {
		while (true) {
			if (Static246.aClass11_Sub25_Sub1_3.method2466(Static315.anInt6163) >= 27) {
				@Pc(14) int local14 = Static246.aClass11_Sub25_Sub1_3.method2462(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static356.aClass67_Sub3_Sub3_Sub1Array1[local14] == null) {
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local14] = new Class67_Sub3_Sub3_Sub1();
						local21 = true;
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local14].anInt5038 = local14;
					}
					@Pc(42) Class67_Sub3_Sub3_Sub1 local42 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local14];
					Static4.anIntArray4[Static141.anInt2601++] = local14;
					local42.anInt5010 = Static293.anInt5807;
					if (local42.aClass82_1 != null && local42.aClass82_1.method1563()) {
						Static168.method2725(local42);
					}
					local42.method2677(Static156.method2516(Static246.aClass11_Sub25_Sub1_3.method2462(14)));
					@Pc(80) int local80 = Static246.aClass11_Sub25_Sub1_3.method2462(5);
					if (local80 > 15) {
						local80 -= 32;
					}
					@Pc(89) int local89 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
					if (local89 == 1) {
						Static309.anIntArray498[Static90.anInt4650++] = local14;
					}
					@Pc(107) int local107 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
					@Pc(118) int local118 = Static246.aClass11_Sub25_Sub1_3.method2462(3) + 4 << 11 & 0x3AD0;
					@Pc(123) int local123 = Static246.aClass11_Sub25_Sub1_3.method2462(5);
					if (local123 > 15) {
						local123 -= 32;
					}
					local42.method4367(local42.aClass82_1.anInt1871);
					local42.anInt5055 = local42.aClass82_1.anInt1866 << 3;
					if (local42.anInt5055 == 0) {
						local42.method4371(0);
					} else if (local21) {
						local42.method4371(local118);
					}
					local42.method4376(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] + local80, Static322.anInt6250, local42.method4368(), local107 == 1, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] + local123);
					if (local42.aClass82_1.method1563()) {
						Static308.method5158(local42.anIntArray392[0], null, 0, local42, local42.anIntArray391[0], null, Static322.anInt6250);
					}
					continue;
				}
			}
			Static246.aClass11_Sub25_Sub1_3.method2461();
			return;
		}
	}
}
