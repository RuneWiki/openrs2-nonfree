import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] aClass10_Sub1_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!w;")
	public static Class15 aClass15_15;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] aClass10_Sub1_Sub1_Sub2Array2;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public static int anInt783;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!va;")
	private static Class61 aClass61_299 = Static88.method1421("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!va;")
	private static Class61 aClass61_300 = Static88.method1421("level)2");

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public static int anInt776 = 0;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public static int anInt781 = 0;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_301 = aClass61_300;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public static int anInt782 = 3;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
	public static int[] anIntArray84 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_302 = aClass61_299;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)I")
	public static int method489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static93.method1107(arg0 - 1, arg1 - 1) + Static93.method1107(arg0 + 1, arg1 + -1) + Static93.method1107(arg0 - 1, arg1 - -1) + Static93.method1107(arg0 - -1, arg1 - -1);
		@Pc(79) int local79 = Static93.method1107(arg0 - 1, arg1) + Static93.method1107(arg0 + 1, arg1) + Static93.method1107(arg0, arg1 - 1) + Static93.method1107(arg0, arg1 + 1);
		@Pc(84) int local84 = Static93.method1107(arg0, arg1);
		return local79 / 8 + local41 / 16 + local84 / 4;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method490() {
		anIntArray84 = null;
		aClass61_300 = null;
		aClass15_15 = null;
		anIntArray80 = null;
		aClass10_Sub1_Sub1_Sub2Array2 = null;
		aClass10_Sub1_Sub1_Sub2Array1 = null;
		aClass61_299 = null;
		aClass61_301 = null;
		aClass61_302 = null;
		anIntArray83 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public static boolean method491(@OriginalArg(0) int arg0) {
		if (Static51.aBooleanArray5[arg0]) {
			return true;
		} else if (Static88.aClass11_55.method219(arg0)) {
			@Pc(23) int local23 = Static88.aClass11_55.method217(arg0);
			if (local23 == 0) {
				Static51.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static104.aClass10_Sub1_Sub4ArrayArray1[arg0] == null) {
				Static104.aClass10_Sub1_Sub4ArrayArray1[arg0] = new Class10_Sub1_Sub4[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static88.aClass11_55.method203(arg0, local50);
					if (local64 != null) {
						Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local50] = new Class10_Sub1_Sub4();
						Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local50].method396(new Class10_Sub10(local64));
					}
				}
			}
			Static51.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!s;Ljava/awt/Component;B)V")
	public static void method493(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(8) Class17_Sub2 local8 = (Class17_Sub2) Class.forName("Class17_Sub2_Sub2").getDeclaredConstructor().newInstance();
			local8.method1446(arg0, 2048);
			Static107.aClass17_5 = local8;
		} catch (@Pc(20) Throwable local20) {
			try {
				Static107.aClass17_5 = new Class17_Sub2_Sub1(arg0, arg1);
			} catch (@Pc(28) Throwable local28) {
				if (Static86.aString3.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static107.aClass17_5 = new Class17_Sub1();
						return;
					} catch (@Pc(39) Throwable local39) {
					}
				}
				Static107.aClass17_5 = new Class17(8000);
			}
		}
	}
}
