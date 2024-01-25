import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "[I")
	public static final int[] anIntArray627 = new int[14];

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_8 = new Class190("", 17);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
	public static void method5597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class1_Sub2_Sub1 local15 = Static258.method5559(arg1, 4);
		local15.method202();
		local15.anInt214 = arg2;
		local15.anInt211 = arg3;
		local15.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
	public static void method5599(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 9);
		local8.method195();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIBI)V")
	public static void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg4;
		@Pc(18) int local18 = arg0 * arg0;
		@Pc(22) int local22 = arg4 * arg4;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(44) int local44 = local18 * (1 - local34) + local26;
		@Pc(52) int local52 = local22 - local30 * (local34 - 1);
		@Pc(56) int local56 = local18 << 2;
		@Pc(60) int local60 = local22 << 2;
		@Pc(68) int local68 = local26 * 3;
		@Pc(76) int local76 = local30 * ((arg4 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg4 - 1);
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (arg2 >= Static305.anInt5429 && Static212.anInt452 >= arg2) {
			local111 = Static85.method1427(Static221.anInt4001, arg1 + arg0, Static83.anInt7380);
			local119 = Static85.method1427(Static221.anInt4001, arg1 - arg0, Static83.anInt7380);
			Static217.method3280(Static59.anIntArrayArray34[arg2], local119, arg3, local111);
		}
		while (local14 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local44 += local68;
					local52 += local82;
					local68 += local60;
					local12++;
					local82 += local60;
				}
			}
			if (local52 < 0) {
				local44 += local68;
				local52 += local82;
				local82 += local60;
				local12++;
				local68 += local60;
			}
			local52 += -local76;
			local44 += -local88;
			local76 -= local56;
			local88 -= local56;
			local14--;
			local111 = arg2 - local14;
			local119 = local14 + arg2;
			if (local119 >= Static305.anInt5429 && Static212.anInt452 >= local111) {
				@Pc(222) int local222 = Static85.method1427(Static221.anInt4001, local12 + arg1, Static83.anInt7380);
				@Pc(231) int local231 = Static85.method1427(Static221.anInt4001, arg1 - local12, Static83.anInt7380);
				if (Static305.anInt5429 <= local111) {
					Static217.method3280(Static59.anIntArrayArray34[local111], local231, arg3, local222);
				}
				if (local119 <= Static212.anInt452) {
					Static217.method3280(Static59.anIntArrayArray34[local119], local231, arg3, local222);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)V")
	public static void method5603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static55.anInt1147 = arg0 - Static7.anInt2566;
		Static21.anInt465 = arg1 - Static7.anInt2576;
	}
}
