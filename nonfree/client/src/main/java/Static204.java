import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "Lclient!dca;")
	public static Class76 aClass76_4;

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
	public static int anInt3328 = 0;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)I")
	public static int method2894(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static240.anInt10701;
		if (local5 == 0) {
			return arg0 ? 0 : Static368.anInt5900;
		} else if (local5 == 1) {
			return Static368.anInt5900;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)V")
	public static void method2897() {
		Static634.anInt9767 = Static175.aClass289_18.anInt7763 + Static175.aClass289_18.anInt7758 + 2;
		Static371.aStringArray22 = new String[500];
		Static195.anInt3173 = Static277.aClass289_8.anInt7763 + Static277.aClass289_8.anInt7758 + 2;
		for (@Pc(33) int local33 = 0; local33 < Static371.aStringArray22.length; local33++) {
			Static371.aStringArray22[local33] = "";
		}
		Static180.method5442(Static289.aClass191_1.method4067(Static414.anInt9485));
	}
}
