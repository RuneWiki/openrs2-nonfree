import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt878 = 0;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString37 = " more options";

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static void method643() {
		Static145.aClass157_27.method4034(5);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method644() {
		for (@Pc(12) Class2_Sub29 local12 = (Class2_Sub29) Static300.aClass44_26.method1352(); local12 != null; local12 = (Class2_Sub29) Static300.aClass44_26.method1360()) {
			if (local12.anInt5683 == -1) {
				local12.anInt5693 = 0;
				Static163.method2981(local12);
			} else {
				local12.method4743();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
	public static int method645(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)I")
	public static int method646() {
		return Static175.aClass157_33.method4030();
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method647() {
		@Pc(5) String local5 = "www";
		if (Static123.anInt2856 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (Static6.aString4 != null) {
			local12 = "/p=" + Static6.aString4;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static100.anInt2375 + "/a=" + Static21.anInt460 + local12 + "/";
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!ml;Lclient!ml;IIIIJ)V")
	public static void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class147 local6 = new Class147();
		local6.aLong178 = arg10;
		local6.anInt4781 = arg1 * 128 + 64;
		local6.anInt4784 = arg2 * 128 + 64;
		local6.anInt4780 = arg3;
		local6.aClass15_5 = arg4;
		local6.aClass15_4 = arg5;
		local6.anInt4777 = arg6;
		local6.anInt4782 = arg7;
		local6.anInt4783 = arg8;
		local6.anInt4778 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static52.aClass2_Sub13ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static52.aClass2_Sub13ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub13(local46, arg1, arg2);
			}
		}
		Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass147_1 = local6;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZI)I")
	public static int method649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
