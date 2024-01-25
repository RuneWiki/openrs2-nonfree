import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!vc", name = "Mb", descriptor = "[I")
	public static int[] anIntArray586 = new int[1];

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(Z)V")
	public static void method5521() {
		if (Static162.anInt3250 == 10 || Static162.anInt3250 == 28) {
			Static20.method451(Static23.anInt567 >> 10, 5000, Static364.anInt6270 >> 10);
		} else {
			@Pc(31) int local31 = Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] >> 3;
			@Pc(38) int local38 = Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0] >> 3;
			if (local31 >= 0 && local31 < Static229.anInt4427 >> 3 && local38 >= 0 && local38 < Static379.anInt6422 >> 3) {
				Static20.method451(local38, 5000, local31);
			} else {
				Static20.method451(Static379.anInt6422 >> 4, 0, Static229.anInt4427 >> 4);
			}
		}
		Static188.method2968();
		Static72.method1344();
		Static62.method1184();
		Static334.method4663();
	}

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "(B)V")
	public static void method5522() {
		@Pc(7) Class99 local7 = null;
		try {
			@Pc(12) Class138 local12 = Static43.aClass59_5.method1355("2");
			while (local12.anInt3723 == 0) {
				Static81.method1477(1L);
			}
			if (local12.anInt3723 == 1) {
				local7 = (Class99) local12.anObject7;
				@Pc(43) Class2_Sub23 local43 = new Class2_Sub23(Static421.anInt7073 * 6 + 3);
				local43.method5449(1);
				local43.method5502(Static421.anInt7073);
				for (@Pc(53) int local53 = 0; local53 < Static19.anIntArray426.length; local53++) {
					if (Static70.aBooleanArray9[local53]) {
						local43.method5502(local53);
						local43.method5506(Static19.anIntArray426[local53]);
					}
				}
				local7.method2252(0, local43.anInt6952, local43.aByteArray130);
			}
		} catch (@Pc(84) Exception local84) {
		}
		try {
			if (local7 != null) {
				local7.method2257();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static449.aLong223 = Static21.method458();
		Static275.aBoolean376 = false;
	}
}
