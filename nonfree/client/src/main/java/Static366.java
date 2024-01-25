import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array11;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "Lclient!wu;")
	public static Class380 aClass380_90;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "[Lclient!paa;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public static int anInt5787;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLclient!gfa;Lclient!jk;Lclient!ha;)V")
	public static void method4956(@OriginalArg(1) Class2_Sub14 arg0, @OriginalArg(2) Class172 arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(10) Class61 local10 = arg1.method3767(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method6445();
		if (local10.method6447() > local16) {
			local16 = local10.method6447();
		}
		@Pc(32) int local32 = arg0.anInt3125;
		@Pc(52) int local52 = arg0.anInt3127;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(72) int local72;
		@Pc(95) int local95;
		if (arg1.aString42 != null) {
			local54 = Static251.aClass256_8.method5541(arg1.aString42, Static597.aStringArray46, null, null);
			for (local72 = 0; local72 < local54; local72++) {
				@Pc(78) String local78 = Static597.aStringArray46[local72];
				if (local72 < local54 - 1) {
					local78 = local78.substring(0, local78.length() - 4);
				}
				local95 = Static493.aClass55_8.method1009(local78);
				if (local95 > local56) {
					local56 = local95;
				}
			}
			local58 = Static493.aClass55_8.method1012() * local54 + Static493.aClass55_8.method1006() / 2;
		}
		local72 = arg0.anInt3125 + local16 / 2;
		if (local32 < local16 + Static193.anInt1549) {
			local72 = Static193.anInt1549 + local16 / 2 + local56 / 2 + 10 + 5;
			local32 = Static193.anInt1549;
		} else if (local32 > Static193.anInt1552 - local16) {
			local72 = Static193.anInt1552 - local56 / 2 - local16 / 2 - 15;
			local32 = Static193.anInt1552 - local16;
		}
		@Pc(182) int local182 = arg0.anInt3127;
		if (local52 < Static193.anInt1547 + local16) {
			local182 = local16 / 2 + Static193.anInt1547 + 10;
			local52 = Static193.anInt1547;
		} else if (Static193.anInt1554 - local16 < local52) {
			local182 = Static193.anInt1554 - local16 / 2 - local58 - 10;
			local52 = Static193.anInt1554 - local16;
		}
		local95 = (int) (Math.atan2((double) (local32 - arg0.anInt3125), (double) (local52 - arg0.anInt3127)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6442((float) local16 / 2.0F + (float) local32, (float) local52 + (float) local16 / 2.0F, 4096, local95);
		@Pc(269) int local269 = -2;
		@Pc(271) int local271 = -2;
		@Pc(273) int local273 = -2;
		@Pc(275) int local275 = -2;
		if (arg1.aString42 != null) {
			local271 = local182;
			local269 = local72 - local56 / 2 - 5;
			local273 = local56 + local269 + 10;
			local275 = local182 + Static493.aClass55_8.method1012() * local54 + 3;
			if (arg1.anInt4348 != 0) {
				arg2.method6936(local275 - local182, -local269 + local273, local269, arg1.anInt4348, local182);
			}
			if (arg1.anInt4346 != 0) {
				arg2.method6989(local269, arg1.anInt4346, local275 - local182, local182, local273 - local269);
			}
			for (@Pc(344) int local344 = 0; local344 < local54; local344++) {
				@Pc(350) String local350 = Static597.aStringArray46[local344];
				if (local344 < local54 - 1) {
					local350 = local350.substring(0, local350.length() - 4);
				}
				Static493.aClass55_8.method1007(arg2, local350, local72, local182, arg1.anInt4328);
				local182 += Static493.aClass55_8.method1012();
			}
		}
		if (arg1.anInt4332 == -1 && arg1.aString42 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(405) Class2_Sub23 local405 = new Class2_Sub23(arg0);
		local405.anInt4456 = local271;
		local405.anInt4464 = local269;
		local405.anInt4462 = local52 - local16;
		local405.anInt4461 = local273;
		local405.anInt4455 = local32 - local16;
		local405.anInt4463 = local16 + local32;
		local405.anInt4459 = local275;
		local405.anInt4457 = local52 + local16;
		Static372.aClass109_37.method2323(local405);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[[[BIIIIIIIIIILclient!ha;)V")
	public static void method4958(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class95 arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg6 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		if (arg6 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 8;
		}
		arg11.Q(arg0, arg9, arg2, arg10, arg4, arg5, arg1[arg6 - 1][arg3], arg7, arg8);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)V")
	public static void method4959(@OriginalArg(1) int arg0) {
		Static36.anInt769 = arg0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)[Lclient!rq;")
	public static Class306[] method4960() {
		return new Class306[] { Static173.aClass306_14, Static503.aClass306_10, Static523.aClass306_11 };
	}
}
