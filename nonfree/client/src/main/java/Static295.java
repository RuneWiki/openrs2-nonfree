import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	public static int anInt5742 = 0;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public static int anInt5744 = 20;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Ljava/lang/String;")
	public static final String aString228 = "flash1:";

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lclient!jm;")
	public static Class37 method5058() {
		try {
			return new Class37_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class37) Class.forName("Class37_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class37_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
	public static boolean method5059(@OriginalArg(0) int arg0) {
		if (arg0 == 34 || arg0 == 10 || arg0 == 4 || arg0 == 47 || arg0 == 42) {
			return true;
		} else if (arg0 == 35 || arg0 == 44 || arg0 == 1002) {
			return true;
		} else if (arg0 == 26 || arg0 == 37 || arg0 == 41 || arg0 == 45 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 15 || arg0 == 1004 || arg0 == 43;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
	public static int method5063() {
		if (Static292.aFrame2 == null) {
			return Static279.aBoolean465 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!pn;)V")
	public static void method5064(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub12_5 != null) {
			arg0.aClass1_Sub12_5.anInt1550 = 0;
		}
		arg0.aBoolean150 = false;
		for (@Pc(23) Class1_Sub6 local23 = arg0.method1664(); local23 != null; local23 = arg0.method1660()) {
			method5064(local23);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method5065(@OriginalArg(0) int arg0) {
		Static33.anInt805 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static222.anInt4391; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static74.anInt3404; local6++) {
				if (Static138.aClass204ArrayArrayArray1[arg0][local3][local6] == null) {
					Static138.aClass204ArrayArrayArray1[arg0][local3][local6] = new Class204(arg0, local3, local6);
				}
			}
		}
	}
}
