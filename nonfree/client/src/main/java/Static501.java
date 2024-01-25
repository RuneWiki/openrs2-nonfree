import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "B")
	public static byte aByte115 = -6;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)Z")
	public static boolean method7146(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7147(@OriginalArg(1) Class13 arg0) {
		if (Static276.anInt4810 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 && (Static15.aClass164ArrayArrayArray5 != null && Static127.method2389(arg0, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174))) {
			Static276.anInt4810 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174;
		}
	}
}
