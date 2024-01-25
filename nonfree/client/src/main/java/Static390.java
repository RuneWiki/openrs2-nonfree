import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
	public static int anInt6750 = 2;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_41 = new Class222(64);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BIIILclient!ut;ILclient!gi;IIIII)V")
	public static void method5394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class335 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class122 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static6.anInt66 = arg8;
		Static33.anInt2647 = arg7;
		Static301.aClass335_11 = arg3;
		Static429.anInt7506 = arg1;
		Static422.aClass102_10 = null;
		Static381.aClass122_11 = arg5;
		Static316.anInt5409 = arg10;
		Static308.anInt5288 = arg2;
		Static548.aClass102_14 = null;
		Static472.anInt8018 = arg0;
		Static401.aClass102_8 = null;
		Static351.anInt5834 = arg9;
		Static479.anInt8091 = arg6;
		Static461.anInt7945 = arg4;
		Static527.method7249();
		Static142.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
	public static void method5395(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub6_Sub16 local14 = Static212.method3332(2, arg0);
		local14.method6593();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Lclient!sk;")
	public static Class307 method5396(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static17.aClass307Array1[arg0] : null;
	}
}
