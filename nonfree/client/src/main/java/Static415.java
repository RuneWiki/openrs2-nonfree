import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public static void method5563(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static139.method2522(16, arg0);
		local12.method1563();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)I")
	public static int method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static120.aClass64Array1 == null) {
			return 0;
		}
		if (arg0 < 3) {
			@Pc(16) int local16 = arg4 >> 7;
			@Pc(20) int local20 = arg3 >> 7;
			if (arg1 < 0 || arg2 < 0 || arg1 > Static399.anInt6923 - 1 || Static127.anInt2696 - 1 < arg2) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > Static399.anInt6923 - 1 || Static127.anInt2696 - 1 < local20) {
				return 0;
			}
			@Pc(81) boolean local81 = (Static325.aByteArrayArrayArray15[1][arg4 >> 7][arg3 >> 7] & 0x2) != 0;
			@Pc(106) boolean local106;
			@Pc(125) boolean local125;
			if ((arg4 & 0x7F) == 0) {
				local106 = (Static325.aByteArrayArrayArray15[1][local16 - 1][arg3 >> 7] & 0x2) != 0;
				local125 = (Static325.aByteArrayArrayArray15[1][local16][arg3 >> 7] & 0x2) != 0;
				if (local125 != local106) {
					local81 = (Static325.aByteArrayArrayArray15[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x7F) == 0) {
				local106 = (Static325.aByteArrayArrayArray15[1][arg4 >> 7][local20 - 1] & 0x2) != 0;
				local125 = (Static325.aByteArrayArrayArray15[1][arg4 >> 7][local20] & 0x2) != 0;
				if (local125 != local106) {
					local81 = (Static325.aByteArrayArrayArray15[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if (local81) {
				arg0++;
			}
		}
		return Static120.aClass64Array1[arg0].va(arg4, arg3);
	}
}
