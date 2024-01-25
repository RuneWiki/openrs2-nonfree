import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	public static final int anInt6754 = 1339;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_101 = new Class218(28, 3);

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_102 = new Class218(86, -1);

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public static void method6086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class312 local9 = Static654.aClass312ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static5.anInt69 = local9.anInt8865;
			Static146.anInt2950 = local9.anInt8866;
			Static611.anInt9854 = local9.anInt8869;
		}
		Static663.method9154();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6088(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(3, (long) arg0);
		local9.method2195();
		local9.aString21 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLclient!ha;Lclient!ck;)I")
	public static int method6089(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class62 arg1) {
		if (arg1.anInt1417 != -1) {
			return arg1.anInt1417;
		}
		if (arg1.anInt1409 != -1) {
			@Pc(23) Class119 local23 = arg0.anInterface4_14.method4673(arg1.anInt1409);
			if (!local23.aBoolean291) {
				return local23.aShort42;
			}
		}
		return arg1.anInt1415;
	}
}
