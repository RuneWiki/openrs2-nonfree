import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!vj;B)Lclient!faa;")
	public static Class102_Sub1 method5662(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(7) Class102 local7 = Static455.method6237(arg0);
		@Pc(16) int local16 = arg0.method8503();
		return new Class102_Sub1(local7.anInt2634, local7.aClass361_5, local7.aClass306_6, local7.anInt2636, local7.anInt2633, local16);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!vfa;IIIIIIILclient!rq;I)V")
	public static void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class306 arg9, @OriginalArg(11) int arg10) {
		Static250.anInt4005 = arg7;
		Static551.anInt9026 = arg0;
		Static558.anInt9099 = arg3;
		Static88.aClass306_1 = arg9;
		Static609.anInt9822 = arg5;
		Static8.aClass329_1 = null;
		Static208.anInt3519 = arg1;
		Static594.aClass361_11 = arg2;
		Static396.anInt6226 = arg8;
		Static369.anInt5833 = arg4;
		Static151.anInt2702 = arg6;
		Static283.aClass329_7 = null;
		Static166.aClass329_3 = null;
		Static78.anInt1411 = arg10;
		Static235.method3205();
		Static384.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIZI)V")
	public static void method5664(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static541.method7472();
		Static67.aLong44 = 0L;
		@Pc(10) int local10 = Static626.method8388();
		if (arg3 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static192.aClass95_4.method6993()) {
			arg0 = true;
		}
		Static539.method7448(local10, arg0, arg1, arg3, arg2);
	}
}
