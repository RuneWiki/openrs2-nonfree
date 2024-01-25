import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	public static final int anInt10648 = 13156520;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "S")
	public static short aShort119 = 256;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)I")
	public static int method9048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static477.aClass259Array3 == null) {
			return 0;
		}
		if (arg0 < 3) {
			@Pc(28) int local28 = arg3 >> 9;
			@Pc(32) int local32 = arg4 >> 9;
			if (arg1 < 0 || arg2 < 0 || Static497.anInt7926 - 1 < arg1 || Static646.anInt9979 - 1 < arg2) {
				return 0;
			}
			if (local28 < 1 || local32 < 1 || local28 > Static497.anInt7926 - 1 || Static646.anInt9979 - 1 < local32) {
				return 0;
			}
			@Pc(114) boolean local114 = (Static510.aByteArrayArrayArray11[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
			@Pc(142) boolean local142;
			@Pc(159) boolean local159;
			if ((arg3 & 0x1FF) == 0) {
				local142 = (Static510.aByteArrayArrayArray11[1][local28 - 1][arg4 >> 9] & 0x2) != 0;
				local159 = (Static510.aByteArrayArrayArray11[1][local28][arg4 >> 9] & 0x2) != 0;
				if (local142 != local159) {
					local114 = (Static510.aByteArrayArrayArray11[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x1FF) == 0) {
				local142 = (Static510.aByteArrayArrayArray11[1][arg3 >> 9][local32 - 1] & 0x2) != 0;
				local159 = (Static510.aByteArrayArrayArray11[1][arg3 >> 9][local32] & 0x2) != 0;
				if (local142 != local159) {
					local114 = (Static510.aByteArrayArrayArray11[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if (local114) {
				arg0++;
			}
		}
		return Static477.aClass259Array3[arg0].method9294(arg4, arg3);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I")
	public static int method9049() {
		@Pc(38) byte local38;
		if (Static7.anInt229 >= 96) {
			@Pc(19) int local19 = Static270.method3826();
			if (local19 <= 100) {
				Static542.method7186();
				local38 = 4;
			} else if (local19 <= 500) {
				local38 = 3;
				Static71.method1572();
			} else if (local19 <= 1000) {
				local38 = 2;
				Static719.method6597();
			} else {
				Static274.method3861();
				local38 = 1;
			}
		} else {
			Static274.method3861();
			local38 = 1;
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 0) {
			Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
			Static36.method1127(false, 0);
		}
		Static124.method2284();
		return local38;
	}
}
