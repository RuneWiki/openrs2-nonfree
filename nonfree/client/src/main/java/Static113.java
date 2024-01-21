import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!wc;")
	public static Class4 aClass4_50;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!ed;")
	public static Class18 aClass18_9;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!cb;")
	public static Class11 aClass11_20 = new Class11(64);

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt2233 = 0;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public static int anInt2237 = 0;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!a;")
	private static Class1 aClass1_2347 = Static94.method1596(" is already on your ignore list");

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2346 = aClass1_2347;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt2241 = 0;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	public static int anInt2242 = 0;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "Lclient!a;")
	private static Class1 aClass1_2352 = Static94.method1596("Cancel");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_2348 = aClass1_2352;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!a;")
	private static Class1 aClass1_2349 = Static94.method1596("Loaded title screen");

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2350 = aClass1_2349;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2351 = Static94.method1596("@or2@");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;ILclient!lc;)V")
	public static void method1521(@OriginalArg(0) Component arg0, @OriginalArg(2) Class34 arg1) {
		try {
			@Pc(8) Class10_Sub1 local8 = (Class10_Sub1) Class.forName("Class10_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local8.method1038(arg1, 2048);
			Static5.aClass10_1 = local8;
		} catch (@Pc(16) Throwable local16) {
			try {
				Static5.aClass10_1 = new Class10_Sub1_Sub1(arg1, arg0);
			} catch (@Pc(24) Throwable local24) {
				if (Static58.aString5.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static5.aClass10_1 = new Class10_Sub2();
						return;
					} catch (@Pc(36) Throwable local36) {
					}
				}
				Static5.aClass10_1 = new Class10(8000);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method1523() {
		aClass1_2350 = null;
		aClass1_2351 = null;
		aBooleanArray17 = null;
		aClass4_50 = null;
		aClass18_9 = null;
		aClass1_2349 = null;
		aClass11_20 = null;
		aClass1_2352 = null;
		aClass1_2348 = null;
		aClass1_2346 = null;
		aClass1_2347 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public static boolean method1524(@OriginalArg(0) int arg0) {
		if (aBooleanArray17[arg0]) {
			return true;
		} else if (Static30.aClass8_9.method1698(arg0)) {
			@Pc(31) int local31 = Static30.aClass8_9.method1702(arg0);
			if (local31 == 0) {
				aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static98.aClass2_Sub1_Sub14ArrayArray1[arg0] == null) {
				Static98.aClass2_Sub1_Sub14ArrayArray1[arg0] = new Class2_Sub1_Sub14[local31];
			}
			for (@Pc(50) int local50 = 0; local50 < local31; local50++) {
				if (Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static30.aClass8_9.method1684(local50, arg0);
					if (local64 != null) {
						Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local50] = new Class2_Sub1_Sub14();
						Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local50].anInt2194 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local50].method1516(new Class2_Sub3(local64));
						} else {
							Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local50].method1509(new Class2_Sub3(local64));
						}
					}
				}
			}
			aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Lclient!qd;")
	public static Class2_Sub1_Sub14 method1526(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static98.aClass2_Sub1_Sub14ArrayArray1[local7] == null || Static98.aClass2_Sub1_Sub14ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = method1524(local7);
			if (!local25) {
				return null;
			}
		}
		return Static98.aClass2_Sub1_Sub14ArrayArray1[local7][local11];
	}
}
