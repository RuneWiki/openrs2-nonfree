import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "[I")
	public static int[] anIntArray167;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)[Lclient!b;")
	public static Class25[] method3118() {
		if (Static516.aClass25Array1 == null) {
			@Pc(17) Class25[] local17 = Static212.method4179(Static268.aClass370_3);
			@Pc(21) Class25[] local21 = new Class25[local17.length];
			@Pc(23) int local23 = 0;
			@Pc(28) int local28 = Static74.aClass2_Sub13_5.aClass14_Sub3_1.method1703();
			@Pc(100) int local100;
			@Pc(106) Class25 local106;
			label70: for (@Pc(30) int local30 = 0; local30 < local17.length; local30++) {
				@Pc(36) Class25 local36 = local17[local30];
				if ((local36.anInt576 <= 0 || local36.anInt576 >= 24) && local36.anInt577 >= 800 && local36.anInt581 >= 600 && (local28 != 2 || local36.anInt577 <= 800 && local36.anInt581 <= 600) && (local28 != 1 || local36.anInt577 <= 1024 && local36.anInt581 <= 768)) {
					for (local100 = 0; local100 < local23; local100++) {
						local106 = local21[local100];
						if (local106.anInt577 == local36.anInt577 && local36.anInt581 == local106.anInt581) {
							if (local106.anInt576 < local36.anInt576) {
								local21[local100] = local36;
							}
							continue label70;
						}
					}
					local21[local23] = local36;
					local23++;
				}
			}
			Static516.aClass25Array1 = new Class25[local23];
			Static653.method7721(local21, 0, Static516.aClass25Array1, 0, local23);
			@Pc(166) int[] local166 = new int[Static516.aClass25Array1.length];
			for (local100 = 0; local100 < Static516.aClass25Array1.length; local100++) {
				local106 = Static516.aClass25Array1[local100];
				local166[local100] = local106.anInt577 * local106.anInt581;
			}
			Static238.method4460(Static516.aClass25Array1, local166);
		}
		return Static516.aClass25Array1;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBI)Lclient!et;")
	public static Class2_Sub6_Sub6 method3119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub6_Sub6 local17 = (Class2_Sub6_Sub6) Static343.aClass99_48.method3056((long) arg1 << 32 | (long) arg0);
		if (local17 == null) {
			local17 = new Class2_Sub6_Sub6(arg1, arg0);
			Static343.aClass99_48.method3059(local17.aLong278, local17);
		}
		return local17;
	}
}
