import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
	public static final int[] anIntArray249 = new int[25];

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg1 < 0 || Static233.anInt5573 - 1 <= arg0 || arg1 >= Static134.anInt2971 - 1) {
			return;
		}
		if (Static77.aClass194ArrayArrayArray1 == null) {
			return;
		}
		@Pc(53) Interface5 local53;
		if (arg5 == 0) {
			local53 = (Interface5) Static352.method5612(arg6, arg0, arg1);
			@Pc(256) Interface5 local256 = (Interface5) Static21.method574(arg6, arg0, arg1);
			if (local53 != null && arg3 != 2) {
				if (local53 instanceof Class17_Sub4_Sub1) {
					((Class17_Sub4_Sub1) local53).aClass120_2.method3372(arg2);
				} else {
					Static340.method5481(arg0, arg3, arg5, arg2, arg4, arg6, arg1, local53.method4799());
				}
			}
			if (local256 != null) {
				if (local256 instanceof Class17_Sub4_Sub1) {
					((Class17_Sub4_Sub1) local256).aClass120_2.method3372(arg2);
				} else {
					Static340.method5481(arg0, arg3, arg5, arg2, arg4, arg6, arg1, local256.method4799());
				}
			}
		} else if (arg5 == 1) {
			local53 = (Interface5) Static223.method5335(arg6, arg0, arg1);
			if (local53 != null) {
				if (local53 instanceof Class17_Sub3_Sub1) {
					((Class17_Sub3_Sub1) local53).aClass120_1.method3372(arg2);
				} else {
					@Pc(141) int local141 = local53.method4799();
					if (arg3 == 4 || arg3 == 5) {
						Static340.method5481(arg0, 4, arg5, arg2, arg4, arg6, arg1, local141);
					} else if (arg3 == 6) {
						Static340.method5481(arg0, 4, arg5, arg2, arg4 + 4, arg6, arg1, local141);
					} else if (arg3 == 7) {
						Static340.method5481(arg0, 4, arg5, arg2, (arg4 + 2 & 0x3) + 4, arg6, arg1, local141);
					} else if (arg3 == 8) {
						Static340.method5481(arg0, 4, arg5, arg2, arg4 + 4, arg6, arg1, local141);
						Static340.method5481(arg0, 4, arg5, arg2, (arg4 + 2 & 0x3) + 4, arg6, arg1, local141);
					}
				}
			}
		} else if (arg5 == 2) {
			local53 = (Interface5) Static258.method4649(arg6, arg0, arg1, ol.class);
			if (local53 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local53 instanceof Class17_Sub1_Sub3) {
					((Class17_Sub1_Sub3) local53).aClass120_4.method3372(arg2);
				} else {
					Static340.method5481(arg0, arg3, arg5, arg2, arg4, arg6, arg1, local53.method4799());
				}
			}
		} else if (arg5 == 3) {
			local53 = (Interface5) Static127.method2619(arg6, arg0, arg1);
			if (local53 != null) {
				if (local53 instanceof Class17_Sub5_Sub1) {
					((Class17_Sub5_Sub1) local53).aClass120_3.method3372(arg2);
				} else {
					Static340.method5481(arg0, arg3, arg5, arg2, arg4, arg6, arg1, local53.method4799());
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method2552() {
		if (Static207.anInt4332 == 2) {
			Static257.anInt5344 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static257.anInt5344 = (int) (local33 / 1048576L) + 1;
					return;
				} catch (@Pc(43) Throwable local43) {
					return;
				}
			}
		} catch (@Pc(45) Exception local45) {
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method2553(@OriginalArg(1) int arg0) {
		if (!Static279.method4856(arg0)) {
			return;
		}
		@Pc(16) Class12[] local16 = Static348.aClass12ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class12 local24 = local16[local18];
			if (local24 != null) {
				local24.anInt388 = 0;
				local24.anInt450 = 0;
				local24.anInt395 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method2554(@OriginalArg(1) Class216 arg0) {
		Static72.aClass216_24 = arg0;
		Static279.anInt5665 = Static72.aClass216_24.method5675(19);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZLclient!aq;IILclient!c;Lclient!em;I)V")
	public static void method2555(@OriginalArg(0) int arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) Class52 arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Static147.anInt3204 == 4) {
			local21 = (int) Static75.aFloat13 & 0x3FFF;
		} else {
			local21 = (int) Static75.aFloat13 + Static337.anInt6461 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg1.lb / 2, arg1.anInt446 / 2) + 10;
		@Pc(48) int local48 = arg6 * arg6 + arg3 * arg3;
		if (local48 > local40 * local40) {
			return;
		}
		@Pc(58) int local58 = Class1_Sub3_Sub8.anIntArray159[local21];
		@Pc(62) int local62 = Class1_Sub3_Sub8.anIntArray156[local21];
		if (Static147.anInt3204 != 4) {
			local58 = local58 * 256 / (Static287.anInt5748 + 256);
			local62 = local62 * 256 / (Static287.anInt5748 + 256);
		}
		@Pc(91) int local91 = local58 * arg6 + local62 * arg3 >> 15;
		@Pc(102) int local102 = arg6 * local62 - local58 * arg3 >> 15;
		arg4.method3620(arg2 + arg1.lb / 2 + local91 - arg4.method3632() / 2, -local102 + arg1.anInt446 / 2 + arg0 + -(arg4.method3630() / 2), arg5, arg2, arg0);
	}
}
