import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!ml;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Lclient!tj;")
	public static Class193 aClass193_65;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	public static int anInt3835 = 0;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)I")
	public static int method3479(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method3480() {
		try {
			if (Static261.anInt5280 == 1) {
				@Pc(12) int local12 = Static229.aClass4_Sub1_Sub4_3.method3813();
				if (local12 > 0 && Static229.aClass4_Sub1_Sub4_3.method3806()) {
					local12 -= Static254.anInt2745;
					if (local12 < 0) {
						local12 = 0;
					}
					Static229.aClass4_Sub1_Sub4_3.method3794(local12);
					return;
				}
				Static229.aClass4_Sub1_Sub4_3.method3797();
				Static229.aClass4_Sub1_Sub4_3.method3822();
				Static342.aClass96_1 = null;
				Static209.aClass4_Sub43_2 = null;
				if (Static317.aClass193_100 == null) {
					Static261.anInt5280 = 0;
				} else {
					Static261.anInt5280 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static229.aClass4_Sub1_Sub4_3.method3797();
			Static342.aClass96_1 = null;
			Static317.aClass193_100 = null;
			Static209.aClass4_Sub43_2 = null;
			Static261.anInt5280 = 0;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method3481() {
		@Pc(5) String local5 = "www";
		if (Static80.anInt2116 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(16) String local16 = "";
		if (Static209.aString48 != null) {
			local16 = "/p=" + Static209.aString48;
		}
		return Static330.anInt6312 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + anInt3835 + "/a=" + Static182.anInt3853 + local16 + "/" : "http://" + local5 + ".runescape.com/l=" + anInt3835 + "/a=" + Static182.anInt3853 + local16 + "/";
	}
}
