import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "Lclient!cw;")
	public static Class61 aClass61_18;

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "[[S")
	public static short[][] aShortArrayArray23;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_208 = new Class288(36, 3);

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "[I")
	public static final int[] anIntArray434 = new int[14];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!nm;BIIII)V")
	public static void method5055(@OriginalArg(0) Class2_Sub33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt5976 == -1 && arg0.anIntArray438 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg0.anInt5984 * Static234.aClass2_Sub5_48.aClass6_Sub22_2.method7291() >> 8;
		if (arg4 > arg0.anInt5987) {
			local16 = arg4 - arg0.anInt5987;
		} else if (arg0.anInt5974 > arg4) {
			local16 = arg0.anInt5974 - arg4;
		}
		if (arg0.anInt5985 < arg3) {
			local16 += arg3 - arg0.anInt5985;
		} else if (arg0.anInt5988 > arg3) {
			local16 += arg0.anInt5988 - arg3;
		}
		if (arg0.anInt5973 == 0 || local16 - 256 > arg0.anInt5973 || Static234.aClass2_Sub5_48.aClass6_Sub22_2.method7291() == 0 || arg0.anInt5981 != arg2) {
			if (arg0.aClass2_Sub13_Sub2_3 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(arg0.aClass2_Sub13_Sub2_3);
				arg0.aClass2_Sub1_Sub1_3 = null;
				arg0.aClass2_Sub13_Sub2_3 = null;
				arg0.aClass2_Sub39_2 = null;
			}
			if (arg0.aClass2_Sub13_Sub2_2 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(arg0.aClass2_Sub13_Sub2_2);
				arg0.aClass2_Sub13_Sub2_2 = null;
				arg0.aClass2_Sub1_Sub1_2 = null;
				arg0.aClass2_Sub39_3 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(170) int local170 = (arg0.anInt5973 - local16) * local26 / arg0.anInt5973;
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950();
		@Pc(181) int local181 = 8192;
		@Pc(193) int local193 = (arg0.anInt5987 + arg0.anInt5974) / 2 - arg4;
		@Pc(204) int local204 = (arg0.anInt5985 + arg0.anInt5988) / 2 - arg3;
		@Pc(228) int local228;
		@Pc(242) int local242;
		if (local193 != 0 || local204 != 0) {
			local228 = -Static338.anInt5355 - (int) (Math.atan2((double) local193, (double) local204) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local228 > 8192) {
				local228 = 16384 - local228;
			}
			if (local16 <= 0) {
				local242 = 8192;
			} else if (local16 < 4096) {
				local242 = local16 * 8192 / 4096 + 8192;
			} else {
				local242 = 16384;
			}
			local181 = (16384 - local242 >> 1) + local228 * local242 / 8192;
		}
		@Pc(342) Class2_Sub13_Sub2 local342;
		if (arg0.aClass2_Sub13_Sub2_3 != null) {
			arg0.aClass2_Sub13_Sub2_3.method4470(local170);
			arg0.aClass2_Sub13_Sub2_3.method4464(local181);
		} else if (arg0.anInt5976 >= 0) {
			local228 = arg0.anInt5979 == 256 && arg0.anInt5978 == 256 ? 256 : Static440.method6030(arg0.anInt5978, arg0.anInt5979);
			if (arg0.aBoolean433) {
				if (arg0.aClass2_Sub39_2 == null) {
					arg0.aClass2_Sub39_2 = Static477.method6426(Static404.aClass380_98, arg0.anInt5976);
				}
				if (arg0.aClass2_Sub39_2 != null) {
					if (arg0.aClass2_Sub1_Sub1_3 == null) {
						arg0.aClass2_Sub1_Sub1_3 = arg0.aClass2_Sub39_2.method6420(new int[] { 22050 });
					}
					if (arg0.aClass2_Sub1_Sub1_3 != null) {
						local342 = Static652.method4446(arg0.aClass2_Sub1_Sub1_3, local228, local170 << 6, local181);
						local342.method4453(-1);
						Static586.aClass2_Sub13_Sub4_2.method7225(local342);
						arg0.aClass2_Sub13_Sub2_3 = local342;
					}
				}
			} else {
				@Pc(359) Class88 local359 = Static647.method1810(Static319.aClass380_76, arg0.anInt5976, 0);
				if (local359 != null) {
					@Pc(366) Class2_Sub1_Sub1 local366 = local359.method1813().method32(Static115.aClass217_1);
					@Pc(374) Class2_Sub13_Sub2 local374 = Static652.method4446(local366, local228, local170 << 6, local181);
					local374.method4453(-1);
					Static586.aClass2_Sub13_Sub4_2.method7225(local374);
					arg0.aClass2_Sub13_Sub2_3 = local374;
				}
			}
		}
		if (arg0.aClass2_Sub13_Sub2_2 != null) {
			arg0.aClass2_Sub13_Sub2_2.method4470(local170);
			arg0.aClass2_Sub13_Sub2_2.method4464(local181);
			if (arg0.aClass2_Sub13_Sub2_2.method8652()) {
				return;
			}
			arg0.aClass2_Sub13_Sub2_2 = null;
			arg0.aClass2_Sub1_Sub1_2 = null;
			arg0.aClass2_Sub39_3 = null;
		} else if (arg0.anIntArray438 != null && (arg0.anInt5990 -= arg1) <= 0) {
			local228 = arg0.anInt5979 == 256 && arg0.anInt5978 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt5979 - arg0.anInt5978)) + arg0.anInt5978;
			if (arg0.aBoolean435) {
				if (arg0.aClass2_Sub39_3 == null) {
					local242 = (int) (Math.random() * (double) arg0.anIntArray438.length);
					arg0.aClass2_Sub39_3 = Static477.method6426(Static404.aClass380_98, arg0.anIntArray438[local242]);
				}
				if (arg0.aClass2_Sub39_3 != null) {
					if (arg0.aClass2_Sub1_Sub1_2 == null) {
						arg0.aClass2_Sub1_Sub1_2 = arg0.aClass2_Sub39_3.method6420(new int[] { 22050 });
					}
					if (arg0.aClass2_Sub1_Sub1_2 != null) {
						local342 = Static652.method4446(arg0.aClass2_Sub1_Sub1_2, local228, local170 << 6, local181);
						local342.method4453(0);
						Static586.aClass2_Sub13_Sub4_2.method7225(local342);
						arg0.anInt5990 = arg0.anInt5975 + (int) (Math.random() * (double) (arg0.anInt5989 - arg0.anInt5975));
						arg0.aClass2_Sub13_Sub2_2 = local342;
						return;
					}
				}
				return;
			}
			local242 = (int) ((double) arg0.anIntArray438.length * Math.random());
			@Pc(525) Class88 local525 = Static647.method1810(Static319.aClass380_76, arg0.anIntArray438[local242], 0);
			if (local525 != null) {
				@Pc(532) Class2_Sub1_Sub1 local532 = local525.method1813().method32(Static115.aClass217_1);
				@Pc(540) Class2_Sub13_Sub2 local540 = Static652.method4446(local532, local228, local170 << 6, local181);
				local540.method4453(0);
				Static586.aClass2_Sub13_Sub4_2.method7225(local540);
				arg0.aClass2_Sub13_Sub2_2 = local540;
				arg0.anInt5990 = arg0.anInt5975 + (int) ((double) (arg0.anInt5989 - arg0.anInt5975) * Math.random());
				return;
			}
		}
	}
}
