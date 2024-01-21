import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
	public static volatile int anInt2746 = -1;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1189 = Static51.method932("cross");

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray31 = new int[104][104];

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1190 = null;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1191 = Static51.method932("Hierhin gehen");

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1192 = Static51.method932(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	public static void method1952() {
		aClass10_1190 = null;
		aClass10_1189 = null;
		aClass10_1192 = null;
		anIntArray296 = null;
		aClass10_1191 = null;
		anIntArrayArray31 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	public static void method1953(@OriginalArg(0) int arg0) {
		Static100.method1659();
		Static126.method2065();
		@Pc(14) int local14 = Static110.method1756(arg0).anInt3156;
		if (local14 == 0) {
			return;
		}
		@Pc(26) int local26 = Static51.anIntArray143[arg0];
		if (local14 == 1) {
			if (local26 == 1) {
				Static125.method2045(0.9F);
			}
			if (local26 == 2) {
				Static125.method2045(0.8F);
			}
			if (local26 == 3) {
				Static125.method2045(0.7F);
			}
			if (local26 == 4) {
				Static125.method2045(0.6F);
			}
			Static94.method1584();
		}
		if (local14 == 3) {
			@Pc(62) short local62 = 0;
			if (local26 == 0) {
				local62 = 255;
			}
			if (local26 == 1) {
				local62 = 192;
			}
			if (local26 == 2) {
				local62 = 128;
			}
			if (local26 == 3) {
				local62 = 64;
			}
			if (local26 == 4) {
				local62 = 0;
			}
			if (Static37.anInt932 != local62) {
				if (Static37.anInt932 == 0 && Static27.anInt757 != -1) {
					Static63.method1124(0, Static170.aClass29_Sub1_51, local62, Static27.anInt757);
					Static24.aBoolean22 = false;
				} else if (local62 == 0) {
					Static138.method2181();
					Static24.aBoolean22 = false;
				} else {
					Static148.method2282(local62);
				}
				Static37.anInt932 = local62;
			}
		}
		if (local14 == 9) {
			Static168.anInt3660 = local26;
		}
		if (local14 == 10) {
			if (local26 == 0) {
				Static180.anInt3818 = 127;
			}
			if (local26 == 1) {
				Static180.anInt3818 = 96;
			}
			if (local26 == 2) {
				Static180.anInt3818 = 64;
			}
			if (local26 == 3) {
				Static180.anInt3818 = 32;
			}
			if (local26 == 4) {
				Static180.anInt3818 = 0;
			}
		}
		if (local14 == 6) {
			Static97.anInt2270 = local26;
		}
		if (local14 == 5) {
			Static131.anInt2911 = local26;
		}
		if (local14 != 4) {
			return;
		}
		if (local26 == 0) {
			Static142.anInt3159 = 127;
		}
		if (local26 == 1) {
			Static142.anInt3159 = 96;
		}
		if (local26 == 2) {
			Static142.anInt3159 = 64;
		}
		if (local26 == 3) {
			Static142.anInt3159 = 32;
		}
		if (local26 == 4) {
			Static142.anInt3159 = 0;
			return;
		}
	}
}
