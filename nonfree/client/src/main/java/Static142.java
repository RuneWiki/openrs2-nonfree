import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
	public static final int anInt2557 = 4;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	public static void method2184() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static408.aBooleanArray26[local7] = false;
		}
		Static275.anInt4601 = Static410.anInt6946;
		Static464.anInt7828 = -1;
		Static46.anInt820 = Static266.anInt4433;
		Static416.anInt6989 = 0;
		Static27.anInt490 = 5;
		Static243.anInt7142 = -1;
		Static330.anInt5523 = 0;
		Static455.anInt7684 = Static419.anInt7092;
		Static457.anInt7713 = Static172.anInt3107;
		Static124.anInt2277 = Static372.anInt6317;
		Static154.anInt2804 = Static152.anInt7561;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)Z")
	public static boolean method2185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static67.method1249(arg1, arg0) | (arg0 & 0x800) != 0 || Static5.method68(arg1, arg0);
	}
}
