import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_1 = new Class238(12, 16);

	@OriginalMember(owner = "client!ac", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray9 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method61() {
		Static246.method3821(Static126.aClass66_5, (long) Static66.anInt1741);
		if (Static36.anInt1129 != -1) {
			Static316.method4598(Static36.anInt1129);
		}
		for (@Pc(23) int local23 = 0; local23 < Static386.anInt6857; local23++) {
			if (Static180.aBooleanArray8[local23]) {
				Static256.aBooleanArray16[local23] = true;
			}
			Static43.aBooleanArray4[local23] = Static180.aBooleanArray8[local23];
			Static180.aBooleanArray8[local23] = false;
		}
		Static129.anInt2771 = Static66.anInt1741;
		if (Static126.aClass66_5.method5065()) {
			Static302.aBoolean345 = true;
		}
		if (Static36.anInt1129 != -1) {
			Static386.anInt6857 = 0;
			Static226.method4727();
		}
		Static126.aClass66_5.method5070();
		Static238.method3671(Static28.anInt815);
		Static254.anInt4641 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method69() {
		Static214.anInt3921 = 0;
		@Pc(13) int local13 = (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7) + Static2.anInt6396;
		@Pc(20) int local20 = Static348.anInt6273 + (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static214.anInt3921 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static214.anInt3921 = 1;
		}
		if (Static214.anInt3921 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static214.anInt3921 = 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public static int method70(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
