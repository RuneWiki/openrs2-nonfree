import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!pr;")
	public static Class254 aClass254_80;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt4373;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public static int anInt4369 = 0;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
	public static final int[] anIntArray283 = new int[5];

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	public static int anInt4372 = 64;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_81 = new Class254(42, 4);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZII)I")
	public static int method3804(@OriginalArg(1) int arg0) {
		@Pc(19) Class6_Sub15 local19 = Static519.method7596(arg0, false);
		if (local19 == null) {
			return Static409.aClass36_1.method1096(arg0).anInt2211;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray173.length; local31++) {
			if (local19.anIntArray173[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static409.aClass36_1.method1096(arg0).anInt2211 - local19.anIntArray173.length;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I")
	public static int method3805() {
		if (Static122.aClass93_7 == null) {
			if (!Static218.aBoolean366 && anInt4369 > 0) {
				if (Static478.aBoolean650 && Static387.aClass273_1.method6617(81) && anInt4369 > 2) {
					return ((Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284.aClass6_284).anInt8287;
				}
				return ((Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284).anInt8287;
			}
			@Pc(15) int local15 = Static401.aClass4_1.method1216();
			@Pc(19) int local19 = Static401.aClass4_1.method1215();
			@Pc(21) int local21 = Static69.anInt1684;
			@Pc(23) int local23 = Static230.anInt4775;
			@Pc(25) int local25 = Static24.anInt8441;
			if (local21 < local15 && local21 + local25 > local15) {
				@Pc(40) int local40 = -1;
				@Pc(59) int local59;
				for (@Pc(42) int local42 = 0; local42 < anInt4369; local42++) {
					if (Static28.aBoolean82) {
						local59 = local23 + (anInt4369 + -1 - local42) * 16 + 33;
						if (local19 > local59 - 13 && local59 + 3 >= local19) {
							local40 = local42;
						}
					} else {
						local59 = local23 + (-local42 + -1 + anInt4369) * 16 + 31;
						if (local19 > local59 - 13 && local19 <= local59 + 3) {
							local40 = local42;
						}
					}
				}
				if (local40 != -1) {
					local59 = 0;
					@Pc(115) Class97 local115 = new Class97(Static207.aClass211_29);
					for (@Pc(120) Class6_Sub42 local120 = (Class6_Sub42) local115.method2517(); local120 != null; local120 = (Class6_Sub42) local115.method2512()) {
						if (local40 == local59++) {
							return local120.anInt8287;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIB)Z")
	public static boolean method3807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static445.method6833(arg1, arg0) || Static331.method8155(arg0, arg1);
	}
}
