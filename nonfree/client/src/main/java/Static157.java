import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Z")
	public static boolean method2376() {
		try {
			if (Static175.anInt2881 == 2) {
				if (Static402.aClass5_Sub31_2 == null) {
					Static402.aClass5_Sub31_2 = Static681.method3895(Static516.aClass50_76, Static643.anInt10179, Static30.anInt411);
					if (Static402.aClass5_Sub31_2 == null) {
						return false;
					}
				}
				if (Static651.aClass37_1 == null) {
					Static651.aClass37_1 = new Class37(Static447.aClass50_128, Static555.aClass50_160);
				}
				@Pc(31) Class5_Sub14_Sub4 local31 = Static537.aClass5_Sub14_Sub4_35;
				if (Static464.aClass5_Sub14_Sub4_25 != null) {
					local31 = Static464.aClass5_Sub14_Sub4_25;
				}
				if (local31.method3251(Static651.aClass37_1, Static402.aClass5_Sub31_2, Static213.aClass50_58)) {
					Static537.aClass5_Sub14_Sub4_35 = local31;
					Static537.aClass5_Sub14_Sub4_35.method3221();
					@Pc(61) int local61;
					if (Static94.anInt1559 <= 0) {
						Static175.anInt2881 = 0;
						Static537.aClass5_Sub14_Sub4_35.method3245(Static332.anInt6016);
						for (local61 = 0; local61 < Static452.anIntArray439.length; local61++) {
							Static537.aClass5_Sub14_Sub4_35.method3248(local61, Static452.anIntArray439[local61]);
							Static452.anIntArray439[local61] = 255;
						}
					} else {
						Static175.anInt2881 = 3;
						Static537.aClass5_Sub14_Sub4_35.method3245(Static94.anInt1559 > Static332.anInt6016 ? Static332.anInt6016 : Static94.anInt1559);
						for (local61 = 0; local61 < Static452.anIntArray439.length; local61++) {
							Static537.aClass5_Sub14_Sub4_35.method3248(local61, Static452.anIntArray439[local61]);
							Static452.anIntArray439[local61] = 255;
						}
					}
					if (Static464.aClass5_Sub14_Sub4_25 == null) {
						if (Static70.aLong50 > 0L) {
							Static537.aClass5_Sub14_Sub4_35.method3239(Static402.aClass5_Sub31_2, Static70.aLong50, Static342.aBoolean452);
						} else {
							Static537.aClass5_Sub14_Sub4_35.method3258(Static342.aBoolean452, Static402.aClass5_Sub31_2);
						}
					}
					if (Static507.aClass107_2 != null) {
						Static507.aClass107_2.method8604(Static537.aClass5_Sub14_Sub4_35);
					}
					Static70.aLong50 = 0L;
					Static651.aClass37_1 = null;
					Static402.aClass5_Sub31_2 = null;
					Static464.aClass5_Sub14_Sub4_25 = null;
					Static516.aClass50_76 = null;
					return true;
				}
			}
		} catch (@Pc(172) Exception local172) {
			local172.printStackTrace();
			Static537.aClass5_Sub14_Sub4_35.method3247();
			Static402.aClass5_Sub31_2 = null;
			Static175.anInt2881 = 0;
			Static651.aClass37_1 = null;
			Static516.aClass50_76 = null;
			Static464.aClass5_Sub14_Sub4_25 = null;
		}
		return false;
	}
}
