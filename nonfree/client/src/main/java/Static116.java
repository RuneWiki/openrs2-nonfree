import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!nd", name = "Bc", descriptor = "Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 aClass4_Sub1_Sub7_Sub2_3;

	@OriginalMember(owner = "client!nd", name = "Dc", descriptor = "I")
	public static int anInt2858;

	@OriginalMember(owner = "client!nd", name = "qc", descriptor = "I")
	public static final int anInt2850 = 5063219;

	@OriginalMember(owner = "client!nd", name = "rc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1045 = Static177.method3050("Stufe)2");

	@OriginalMember(owner = "client!nd", name = "vc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1046 = Static177.method3050("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!nd", name = "xc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1047 = Static177.method3050("mapflag");

	@OriginalMember(owner = "client!nd", name = "Ac", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!nd", name = "Cc", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!nd", name = "Ec", descriptor = "I")
	public static int anInt2859 = 128;

	@OriginalMember(owner = "client!nd", name = "Fc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1048 = Static177.method3050("leuchten2:");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBI)V")
	public static void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class4_Sub24 local6 = (Class4_Sub24) Static121.aClass11_12.method274(); local6 != null; local6 = (Class4_Sub24) Static121.aClass11_12.method271()) {
			if (local6.anInt3614 != -1 || local6.anIntArray352 != null) {
				@Pc(17) int local17 = 0;
				if (local6.anInt3609 < arg3) {
					local17 = arg3 - local6.anInt3609;
				} else if (local6.anInt3605 > arg3) {
					local17 = local6.anInt3605 - arg3;
				}
				if (local6.anInt3613 < arg2) {
					local17 += arg2 - local6.anInt3613;
				} else if (arg2 < local6.anInt3616) {
					local17 += local6.anInt3616 - arg2;
				}
				if (local6.anInt3610 < local17 - 64 || Static122.anInt2962 == 0 || arg0 != local6.anInt3606) {
					if (local6.aClass4_Sub2_Sub2_1 != null) {
						Static50.aClass4_Sub2_Sub1_1.method1074(local6.aClass4_Sub2_Sub2_1);
						local6.aClass4_Sub2_Sub2_1 = null;
					}
					if (local6.aClass4_Sub2_Sub2_2 != null) {
						Static50.aClass4_Sub2_Sub1_1.method1074(local6.aClass4_Sub2_Sub2_2);
						local6.aClass4_Sub2_Sub2_2 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(130) int local130 = (local6.anInt3610 - local17) * Static122.anInt2962 / local6.anInt3610;
					if (local6.aClass4_Sub2_Sub2_1 != null) {
						local6.aClass4_Sub2_Sub2_1.method1337(local130);
					} else if (local6.anInt3614 >= 0) {
						@Pc(145) Class13 local145 = Static191.method352(Static188.aClass62_Sub1_103, local6.anInt3614, 0);
						if (local145 != null) {
							@Pc(152) Class4_Sub12_Sub1 local152 = local145.method354().method3060(Static60.aClass25_1);
							@Pc(157) Class4_Sub2_Sub2 local157 = Static192.method1306(local152, local130);
							local157.method1335(-1);
							Static50.aClass4_Sub2_Sub1_1.method1076(local157);
							local6.aClass4_Sub2_Sub2_1 = local157;
						}
					}
					if (local6.aClass4_Sub2_Sub2_2 != null) {
						local6.aClass4_Sub2_Sub2_2.method1337(local130);
						if (!local6.aClass4_Sub2_Sub2_2.method3174()) {
							local6.aClass4_Sub2_Sub2_2 = null;
						}
					} else if (local6.anIntArray352 != null && (local6.anInt3615 -= arg1) <= 0) {
						@Pc(194) int local194 = (int) (Math.random() * (double) local6.anIntArray352.length);
						@Pc(202) Class13 local202 = Static191.method352(Static188.aClass62_Sub1_103, local6.anIntArray352[local194], 0);
						if (local202 != null) {
							@Pc(209) Class4_Sub12_Sub1 local209 = local202.method354().method3060(Static60.aClass25_1);
							@Pc(214) Class4_Sub2_Sub2 local214 = Static192.method1306(local209, local130);
							local214.method1335(0);
							Static50.aClass4_Sub2_Sub1_1.method1076(local214);
							local6.anInt3615 = local6.anInt3603 + (int) ((double) (local6.anInt3604 - local6.anInt3603) * Math.random());
							local6.aClass4_Sub2_Sub2_2 = local214;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[Lclient!jd;I)Lclient!jd;")
	public static Class46 method2123(@OriginalArg(1) int arg0, @OriginalArg(2) Class46[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[arg2 + local9] == null) {
				arg1[arg2 + local9] = Static65.aClass46_670;
			}
			local7 += arg1[local9 + arg2].anInt2141;
		}
		@Pc(38) int local38 = 0;
		@Pc(41) byte[] local41 = new byte[local7];
		@Pc(51) Class46 local51;
		for (@Pc(43) int local43 = 0; local43 < arg0; local43++) {
			local51 = arg1[arg2 + local43];
			Static189.method187(local51.aByteArray20, 0, local41, local38, local51.anInt2141);
			local38 += local51.anInt2141;
		}
		local51 = new Class46();
		local51.aByteArray20 = local41;
		local51.anInt2141 = local7;
		return local51;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZJ)Lclient!jd;")
	public static Class46 method2124(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			@Pc(38) long local38 = arg0;
			while (local38 != 0L) {
				local38 /= 37L;
				local36++;
			}
			@Pc(54) byte[] local54 = new byte[local36];
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local36--;
				local54[local36] = Static106.aByteArray30[(int) (local58 - arg0 * 37L)];
			}
			@Pc(83) Class46 local83 = new Class46();
			local83.aByteArray20 = local54;
			local83.anInt2141 = local54.length;
			return local83;
		}
	}
}
