import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!uc;")
	public static Class4_Sub4_Sub15 aClass4_Sub4_Sub15_1;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_307 = Static121.method2047("title_mute");

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!qc;")
	public static Class60 aClass60_308 = Static121.method2047("Texturen geladen)3");

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt754 = 0;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_309 = Static121.method2047("null");

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_310 = Static121.method2047("m");

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_311 = Static121.method2047("Fps:");

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
	public static int anInt757 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
	public static boolean method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(29) Class4_Sub4_Sub5 local29 = Static24.method477(arg1);
		return local29.method723(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method520(@OriginalArg(1) int arg0) {
		if (Static131.aBooleanArray18[arg0]) {
			return true;
		} else if (Static70.aClass40_52.method1119(arg0)) {
			@Pc(23) int local23 = Static70.aClass40_52.method1114(arg0);
			if (local23 == 0) {
				Static131.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static82.aClass4_Sub17ArrayArray1[arg0] == null) {
				Static82.aClass4_Sub17ArrayArray1[arg0] = new Class4_Sub17[local23];
			}
			for (@Pc(52) int local52 = 0; local52 < local23; local52++) {
				if (Static82.aClass4_Sub17ArrayArray1[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static70.aClass40_52.method1110(local52, arg0);
					if (local66 != null) {
						Static82.aClass4_Sub17ArrayArray1[arg0][local52] = new Class4_Sub17();
						Static82.aClass4_Sub17ArrayArray1[arg0][local52].anInt2203 = local52 + (arg0 << 16);
						if (local66[0] == -1) {
							Static82.aClass4_Sub17ArrayArray1[arg0][local52].method1617(new Class4_Sub13(local66));
						} else {
							Static82.aClass4_Sub17ArrayArray1[arg0][local52].method1624(new Class4_Sub13(local66));
						}
					}
				}
			}
			Static131.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)V")
	public static void method521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static56.aClass4_Sub13_Sub1_1.method1265(129);
		Static56.aClass4_Sub13_Sub1_1.method1219(arg0);
		Static56.aClass4_Sub13_Sub1_1.method1208(arg1);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method522() {
		aClass60_307 = null;
		aClass60_309 = null;
		aClass60_310 = null;
		aClass60_308 = null;
		aClass60_311 = null;
		aClass4_Sub4_Sub15_1 = null;
	}
}
