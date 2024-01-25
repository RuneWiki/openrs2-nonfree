import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array17;

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
	public static int anInt7309;

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!mc;I)V")
	public static void method6126(@OriginalArg(0) int arg0, @OriginalArg(1) Class216 arg1) {
		if (Static210.aBoolean328) {
			arg0 = 0;
			Static210.aBoolean328 = false;
		}
		if (Static539.aClass216_2 != null && Static539.aClass216_2.method5008(arg1)) {
			return;
		}
		Static539.aClass216_2 = arg1;
		Static415.aLong200 = Static548.method7437();
		Static348.anInt6257 = arg0;
		Static547.anInt7003 = arg0;
		if (Static547.anInt7003 == 0) {
			Static508.method7047();
			return;
		}
		Static290.aClass37_4 = Static101.aClass37_2;
		Static122.anInt2380 = Static428.anInt7334;
		Static188.aFloat124 = Static121.aFloat64;
		Static223.anInt4186 = Static534.anInt8750;
		Static84.aFloat50 = Static97.aFloat54;
		Static469.aFloat251 = Static289.aFloat145;
		Static427.aFloat208 = Static45.aFloat24;
		Static4.aFloat263 = Static205.aFloat126;
		Static327.anInt6049 = Static293.anInt5314;
		Static40.aFloat21 = Static92.aFloat53;
	}
}
