import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public static int anInt286;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_94 = Static49.method1293("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array4 = new Class70[8];

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_95 = Static49.method1293("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_96 = Static49.method1293(":duelfriend:");

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	public static int[] anIntArray21 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!rf;")
	public static Class70 aClass70_97 = Static49.method1293("Angreifen");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method245(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method246() {
		Static160.anInt4192 = 1;
		Static184.anInt4567 = 0;
		Static144.anInt3804 = -1;
		Static143.aBoolean142 = false;
		Static143.aClass76_111 = null;
		Static28.anInt834 = 2;
		Static47.anInt1655 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Lclient!mh;")
	public static Class53 method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2953; local13++) {
			@Pc(19) Class53 local19 = local7.aClass53Array2[local13];
			if ((local19.aLong99 >> 29 & 0x3L) == 2L && local19.anInt3109 == arg1 && local19.anInt3107 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)J")
	public static long method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2953; local13++) {
			@Pc(19) Class53 local19 = local7.aClass53Array2[local13];
			if ((local19.aLong99 >> 29 & 0x3L) == 2L && local19.anInt3109 == arg1 && local19.anInt3107 == arg2) {
				return local19.aLong99;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public static void method249() {
		aClass70_94 = null;
		anIntArray21 = null;
		aClass70_97 = null;
		aClass70Array4 = null;
		aClass70_96 = null;
		aClass70_95 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!rf;B)V")
	public static void method250(@OriginalArg(0) Class70 arg0) {
		if (Static20.anInt551 >= 2) {
			if (arg0.method2905(Static173.aClass70_1537)) {
				System.gc();
			}
			if (arg0.method2905(Static61.aClass70_613)) {
				Static109.method2272();
			}
			if (arg0.method2905(Static31.aClass70_334)) {
				Static89.aBoolean103 = true;
			}
			if (arg0.method2905(Static89.aClass70_864)) {
				Static89.aBoolean103 = false;
			}
			arg0.method2905(Static19.aClass70_186);
			arg0.method2905(Static78.aClass70_791);
			if (arg0.method2905(Static181.aClass70_1570)) {
				for (@Pc(52) int local52 = 0; local52 < 4; local52++) {
					for (@Pc(56) int local56 = 1; local56 < 103; local56++) {
						for (@Pc(60) int local60 = 1; local60 < 103; local60++) {
							Static96.aClass59Array1[local52].anIntArrayArray27[local56][local60] = 0;
						}
					}
				}
			}
			if (arg0.method2891(Static181.aClass70_1571) && Static35.anInt2016 != 0) {
				Static56.method1376(arg0.method2906(6).method2892());
			}
			if (arg0.method2905(Static136.aClass70_1200) && Static35.anInt2016 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2891(Static103.aClass70_951)) {
				Static45.anInt1478 = arg0.method2906(12).method2919().method2892();
				Static41.method1036(Static160.method3210(new Class70[] { Static113.aClass70_1024, Static34.method873(Static45.anInt1478) }), null, 0);
			}
			if (arg0.method2905(Static185.aClass70_1604)) {
				Static125.aBoolean134 = true;
			}
		}
		Static131.aClass1_Sub9_Sub1_3.method1283(142);
		Static131.aClass1_Sub9_Sub1_3.method1260(arg0.method2896() - 1);
		Static131.aClass1_Sub9_Sub1_3.method1232(arg0.method2906(2));
	}
}
