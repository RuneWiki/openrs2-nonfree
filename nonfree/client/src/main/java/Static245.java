import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[Lclient!fe;")
	public static Class17_Sub1[] aClass17_Sub1Array2;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public static int anInt4996 = -1;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!uo;I)V")
	public static void method4391(@OriginalArg(0) Class32 arg0) {
		arg0.method2226(0, 0, Static194.anInt4145, 350);
		arg0.method2241(0, 0, Static194.anInt4145, 350, Static28.anInt1015 << 24 | 0x332277, 1);
		@Pc(37) int local37;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local37 = Static344.anIntArray525[local25];
			local41 = Static158.anIntArray314[local25];
			arg0.method2241(local37, local41, 2, 2, Static31.anIntArray95[local25] << 24 | 0xFFFFFF, 1);
		}
		local37 = 350 / Static264.anInt6559;
		if (Static178.anInt3855 > 0) {
			local41 = 346 - Static264.anInt6559 - 4;
			@Pc(82) int local82 = local41 * local37 / (local37 + Static178.anInt3855 - 1);
			@Pc(84) int local84 = 4;
			if (Static178.anInt3855 > 1) {
				local84 = (Static178.anInt3855 - Static234.anInt4773 - 1) * (local41 - local82) / (Static178.anInt3855 - 1) + 4;
			}
			arg0.method2241(Static194.anInt4145 - 16, local84, 12, local82, Static28.anInt1015 << 24 | 0x332277, 2);
			for (@Pc(122) int local122 = Static234.anInt4773; local122 < local37 + Static234.anInt4773 && local122 < Static178.anInt3855; local122++) {
				@Pc(131) String[] local131 = Static309.method5164('\b', Static263.aStringArray56[local122]);
				@Pc(140) int local140 = (Static194.anInt4145 - 8 - 16) / local131.length;
				for (@Pc(142) int local142 = 0; local142 < local131.length; local142++) {
					@Pc(151) int local151 = local140 * local142 + 8;
					arg0.method2226(local151, 0, local140 + local151 - 8, 350);
					Static212.aClass9_3.method5021(-1, local151, 350 - Static176.anInt3800 - Static195.aClass63_5.anInt1997 - Static264.anInt6559 * (local122 + -Static234.anInt4773) - 2, -16777216, local131[local142]);
				}
			}
		}
		arg0.method2226(0, 0, Static194.anInt4145, 350);
		arg0.method2157(Static194.anInt4145, 350 - Static176.anInt3800, 0, -1);
		Static49.aClass9_1.method5021(-1, 10, 350 - Static90.aClass63_3.anInt1997 - 1, -16777216, "--> " + Static243.aString52);
		local41 = -1;
		if (Static5.anInt208 % 30 > 15) {
			local41 = 16777215;
		}
		arg0.method2206(12, local41, 350 - Static90.aClass63_3.anInt1997 - 11, Static90.aClass63_3.method1746("--> " + Static243.aString52.substring(0, Static300.anInt5954)) + 10);
	}
}
