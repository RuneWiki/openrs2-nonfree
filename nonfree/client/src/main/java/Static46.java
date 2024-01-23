import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!fh;")
	public static Class58 aClass58_22;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!ld;")
	public static Class4_Sub6_Sub2 aClass4_Sub6_Sub2_3;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public static int anInt873 = 1;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public static int anInt876 = 0;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static int[] anIntArray62 = new int[2500];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILclient!gn;I)V")
	public static void method731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub11 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt2115 == -1 && arg3.anIntArray172 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(23) int local23 = arg3.anInt2127 * Static208.anInt4120 >> 8;
		if (arg1 > arg3.anInt2117) {
			local16 = arg1 - arg3.anInt2117;
		} else if (arg3.anInt2124 > arg1) {
			local16 = arg3.anInt2124 - arg1;
		}
		if (arg4 > arg3.anInt2112) {
			local16 += arg4 - arg3.anInt2112;
		} else if (arg3.anInt2113 > arg4) {
			local16 += arg3.anInt2113 - arg4;
		}
		if (arg3.anInt2123 == 0 || arg3.anInt2123 < local16 - 64 || Static208.anInt4120 == 0 || arg3.anInt2126 != arg0) {
			if (arg3.aClass4_Sub6_Sub4_3 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(arg3.aClass4_Sub6_Sub4_3);
				arg3.aClass4_Sub6_Sub4_3 = null;
			}
			if (arg3.aClass4_Sub6_Sub4_2 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(arg3.aClass4_Sub6_Sub4_2);
				arg3.aClass4_Sub6_Sub4_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(164) int local164 = (arg3.anInt2123 - local16) * local23 / arg3.anInt2123;
		if (arg3.aClass4_Sub6_Sub4_3 != null) {
			arg3.aClass4_Sub6_Sub4_3.method3390(local164);
		} else if (arg3.anInt2115 >= 0) {
			@Pc(186) Class7 local186 = Static317.method106(Static258.aClass58_92, arg3.anInt2115, 0);
			if (local186 != null) {
				@Pc(195) Class4_Sub8_Sub1 local195 = local186.method107().method3351(Static297.aClass173_1);
				@Pc(200) Class4_Sub6_Sub4 local200 = Static322.method3398(local195, local164);
				local200.method3372(-1);
				Static211.aClass4_Sub6_Sub3_2.method2687(local200);
				arg3.aClass4_Sub6_Sub4_3 = local200;
			}
		}
		if (arg3.aClass4_Sub6_Sub4_2 != null) {
			arg3.aClass4_Sub6_Sub4_2.method3390(local164);
			if (!arg3.aClass4_Sub6_Sub4_2.method4852()) {
				arg3.aClass4_Sub6_Sub4_2 = null;
			}
		} else if (arg3.anIntArray172 != null && (arg3.anInt2125 -= arg2) <= 0) {
			@Pc(234) int local234 = (int) ((double) arg3.anIntArray172.length * Math.random());
			@Pc(242) Class7 local242 = Static317.method106(Static258.aClass58_92, arg3.anIntArray172[local234], 0);
			if (local242 != null) {
				@Pc(249) Class4_Sub8_Sub1 local249 = local242.method107().method3351(Static297.aClass173_1);
				@Pc(254) Class4_Sub6_Sub4 local254 = Static322.method3398(local249, local164);
				local254.method3372(0);
				Static211.aClass4_Sub6_Sub3_2.method2687(local254);
				arg3.anInt2125 = (int) (Math.random() * (double) (arg3.anInt2116 - arg3.anInt2119)) + arg3.anInt2119;
				arg3.aClass4_Sub6_Sub4_2 = local254;
			}
		}
	}
}
