import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!bba", name = "P", descriptor = "Lclient!la;")
	public static Class207 aClass207_8;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_2 = new Class216(6, 0, 4, 2);

	@OriginalMember(owner = "client!bba", name = "M", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_1 = new Class15("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!bba", name = "O", descriptor = "[Lclient!b;")
	public static final Class26[] aClass26Array1 = new Class26[4];

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZZ)V")
	public static void method520(@OriginalArg(0) boolean arg0) {
		Static229.method3856();
		if (!Static75.method1290(Static151.anInt2620)) {
			return;
		}
		Static152.anInt2629++;
		if (Static152.anInt2629 < 50 && !arg0) {
			return;
		}
		Static152.anInt2629 = 0;
		if (!Static353.aBoolean428 && Static495.aClass170_2 != null) {
			@Pc(46) Class5_Sub48 local46 = Static16.method232(Static96.aClass46_21, Static276.aClass251_2);
			Static277.method4436(local46);
			try {
				Static386.method5642();
			} catch (@Pc(53) IOException local53) {
				Static353.aBoolean428 = true;
			}
		}
		Static229.method3856();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BIILclient!bfa;I)V")
	public static void method521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub2_Sub1_Sub1_Sub1 arg2) {
		@Pc(16) int local16 = arg2.anIntArray94[0];
		@Pc(21) int local21 = arg2.anIntArray95[0];
		if (local16 < 0 || local16 >= Static326.anInt5541 || local21 < 0 || local21 >= Static448.anInt7637 || (arg1 < 0 || Static326.anInt5541 <= arg1 || arg0 < 0 || arg0 >= Static448.anInt7637)) {
			return;
		}
		@Pc(83) int local83 = Static426.method6544(local16, arg0, 0, local21, true, arg2.method1018(), 0, arg1, Static322.aClass352Array1[arg2.aByte132], Static535.anIntArray503, -4, Static53.anIntArray72, 0, 0);
		if (local83 >= 1 && local83 <= 3) {
			for (@Pc(97) int local97 = 0; local97 < local83 - 1; local97++) {
				arg2.method741((byte) 2, Static535.anIntArray503[local97], Static53.anIntArray72[local97]);
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)V")
	public static void method523() {
		Static184.anInt3247 = 0;
		@Pc(13) int local13 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9) + Static565.anInt9560;
		@Pc(20) int local20 = Static567.anInt9589 + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static184.anInt3247 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static184.anInt3247 = 1;
		}
		if (Static184.anInt3247 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static184.anInt3247 = 0;
		}
	}
}
