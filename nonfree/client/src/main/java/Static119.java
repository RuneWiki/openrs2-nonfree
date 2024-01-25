import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[Lclient!cka;")
	public static Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public static int anInt2286 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)I")
	public static int method2179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static555.aClass96Array3 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(21) int local21 = arg0 >> 9;
			@Pc(25) int local25 = arg2 >> 9;
			if (arg4 < 0 || arg1 < 0 || arg4 > Static29.anInt380 - 1 || Static327.anInt5650 - 1 < arg1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static29.anInt380 - 1 >= local21 && local25 <= Static327.anInt5650 - 1) {
				@Pc(108) boolean local108 = (Static272.aByteArrayArrayArray2[1][arg0 >> 9][arg2 >> 9] & 0x2) != 0;
				@Pc(133) boolean local133;
				@Pc(150) boolean local150;
				if ((arg0 & 0x1FF) == 0) {
					local133 = (Static272.aByteArrayArrayArray2[1][local21 - 1][arg2 >> 9] & 0x2) != 0;
					local150 = (Static272.aByteArrayArrayArray2[1][local21][arg2 >> 9] & 0x2) != 0;
					if (local150 != local133) {
						local108 = (Static272.aByteArrayArrayArray2[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x1FF) == 0) {
					local133 = (Static272.aByteArrayArrayArray2[1][arg0 >> 9][local25 - 1] & 0x2) != 0;
					local150 = (Static272.aByteArrayArrayArray2[1][arg0 >> 9][local25] & 0x2) != 0;
					if (local133 != local150) {
						local108 = (Static272.aByteArrayArrayArray2[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local108) {
					arg3++;
				}
				return Static555.aClass96Array3[arg3].method8077(arg0, arg2);
			} else {
				return 0;
			}
		} else {
			return Static555.aClass96Array3[arg3].method8077(arg0, arg2);
		}
	}
}
