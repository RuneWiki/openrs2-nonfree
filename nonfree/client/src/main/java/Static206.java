import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	public static int anInt4170;

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "J")
	public static long aLong118;

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
	public static int anInt4180;

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "I")
	public static int anInt4182;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Lclient!gw;")
	public static final Class123 aClass123_7 = new Class123();

	@OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
	public static int anInt4178 = 16777215;

	@OriginalMember(owner = "client!ht", name = "L", descriptor = "J")
	public static volatile long aLong119 = 0L;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
	public static void method3700(@OriginalArg(0) int arg0) {
		if (arg0 == Static164.anInt3289) {
			return;
		}
		Static400.anInt6818 = Static271.anInt5050 = Static518.anIntArray628[arg0];
		Static425.method6060();
		Static162.anIntArrayArray26 = new int[Static400.anInt6818][Static271.anInt5050];
		Static316.anIntArrayArray70 = new int[Static400.anInt6818][Static271.anInt5050];
		Static73.anIntArrayArrayArray3 = new int[4][Static400.anInt6818 >> 3][Static271.anInt5050 >> 3];
		for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
			Static221.aClass95Array2[local43] = Static352.method4081(Static400.anInt6818, Static271.anInt5050);
		}
		Static55.aByteArrayArrayArray2 = new byte[4][Static400.anInt6818][Static271.anInt5050];
		Static355.method5323(Static400.anInt6818, Static271.anInt5050);
		Static453.method6304(Static271.anInt5050 >> 3, Static4.aClass43_1, Static400.anInt6818 >> 3);
		Static164.anInt3289 = arg0;
	}
}
