import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_140 = new Class253(110, 12);

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!hu;")
	public static final Class7_Sub21 aClass7_Sub21_1 = new Class7_Sub21(0, 0);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_128 = new Class55("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
	public static boolean method4975(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method4976() {
		if (Static183.anInt3293 == -1) {
			return;
		}
		@Pc(16) int local16 = Static154.aClass50_1.method1860();
		@Pc(20) int local20 = Static154.aClass50_1.method1870();
		@Pc(25) Class7_Sub12 local25 = (Class7_Sub12) Static204.aClass85_37.method2010();
		if (local25 != null) {
			local16 = local25.method942();
			local20 = local25.method943();
		}
		Static308.method4069(0, 0, local20, Static183.anInt3293, Static251.anInt4258, 0, Static286.anInt4051, 0, local16);
		if (Static282.aClass95_11 != null) {
			Static54.method754(local20, local16);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!mv;)V")
	public static void method4978(@OriginalArg(0) Class26_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort105; local2 <= arg0.aShort104; local2++) {
			for (@Pc(6) int local6 = arg0.aShort103; local6 <= arg0.aShort102; local6++) {
				@Pc(16) Class223 local16 = Static19.aClass223ArrayArrayArray1[arg0.aByte102][local2][local6];
				if (local16 != null) {
					@Pc(21) Class270 local21 = local16.aClass270_1;
					@Pc(23) Class270 local23 = null;
					while (local21 != null) {
						if (local21.aClass26_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass270_1 = local21.aClass270_3;
							} else {
								local23.aClass270_3 = local21.aClass270_3;
							}
							local21.method5794();
							break;
						}
						local23 = local21;
						local21 = local21.aClass270_3;
					}
					local16.aByte69 = 0;
					for (@Pc(56) Class270 local56 = local16.aClass270_1; local56 != null; local56 = local56.aClass270_3) {
						local16.aByte69 = (byte) (local16.aByte69 | local56.anInt7523);
					}
				}
			}
		}
	}
}
