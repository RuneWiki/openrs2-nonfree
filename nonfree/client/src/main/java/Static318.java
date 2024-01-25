import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "Lclient!st;")
	public static final Class314 aClass314_91 = new Class314(66, -1);

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "[Lclient!gca;")
	public static final Class121[] aClass121Array1 = new Class121[16];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIBI)I")
	public static int method5299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static637.aClass91Array4 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(27) int local27 = arg2 >> 9;
			@Pc(31) int local31 = arg1 >> 9;
			if (arg3 < 0 || arg4 < 0 || Static399.anInt7121 - 1 < arg3 || Static24.anInt345 - 1 < arg4) {
				return 0;
			} else if (local27 >= 1 && local31 >= 1 && local27 <= Static399.anInt7121 - 1 && Static24.anInt345 - 1 >= local31) {
				@Pc(90) boolean local90 = (Static546.aByteArrayArrayArray18[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg2 & 0x1FF) == 0) {
					local115 = (Static546.aByteArrayArrayArray18[1][local27 - 1][arg1 >> 9] & 0x2) != 0;
					local131 = (Static546.aByteArrayArrayArray18[1][local27][arg1 >> 9] & 0x2) != 0;
					if (local131 != local115) {
						local90 = (Static546.aByteArrayArrayArray18[1][arg3][arg4] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local115 = (Static546.aByteArrayArrayArray18[1][arg2 >> 9][local31 - 1] & 0x2) != 0;
					local131 = (Static546.aByteArrayArrayArray18[1][arg2 >> 9][local31] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static546.aByteArrayArrayArray18[1][arg3][arg4] & 0x2) != 0;
					}
				}
				if (local90) {
					arg0++;
				}
				return Static637.aClass91Array4[arg0].method7725(arg2, arg1);
			} else {
				return 0;
			}
		} else {
			return Static637.aClass91Array4[arg0].method7725(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIII)V")
	public static void method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg0 << 1) - 3) * local25;
		@Pc(84) int local84 = local56;
		@Pc(90) int local90 = (arg0 - 1) * local52;
		Static82.method1400(arg4, arg3 - arg2, arg2 + arg3, Static71.anIntArrayArray5[arg1]);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local84;
					local39 += local64;
					local64 += local56;
					local84 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local84;
				local84 += local56;
				local7++;
				local64 += local56;
			}
			local48 += -local72;
			local39 += -local90;
			local90 -= local52;
			local9--;
			local72 -= local52;
			@Pc(173) int local173 = arg1 - local9;
			@Pc(177) int local177 = arg1 + local9;
			@Pc(181) int local181 = local7 + arg3;
			@Pc(186) int local186 = arg3 - local7;
			Static82.method1400(arg4, local186, local181, Static71.anIntArrayArray5[local173]);
			Static82.method1400(arg4, local186, local181, Static71.anIntArrayArray5[local177]);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(JI)V")
	public static void method5301(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
