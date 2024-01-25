import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
	public static int anInt3337;

	@OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
	public static int anInt3338;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "[I")
	public static final int[] anIntArray299 = new int[13];

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)I")
	public static int method2906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub41 local15 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray537.length) {
			return local15.anIntArray537[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZZ)V")
	public static void method2907(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static68.aByteArrayArray3;
			local11 = 1;
		} else {
			local9 = Static118.aByteArrayArray8;
			local11 = 4;
		}
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			Static294.method3383();
			for (@Pc(25) int local25 = 0; local25 < Static92.anInt2048 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static290.anInt5893 >> 3; local29++) {
					@Pc(39) int local39 = Static254.anIntArrayArrayArray16[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg0 || local48 == 0) {
							@Pc(61) int local61 = local39 >> 1 & 0x3;
							@Pc(67) int local67 = local39 >> 14 & 0x3FF;
							@Pc(73) int local73 = local39 >> 3 & 0x7FF;
							@Pc(83) int local83 = (local67 / 8 << 8) + local73 / 8;
							for (@Pc(85) int local85 = 0; local85 < Static313.anIntArray505.length; local85++) {
								if (local83 == Static313.anIntArray505[local85] && local9[local85] != null) {
									Static251.method4338((local67 & 0x7) * 8, local19, arg0, local9[local85], local48, (local73 & 0x7) * 8, Static164.aClass92_7, local25 * 8, Static345.aClass174Array1, local61, local29 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
