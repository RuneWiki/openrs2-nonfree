import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1185 = Static65.method1172("<col=40ff00>");

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array22 = new Class46[500];

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!nb;")
	public static Class57 aClass57_24 = new Class57(64);

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
	public static int[] anIntArray392 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!nd;")
	public static Class59 aClass59_12 = new Class59();

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1186 = Static65.method1172("blinken1:");

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[I")
	public static int[] anIntArray393 = new int[1000];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([Lclient!qf;IILclient!og;[BI)V")
	public static void method2478(@OriginalArg(0) Class69[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(arg4);
		while (true) {
			@Pc(22) int local22 = local12.method209();
			if (local22 == 0) {
				return;
			}
			@Pc(26) int local26 = 0;
			local7 += local22;
			while (true) {
				@Pc(34) int local34 = local12.method209();
				if (local34 == 0) {
					break;
				}
				local26 += local34 - 1;
				@Pc(48) int local48 = local26 >> 6 & 0x3F;
				@Pc(52) int local52 = local26 & 0x3F;
				@Pc(56) int local56 = local26 >> 12;
				@Pc(60) int local60 = local12.method191();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = arg1 + local48;
				@Pc(72) int local72 = arg2 + local52;
				@Pc(76) int local76 = local60 & 0x3;
				if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
					@Pc(93) Class69 local93 = null;
					@Pc(95) int local95 = local56;
					if ((Static119.aByteArrayArrayArray5[1][local68][local72] & 0x2) == 2) {
						local95 = local56 - 1;
					}
					if (local95 >= 0) {
						local93 = arg0[local95];
					}
					Static31.method571(local76, local72, local7, local93, arg3, local68, local64, local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!jg;B)V")
	public static void method2479(@OriginalArg(0) Class44 arg0) {
		Static145.aClass44_28 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method2480() {
		aClass46_1185 = null;
		anIntArray393 = null;
		anIntArray392 = null;
		aClass57_24 = null;
		aClass59_12 = null;
		aClass46Array22 = null;
		aClass46_1186 = null;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)J")
	public static synchronized long method2481() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static6.aLong7 > local5) {
			Static147.aLong115 += Static6.aLong7 - local5;
		}
		Static6.aLong7 = local5;
		return Static147.aLong115 + local5;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
	public static void method2482() {
		Static61.aClass57_13.method1715();
		Static97.aClass57_14.method1715();
	}
}
