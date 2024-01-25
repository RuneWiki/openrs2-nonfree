import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!wj;)I")
	public static int method4444(@OriginalArg(1) Class1_Sub2_Sub6 arg0) {
		if (arg0.anInt7618 == 0) {
			return 0;
		}
		@Pc(71) int local71;
		@Pc(64) int local64;
		if (arg0.anInt7580 != -1) {
			@Pc(22) Class1_Sub2_Sub6 local22 = null;
			if (arg0.anInt7580 < 32768) {
				@Pc(36) Class3_Sub40 local36 = (Class3_Sub40) Static63.aClass140_37.method3490((long) arg0.anInt7580);
				if (local36 != null) {
					local22 = local36.aClass1_Sub2_Sub6_Sub1_2;
				}
			} else if (arg0.anInt7580 >= 32768) {
				local22 = Static216.aClass1_Sub2_Sub6_Sub2Array1[arg0.anInt7580 - 32768];
			}
			if (local22 != null) {
				local64 = arg0.anInt7560 - local22.anInt7560;
				local71 = arg0.anInt7557 - local22.anInt7557;
				if (local64 != 0 || local71 != 0) {
					arg0.method6198((int) (Math.atan2((double) local64, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub2_Sub6_Sub2) {
			@Pc(170) Class1_Sub2_Sub6_Sub2 local170 = (Class1_Sub2_Sub6_Sub2) arg0;
			if (local170.anInt7647 != -1 && (local170.anInt7644 == 0 || local170.anInt7642 > 0)) {
				local170.method6198(local170.anInt7647);
				local170.anInt7647 = -1;
			}
		} else if (arg0 instanceof Class1_Sub2_Sub6_Sub1) {
			@Pc(100) Class1_Sub2_Sub6_Sub1 local100 = (Class1_Sub2_Sub6_Sub1) arg0;
			if (local100.anInt6916 != -1 && (local100.anInt7644 == 0 || local100.anInt7642 > 0)) {
				local64 = local100.anInt7560 - (local100.anInt6916 - Static59.anInt1127 - Static59.anInt1127) * 64;
				local71 = local100.anInt7557 - (local100.anInt6921 - Static49.anInt873 - Static49.anInt873) * 64;
				if (local64 != 0 || local71 != 0) {
					local100.method6198((int) (Math.atan2((double) local64, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
				local100.anInt6916 = -1;
			}
		}
		return arg0.method6196();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Lclient!js;")
	public static Class123 method4445(@OriginalArg(0) int arg0) {
		@Pc(8) Class123[] local8 = Static192.method3009();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(24) Class123 local24 = local8[local10];
			if (local24.anInt3588 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Lclient!bb;")
	public static Class1_Sub1 method4446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!qa;Lclient!a;III)V")
	public static void method4447(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class227 local12;
		if (arg3 < Static459.anInt5916) {
			local12 = Static389.aClass227ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass1_Sub4_2 != null && local12.aClass1_Sub4_2.method6247()) {
				arg1.method6248(0, local12.aClass1_Sub4_2, Static99.anInt1803, 0, arg0, true);
			}
		}
		if (arg4 < Static459.anInt5916) {
			local12 = Static389.aClass227ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_2 != null && local12.aClass1_Sub4_2.method6247()) {
				arg1.method6248(0, local12.aClass1_Sub4_2, 0, Static99.anInt1803, arg0, true);
			}
		}
		if (arg3 < Static459.anInt5916 && arg4 < Static342.anInt5746) {
			local12 = Static389.aClass227ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_2 != null && local12.aClass1_Sub4_2.method6247()) {
				arg1.method6248(0, local12.aClass1_Sub4_2, Static99.anInt1803, Static99.anInt1803, arg0, true);
			}
		}
		if (arg3 < Static459.anInt5916 && arg4 > 0) {
			local12 = Static389.aClass227ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass1_Sub4_2 != null && local12.aClass1_Sub4_2.method6247()) {
				arg1.method6248(0, local12.aClass1_Sub4_2, Static99.anInt1803, -Static99.anInt1803, arg0, true);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)Z")
	public static boolean method4448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
