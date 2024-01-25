import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public static int anInt10343 = 1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method9063(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(54) int local54 = 2;
			for (@Pc(58) int local58 = arg1 / 10; local58 != 0; local58 /= 10) {
				local54++;
			}
			@Pc(72) char[] local72 = new char[local54];
			local72[0] = '+';
			for (@Pc(80) int local80 = local54 - 1; local80 > 0; local80--) {
				@Pc(86) int local86 = arg1;
				arg1 /= 10;
				@Pc(97) int local97 = local86 - arg1 * 10;
				if (local97 >= 10) {
					local72[local80] = (char) (local97 + 87);
				} else {
					local72[local80] = (char) (local97 + 48);
				}
			}
			return new String(local72);
		} else {
			return Integer.toString(arg1, 10);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)I")
	public static int method9064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static158.aClass133Array4 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(28) int local28 = arg4 >> 9;
			@Pc(32) int local32 = arg0 >> 9;
			if (arg1 < 0 || arg2 < 0 || arg1 > Static426.anInt6942 - 1 || arg2 > Static280.anInt6752 - 1) {
				return 0;
			}
			if (local28 < 1 || local32 < 1 || local28 > Static426.anInt6942 - 1 || Static280.anInt6752 - 1 < local32) {
				return 0;
			}
			@Pc(109) boolean local109 = (Static392.aByteArrayArrayArray16[1][arg4 >> 9][arg0 >> 9] & 0x2) != 0;
			@Pc(137) boolean local137;
			@Pc(157) boolean local157;
			if ((arg4 & 0x1FF) == 0) {
				local137 = (Static392.aByteArrayArrayArray16[1][local28 - 1][arg0 >> 9] & 0x2) != 0;
				local157 = (Static392.aByteArrayArrayArray16[1][local28][arg0 >> 9] & 0x2) != 0;
				if (local157 != local137) {
					local109 = (Static392.aByteArrayArrayArray16[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x1FF) == 0) {
				local137 = (Static392.aByteArrayArrayArray16[1][arg4 >> 9][local32 - 1] & 0x2) != 0;
				local157 = (Static392.aByteArrayArrayArray16[1][arg4 >> 9][local32] & 0x2) != 0;
				if (local137 != local157) {
					local109 = (Static392.aByteArrayArrayArray16[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if (local109) {
				arg3++;
			}
		}
		return Static158.aClass133Array4[arg3].method8214(arg4, arg0);
	}
}
