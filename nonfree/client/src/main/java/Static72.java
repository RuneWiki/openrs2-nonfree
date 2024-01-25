import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "Lclient!hl;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ns;)V")
	public static void method1149(@OriginalArg(0) Class25_Sub5 arg0) {
		for (@Pc(2) int local2 = arg0.aShort97; local2 <= arg0.aShort96; local2++) {
			for (@Pc(6) int local6 = arg0.aShort94; local6 <= arg0.aShort95; local6++) {
				@Pc(16) Class169 local16 = Static359.aClass169ArrayArrayArray5[arg0.aByte94][local2][local6];
				if (local16 != null) {
					@Pc(21) Class27 local21 = local16.aClass27_3;
					@Pc(23) Class27 local23 = null;
					while (local21 != null) {
						if (local21.aClass25_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass27_3 = local21.aClass27_1;
							} else {
								local23.aClass27_1 = local21.aClass27_1;
							}
							local21.method575();
							break;
						}
						local23 = local21;
						local21 = local21.aClass27_1;
					}
					local16.aByte80 = 0;
					for (@Pc(56) Class27 local56 = local16.aClass27_3; local56 != null; local56 = local56.aClass27_1) {
						local16.aByte80 = (byte) (local16.aByte80 | local56.anInt686);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method1154() {
		Static168.aClass6_31 = null;
		Static247.anInt4472 = -1;
	}
}
