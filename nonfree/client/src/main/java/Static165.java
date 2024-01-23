import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public static int anInt2958;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!ai;")
	public static Class7 aClass7_28;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "S")
	public static short aShort28 = 256;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1028 = Static200.method3116("Please remove ");

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1029 = Static200.method3116("Username: ");

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public static int anInt2955 = 0;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1030 = aClass60_1028;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1031 = aClass60_1029;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1032 = Static200.method3116("");

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1033 = aClass60_1028;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIII)I")
	public static int method2268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 >> 7;
		@Pc(16) int local16 = arg2 >> 7;
		if (local16 < 0 || local12 < 0 || local16 > 103 || local12 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg1;
		if (arg1 < 3 && (Static209.aByteArrayArrayArray13[1][local16][local12] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		@Pc(56) int local56 = arg0 & 0x7F;
		@Pc(60) int local60 = arg2 & 0x7F;
		@Pc(91) int local91 = Static138.anIntArrayArrayArray17[local33][local16 + 1][local12 + 1] * local60 + (128 - local60) * Static138.anIntArrayArrayArray17[local33][local16][local12 + 1] >> 7;
		@Pc(117) int local117 = Static138.anIntArrayArrayArray17[local33][local16][local12] * (128 - local60) + Static138.anIntArrayArrayArray17[local33][local16 + 1][local12] * local60 >> 7;
		return local56 * local91 + local117 * (128 - local56) >> 7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
	public static int method2271() {
		@Pc(14) int local14 = method2268(anInt2958, Static180.anInt3841, Static17.anInt438);
		return local14 - Static28.anInt2840 >= 800 || (Static209.aByteArrayArrayArray13[Static180.anInt3841][Static17.anInt438 >> 7][anInt2958 >> 7] & 0x4) == 0 ? 3 : Static180.anInt3841;
	}
}
