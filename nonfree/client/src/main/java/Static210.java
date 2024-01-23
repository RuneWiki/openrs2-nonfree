import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1225;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1229 = Static231.method3737("glow2:");

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1224 = aClass107_1229;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1226 = aClass107_1229;

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
	public static int anInt4519 = 0;

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array28 = new Class107[500];

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1227 = Static231.method3737("Hierhin gehen");

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1228 = Static231.method3737("details");

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1230 = Static231.method3737("Clientscript error in: ");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I")
	public static int method3377(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lclient!ka;Lclient!jb;[Lclient!ka;[Lclient!ka;[Lclient!pd;I[Lclient!ka;)V")
	public static void method3379(@OriginalArg(0) Class64_Sub1[] arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class64_Sub1[] arg2, @OriginalArg(3) Class64_Sub1[] arg3, @OriginalArg(4) Class1_Sub2_Sub2_Sub1[] arg4, @OriginalArg(6) Class64_Sub1[] arg5) {
		Static160.aClass1_Sub2_Sub2_Sub1Array2 = arg4;
		Static44.aClass64_Sub1Array2 = arg2;
		Static195.aClass64_Sub1Array8 = arg0;
		Static155.aClass28_10 = arg1;
		Static98.aClass64_Sub1Array5 = arg5;
		Static178.aClass64_Sub1Array6 = arg3;
		Static230.aClass120_22.method3560();
		@Pc(25) int local25 = Static155.aClass28_10.method837(aClass107_1228);
		@Pc(30) int[] local30 = Static155.aClass28_10.method830(local25);
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			Static230.aClass120_22.method3567(Static21.method389(new Class1_Sub26(Static155.aClass28_10.method819(local30[local32], local25))));
		}
	}
}
