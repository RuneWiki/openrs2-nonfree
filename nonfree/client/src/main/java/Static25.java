import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "D")
	public static double aDouble2;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public static int anInt344;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
	public static final int[] anIntArray18 = new int[14];

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_7 = new Class305(79, 3);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)I")
	public static int method309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static495.aClass109Array4 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(25) int local25 = arg2 >> 9;
			@Pc(29) int local29 = arg4 >> 9;
			if (arg1 < 0 || arg3 < 0 || Static201.anInt3834 - 1 < arg1 || arg3 > Static626.anInt10238 - 1) {
				return 0;
			} else if (local25 >= 1 && local29 >= 1 && local25 <= Static201.anInt3834 - 1 && local29 <= Static626.anInt10238 - 1) {
				@Pc(101) boolean local101 = (Static7.aByteArrayArrayArray1[1][arg2 >> 9][arg4 >> 9] & 0x2) != 0;
				@Pc(126) boolean local126;
				@Pc(142) boolean local142;
				if ((arg2 & 0x1FF) == 0) {
					local126 = (Static7.aByteArrayArrayArray1[1][local25 - 1][arg4 >> 9] & 0x2) != 0;
					local142 = (Static7.aByteArrayArrayArray1[1][local25][arg4 >> 9] & 0x2) != 0;
					if (local142 != local126) {
						local101 = (Static7.aByteArrayArrayArray1[1][arg1][arg3] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x1FF) == 0) {
					local126 = (Static7.aByteArrayArrayArray1[1][arg2 >> 9][local29 - 1] & 0x2) != 0;
					local142 = (Static7.aByteArrayArrayArray1[1][arg2 >> 9][local29] & 0x2) != 0;
					if (local142 != local126) {
						local101 = (Static7.aByteArrayArrayArray1[1][arg1][arg3] & 0x2) != 0;
					}
				}
				if (local101) {
					arg0++;
				}
				return Static495.aClass109Array4[arg0].method7702(arg2, arg4);
			} else {
				return 0;
			}
		} else {
			return Static495.aClass109Array4[arg0].method7702(arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
	public static void method310(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub40 local16 = (Class5_Sub40) Static133.aClass300_10.method7188((long) arg0);
		if (local16 != null) {
			local16.aBoolean562 = !local16.aBoolean562;
			local16.aClass140_Sub1_1.method7262(local16.aBoolean562);
		}
	}
}
