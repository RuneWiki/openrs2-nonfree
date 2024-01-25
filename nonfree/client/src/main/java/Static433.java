import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[5];

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Lclient!el;")
	public static final Class109 aClass109_158 = new Class109(101, 2);

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
	public static void method6419() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static261.aBooleanArray7[local7] = false;
		}
		Static594.anInt10008 = Static44.anInt740;
		Static342.anInt6068 = -1;
		Static490.anInt9714 = Static159.anInt2475;
		Static104.anInt1683 = Static132.anInt2186;
		Static241.anInt9882 = Static489.anInt8202;
		Static658.anInt10595 = -1;
		Static635.anInt10332 = 0;
		Static393.anInt7347 = 0;
		Static79.anInt1216 = 5;
		Static164.anInt2527 = Static649.anInt5976;
		Static272.anInt4763 = -1;
		Static651.anInt10529 = -1;
		Static378.anInt6475 = Static532.anInt9189;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
