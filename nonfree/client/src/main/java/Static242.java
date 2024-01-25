import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public static final int anInt4142 = 1400;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_7 = new Class83(8, 0, 4, 1);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)Z")
	public static boolean method3278(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 16 || arg0 == 1008 || arg0 == 17 || arg0 == 22;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIZI)I")
	public static int method3279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static244.aClass165Array8 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(16) int local16 = arg0 >> 7;
			@Pc(20) int local20 = arg1 >> 7;
			if (arg4 < 0 || arg2 < 0 || arg4 > Static333.anInt3375 - 1 || Static102.anInt2086 - 1 < arg2) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && Static333.anInt3375 - 1 >= local16 && Static102.anInt2086 - 1 >= local20) {
				@Pc(82) boolean local82 = (Static347.aByteArrayArrayArray16[1][arg0 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(110) boolean local110;
				@Pc(129) boolean local129;
				if ((arg0 & 0x7F) == 0) {
					local110 = (Static347.aByteArrayArrayArray16[1][local16 - 1][arg1 >> 7] & 0x2) != 0;
					local129 = (Static347.aByteArrayArrayArray16[1][local16][arg1 >> 7] & 0x2) != 0;
					if (local110 != local129) {
						local82 = (Static347.aByteArrayArrayArray16[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local110 = (Static347.aByteArrayArrayArray16[1][arg0 >> 7][local20 - 1] & 0x2) != 0;
					local129 = (Static347.aByteArrayArrayArray16[1][arg0 >> 7][local20] & 0x2) != 0;
					if (local110 != local129) {
						local82 = (Static347.aByteArrayArrayArray16[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if (local82) {
					arg3++;
				}
				return Static244.aClass165Array8[arg3].a(arg0, arg1);
			} else {
				return 0;
			}
		} else {
			return Static244.aClass165Array8[arg3].a(arg0, arg1);
		}
	}
}
