import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "I")
	public static int anInt5283;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZ)V")
	public static void method4478(@OriginalArg(0) int arg0) {
		Static490.anInt8296 = 2;
		Static558.anInt8991 = arg0;
		if (Static573.aString114 == null) {
			Static582.method7836(35);
		} else {
			@Pc(28) Class3_Sub17 local28 = new Class3_Sub17(Static188.method3036(Static454.method6516(Static573.aString114)));
			@Pc(32) long local32 = local28.method4865();
			Static222.aLong106 = local28.method4865();
			Static164.method2758("", true, Static455.method6553(local32));
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZILclient!gj;III)V")
	public static void method4479(@OriginalArg(0) int arg0, @OriginalArg(3) Class143 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (arg0 <= 0) {
			Static507.method7179(arg3, arg1, arg2);
			return;
		}
		Static230.aBoolean341 = false;
		Static54.anInt1418 = 1;
		anInt5283 = 0;
		Static548.aClass143_125 = arg1;
		Static424.aClass3_Sub9_Sub5_3 = null;
		Static231.anInt4426 = arg2;
		Static335.anInt6114 = arg3;
		Static279.anInt5228 = Static402.aClass3_Sub9_Sub5_2.method6735() / arg0;
		if (Static279.anInt5228 < 1) {
			Static279.anInt5228 = 1;
			return;
		}
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
	public static void method4480() {
		Static654.method8553(Static227.aClass3_Sub15_11.aClass17_Sub7_1.method2458() == 1);
		Static212.aClass232_2 = Static664.method5820(22050, Static469.aCanvas11, Static499.aClass231_4, 0);
		Static619.method8224(Static552.method7577((Class3_Sub9_Sub5) null));
		Static18.aClass232_1 = Static664.method5820(2048, Static469.aCanvas11, Static499.aClass231_4, 1);
		Static557.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1();
		Static18.aClass232_1.method8514(Static557.aClass3_Sub9_Sub1_2);
		Static46.aClass334_1 = new Class334(22050, Static656.anInt1392);
		Static361.method5397();
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)I")
	public static int method4481() {
		return 16;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(IZ)Z")
	public static boolean method4482(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class3_Sub6_Sub16 local10 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local10 != null; local10 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
			if (Static156.method4836(local10.anInt7069) && local10.aLong202 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
