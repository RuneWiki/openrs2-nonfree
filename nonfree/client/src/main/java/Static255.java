import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	public static int anInt4574;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Z")
	public static boolean aBoolean311 = true;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIII)V")
	public static void method3756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static282.anInt4980 = arg4;
		Static86.anInt1676 = arg2;
		Static132.anInt2279 = arg1;
		Static198.anInt3609 = arg3;
		Static307.anInt5523 = arg0;
		if (Static132.anInt2279 >= 100) {
			@Pc(24) int local24 = Static307.anInt5523 * 128 + 64;
			@Pc(30) int local30 = Static282.anInt4980 * 128 + 64;
			@Pc(38) int local38 = Static289.method4078(local24, local30, Static152.anInt2600) - Static86.anInt1676;
			@Pc(43) int local43 = local24 - Static306.anInt5497;
			@Pc(48) int local48 = local38 - Static254.anInt4567;
			@Pc(52) int local52 = local30 - Static402.anInt6941;
			@Pc(63) int local63 = (int) Math.sqrt((double) (local52 * local52 + local43 * local43));
			Static239.anInt4284 = (int) (Math.atan2((double) local48, (double) local63) * 2607.5945876176133D) & 0x3FFF;
			Static94.anInt1775 = (int) (-2607.5945876176133D * Math.atan2((double) local43, (double) local52)) & 0x3FFF;
			if (Static239.anInt4284 < 1024) {
				Static239.anInt4284 = 1024;
			}
			Static454.anInt7852 = 0;
			if (Static239.anInt4284 > 3072) {
				Static239.anInt4284 = 3072;
			}
		}
		Static310.anInt5540 = 2;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg1;
		@Pc(14) int local14 = arg1 + arg6;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static217.method3280(Static59.anIntArrayArray34[local16], arg2, arg3, arg4);
		}
		@Pc(38) int local38 = arg2 + arg1;
		for (@Pc(44) int local44 = arg5; local44 > local10; local44--) {
			Static217.method3280(Static59.anIntArrayArray34[local44], arg2, arg3, arg4);
		}
		@Pc(63) int local63 = arg4 - arg1;
		for (@Pc(65) int local65 = local14; local65 <= local10; local65++) {
			@Pc(71) int[] local71 = Static59.anIntArrayArray34[local65];
			Static217.method3280(local71, arg2, arg3, local38);
			Static217.method3280(local71, local38, arg0, local63);
			Static217.method3280(local71, local63, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public static void method3758() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static421.anInt7287 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg5 - arg0;
		@Pc(20) int local20 = arg3 - arg0;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + (1 - local60) * local32;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg3 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local20 - 1);
		@Pc(151) int[] local151 = Static59.anIntArrayArray34[arg2];
		Static217.method3280(local151, arg4 - arg5, arg6, arg4 - local15);
		Static217.method3280(local151, arg4 - local15, arg1, local15 + arg4);
		Static217.method3280(local151, local15 + arg4, arg6, arg4 + arg5);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local9 <= local20;
			if (local200) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local141;
						local11++;
						local141 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local86 += local125;
					local141 += local111;
					local11++;
					local125 += local111;
				}
				local95 += -local131;
				local86 += -local147;
				local131 -= local107;
				local147 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local78 += local133;
					local133 += local103;
					local7++;
					local115 += local103;
				}
			}
			if (local78 < 0) {
				local78 += local133;
				local69 += local115;
				local115 += local103;
				local133 += local103;
				local7++;
			}
			local78 += -local121;
			local69 += -local139;
			local139 -= local99;
			local9--;
			local121 -= local99;
			@Pc(331) int local331 = arg2 - local9;
			@Pc(336) int local336 = arg2 + local9;
			@Pc(340) int local340 = arg4 + local7;
			@Pc(345) int local345 = arg4 - local7;
			if (local200) {
				@Pc(372) int local372 = arg4 + local11;
				@Pc(377) int local377 = arg4 - local11;
				Static217.method3280(Static59.anIntArrayArray34[local331], local345, arg6, local377);
				Static217.method3280(Static59.anIntArrayArray34[local331], local377, arg1, local372);
				Static217.method3280(Static59.anIntArrayArray34[local331], local372, arg6, local340);
				Static217.method3280(Static59.anIntArrayArray34[local336], local345, arg6, local377);
				Static217.method3280(Static59.anIntArrayArray34[local336], local377, arg1, local372);
				Static217.method3280(Static59.anIntArrayArray34[local336], local372, arg6, local340);
			} else {
				Static217.method3280(Static59.anIntArrayArray34[local331], local345, arg6, local340);
				Static217.method3280(Static59.anIntArrayArray34[local336], local345, arg6, local340);
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V")
	public static void method3760(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static220.method3315(arg1, arg0, 0, arg1.length - 1);
	}
}
