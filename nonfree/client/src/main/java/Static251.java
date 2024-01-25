import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
	public static int anInt4762 = -1;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	public static void method3749() {
		Static386.method5010(Static238.aClass156_9);
		Static428.anInt7012++;
		if (Static352.aBoolean518 && Static337.aBoolean491) {
			@Pc(31) int local31 = Static290.aClass100_1.method3218();
			@Pc(35) int local35 = Static290.aClass100_1.method3213();
			local35 -= Static371.anInt6244;
			local31 -= Static123.anInt2620;
			if (Static431.anInt6735 > local31) {
				local31 = Static431.anInt6735;
			}
			if (local31 + Static238.aClass156_9.anInt4853 > Static431.anInt6735 + Static89.aClass156_3.anInt4853) {
				local31 = Static89.aClass156_3.anInt4853 + Static431.anInt6735 - Static238.aClass156_9.anInt4853;
			}
			if (local35 < Static351.anInt5971) {
				local35 = Static351.anInt5971;
			}
			if (local35 + Static238.aClass156_9.anInt4823 > Static89.aClass156_3.anInt4823 + Static351.anInt5971) {
				local35 = Static89.aClass156_3.anInt4823 + Static351.anInt5971 - Static238.aClass156_9.anInt4823;
			}
			@Pc(97) int local97 = local31 + Static89.aClass156_3.anInt4821 - Static431.anInt6735;
			@Pc(104) int local104 = Static89.aClass156_3.anInt4801 + local35 - Static351.anInt5971;
			@Pc(157) Class3_Sub31 local157;
			if (Static290.aClass100_1.method3217()) {
				if (Static428.anInt7012 > Static238.aClass156_9.anInt4812) {
					@Pc(200) int local200 = local31 - Static331.anInt7555;
					@Pc(205) int local205 = local35 - Static261.anInt948;
					if (Static238.aClass156_9.anInt4855 < local200 || -Static238.aClass156_9.anInt4855 > local200 || Static238.aClass156_9.anInt4855 < local205 || local205 < -Static238.aClass156_9.anInt4855) {
						Static255.aBoolean429 = true;
					}
				}
				if (Static238.aClass156_9.anObjectArray35 != null && Static255.aBoolean429) {
					local157 = new Class3_Sub31();
					local157.anInt4999 = local104;
					local157.aClass156_11 = Static238.aClass156_9;
					local157.anObjectArray36 = Static238.aClass156_9.anObjectArray35;
					local157.anInt5003 = local97;
					Static285.method4059(local157);
				}
			} else {
				if (Static255.aBoolean429) {
					Static70.method1396();
					if (Static238.aClass156_9.anObjectArray6 != null) {
						local157 = new Class3_Sub31();
						local157.aClass156_11 = Static238.aClass156_9;
						local157.aClass156_12 = Static74.aClass156_2;
						local157.anObjectArray36 = Static238.aClass156_9.anObjectArray6;
						local157.anInt5003 = local97;
						local157.anInt4999 = local104;
						Static285.method4059(local157);
					}
					if (Static74.aClass156_2 != null && Static53.method1119(Static238.aClass156_9) != null) {
						Static62.method1244(Static74.aClass156_2, Static238.aClass156_9);
					}
				} else if ((Static216.anInt4119 == 1 || Static21.method469()) && Static158.anInt3162 > 2) {
					Static235.method3585(Static123.anInt2620 + Static331.anInt7555, Static371.anInt6244 - -Static261.anInt948);
				} else if (Static324.method5976()) {
					Static235.method3585(Static123.anInt2620 + Static331.anInt7555, Static371.anInt6244 - -Static261.anInt948);
				}
				Static238.aClass156_9 = null;
			}
		} else if (Static428.anInt7012 > 1) {
			Static238.aClass156_9 = null;
		}
	}
}
