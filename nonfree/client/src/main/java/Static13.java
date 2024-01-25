import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_5 = new Class44(30, 6);

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!wn;IIIILclient!ha;IIIIII)V")
	public static void method127(@OriginalArg(0) Class14_Sub3_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 < arg9 && arg9 < arg6 + arg2 && arg3 > arg10 - 13 && arg3 < arg10 + 3) {
			arg8 = arg5;
		}
		@Pc(43) String local43 = Static175.method2826(arg0);
		Static448.aClass38_10.method8993(arg8, Static387.anIntArray518, Static135.aClass20Array3, arg10, local43, arg2 + 3);
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method130() {
		@Pc(3) Class376[] local3 = Class175.aClass376Array1;
		synchronized (Class175.aClass376Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class175.aClass376Array1.length; local7++) {
				Class175.aClass376Array1[local7] = new Class376();
				Static42.anIntArray83[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method131() {
		if (Static505.aBoolean629 || Static12.aClass14_Sub3_Sub11_1 == null) {
			return "";
		} else if ((Static12.aClass14_Sub3_Sub11_1.aString58 == null || Static12.aClass14_Sub3_Sub11_1.aString58.length() == 0) && Static12.aClass14_Sub3_Sub11_1.aString57 != null && Static12.aClass14_Sub3_Sub11_1.aString57.length() > 0) {
			return Static12.aClass14_Sub3_Sub11_1.aString57;
		} else {
			return Static12.aClass14_Sub3_Sub11_1.aString58;
		}
	}
}
