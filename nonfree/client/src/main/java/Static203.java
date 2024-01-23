import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!og", name = "y", descriptor = "Lclient!ek;")
	public static Class42 aClass42_62;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "Lclient!sf;")
	public static Class157 aClass157_34 = new Class157(64);

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public static int anInt4260 = -1;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!og", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString144 = "Loading wordpack - ";

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
	public static int method3463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!en;III)V")
	public static void method3464(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static94.aClass44_9.method1361();
		if (Static299.aBoolean382) {
			return;
		}
		for (@Pc(20) Class2_Sub8_Sub21 local20 = (Class2_Sub8_Sub21) arg0.method1352(); local20 != null; local20 = (Class2_Sub8_Sub21) arg0.method1360()) {
			@Pc(27) Class10 local27 = Static48.method890(local20.anInt4970);
			if (Static159.method2934(local27)) {
				Static188.method4598(arg2, arg1, local27, local20);
				if (local20.aBoolean327) {
					Static110.method1866(local20, local27);
				}
			}
		}
	}
}
