import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	public static int anInt4328;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_8 = new Class15(128);

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)I")
	public static int method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static307.aClass26Array3 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(21) int local21 = arg1 >> 7;
			@Pc(25) int local25 = arg4 >> 7;
			if (arg2 < 0 || arg0 < 0 || Static92.anInt2048 - 1 < arg2 || Static290.anInt5893 - 1 < arg0) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static92.anInt2048 - 1 < local21 || Static290.anInt5893 - 1 < local25) {
				return 0;
			}
			@Pc(92) boolean local92 = (Static348.aByteArrayArrayArray11[1][arg1 >> 7][arg4 >> 7] & 0x2) != 0;
			@Pc(114) boolean local114;
			@Pc(130) boolean local130;
			if ((arg1 & 0x7F) == 0) {
				local114 = (Static348.aByteArrayArrayArray11[1][local21 - 1][arg4 >> 7] & 0x2) != 0;
				local130 = (Static348.aByteArrayArrayArray11[1][local21][arg4 >> 7] & 0x2) != 0;
				if (local114 != local130) {
					local92 = (Static348.aByteArrayArrayArray11[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x7F) == 0) {
				local114 = (Static348.aByteArrayArrayArray11[1][arg1 >> 7][local25 - 1] & 0x2) != 0;
				local130 = (Static348.aByteArrayArrayArray11[1][arg1 >> 7][local25] & 0x2) != 0;
				if (local114 != local130) {
					local92 = (Static348.aByteArrayArrayArray11[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local92) {
				arg3++;
			}
		}
		return Static307.aClass26Array3[arg3].method4990(arg1, arg4);
	}
}
