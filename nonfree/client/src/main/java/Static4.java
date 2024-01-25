import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!qj;")
	public static Class165 aClass165_4;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt86;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static142.aString123 = arg1;
		Static87.anInt1718 = arg0;
		Static87.aString69 = arg2;
		if (Static142.aString123.equals("") || Static87.aString69.equals("")) {
			Static82.anInt1642 = 3;
		} else if (Static232.anInt6331 == -1) {
			Static82.anInt1642 = -3;
			Static100.anInt2076 = 0;
			Static51.anInt5048 = 1;
			Static193.anInt3949 = 0;
			@Pc(40) Class1_Sub7 local40 = new Class1_Sub7(128);
			local40.method3108(10);
			local40.method3098((int) (Math.random() * 9.9999999E7D));
			local40.method3121(Static57.method1236(Static142.aString123));
			local40.method3098((int) (Math.random() * 9.9999999E7D));
			local40.method3124(Static87.aString69);
			local40.method3098((int) (Math.random() * 9.9999999E7D));
			local40.method3092(Static82.aBigInteger1, Static152.aBigInteger2);
			Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
			Static248.aClass1_Sub7_Sub1_2.method3108(24);
			Static248.aClass1_Sub7_Sub1_2.method3108(local40.anInt3368 + 2);
			Static248.aClass1_Sub7_Sub1_2.method3128(563);
			Static248.aClass1_Sub7_Sub1_2.method3146(local40.aByteArray58, local40.anInt3368);
		} else {
			Static138.method2659();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass5_Sub5_1 != null) {
			local7.aClass5_Sub5_1 = null;
		}
	}
}
