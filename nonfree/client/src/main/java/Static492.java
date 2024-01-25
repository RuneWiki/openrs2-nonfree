import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_131 = new Class349(24, 8);

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
	public static final int[] anIntArray520 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "[I")
	public static final int[] anIntArray521 = new int[1];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIII)I")
	public static int method6297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static114.aClass151Array1 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(14) int local14 = arg2 >> 9;
			@Pc(18) int local18 = arg1 >> 9;
			if (arg4 < 0 || arg0 < 0 || arg4 > Static281.anInt4822 - 1 || arg0 > Static29.anInt491 - 1) {
				return 0;
			}
			if (local14 < 1 || local18 < 1 || Static281.anInt4822 - 1 < local14 || Static29.anInt491 - 1 < local18) {
				return 0;
			}
			@Pc(85) boolean local85 = (Static433.aByteArrayArrayArray15[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(107) boolean local107;
			@Pc(126) boolean local126;
			if ((arg2 & 0x1FF) == 0) {
				local107 = (Static433.aByteArrayArrayArray15[1][local14 - 1][arg1 >> 9] & 0x2) != 0;
				local126 = (Static433.aByteArrayArrayArray15[1][local14][arg1 >> 9] & 0x2) != 0;
				if (local107 != local126) {
					local85 = (Static433.aByteArrayArrayArray15[1][arg4][arg0] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local107 = (Static433.aByteArrayArrayArray15[1][arg2 >> 9][local18 - 1] & 0x2) != 0;
				local126 = (Static433.aByteArrayArrayArray15[1][arg2 >> 9][local18] & 0x2) != 0;
				if (local107 != local126) {
					local85 = (Static433.aByteArrayArrayArray15[1][arg4][arg0] & 0x2) != 0;
				}
			}
			if (local85) {
				arg3++;
			}
		}
		return Static114.aClass151Array1[arg3].method7680(arg2, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I")
	public static int method6299() {
		@Pc(12) int local12 = Static394.aClass261_1.method5483();
		if (local12 < Static432.aClass261Array1.length - 1) {
			Static394.aClass261_1 = Static432.aClass261Array1[local12 + 1];
		}
		return 100;
	}
}
