import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString430 = "red:";

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5559(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method5560() {
		while (true) {
			if (Static200.aClass7_Sub3_Sub2_3.method2801(Static54.anInt1421) >= 27) {
				@Pc(16) int local16 = Static200.aClass7_Sub3_Sub2_3.method2806(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static69.aClass22_Sub2_Sub1_Sub2Array1[local16] == null) {
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local16] = new Class22_Sub2_Sub1_Sub2();
						local23 = true;
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local16].anInt5115 = local16;
					}
					@Pc(44) Class22_Sub2_Sub1_Sub2 local44 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local16];
					Static257.anIntArray649[Static11.anInt3203++] = local16;
					local44.anInt5096 = Static212.anInt4234;
					if (local44.aClass174_1 != null && local44.aClass174_1.method4440()) {
						Static62.method1296(local44);
					}
					@Pc(75) int local75 = Static200.aClass7_Sub3_Sub2_3.method2806(5);
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(84) int local84 = Static200.aClass7_Sub3_Sub2_3.method2806(5);
					local44.method4426(Static132.method2664(Static200.aClass7_Sub3_Sub2_3.method2806(14)));
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(110) int local110 = Static122.anIntArray368[Static200.aClass7_Sub3_Sub2_3.method2806(3)];
					@Pc(115) int local115 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
					@Pc(120) int local120 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
					if (local120 == 1) {
						Static71.anIntArray241[Static85.anInt2209++] = local16;
					}
					local44.method4420(local44.aClass174_1.anInt5191);
					local44.anInt5111 = local44.aClass174_1.anInt5178 << 3;
					if (local44.anInt5111 == 0) {
						local44.method4411(0);
					} else if (local23) {
						local44.method4411(local110);
					}
					local44.method4408(local115 == 1, local44.method4421(), local75 + Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] + local84, Static168.anInt3508);
					if (local44.aClass174_1.method4440()) {
						Static339.method5516(local44, local44.anIntArray666[0], Static168.anInt3508, null, null, local44.anIntArray665[0], 0);
					}
					continue;
				}
			}
			Static200.aClass7_Sub3_Sub2_3.method2805();
			return;
		}
	}
}
