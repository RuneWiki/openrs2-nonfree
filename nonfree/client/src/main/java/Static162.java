import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "[S")
	public static short[] aShortArray57;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
	public static int anInt3661 = 0;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "[I")
	public static final int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([ILclient!ur;B[I[I)V")
	public static void method3123(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) int local18 = arg2[local12];
			@Pc(22) int local22 = arg0[local12];
			@Pc(26) int local26 = arg3[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg1.aClass186Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass186Array3[local28] = null;
					} else {
						@Pc(48) Class116 local48 = Static340.method5560(local18);
						@Pc(51) int local51 = local48.anInt3739;
						@Pc(56) Class186 local56 = arg1.aClass186Array3[local28];
						if (local56 != null) {
							if (local18 == local56.anInt5820) {
								if (local51 == 0) {
									local56 = arg1.aClass186Array3[local28] = null;
								} else if (local51 == 1) {
									local56.anInt5815 = 0;
									local56.anInt5816 = local26;
									local56.anInt5819 = 0;
									local56.anInt5825 = 0;
									local56.anInt5818 = 1;
									Static291.method4975(false, local48, 0, arg1.anInt6465, arg1.anInt6466);
								} else if (local51 == 2) {
									local56.anInt5815 = 0;
								}
							} else if (local48.anInt3749 >= Static340.method5560(local56.anInt5820).anInt3749) {
								local56 = arg1.aClass186Array3[local28] = null;
							}
						}
						if (local56 == null) {
							local56 = arg1.aClass186Array3[local28] = new Class186();
							local56.anInt5819 = 0;
							local56.anInt5818 = 1;
							local56.anInt5825 = 0;
							local56.anInt5820 = local18;
							local56.anInt5815 = 0;
							local56.anInt5816 = local26;
							Static291.method4975(false, local48, 0, arg1.anInt6465, arg1.anInt6466);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}
}
