import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!s;")
	public static Class3_Sub1_Sub12 aClass3_Sub1_Sub12_2;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_20;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1041 = Static109.method1737("leuchten2:");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_1042 = Static109.method1737("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!na;")
	private static Class53 aClass53_1043 = Static109.method1737("Login limit exceeded)3");

	@OriginalMember(owner = "client!we", name = "V", descriptor = "Lclient!na;")
	private static Class53 aClass53_1048 = Static109.method1737("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_1044 = aClass53_1048;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_1045 = Static109.method1737("@cr2@");

	@OriginalMember(owner = "client!we", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_1046 = Static109.method1737("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1047 = Static109.method1737("Weiter");

	@OriginalMember(owner = "client!we", name = "S", descriptor = "I")
	public static int anInt2183 = 0;

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "Lclient!na;")
	public static Class53 aClass53_1049 = aClass53_1043;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!we;Lclient!na;ILclient!na;IZ)V")
	public static void method1514(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(4) Class53 arg2) {
		@Pc(8) int local8 = arg0.method1504(arg1);
		@Pc(14) int local14 = arg0.method1502(arg2, local8);
		Static9.method143(local14, 255, local8, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLclient!na;ILclient!we;Lclient!na;)V")
	public static void method1517(@OriginalArg(2) Class53 arg0, @OriginalArg(4) Class62 arg1, @OriginalArg(5) Class53 arg2) {
		@Pc(8) int local8 = arg1.method1504(arg0);
		@Pc(16) int local16 = arg1.method1502(arg2, local8);
		Static100.method1655(local16, arg1, 255, local8);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method1518() {
		aClass3_Sub1_Sub5_Sub3_20 = null;
		aClass53_1046 = null;
		aClass53_1042 = null;
		aClass3_Sub1_Sub12_2 = null;
		aClass53_1047 = null;
		aClass53_1049 = null;
		aClass53_1044 = null;
		aClass53_1043 = null;
		aClass53_1045 = null;
		aClass53_1041 = null;
		aClass53_1048 = null;
	}
}
