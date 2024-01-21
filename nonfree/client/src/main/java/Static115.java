import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	public static int anInt2578;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	public static int anInt2583;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "I")
	public static int anInt2585;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_765 = Static81.method1507("details)3dat");

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Lclient!l;")
	public static Class57 aClass57_25 = new Class57(8);

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	public static int anInt2586 = 0;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_766 = Static81.method1507("You have only just left another world)3");

	@OriginalMember(owner = "client!li", name = "K", descriptor = "Lclient!dj;")
	public static Class24 aClass24_767 = aClass24_766;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_768 = Static81.method1507(")2");

	@OriginalMember(owner = "client!li", name = "M", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_769 = Static81.method1507(":");

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
	public static final boolean aBoolean118 = false;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BLclient!af;B)V")
	public static void method1983(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class6 arg2) {
		@Pc(15) Class1_Sub25 local15 = new Class1_Sub25();
		local15.anInt4438 = 0;
		local15.aLong149 = arg0;
		local15.aClass6_4 = arg2;
		local15.aByteArray55 = arg1;
		@Pc(30) Class87 local30 = Static12.aClass87_6;
		synchronized (Static12.aClass87_6) {
			Static12.aClass87_6.method2823(local15);
		}
		Static200.method3379();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1987(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static203.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static15.aClass37_1);
		arg0.addFocusListener(Static15.aClass37_1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	public static boolean method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = 0; local5 < 104; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static36.anIntArrayArray8[local5][local8] = 0;
				Static110.anIntArrayArray18[local5][local8] = 99999999;
			}
		}
		local8 = arg1;
		Static36.anIntArrayArray8[arg1][arg4] = 99;
		@Pc(48) int local48 = arg4;
		Static110.anIntArrayArray18[arg1][arg4] = 0;
		@Pc(56) byte local56 = 0;
		Static37.anIntArray89[0] = arg1;
		@Pc(63) int local63 = local56 + 1;
		Static76.anIntArray154[0] = arg4;
		@Pc(67) int local67 = 0;
		@Pc(69) boolean local69 = false;
		@Pc(72) int local72 = Static37.anIntArray89.length;
		@Pc(77) int[][] local77 = Static66.aClass93Array1[Static170.anInt3799].anIntArrayArray33;
		@Pc(187) int local187;
		while (local63 != local67) {
			local8 = Static37.anIntArray89[local67];
			local48 = Static76.anIntArray154[local67];
			local67 = (local67 + 1) % local72;
			if (arg7 == local8 && local48 == arg6) {
				local69 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static66.aClass93Array1[Static170.anInt3799].method3260(arg3 - 1, local8, arg6, arg7, local48, arg8)) {
					local69 = true;
					break;
				}
				if (arg3 < 10 && Static66.aClass93Array1[Static170.anInt3799].method3264(local8, arg6, local48, arg7, arg3 - 1, arg8)) {
					local69 = true;
					break;
				}
			}
			if (arg9 != 0 && arg10 != 0 && Static66.aClass93Array1[Static170.anInt3799].method3274(arg10, arg9, local8, arg0, local48, arg6, arg7)) {
				local69 = true;
				break;
			}
			local187 = Static110.anIntArrayArray18[local8][local48] + 1;
			if (local8 > 0 && Static36.anIntArrayArray8[local8 - 1][local48] == 0 && (local77[local8 - 1][local48] & 0x12C0108) == 0) {
				Static37.anIntArray89[local63] = local8 - 1;
				Static76.anIntArray154[local63] = local48;
				local63 = (local63 + 1) % local72;
				Static36.anIntArrayArray8[local8 - 1][local48] = 2;
				Static110.anIntArrayArray18[local8 - 1][local48] = local187;
			}
			if (local8 < 103 && Static36.anIntArrayArray8[local8 + 1][local48] == 0 && (local77[local8 + 1][local48] & 0x12C0180) == 0) {
				Static37.anIntArray89[local63] = local8 + 1;
				Static76.anIntArray154[local63] = local48;
				Static36.anIntArrayArray8[local8 + 1][local48] = 8;
				local63 = (local63 + 1) % local72;
				Static110.anIntArrayArray18[local8 + 1][local48] = local187;
			}
			if (local48 > 0 && Static36.anIntArrayArray8[local8][local48 - 1] == 0 && (local77[local8][local48 - 1] & 0x12C0102) == 0) {
				Static37.anIntArray89[local63] = local8;
				Static76.anIntArray154[local63] = local48 - 1;
				Static36.anIntArrayArray8[local8][local48 - 1] = 1;
				local63 = (local63 + 1) % local72;
				Static110.anIntArrayArray18[local8][local48 - 1] = local187;
			}
			if (local48 < 103 && Static36.anIntArrayArray8[local8][local48 + 1] == 0 && (local77[local8][local48 + 1] & 0x12C0120) == 0) {
				Static37.anIntArray89[local63] = local8;
				Static76.anIntArray154[local63] = local48 + 1;
				Static36.anIntArrayArray8[local8][local48 + 1] = 4;
				Static110.anIntArrayArray18[local8][local48 + 1] = local187;
				local63 = (local63 + 1) % local72;
			}
			if (local8 > 0 && local48 > 0 && Static36.anIntArrayArray8[local8 - 1][local48 - 1] == 0 && (local77[local8 - 1][local48 - 1] & 0x12C010E) == 0 && (local77[local8 - 1][local48] & 0x12C0108) == 0 && (local77[local8][local48 - 1] & 0x12C0102) == 0) {
				Static37.anIntArray89[local63] = local8 - 1;
				Static76.anIntArray154[local63] = local48 - 1;
				Static36.anIntArrayArray8[local8 - 1][local48 - 1] = 3;
				local63 = (local63 + 1) % local72;
				Static110.anIntArrayArray18[local8 - 1][local48 - 1] = local187;
			}
			if (local8 < 103 && local48 > 0 && Static36.anIntArrayArray8[local8 + 1][local48 - 1] == 0 && (local77[local8 + 1][local48 - 1] & 0x12C0183) == 0 && (local77[local8 + 1][local48] & 0x12C0180) == 0 && (local77[local8][local48 - 1] & 0x12C0102) == 0) {
				Static37.anIntArray89[local63] = local8 + 1;
				Static76.anIntArray154[local63] = local48 - 1;
				local63 = (local63 + 1) % local72;
				Static36.anIntArrayArray8[local8 + 1][local48 - 1] = 9;
				Static110.anIntArrayArray18[local8 + 1][local48 - 1] = local187;
			}
			if (local8 > 0 && local48 < 103 && Static36.anIntArrayArray8[local8 - 1][local48 + 1] == 0 && (local77[local8 - 1][local48 + 1] & 0x12C0138) == 0 && (local77[local8 - 1][local48] & 0x12C0108) == 0 && (local77[local8][local48 + 1] & 0x12C0120) == 0) {
				Static37.anIntArray89[local63] = local8 - 1;
				Static76.anIntArray154[local63] = local48 + 1;
				local63 = (local63 + 1) % local72;
				Static36.anIntArrayArray8[local8 - 1][local48 + 1] = 6;
				Static110.anIntArrayArray18[local8 - 1][local48 + 1] = local187;
			}
			if (local8 < 103 && local48 < 103 && Static36.anIntArrayArray8[local8 + 1][local48 + 1] == 0 && (local77[local8 + 1][local48 + 1] & 0x12C01E0) == 0 && (local77[local8 + 1][local48] & 0x12C0180) == 0 && (local77[local8][local48 + 1] & 0x12C0120) == 0) {
				Static37.anIntArray89[local63] = local8 + 1;
				Static76.anIntArray154[local63] = local48 + 1;
				local63 = (local63 + 1) % local72;
				Static36.anIntArrayArray8[local8 + 1][local48 + 1] = 12;
				Static110.anIntArrayArray18[local8 + 1][local48 + 1] = local187;
			}
		}
		Static181.anInt4045 = 0;
		@Pc(809) int local809;
		@Pc(818) int local818;
		@Pc(824) int local824;
		if (!local69) {
			if (!arg5) {
				return false;
			}
			local809 = 100;
			local187 = 1000;
			for (local818 = arg7 - 10; local818 <= arg7 + 10; local818++) {
				for (local824 = arg6 - 10; local824 <= arg6 + 10; local824++) {
					if (local818 >= 0 && local824 >= 0 && local818 < 104 && local824 < 104 && Static110.anIntArrayArray18[local818][local824] < 100) {
						@Pc(848) int local848 = 0;
						if (local818 < arg7) {
							local848 = arg7 - local818;
						} else if (arg7 + arg9 - 1 < local818) {
							local848 = local818 + 1 - arg7 - arg9;
						}
						@Pc(875) int local875 = 0;
						if (arg6 > local824) {
							local875 = arg6 - local824;
						} else if (local824 > arg10 + arg6 - 1) {
							local875 = local824 + 1 - arg10 - arg6;
						}
						@Pc(915) int local915 = local875 * local875 + local848 * local848;
						if (local187 > local915 || local915 == local187 && Static110.anIntArrayArray18[local818][local824] < local809) {
							local809 = Static110.anIntArrayArray18[local818][local824];
							local48 = local824;
							local8 = local818;
							local187 = local915;
						}
					}
				}
			}
			if (local187 == 1000) {
				return false;
			}
			if (arg1 == local8 && arg4 == local48) {
				return false;
			}
			Static181.anInt4045 = 1;
		}
		@Pc(986) byte local986 = 0;
		Static37.anIntArray89[0] = local8;
		local67 = local986 + 1;
		Static76.anIntArray154[0] = local48;
		local187 = local809 = Static36.anIntArrayArray8[local8][local48];
		while (arg1 != local8 || arg4 != local48) {
			if (local809 != local187) {
				Static37.anIntArray89[local67] = local8;
				Static76.anIntArray154[local67++] = local48;
				local809 = local187;
			}
			if ((local187 & 0x2) != 0) {
				local8++;
			} else if ((local187 & 0x8) != 0) {
				local8--;
			}
			if ((local187 & 0x1) != 0) {
				local48++;
			} else if ((local187 & 0x4) != 0) {
				local48--;
			}
			local187 = Static36.anIntArrayArray8[local8][local48];
		}
		if (local67 > 0) {
			local72 = local67;
			if (local67 > 25) {
				local72 = 25;
			}
			local67--;
			@Pc(1089) int local1089 = Static37.anIntArray89[local67];
			local818 = Static76.anIntArray154[local67];
			if (arg2 == 0) {
				Static176.aClass1_Sub7_Sub1_34.method2808(245);
				Static176.aClass1_Sub7_Sub1_34.method2753(local72 + local72 + 3);
			}
			if (arg2 == 1) {
				Static176.aClass1_Sub7_Sub1_34.method2808(255);
				Static176.aClass1_Sub7_Sub1_34.method2753(local72 + local72 + 3 + 14);
			}
			if (arg2 == 2) {
				Static176.aClass1_Sub7_Sub1_34.method2808(247);
				Static176.aClass1_Sub7_Sub1_34.method2753(local72 + local72 + 3);
			}
			Static176.aClass1_Sub7_Sub1_34.method2791(local1089 + Static196.anInt4343);
			Static174.anInt3879 = Static37.anIntArray89[0];
			Static35.anInt4154 = Static76.anIntArray154[0];
			for (local824 = 1; local824 < local72; local824++) {
				local67--;
				Static176.aClass1_Sub7_Sub1_34.method2753(Static37.anIntArray89[local67] - local1089);
				Static176.aClass1_Sub7_Sub1_34.method2749(Static76.anIntArray154[local67] - local818);
			}
			Static176.aClass1_Sub7_Sub1_34.method2758(Static127.anInt2789 + local818);
			Static176.aClass1_Sub7_Sub1_34.method2744(Static116.aBooleanArray11[82] ? 1 : 0);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
