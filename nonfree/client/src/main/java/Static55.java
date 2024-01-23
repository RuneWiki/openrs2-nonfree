import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static55 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
	public static int anInt1397 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I")
	public static int method1069(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ek;Lclient!ek;B)V")
	public static void method1078(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		Static92.aClass2_Sub8_Sub5_2 = Static13.method234(arg0, arg1, Static84.anInt1972);
		if (Static116.aBoolean184) {
			Static206.aClass2_Sub8_Sub5_Sub1_1 = Static263.method4149(arg1, Static84.anInt1972, arg0);
		} else {
			Static206.aClass2_Sub8_Sub5_Sub1_1 = (Class2_Sub8_Sub5_Sub1) Static92.aClass2_Sub8_Sub5_2;
		}
		Static69.aClass2_Sub8_Sub5_4 = Static13.method234(arg0, arg1, Static36.anInt936);
		Static237.aClass2_Sub8_Sub5_5 = Static13.method234(arg0, arg1, Static106.anInt2446);
	}
}
