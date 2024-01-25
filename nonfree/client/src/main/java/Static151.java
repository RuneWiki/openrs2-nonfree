import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public static int anInt2683 = 100;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZII)Z")
	public static boolean method2221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V")
	public static void method2222(@OriginalArg(1) byte arg0) {
		if (Static393.aByteArrayArrayArray16 == null) {
			Static393.aByteArrayArrayArray16 = new byte[4][Static301.anInt4912][Static473.anInt7969];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static301.anInt4912; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static473.anInt7969; local22++) {
					Static393.aByteArrayArrayArray16[local14][local18][local22] = arg0;
				}
			}
		}
	}
}
