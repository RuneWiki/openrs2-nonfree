import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!mo;")
	public static Class143 aClass143_15;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!al;")
	public static final Class11 aClass11_13 = new Class11(500);

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public static int anInt394 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIZB)Lclient!mo;")
	public static Class143 method450(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class199 local10 = null;
		if (Static307.aClass107_3 != null) {
			local10 = new Class199(arg1, Static307.aClass107_3, Static316.aClass107Array2[arg1], 1000000);
		}
		Static329.aClass121_Sub1Array2[arg1] = Static243.aClass61_1.method2082(Static47.aClass199_1, arg1, local10);
		if (arg0) {
			Static329.aClass121_Sub1Array2[arg1].method3329();
		}
		return new Class143(Static329.aClass121_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		@Pc(11) Class1_Sub4 local11 = new Class1_Sub4();
		local11.anInt1454 = arg1;
		local11.anInt1451 = arg0;
		local11.aString58 = arg5;
		local11.anInt1448 = arg4 + Static153.anInt3257;
		local11.anInt1449 = arg3;
		local11.anInt1447 = arg2;
		Static242.aClass126_5.method3401(local11);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method458(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static258.method4433(Static30.method749(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
