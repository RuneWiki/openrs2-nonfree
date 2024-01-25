import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	public static int anInt10720;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!uh;")
	public static Class341 aClass341_69;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	public static boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
	public static int anInt10717 = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!at;")
	public static Class24 aClass24_17 = null;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public static void method8945() {
		Static548.anInt9815 = 0;
		@Pc(13) int local13 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9) + Static84.anInt2565;
		@Pc(20) int local20 = Static32.anInt723 + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static548.anInt9815 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static548.anInt9815 = 1;
		}
		if (Static548.anInt9815 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static548.anInt9815 = 0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V")
	public static void method8946(@OriginalArg(0) boolean arg0) {
		Static293.method5263();
		if (!Static104.method2676(Static529.anInt9623)) {
			return;
		}
		Static201.anInt4634++;
		if (Static201.anInt4634 < 50 && !arg0) {
			return;
		}
		Static201.anInt4634 = 0;
		if (!Static356.aBoolean506 && Static272.aClass116_1 != null) {
			@Pc(39) Class2_Sub52 local39 = Static130.method3019(Static392.aClass94_78, Static361.aClass183_1);
			Static96.method2563(local39);
			try {
				Static547.method8179();
			} catch (@Pc(46) IOException local46) {
				Static356.aBoolean506 = true;
			}
		}
		Static293.method5263();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!vq;)I")
	public static int method8947(@OriginalArg(1) Class2_Sub6_Sub21 arg0) {
		@Pc(14) String local14 = Static245.method4530(arg0);
		return Static161.aClass239_14.method6485(local14, Static117.aClass46Array5);
	}
}
