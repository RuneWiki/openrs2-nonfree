import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!lia;Lclient!rv;B)Lclient!af;")
	public static Class9 method5852(@OriginalArg(0) Class219 arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		@Pc(8) Class9 local8 = new Class9(arg0);
		@Pc(12) int local12 = arg1.method3642();
		@Pc(23) boolean local23 = (local12 & 0x1) != 0;
		@Pc(34) boolean local34 = (local12 & 0x2) != 0;
		@Pc(45) boolean local45 = (local12 & 0x4) != 0;
		@Pc(61) boolean local61 = (local12 & 0x8) != 0;
		if (local23) {
			local8.anIntArray22[0] = arg1.method3698();
			local8.anIntArray20[0] = arg1.method3698();
			if (arg0.anInt6119 != -1 || arg0.anInt6122 != -1) {
				local8.anIntArray22[1] = arg1.method3698();
				local8.anIntArray20[1] = arg1.method3698();
			}
			if (arg0.anInt6153 != -1 || arg0.anInt6169 != -1) {
				local8.anIntArray22[2] = arg1.method3698();
				local8.anIntArray20[2] = arg1.method3698();
			}
		}
		if (local34) {
			local8.anIntArray21[0] = arg1.method3698();
			local8.anIntArray18[0] = arg1.method3698();
			if (arg0.anInt6154 != -1 || arg0.anInt6135 != -1) {
				local8.anIntArray21[1] = arg1.method3698();
				local8.anIntArray18[1] = arg1.method3698();
			}
		}
		@Pc(169) int local169;
		@Pc(172) int[] local172;
		@Pc(204) int local204;
		if (local45) {
			local169 = arg1.method3698();
			local172 = new int[] { local169 & 0xF, local169 >> 4 & 0xF, local169 >> 8 & 0xF, local169 >> 12 & 0xF };
			for (local204 = 0; local204 < 4; local204++) {
				if (local172[local204] != 15) {
					local8.aShortArray2[local172[local204]] = (short) arg1.method3698();
				}
			}
		}
		if (local61) {
			local169 = arg1.method3642();
			local172 = new int[] { local169 & 0xF, local169 >> 4 & 0xF };
			for (local204 = 0; local204 < 2; local204++) {
				if (local172[local204] != 15) {
					local8.aShortArray1[local172[local204]] = (short) arg1.method3698();
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method5855(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(9, (long) arg0);
		local9.method2440();
	}
}
