import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "Lclient!pe;")
	public static Class254 aClass254_68;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "J")
	public static long aLong118 = 20000000L;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIFIZ[FIII)V")
	public static void method3405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg4;
		@Pc(13) int local13 = arg1 - arg8;
		@Pc(17) int local17 = arg6 - arg2;
		@Pc(52) float local52 = (float) local13 * arg5[2] + arg5[1] * (float) local5 + (float) local17 * arg5[0];
		@Pc(73) float local73 = arg5[3] * (float) local17 + (float) local5 * arg5[4] + arg5[5] * (float) local13;
		@Pc(94) float local94 = (float) local13 * arg5[8] + arg5[7] * (float) local5 + arg5[6] * (float) local17;
		@Pc(109) float local109 = (float) Math.sqrt((double) (local94 * local94 + local73 * local73 + local52 * local52));
		@Pc(120) float local120 = (float) Math.atan2((double) local52, (double) local94) / 6.2831855F + 0.5F;
		@Pc(133) float local133 = arg3 + (float) Math.asin((double) (local73 / local109)) / 3.1415927F + 0.5F;
		@Pc(138) float local138;
		if (arg7 == 1) {
			local138 = local120;
			local120 = -local133;
			local133 = local138;
		} else if (arg7 == 2) {
			local133 = -local133;
			local120 = -local120;
		} else if (arg7 == 3) {
			local138 = local120;
			local120 = local133;
			local133 = -local138;
		}
		Static204.aFloat59 = local133;
		Static509.aFloat185 = local120;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)I")
	public static int method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static224.aClass4Array3 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(16) int local16 = arg1 >> 9;
			@Pc(20) int local20 = arg4 >> 9;
			if (arg0 < 0 || arg3 < 0 || arg0 > Static460.anInt8640 - 1 || Static292.anInt7682 - 1 < arg3) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && Static460.anInt8640 - 1 >= local16 && local20 <= Static292.anInt7682 - 1) {
				@Pc(85) boolean local85 = (Static576.aByteArrayArrayArray21[1][arg1 >> 9][arg4 >> 9] & 0x2) != 0;
				@Pc(107) boolean local107;
				@Pc(123) boolean local123;
				if ((arg1 & 0x1FF) == 0) {
					local107 = (Static576.aByteArrayArrayArray21[1][local16 - 1][arg4 >> 9] & 0x2) != 0;
					local123 = (Static576.aByteArrayArrayArray21[1][local16][arg4 >> 9] & 0x2) != 0;
					if (local107 != local123) {
						local85 = (Static576.aByteArrayArrayArray21[1][arg0][arg3] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x1FF) == 0) {
					local107 = (Static576.aByteArrayArrayArray21[1][arg1 >> 9][local20 - 1] & 0x2) != 0;
					local123 = (Static576.aByteArrayArrayArray21[1][arg1 >> 9][local20] & 0x2) != 0;
					if (local107 != local123) {
						local85 = (Static576.aByteArrayArrayArray21[1][arg0][arg3] & 0x2) != 0;
					}
				}
				if (local85) {
					arg2++;
				}
				return Static224.aClass4Array3[arg2].sa(arg1, arg4);
			} else {
				return 0;
			}
		} else {
			return Static224.aClass4Array3[arg2].sa(arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBII)I")
	public static int method3407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(12) int local12 = 128 - arg2;
		@Pc(26) int local26 = arg2 * (arg0 & 0x7F) + local12 * (arg1 & 0x7F) >> 7;
		@Pc(48) int local48 = arg2 * (arg0 & 0x380) + (arg1 & 0x380) * local12 >> 7;
		@Pc(62) int local62 = (arg1 & 0xFC00) * local12 + (arg0 & 0xFC00) * arg2 >> 7;
		return local62 & 0xFC00 | local48 & 0x380 | local26 & 0x7F;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLclient!ut;)Z")
	public static boolean method3408(@OriginalArg(1) Interface22 arg0) {
		@Pc(10) Class292 local10 = Static253.aClass146_2.method3356(arg0.method8398());
		if (local10.anInt8755 == -1) {
			return true;
		} else {
			@Pc(22) Class114 local22 = Static568.aClass315_4.method7655(local10.anInt8755);
			return local22.anInt3381 == -1 ? true : local22.method2983();
		}
	}
}
