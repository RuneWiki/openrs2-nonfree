import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!fr;")
	public static Class68 aClass68_19;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	public static int anInt4648;

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray31;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString268 = "yellow:";

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString269 = "";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
	public static int method4075(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;Lclient!tc;ZB)V")
	public static void method4079(@OriginalArg(0) String arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(26) int local26 = Static282.aClass138_7.method3722(arg0, null, 250);
		@Pc(35) int local35 = Static282.aClass138_7.method3732(arg0, null, 250) * 13;
		Static15.aClass59_1.method4877(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
		Static15.aClass59_1.method4851(6, 6, local26 + 4 + 4, local35 + 8, -1, 0);
		arg1.method5296(0, local35, 10, 1, null, arg0, -1, 0, null, 10, 1, local26, 0, null, -1);
		Static316.method5375(6, 6, local35 + 4 + 4, local26 + 8);
		if (arg2) {
			Static15.aClass59_1.method4848();
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
	public static void method4083() {
		@Pc(1) Class98 local1 = Static46.aClass98_1;
		synchronized (Static46.aClass98_1) {
			Static160.anInt3228 = Static84.anInt2092;
			Static241.anInt4679++;
			Static270.anInt5171 = Static20.anInt551;
			Static274.anInt5378 = Static36.anInt923;
			Static278.anInt5427 = Static148.anInt3012;
			Static61.anInt1429 = Static324.anInt6143;
			Static318.anInt5916 = Static43.anInt1090;
			Static177.aLong88 = Static130.aLong101;
			Static148.anInt3012 = 0;
		}
	}
}
