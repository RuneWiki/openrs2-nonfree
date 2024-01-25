import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
	public static int anInt2548;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
	public static final int[] anIntArray198 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "[I")
	public static final int[] anIntArray199 = new int[13];

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "Lclient!mq;")
	public static final Class163 aClass163_3 = new Class163();

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)I")
	public static int method2073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static452.aClass139Array3 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(16) int local16 = arg0 >> 7;
			@Pc(20) int local20 = arg4 >> 7;
			if (arg3 < 0 || arg2 < 0 || Static147.anInt2300 - 1 < arg3 || Static293.anInt4886 - 1 < arg2) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > Static147.anInt2300 - 1 || Static293.anInt4886 - 1 < local20) {
				return 0;
			}
			@Pc(90) boolean local90 = (Static278.aByteArrayArrayArray16[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
			@Pc(115) boolean local115;
			@Pc(131) boolean local131;
			if ((arg0 & 0x7F) == 0) {
				local115 = (Static278.aByteArrayArrayArray16[1][local16 - 1][arg4 >> 7] & 0x2) != 0;
				local131 = (Static278.aByteArrayArrayArray16[1][local16][arg4 >> 7] & 0x2) != 0;
				if (local115 != local131) {
					local90 = (Static278.aByteArrayArrayArray16[1][arg3][arg2] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x7F) == 0) {
				local115 = (Static278.aByteArrayArrayArray16[1][arg0 >> 7][local20 - 1] & 0x2) != 0;
				local131 = (Static278.aByteArrayArrayArray16[1][arg0 >> 7][local20] & 0x2) != 0;
				if (local131 != local115) {
					local90 = (Static278.aByteArrayArrayArray16[1][arg3][arg2] & 0x2) != 0;
				}
			}
			if (local90) {
				arg1++;
			}
		}
		return Static452.aClass139Array3[arg1].ca(arg0, arg4);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method2075(@OriginalArg(0) Class117 arg0) {
		if (Static170.aBoolean282) {
			Static81.method991(arg0);
		} else {
			Static326.method4280(arg0);
		}
	}
}
