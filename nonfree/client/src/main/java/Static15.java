import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "Lclient!sb;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_83 = Static181.method2795("(U0a )2 in: ");

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_84 = Static181.method2795("Loaded update list");

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_85 = Static181.method2795("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "[I")
	public static final int[] anIntArray27 = new int[100];

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_86 = aClass83_84;

	@OriginalMember(owner = "client!bc", name = "yb", descriptor = "Lclient!s;")
	public static final Class86 aClass86_8 = new Class86(100);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBIIII)V")
	public static void method341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = arg4 << 1;
		@Pc(34) int local34 = local13 << 2;
		@Pc(43) int local43 = (1 - local25) * local17 + local21;
		@Pc(47) int local47 = local17 << 2;
		@Pc(51) int local51 = local17 << 1;
		@Pc(59) int local59 = local13 - (local25 - 1) * local51;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg4 << 1) - 3) * local51;
		@Pc(93) int local93;
		@Pc(101) int local101;
		if (Static147.anInt4074 <= arg2 && arg2 <= Static61.anInt1501) {
			local93 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg0 + arg1);
			local101 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1 - arg0);
			Static22.method438(local93, arg3, local101, Static14.anIntArrayArray18[arg2]);
		}
		@Pc(115) int local115 = local34;
		@Pc(121) int local121 = (arg4 - 1) * local47;
		while (local7 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local9++;
					local59 += local115;
					local67 += local34;
					local115 += local34;
				}
			}
			local7--;
			if (local59 < 0) {
				local43 += local67;
				local59 += local115;
				local9++;
				local115 += local34;
				local67 += local34;
			}
			local59 += -local75;
			local75 -= local47;
			local43 += -local121;
			local101 = arg2 + local7;
			local93 = arg2 - local7;
			local121 -= local47;
			if (Static147.anInt4074 <= local101 && Static61.anInt1501 >= local93) {
				@Pc(218) int local218 = Static50.method998(Static36.anInt940, Static209.anInt4155, local9 + arg1);
				@Pc(227) int local227 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1 - local9);
				if (Static147.anInt4074 <= local93) {
					Static22.method438(local218, arg3, local227, Static14.anIntArrayArray18[local93]);
				}
				if (Static61.anInt1501 >= local101) {
					Static22.method438(local218, arg3, local227, Static14.anIntArrayArray18[local101]);
				}
			}
		}
	}
}
