import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Z")
	public static boolean aBoolean456;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray140 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
	public static int anInt6275 = -1;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([[BBLclient!uk;)V")
	public static void method5319(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		@Pc(16) int local16 = Static551.aByteArrayArray22.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static403.anIntArray428[local18] >> 8) * 64 - Static335.anInt5608;
				@Pc(48) int local48 = (Static403.anIntArray428[local18] & 0xFF) * 64 - Static246.anInt4344;
				Static236.method3658();
				arg1.method7124(Static460.aClass169Array3, Static505.aClass45_11, local48, local24, local37);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg1; local15 <= arg3; local15++) {
			for (@Pc(19) int local19 = arg2; local19 <= arg0; local19++) {
				if (arg4 == Static189.anIntArrayArray80[local15][local19] && Static172.anIntArrayArray202[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)Z")
	public static boolean method5322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static352.method5160(arg0, arg1) & Static120.method2484(arg1, arg0);
	}
}
