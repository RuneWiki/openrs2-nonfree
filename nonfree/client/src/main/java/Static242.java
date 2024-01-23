import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public static int anInt4995;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!ak;")
	public static Class7 aClass7_199;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray23;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean388 = false;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public static int anInt4996 = 0;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
	public static int[] anIntArray583 = new int[256];

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)J")
	public static long method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2570; local13++) {
			@Pc(22) Class124 local22 = local7.aClass124Array2[local13];
			if ((local22.aLong114 >> 29 & 0x3L) == 2L && local22.anInt3416 == arg1 && local22.anInt3411 == arg2) {
				return local22.aLong114;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3843(@OriginalArg(0) int arg0) {
		return Static190.aStringArray19[arg0].length() <= 0 ? Static277.aStringArray35[arg0] : Static277.aStringArray35[arg0] + Static221.aString148 + Static190.aStringArray19[arg0];
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method3844() {
		Static45.aClass31_8.method855();
	}
}
