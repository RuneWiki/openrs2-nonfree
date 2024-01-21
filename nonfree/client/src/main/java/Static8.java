import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt206;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!fd;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_178 = Static69.method1231("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_179 = Static69.method1231("(U5");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method183() {
		aClass24_4 = null;
		aClass40_178 = null;
		aClass40_179 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!na;ILclient!je;)I")
	public static int method184(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(14) int local14 = arg0.anInt976;
		arg0.method633(arg1.anInt1425);
		arg0.anInt976 += Static47.aClass19_1.method430(arg1.anInt1425, arg0.aByteArray16, arg0.anInt976, arg1.aByteArray18, 0);
		return arg0.anInt976 - local14;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!fd;ILclient!fd;Lclient!fd;Lclient!fd;)V")
	public static void method185(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class24 arg3) {
		Static37.aClass24_10 = arg3;
		Static29.aClass24_8 = arg2;
		Static60.aClass24_17 = arg0;
		Static5.aClass24_3 = arg1;
		Static45.aClass2_Sub13ArrayArray1 = new Class2_Sub13[Static60.aClass24_17.method1914()][];
		Static81.aBooleanArray20 = new boolean[Static60.aClass24_17.method1914()];
	}
}
