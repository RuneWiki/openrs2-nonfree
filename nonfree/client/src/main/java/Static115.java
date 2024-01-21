import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_876 = Static151.method2243("Please contact customer support)3");

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!mb;")
	public static Class62 aClass62_877 = aClass62_876;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_7 = new Class13();

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_878 = Static151.method2243("null");

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_881 = Static151.method2243("Created gameworld");

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!mb;")
	public static Class62 aClass62_879 = aClass62_881;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_880 = Static151.method2243("::fpsoff");

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_882 = Static151.method2243("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
	public static final int[] anIntArray237 = new int[100];

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!mb;")
	public static Class62 aClass62_883 = aClass62_882;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method1776() {
		for (@Pc(7) int local7 = -1; local7 < Static145.anInt3126; local7++) {
			@Pc(15) int local15;
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static28.anIntArray60[local7];
			}
			@Pc(25) Class7_Sub2_Sub2 local25 = Static62.aClass7_Sub2_Sub2Array1[local15];
			if (local25 != null) {
				Static197.method2839(local25, 1);
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
	public static void method1779(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static118.anInt2607; local3++) {
			@Pc(11) Class7_Sub2_Sub1 local11 = Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local3]];
			@Pc(20) long local20 = (long) Static199.anIntArray373[local3] << 32 | 0x20000000L;
			if (local11 != null && local11.method2177() && arg0 == local11.aClass2_Sub1_Sub20_1.aBoolean154 && local11.aClass2_Sub1_Sub20_1.method2444()) {
				@Pc(45) int local45 = local11.anInt3046 >> 7;
				@Pc(50) int local50 = local11.anInt3085 >> 7;
				if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
					if (local11.anInt3048 == 1 && (local11.anInt3046 & 0x7F) == 64 && (local11.anInt3085 & 0x7F) == 64) {
						if (Static185.anInt3845 == Static107.anIntArrayArray19[local45][local50]) {
							continue;
						}
						Static107.anIntArrayArray19[local45][local50] = Static185.anInt3845;
					}
					if (!local11.aClass2_Sub1_Sub20_1.aBoolean153) {
						local20 |= Long.MIN_VALUE;
					}
					local11.anInt3081 = Static175.method2548(local11.anInt3085 + local11.anInt3048 * 64 - 64, Static126.anInt2806, local11.anInt3046 + local11.anInt3048 * 64 - 64);
					Static31.method536(Static126.anInt2806, local11.anInt3046, local11.anInt3085, local11.anInt3081, (local11.anInt3048 - 1) * 64 + 60, local11, local11.anInt3071, local20, local11.aBoolean135);
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILclient!mf;JLclient!mf;Lclient!mf;)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class7 arg6, @OriginalArg(7) Class7 arg7) {
		@Pc(3) Class18 local3 = new Class18();
		local3.aClass7_2 = arg4;
		local3.anInt508 = arg1 * 128 + 64;
		local3.anInt513 = arg2 * 128 + 64;
		local3.anInt519 = arg3;
		local3.aLong30 = arg5;
		local3.aClass7_3 = arg6;
		local3.aClass7_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub18 local42 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3292; local46++) {
				@Pc(52) Class39 local52 = local42.aClass39Array2[local46];
				if ((local52.aLong54 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass7_5.method3148();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt516 = -local34;
		if (Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub18(arg0, arg1, arg2);
		}
		Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass18_1 = local3;
	}
}
