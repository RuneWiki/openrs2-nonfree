import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
	public static int[] anIntArray771;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!gf;")
	public static Class40 aClass40_3;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1 aClass2_Sub3_Sub8_Sub1_1;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt4769 = 0;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
	public static int[] anIntArray772 = new int[25];

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[I")
	public static int[] anIntArray773 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZI)I")
	public static int method3825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class77.anIntArray632[arg3 * 1024 / arg2] >> 1;
		return (arg0 * (65536 - local21) >> 16) + (arg1 * local21 >> 16);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
	public static int method3826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static133.aByteArrayArrayArray10[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static133.aByteArrayArrayArray10[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!oe;)I")
	public static int method3827(@OriginalArg(1) Class72 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method3175(Static186.anInt4341)) {
			local1++;
		}
		if (arg0.method3175(Static89.anInt2000)) {
			local1++;
		}
		return local1;
	}
}
