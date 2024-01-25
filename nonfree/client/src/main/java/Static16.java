import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
	public static int anInt244;

	@OriginalMember(owner = "client!aq", name = "G", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_11 = new Class146(76, 3);

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
	public static void method219(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub17 local12 = Static34.method1709(3, arg0);
		local12.method5523();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!gp;Lclient!ya;Lclient!dt;I)V")
	public static void method220(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) Class4_Sub12 arg2) {
		@Pc(10) Class95 local10 = arg0.method1963(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(24) int local24 = local10.la();
		if (local10.ma() > local24) {
			local24 = local10.ma();
		}
		@Pc(40) int local40 = arg2.anInt1563;
		@Pc(43) int local43 = arg2.anInt1570;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(63) int local63;
		@Pc(86) int local86;
		if (arg0.aString15 != null) {
			local45 = Static261.aClass158_9.method3029(arg0.aString15, null, null, Static51.aStringArray6);
			for (local63 = 0; local63 < local45; local63++) {
				@Pc(69) String local69 = Static51.aStringArray6[local63];
				if (local63 < local45 - 1) {
					local69 = local69.substring(0, local69.length() - 4);
				}
				local86 = Static66.aClass223_4.method4664(local69);
				if (local47 < local86) {
					local47 = local86;
				}
			}
			local49 = Static66.aClass223_4.method4669() * local45 + Static66.aClass223_4.method4666() / 2;
		}
		local63 = local24 / 2 + arg2.anInt1563;
		if (Static292.anInt6151 + local24 > local40) {
			local40 = Static292.anInt6151;
			local63 = local24 / 2 + Static292.anInt6151 + local47 / 2 + 10 + 5;
		} else if (Static292.anInt6147 - local24 < local40) {
			local40 = Static292.anInt6147 - local24;
			local63 = Static292.anInt6147 - local47 / 2 - local24 / 2 - 5 - 10;
		}
		@Pc(167) int local167 = arg2.anInt1570;
		if (Static292.anInt6149 + local24 > local43) {
			local167 = local24 / 2 + Static292.anInt6149 + 10;
			local43 = Static292.anInt6149;
		} else if (local43 > Static292.anInt6141 - local24) {
			local167 = Static292.anInt6141 - local24 / 2 - local49 - 10;
			local43 = Static292.anInt6141 - local24;
		}
		local86 = (int) (Math.atan2((double) (local40 - arg2.anInt1563), (double) (local43 - arg2.anInt1570)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5824((float) local24 / 2.0F + (float) local40, (float) local43 + (float) local24 / 2.0F, 4096, local86);
		@Pc(245) int local245 = -2;
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		if (arg0.aString15 != null) {
			local247 = local167;
			local245 = local63 - local47 / 2 - 5;
			local249 = local47 + local245 + 10;
			local251 = Static66.aClass223_4.method4669() * local45 + local167 + 3;
			if (arg0.anInt2470 != 0) {
				arg1.method5394(local249 - local245, local245, local251 - local167, local167, arg0.anInt2470);
			}
			if (arg0.anInt2464 != 0) {
				arg1.method5369(local245, local249 - local245, arg0.anInt2464, local251 - local167, local167);
			}
			for (@Pc(322) int local322 = 0; local322 < local45; local322++) {
				@Pc(328) String local328 = Static51.aStringArray6[local322];
				if (local322 < local45 - 1) {
					local328 = local328.substring(0, local328.length() - 4);
				}
				Static66.aClass223_4.method4663(arg1, local328, local63, local167, arg0.anInt2462);
				local167 += Static66.aClass223_4.method4669();
			}
		}
		if (arg0.anInt2483 == -1 && arg0.aString15 == null) {
			return;
		}
		local24 >>= 0x1;
		@Pc(375) Class4_Sub32 local375 = new Class4_Sub32(arg2);
		local375.anInt4678 = local247;
		local375.anInt4684 = local249;
		local375.anInt4675 = local245;
		local375.anInt4676 = local43 + local24;
		local375.anInt4677 = local40 - local24;
		local375.anInt4682 = local40 + local24;
		local375.anInt4683 = local43 - local24;
		local375.anInt4685 = local251;
		Static100.aClass244_9.method5273(local375);
	}
}
