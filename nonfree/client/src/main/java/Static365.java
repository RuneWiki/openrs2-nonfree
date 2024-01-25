import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_216 = new Class123(4, -2);

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	public static int anInt6426 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)[B")
	public static byte[] method5190(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub7_Sub17 local17 = (Class3_Sub7_Sub17) Static106.aClass321_1.method7220((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static120.method2330(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class3_Sub7_Sub17(local22);
			Static106.aClass321_1.method7223((long) arg0, local17);
		}
		return local17.aByteArray189;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZIII)I")
	public static int method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static256.aClass127Array3 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(21) int local21 = arg3 >> 9;
			@Pc(25) int local25 = arg0 >> 9;
			if (arg2 < 0 || arg1 < 0 || arg2 > Static345.anInt6228 - 1 || Static535.anInt9341 - 1 < arg1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static345.anInt6228 - 1 < local21 || Static535.anInt9341 - 1 < local25) {
				return 0;
			}
			@Pc(86) boolean local86 = (Static428.aByteArrayArrayArray4[1][arg3 >> 9][arg0 >> 9] & 0x2) != 0;
			@Pc(111) boolean local111;
			@Pc(127) boolean local127;
			if ((arg3 & 0x1FF) == 0) {
				local111 = (Static428.aByteArrayArrayArray4[1][local21 - 1][arg0 >> 9] & 0x2) != 0;
				local127 = (Static428.aByteArrayArrayArray4[1][local21][arg0 >> 9] & 0x2) != 0;
				if (local127 != local111) {
					local86 = (Static428.aByteArrayArrayArray4[1][arg2][arg1] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x1FF) == 0) {
				local111 = (Static428.aByteArrayArrayArray4[1][arg3 >> 9][local25 - 1] & 0x2) != 0;
				local127 = (Static428.aByteArrayArrayArray4[1][arg3 >> 9][local25] & 0x2) != 0;
				if (local111 != local127) {
					local86 = (Static428.aByteArrayArrayArray4[1][arg2][arg1] & 0x2) != 0;
				}
			}
			if (local86) {
				arg4++;
			}
		}
		return Static256.aClass127Array3[arg4].method7860(arg0, arg3);
	}
}
