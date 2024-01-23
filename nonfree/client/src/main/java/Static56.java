import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	public static int anInt1258;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!c;")
	public static Class17 aClass17_6 = new Class17();

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[Lclient!uj;")
	public static Class171[] aClass171Array1 = new Class171[8];

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString44 = "cyan:";

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public static int anInt1264 = -1;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
	public static boolean method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static137.aBoolean176) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static217.aClass97ArrayArray1[local13] == null || Static217.aClass97ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class97 local35 = Static217.aClass97ArrayArray1[local13][local17];
		@Pc(45) int local45;
		if (arg1 == -1 && local35.anInt3177 == 0) {
			for (local45 = 0; local45 < Static286.anInt5602; local45++) {
				if (Static256.aShortArray81[local45] == 11 || Static256.aShortArray81[local45] == 1002 || Static256.aShortArray81[local45] == 14 || Static256.aShortArray81[local45] == 38 || Static256.aShortArray81[local45] == 42) {
					for (@Pc(156) Class97 local156 = Static148.method2340(Static49.anIntArray117[local45]); local156 != null; local156 = Static103.method1689(local156)) {
						if (local156.anInt3162 == local35.anInt3162) {
							return true;
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < Static286.anInt5602; local45++) {
				if (arg1 == Static282.anIntArray439[local45] && local35.anInt3162 == Static49.anIntArray117[local45] && (Static256.aShortArray81[local45] == 11 || Static256.aShortArray81[local45] == 1002 || Static256.aShortArray81[local45] == 14 || Static256.aShortArray81[local45] == 38 || Static256.aShortArray81[local45] == 42)) {
					return true;
				}
			}
		}
		return false;
	}
}
