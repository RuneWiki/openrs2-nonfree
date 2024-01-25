import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_24 = new Class125(260);

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
	public static int anInt2941 = 100;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BILclient!rt;)V")
	public static void method2503(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (Static340.aClass196_6 == null) {
			return;
		}
		try {
			Static340.aClass196_6.method5081(0L);
			Static340.aClass196_6.method5074(arg1.aByteArray114, arg0, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIII)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg4 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(84) int local84 = local52 * (arg4 - 1);
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (Static269.anInt5577 <= arg2 && arg2 <= Static81.anInt1788) {
			local106 = Static73.method7829(arg1 + arg0, Static190.anInt4314, anInt2941);
			local115 = Static73.method7829(arg0 - arg1, Static190.anInt4314, anInt2941);
			Static257.method4540(Static68.anIntArrayArray24[arg2], arg3, local115, local106);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local78;
					local7++;
					local64 += local56;
					local78 += local56;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local78;
				local78 += local56;
				local64 += local56;
				local7++;
			}
			local39 += -local84;
			local48 += -local72;
			local84 -= local52;
			local72 -= local52;
			local9--;
			local106 = arg2 - local9;
			local115 = arg2 + local9;
			if (local115 >= Static269.anInt5577 && Static81.anInt1788 >= local106) {
				@Pc(222) int local222 = Static73.method7829(arg0 + local7, Static190.anInt4314, anInt2941);
				@Pc(231) int local231 = Static73.method7829(arg0 - local7, Static190.anInt4314, anInt2941);
				if (local106 >= Static269.anInt5577) {
					Static257.method4540(Static68.anIntArrayArray24[local106], arg3, local231, local222);
				}
				if (local115 <= Static81.anInt1788) {
					Static257.method4540(Static68.anIntArrayArray24[local115], arg3, local231, local222);
				}
			}
		}
	}
}
