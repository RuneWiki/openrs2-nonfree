import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static243 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt4841;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!lj;")
	public static Class106 aClass106_8 = new Class106(16);

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	public static int anInt4839 = 2;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public static int anInt4840 = 2;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString166 = " from your friend list first.";

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ak;ILclient!ek;Lclient!ek;Lclient!ek;)Z")
	public static boolean method3872(@OriginalArg(0) Class2_Sub3_Sub1 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) Class42 arg3) {
		Static130.aClass42_35 = arg1;
		Static185.aClass2_Sub3_Sub1_7 = arg0;
		Static236.aClass42_75 = arg3;
		Static262.aClass42_83 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)I")
	public static int method3873(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
