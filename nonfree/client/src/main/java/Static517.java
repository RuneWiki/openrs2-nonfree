import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rj", name = "ib", descriptor = "I")
	public static final int anInt8661 = 1403;

	@OriginalMember(owner = "client!rj", name = "kb", descriptor = "Lclient!ab;")
	public static final Class3_Sub1 aClass3_Sub1_2 = new Class3_Sub1(0, -1);

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "(I)V")
	public static void method7334() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static119.aBooleanArray10[local7] = true;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	public static void method7337() {
		Static52.aClass211_2 = Static52.aClass211_1;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
	public static int method7338(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7339(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static343.aClass104Array2 == Static605.aClass104Array3) {
			return;
		}
		@Pc(10) int local10 = Static239.aClass104Array1[arg1].method8286(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class104 local23 = Static239.aClass104Array1[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8286(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7340(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static187.anInt3432;
		@Pc(9) int[] local9 = Static668.anIntArray664;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class23_Sub2_Sub1_Sub2_Sub1 local26 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local9[local18]];
			if (local26 != null && local26 != Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 && local26.aString34 != null && local26.aString34.equalsIgnoreCase(arg1)) {
				@Pc(51) Class3_Sub44 local51;
				if (arg0 == 1) {
					local51 = Static275.method5689(Static17.aClass376_4, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4886(local9[local18]);
					local51.aClass3_Sub17_Sub2_3.method4895(0);
					Static616.method8089(local51);
				} else if (arg0 == 4) {
					local51 = Static275.method5689(Static532.aClass376_125, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4835(0);
					local51.aClass3_Sub17_Sub2_3.method4885(local9[local18]);
					Static616.method8089(local51);
				} else if (arg0 == 5) {
					local51 = Static275.method5689(Static582.aClass376_133, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4895(0);
					local51.aClass3_Sub17_Sub2_3.method4876(local9[local18]);
					Static616.method8089(local51);
				} else if (arg0 == 6) {
					local51 = Static275.method5689(Static347.aClass376_111, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4875(0);
					local51.aClass3_Sub17_Sub2_3.method4885(local9[local18]);
					Static616.method8089(local51);
				} else if (arg0 == 7) {
					local51 = Static275.method5689(Static330.aClass376_84, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4885(local9[local18]);
					local51.aClass3_Sub17_Sub2_3.method4875(0);
					Static616.method8089(local51);
				} else if (arg0 == 8) {
					local51 = Static275.method5689(Static254.aClass376_67, Static540.aClass282_4);
					local51.aClass3_Sub17_Sub2_3.method4895(0);
					local51.aClass3_Sub17_Sub2_3.method4886(local9[local18]);
					Static616.method8089(local51);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static304.method4693(Static569.aClass335_22.method7694(Static319.anInt5939) + arg1);
		}
	}
}
