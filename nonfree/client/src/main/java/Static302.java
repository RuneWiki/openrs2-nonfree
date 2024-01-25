import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!lm;")
	public static Class134 aClass134_133;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!cr;")
	public static Class37 aClass37_99 = new Class37(64);

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
	public static int anInt6037 = 0;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "Ljava/lang/String;")
	public static final String aString239 = "cyan:";

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
	public static int anInt6039 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public static void method5238() {
		Static327.anInt6425 = 0;
		@Pc(18) int local18 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7) + Static92.anInt1755;
		@Pc(25) int local25 = Static98.anInt1911 + (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static327.anInt6425 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static327.anInt6425 = 1;
		}
		if (Static327.anInt6425 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static327.anInt6425 = 0;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!ps;)Z")
	public static boolean method5239(@OriginalArg(1) Class163 arg0) {
		if (arg0.anIntArray450 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray450.length; local17++) {
			@Pc(24) int local24 = Static315.method5398(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray458[local17];
			if (arg0.anIntArray450[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray450[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray450[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
