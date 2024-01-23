import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[500];

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!fa;")
	public static Class53 aClass53_10 = new Class53(64);

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public static int anInt4981 = 0;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
	public static int[] anIntArray447 = new int[5];

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!tk;")
	public static Class2_Sub26_Sub1 aClass2_Sub26_Sub1_2 = new Class2_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) Class2_Sub7 local3 = new Class2_Sub7();
		local3.anInt938 = arg5;
		local3.anInt944 = arg0;
		local3.anInt940 = arg1;
		local3.anInt933 = arg6;
		local3.anInt930 = arg11;
		local3.anInt931 = arg4;
		local3.anInt935 = arg8;
		local3.anInt943 = arg2;
		local3.anInt946 = arg7;
		local3.anInt934 = arg9;
		local3.anInt942 = arg10;
		local3.anInt928 = arg3;
		Static156.aClass1_31.method11(local3);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!wm;B)Lclient!wf;")
	public static Class74_Sub4 method4001(@OriginalArg(0) Class2_Sub26 arg0) {
		return new Class74_Sub4(arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4245(), arg0.method4261());
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method4002() {
		Static108.aClass46_16.method1079();
		Static279.aClass46_40.method1079();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BIILclient!jd;)Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 method4003(@OriginalArg(1) int arg0, @OriginalArg(3) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static289.method4807() : null;
	}
}
