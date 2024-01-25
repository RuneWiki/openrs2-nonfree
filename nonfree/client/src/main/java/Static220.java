import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method3262() {
		Static669.aClass6_38 = null;
		Static161.aClass6_15 = null;
		Static212.aClass6_13 = null;
		Static333.aClass6_17 = null;
		Static50.aClass6_3 = null;
		Static534.aClass6_34 = null;
		Static6.aClass6_1 = null;
		Static197.aClass6_12 = null;
		Static470.aClass6Array11 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILclient!cm;)V")
	public static void method3263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34_Sub1_Sub1_Sub2_Sub1 arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static681.method4032(local10, 0, local10.length, arg0);
		Static503.method6584(arg2, local10, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	public static void method3264(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		Static330.aString71 = arg0;
		Static525.aString100 = arg1;
		Static50.aBoolean72 = arg2;
		if (!Static50.aBoolean72 && (Static525.aString100.equals("") || Static330.aString71.equals(""))) {
			Static302.method4386(3);
			return;
		}
		if (Static367.anInt10954 != 1) {
			Static285.anInt4838 = 0;
			Static237.anInt4212 = -1;
		}
		Static231.aBoolean352 = false;
		Static302.method4386(-3);
		Static16.anInt10137 = 0;
		Static474.anInt7575 = 1;
		Static264.anInt4602 = 0;
	}
}
