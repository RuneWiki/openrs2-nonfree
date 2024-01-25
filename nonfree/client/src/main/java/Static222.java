import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Z")
	public static boolean aBoolean288;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt4040;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public static int anInt4041 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)J")
	public static long method3400() {
		return Static264.aClass77_1.method3074();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method3402() {
		try {
			if (Static390.anInt6278 == 1) {
				@Pc(20) int local20 = Static244.aClass1_Sub19_Sub4_2.method3671();
				if (local20 > 0 && Static244.aClass1_Sub19_Sub4_2.method3655()) {
					local20 -= Static23.anInt5191;
					if (local20 < 0) {
						local20 = 0;
					}
					Static244.aClass1_Sub19_Sub4_2.method3684(local20);
				} else {
					Static244.aClass1_Sub19_Sub4_2.method3664();
					Static244.aClass1_Sub19_Sub4_2.method3678();
					Static233.aClass1_Sub1_2 = null;
					if (Static157.aClass246_114 == null) {
						Static390.anInt6278 = 0;
					} else {
						Static390.anInt6278 = 2;
					}
					Static39.aClass24_1 = null;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static244.aClass1_Sub19_Sub4_2.method3664();
			Static157.aClass246_114 = null;
			Static39.aClass24_1 = null;
			Static390.anInt6278 = 0;
			Static233.aClass1_Sub1_2 = null;
		}
	}
}
