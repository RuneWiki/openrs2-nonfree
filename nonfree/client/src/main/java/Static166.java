import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!mf;")
	public static Class100 aClass100_3;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public static int anInt3796 = 0;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString110 = "scroll:";

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method3079() {
		@Pc(8) Class171 local8 = Static1.aClass171_1;
		synchronized (Static1.aClass171_1) {
			Static14.anInt390 = Static299.anInt6234;
			Static241.anInt5295++;
			@Pc(22) int local22;
			if (Static270.anInt5840 < 0) {
				for (local22 = 0; local22 < 112; local22++) {
					Static35.aBooleanArray2[local22] = false;
				}
				Static270.anInt5840 = Static36.anInt1022;
			} else {
				while (Static270.anInt5840 != Static36.anInt1022) {
					local22 = Static216.anIntArray480[Static36.anInt1022];
					Static36.anInt1022 = Static36.anInt1022 + 1 & 0x7F;
					if (local22 >= 0) {
						Static35.aBooleanArray2[local22] = true;
					} else {
						Static35.aBooleanArray2[~local22] = false;
					}
				}
			}
			Static299.anInt6234 = Static236.anInt5212;
		}
	}
}
