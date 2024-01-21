import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_961 = Static38.method685("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Lclient!ai;")
	private static Class6 aClass6_965 = Static38.method685("green:");

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_962 = aClass6_965;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Lclient!ai;")
	public static Class6 aClass6_963 = Static38.method685("<col=ffb000>");

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	public static int anInt3310 = 0;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "Lclient!ai;")
	public static Class6 aClass6_964 = Static38.method685("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray56 = new int[5][5000];

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
	public static int anInt3311 = 0;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_966 = Static38.method685(": ");

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
	public static int anInt3312 = 0;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_967 = Static38.method685("Lade)3)3)3");

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_968 = aClass6_965;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public static void method2182() {
		aClass6_964 = null;
		aClass6_961 = null;
		aClass6_966 = null;
		aClass6_963 = null;
		aClass6_965 = null;
		anIntArrayArray56 = null;
		aClass6_968 = null;
		aClass6_967 = null;
		aClass6_962 = null;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(BI)V")
	public static void method2183(@OriginalArg(1) int arg0) {
		Static174.method2726();
		Static149.method2285();
		@Pc(14) int local14 = Static39.method705(arg0).anInt431;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static11.anIntArray9[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static100.method1684(0.9F);
			}
			if (local24 == 2) {
				Static100.method1684(0.8F);
			}
			if (local24 == 3) {
				Static100.method1684(0.7F);
			}
			if (local24 == 4) {
				Static100.method1684(0.6F);
			}
			Static168.method2679();
		}
		if (local14 == 3) {
			@Pc(68) short local68 = 0;
			if (local24 == 0) {
				local68 = 255;
			}
			if (local24 == 1) {
				local68 = 192;
			}
			if (local24 == 2) {
				local68 = 128;
			}
			if (local24 == 3) {
				local68 = 64;
			}
			if (local24 == 4) {
				local68 = 0;
			}
			if (local68 != Static81.anInt1983) {
				if (Static81.anInt1983 == 0 && Static94.anInt2328 != -1) {
					Static180.method2811(local68, Static5.aClass10_Sub1_2, Static94.anInt2328, 0);
					Static52.aBoolean56 = false;
				} else if (local68 == 0) {
					Static31.method540();
					Static52.aBoolean56 = false;
				} else {
					Static139.method2155(local68);
				}
				Static81.anInt1983 = local68;
			}
		}
		if (local14 == 9) {
			Static67.anInt1691 = local24;
		}
		if (local14 == 5) {
			Static21.anInt523 = local24;
		}
		if (local14 == 6) {
			Static155.anInt3954 = local24;
		}
		if (local14 == 4) {
			if (local24 == 0) {
				Static34.anInt997 = 127;
			}
			if (local24 == 1) {
				Static34.anInt997 = 96;
			}
			if (local24 == 2) {
				Static34.anInt997 = 64;
			}
			if (local24 == 3) {
				Static34.anInt997 = 32;
			}
			if (local24 == 4) {
				Static34.anInt997 = 0;
			}
		}
		if (local14 != 10) {
			return;
		}
		if (local24 == 0) {
			Static107.anInt2566 = 127;
		}
		if (local24 == 1) {
			Static107.anInt2566 = 96;
		}
		if (local24 == 2) {
			Static107.anInt2566 = 64;
		}
		if (local24 == 3) {
			Static107.anInt2566 = 32;
		}
		if (local24 == 4) {
			Static107.anInt2566 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)I")
	public static int method2184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg1 > 0) {
			local3 = local3 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local3;
	}
}
