import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!ps;")
	public static Class163 aClass163_4;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
	public static final int[] anIntArray66 = new int[] { 0, 0, -1, 0, 6, 0, 2, 0, 0, 0, 0, 6, 0, 0, -2, 0, 0, 0, -1, 2, 1, 0, 0, 6, 8, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 2, 28, 0, 0, 0, -1, 0, 7, -2, 0, -1, 0, 4, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, -1, 0, 0, 6, 10, 0, 15, 0, -1, 0, 0, 0, 5, 0, 3, -1, 0, 6, 7, 0, 0, 0, 0, 0, 14, 0, -1, 7, 0, -2, 8, 4, 0, 12, 0, 2, -2, 0, 6, 0, 0, 0, 1, 1, 0, 0, 0, 0, 6, 0, -2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 8, 0, 0, 0, 12, -2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 6, 8, 3, -1, 0, -1, -1, 0, 0, 0, 0, -2, 2, 0, 0, -1, 0, 17, -1, 0, 0, -2, 6, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 8, 0, 2, 11, 3, 0, 0, 0, 0, 4, 8, 0, 6, 6, 0, 0, 7, 1, 0, 0, 3, 20, 4, 0, 5, 0, 3, 0, 0, 0, 8, -2, 15, 10, 0, 0, -2, 0, 0, 0, 0, 14, 0, -1, 0, 0, 0, 0, -1, 0, 5, 0, 0, -2, 8, -2, 0, 5, 12, 6, 0, 3, 0, 9, 0, 0, 0, 10, 0, 0, -1, 0, 0, 0, 0, 0, 8, 2, 0, 12, 3 };

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	public static int anInt1151 = 104;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "[I")
	public static final int[] anIntArray67 = new int[128];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)Z")
	public static boolean method896(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	public static void method897() {
		@Pc(5) Class37 local5 = Static314.aClass37_102;
		synchronized (Static314.aClass37_102) {
			Static314.aClass37_102.method919();
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)Z")
	public static boolean method899() {
		if (Static129.aBoolean209) {
			try {
				if ((Boolean) Static367.method3947(Static197.aClass215_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
	public static void method900() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static68.aBooleanArray5[local7] = false;
		}
		Static206.anInt4317 = Static177.anInt3734;
		Static13.anInt211 = Static117.anInt2244;
		Static246.anInt5156 = 5;
		Static100.anInt1933 = -1;
		Static87.anInt1665 = Static296.anInt5982;
		Static47.anInt1207 = Static4.anInt41;
		Static342.anInt2478 = -1;
		Static283.anInt5716 = Static282.anInt3516;
		Static324.anInt6407 = 0;
		Static275.anInt5626 = 0;
		Static151.anInt3085 = Static338.anInt6530;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
	public static int method901(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
