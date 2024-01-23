import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!pk;")
	public static Class132 aClass132_85;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!pk;")
	public static Class132 aClass132_86;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!pk;")
	public static Class132 aClass132_87;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!hl;III)V")
	public static void method3692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt2196 == -1 && arg2.anIntArray156 == null) {
			return;
		}
		@Pc(21) int local21 = arg2.anInt2190 * Static106.anInt2205 >> 8;
		@Pc(23) int local23 = 0;
		if (arg2.anInt2195 < arg3) {
			local23 = arg3 - arg2.anInt2195;
		} else if (arg2.anInt2180 > arg3) {
			local23 = arg2.anInt2180 - arg3;
		}
		if (arg2.anInt2189 < arg0) {
			local23 += arg0 - arg2.anInt2189;
		} else if (arg0 < arg2.anInt2193) {
			local23 += arg2.anInt2193 - arg0;
		}
		if (arg2.anInt2177 == 0 || local23 - 64 > arg2.anInt2177 || Static106.anInt2205 == 0 || arg4 != arg2.anInt2186) {
			if (arg2.aClass8_Sub8_Sub4_3 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(arg2.aClass8_Sub8_Sub4_3);
				arg2.aClass8_Sub8_Sub4_3 = null;
			}
			if (arg2.aClass8_Sub8_Sub4_2 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(arg2.aClass8_Sub8_Sub4_2);
				arg2.aClass8_Sub8_Sub4_2 = null;
			}
			return;
		}
		local23 -= 64;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(147) int local147 = local21 * (arg2.anInt2177 - local23) / arg2.anInt2177;
		if (arg2.aClass8_Sub8_Sub4_3 != null) {
			arg2.aClass8_Sub8_Sub4_3.method3717(local147);
		} else if (arg2.anInt2196 >= 0) {
			@Pc(167) Class104 local167 = Static308.method2415(Static207.aClass132_72, arg2.anInt2196, 0);
			if (local167 != null) {
				@Pc(175) Class8_Sub20_Sub1 local175 = local167.method2417().method3542(Static224.aClass75_1);
				@Pc(180) Class8_Sub8_Sub4 local180 = Static309.method3729(local175, local147);
				local180.method3716(-1);
				Static84.aClass8_Sub8_Sub1_1.method834(local180);
				arg2.aClass8_Sub8_Sub4_3 = local180;
			}
		}
		if (arg2.aClass8_Sub8_Sub4_2 != null) {
			arg2.aClass8_Sub8_Sub4_2.method3717(local147);
			if (!arg2.aClass8_Sub8_Sub4_2.method4272()) {
				arg2.aClass8_Sub8_Sub4_2 = null;
			}
		} else if (arg2.anIntArray156 != null && (arg2.anInt2194 -= arg1) <= 0) {
			@Pc(213) int local213 = (int) ((double) arg2.anIntArray156.length * Math.random());
			@Pc(221) Class104 local221 = Static308.method2415(Static207.aClass132_72, arg2.anIntArray156[local213], 0);
			if (local221 != null) {
				@Pc(229) Class8_Sub20_Sub1 local229 = local221.method2417().method3542(Static224.aClass75_1);
				@Pc(234) Class8_Sub8_Sub4 local234 = Static309.method3729(local229, local147);
				local234.method3716(0);
				Static84.aClass8_Sub8_Sub1_1.method834(local234);
				arg2.aClass8_Sub8_Sub4_2 = local234;
				arg2.anInt2194 = (int) (Math.random() * (double) (arg2.anInt2183 - arg2.anInt2187)) + arg2.anInt2187;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!pk;I)[Lclient!wk;")
	public static Class43_Sub2[] method3694(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		return Static34.method533(arg0, arg1) ? Static137.method1324() : null;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!tk;B)Lclient!tk;")
	public static Class159 method3695(@OriginalArg(0) Class159 arg0) {
		@Pc(8) Class159 local8 = Static42.method666(arg0);
		if (local8 == null) {
			local8 = arg0.aClass159_18;
		}
		return local8;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIII)V")
	public static void method3696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static15.method286(false);
		Static162.anInt3359 = arg0;
		Static118.anInt2385 = arg1;
		Static160.method2562(arg2);
	}
}
