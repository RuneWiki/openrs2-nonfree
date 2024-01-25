import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ah;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "Lclient!uj;")
	public static Class254 aClass254_2;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int anInt2068;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
	public static void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub3 local13 = local7.aClass11_Sub3_1;
		@Pc(16) Class11_Sub3 local16 = local7.aClass11_Sub3_2;
		if (local13 != null) {
			local13.anInt6738 = local13.anInt6738 * arg3 / (0x10 << Static391.anInt6797 - 7);
			local13.anInt6739 = local13.anInt6739 * arg3 / (0x10 << Static391.anInt6797 - 7);
		}
		if (local16 != null) {
			local16.anInt6738 = local16.anInt6738 * arg3 / (0x10 << Static391.anInt6797 - 7);
			local16.anInt6739 = local16.anInt6739 * arg3 / (0x10 << Static391.anInt6797 - 7);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
	public static int method1832(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(43) int local43 = 0; local43 < local33; local43++) {
			@Pc(49) char local49 = arg1.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local26 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local49 >= '0' && local49 <= '9') {
				local87 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local87 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local87 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local87 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local87 = -local87;
			}
			@Pc(127) int local127 = local87 + arg0 * local30;
			if (local30 != local127 / arg0) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local127;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
