import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Lclient!fu;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!kr;")
	public static final Class147 aClass147_3 = new Class147(16);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5543(@OriginalArg(0) String arg0) {
		return Static159.method2587(10, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)I")
	public static int method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static58.aClass64Array1 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(19) int local19 = arg2 >> 7;
			@Pc(23) int local23 = arg3 >> 7;
			if (arg1 < 0 || arg0 < 0 || arg1 > Static229.anInt4427 - 1 || Static379.anInt6422 - 1 < arg0) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static229.anInt4427 - 1 && local23 <= Static379.anInt6422 - 1) {
				@Pc(90) boolean local90 = (Static227.aByteArrayArrayArray8[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(131) boolean local131;
				if ((arg2 & 0x7F) == 0) {
					local112 = (Static227.aByteArrayArrayArray8[1][local19 - 1][arg3 >> 7] & 0x2) != 0;
					local131 = (Static227.aByteArrayArrayArray8[1][local19][arg3 >> 7] & 0x2) != 0;
					if (local131 != local112) {
						local90 = (Static227.aByteArrayArrayArray8[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local112 = (Static227.aByteArrayArrayArray8[1][arg2 >> 7][local23 - 1] & 0x2) != 0;
					local131 = (Static227.aByteArrayArrayArray8[1][arg2 >> 7][local23] & 0x2) != 0;
					if (local131 != local112) {
						local90 = (Static227.aByteArrayArrayArray8[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if (local90) {
					arg4++;
				}
				return Static58.aClass64Array1[arg4].a(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static58.aClass64Array1[arg4].a(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[I[Ljava/lang/Object;BI)V")
	public static void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg3; local59++) {
			if (local24 + (local59 & local57) > arg1[local59]) {
				@Pc(75) int local75 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local75;
				@Pc(89) Object local89 = arg2[local59];
				arg2[local59] = arg2[local20];
				arg2[local20++] = local89;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg3] = arg2[local20];
		arg2[local20] = local38;
		method5550(arg0, arg1, arg2, local20 - 1);
		method5550(local20 + 1, arg1, arg2, arg3);
	}
}
