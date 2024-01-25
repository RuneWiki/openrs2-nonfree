import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!iu;")
	public static Class150 aClass150_190;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt7815;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "F")
	public static float aFloat326;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "[Lclient!tv;")
	public static Class15_Sub2[] aClass15_Sub2Array3;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "[B")
	public static final byte[] aByteArray111 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method6330() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static494.aBooleanArray35[local11] = false;
		}
		Static466.anInt7999 = -1;
		Static93.anInt2151 = -1;
		Static166.anInt3343 = 1;
		Static107.anInt2340 = 0;
		Static73.anInt1454 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIFFLclient!vo;IFII[BFF)V")
	public static void method6331(@OriginalArg(4) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) Class304 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float arg4, @OriginalArg(10) int arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg5;
			arg2.method7266(arg0 / (float) 128, arg1 / (float) 16, 0, arg3, arg4 / (float) 128, local12, arg8 * 127.0F);
			arg4 *= 2.0F;
			arg1 *= 2.0F;
			arg0 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg6[local18] = (byte) ((float) arg6[local18] + local12[local56]);
				local18++;
			}
			arg8 *= arg7;
		}
		local18 = arg5;
		for (local56 = 0; local56 < 16384; local56++) {
			arg6[local18] = (byte) (arg6[local18] + 127);
			local18++;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)I")
	public static int method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(18) int local18 = local7 < 8 ? arg0 : arg2;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg3) : arg2;
		return ((local7 & 0x2) == 0 ? local33 : -local33) + ((local7 & 0x1) == 0 ? local18 : -local18);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public static boolean method6334(@OriginalArg(1) int arg0) {
		if (arg0 == 47 || arg0 == 49 || arg0 == 4 || arg0 == 17 || arg0 == 60) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 1012;
		}
	}
}
