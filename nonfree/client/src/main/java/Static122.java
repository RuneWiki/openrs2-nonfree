import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ff;")
	public static Class11 aClass11_44;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
	public static int[] anIntArray405;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1188 = Static2.method59(":tradereq:");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1189 = Static2.method59("runes");

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1967(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static45.anInt2088 > 0) {
			local24 = Static14.aByteArrayArray3[--Static45.anInt2088];
			Static14.aByteArrayArray3[Static45.anInt2088] = null;
			return local24;
		} else if (arg0 == 5000 && Static37.anInt1213 > 0) {
			local24 = Static106.aByteArrayArray8[--Static37.anInt1213];
			Static106.aByteArrayArray8[Static37.anInt1213] = null;
			return local24;
		} else if (arg0 == 30000 && Static28.anInt2317 > 0) {
			local24 = Static60.aByteArrayArray6[--Static28.anInt2317];
			Static60.aByteArrayArray6[Static28.anInt2317] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method1968() {
		aClass80_1189 = null;
		aClass11_44 = null;
		aClass80_1188 = null;
		anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
	public static boolean method1969(@OriginalArg(1) int arg0) {
		if (Static25.aBooleanArray10[arg0]) {
			return true;
		} else if (Static43.aClass11_23.method398(arg0)) {
			@Pc(23) int local23 = Static43.aClass11_23.method387(arg0);
			if (local23 == 0) {
				Static25.aBooleanArray10[arg0] = true;
				return true;
			}
			if (Static51.aClass2_Sub1_Sub17ArrayArray1[arg0] == null) {
				Static51.aClass2_Sub1_Sub17ArrayArray1[arg0] = new Class2_Sub1_Sub17[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static43.aClass11_23.method383(local50, arg0);
					if (local64 != null) {
						Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local50] = new Class2_Sub1_Sub17();
						Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local50].anInt3022 = local50 + (arg0 << 16);
						if (local64[0] == -1) {
							Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local50].method1948(new Class2_Sub17(local64));
						} else {
							Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local50].method1940(new Class2_Sub17(local64));
						}
					}
				}
			}
			Static25.aBooleanArray10[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
