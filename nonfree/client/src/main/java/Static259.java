import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "[[Lclient!wp;")
	public static Class361[][] aClass361ArrayArray1;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!tf;")
	public static Class322 aClass322_90;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)Z")
	public static boolean method3984(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)[I")
	public static int[] method3986() {
		return new int[] { Static132.anInt9450, Static334.anInt5599, Static189.anInt3600 };
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
	public static void method3987(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static553.aBoolean674 = arg0;
		Static196.aString85 = arg1;
		Static173.aString18 = arg2;
		if (!Static553.aBoolean674 && Static570.anInt9273 != 3 && (Static196.aString85.equals("") || Static173.aString18.equals(""))) {
			Static526.method7023(3);
			return;
		}
		if (Static570.anInt9273 != 1) {
			Static120.anInt2777 = -1;
			Static337.anInt5633 = 0;
		}
		Static165.aBoolean259 = false;
		Static526.method7023(-3);
		Static407.anInt7011 = 1;
		Static113.anInt2215 = 0;
		Static584.anInt9416 = 0;
	}
}
