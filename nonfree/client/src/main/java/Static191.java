import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "[I")
	public static final int[] anIntArray489 = new int[25];

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_164 = new Class150(89, 3);

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "[I")
	public static int[] anIntArray490 = new int[1];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)V")
	public static void method5463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = Static312.aClass256_7.method6113(Static400.aClass40_112.method1063(Static194.anInt3737));
		@Pc(29) int local29;
		for (@Pc(23) Class5_Sub47 local23 = (Class5_Sub47) Static521.aClass99_78.method2526(); local23 != null; local23 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			local29 = Static201.method3300(local23);
			if (local29 > local18) {
				local18 = local29;
			}
		}
		local18 += 8;
		local29 = Static257.anInt5147 * 16 + 21;
		@Pc(55) int local55 = arg1 - local18 / 2;
		if (local55 + local18 > Static383.anInt6994) {
			local55 = Static383.anInt6994 - local18;
		}
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(78) int local78 = arg0;
		if (Static456.anInt7874 < arg0 + local29) {
			local78 = Static456.anInt7874 - local29;
		}
		Static159.anInt3261 = local55;
		if (local78 < 0) {
			local78 = 0;
		}
		Static221.anInt4157 = Static257.anInt5147 * 16 + (Static8.aBoolean8 ? 26 : 22);
		Static218.aBoolean250 = true;
		Static122.anInt2575 = local78;
		Static142.anInt2984 = local18;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(IIIB)I")
	public static int method5464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static248.aClass131Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static460.anInt7894 - 1 < local11 || Static235.anInt4493 - 1 < local15) {
			return 0;
		}
		@Pc(44) int local44 = arg2;
		if (arg2 < 3 && (Static429.aByteArrayArrayArray17[1][local11][local15] & 0x2) != 0) {
			local44 = arg2 + 1;
		}
		return Static248.aClass131Array4[local44].aa(arg0, arg1);
	}
}
