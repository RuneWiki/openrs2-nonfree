import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!nj;")
	public static Class64 aClass64_3;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_33 = new Class27(4, 1, 1, 1);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	public static void method7689() {
		@Pc(1) Class352 local1 = Static318.aClass352_43;
		synchronized (Static318.aClass352_43) {
			Static318.aClass352_43.method7663(5);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7690(@OriginalArg(1) Class33 arg0) {
		if (Static333.aBoolean400) {
			Static530.method7122(arg0);
		} else {
			Static105.method2065(arg0);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJ)V")
	public static void method7691(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static443.anInt6913;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (Static11.anInt171 != local7) {
			local15 = local7 - Static11.anInt171;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local23 < local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local23 > local15) {
				local23 = local15;
			}
			Static11.anInt171 += local23;
		}
		@Pc(66) int local66 = Static149.anInt2728;
		if (local66 != Static27.anInt610) {
			local15 = local66 - Static27.anInt610;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local23 < local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local15 < local23) {
				local23 = local15;
			}
			Static27.anInt610 += local23;
		}
		Static642.aFloat230 += Static110.aFloat39 * (float) arg0 / 40.0F * 8.0F;
		Static275.aFloat105 += (float) arg0 * Static566.aFloat202 / 40.0F * 8.0F;
		Static340.method4636();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[IILclient!vk;)V")
	public static void method7692(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub2_Sub2 arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg2.anIntArray690 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg2.anIntArray690.length; local8++) {
				if (arg1[local8] != arg2.anIntArray690[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg2.anInt9981 != -1) {
				@Pc(50) Class124 local50 = Static99.aClass2_1.method22(arg2.anInt9981);
				@Pc(53) int local53 = local50.anInt3024;
				if (local53 == 1) {
					arg2.anInt9984 = 0;
					arg2.anInt9934 = arg0;
					arg2.anInt9941 = 0;
					arg2.anInt9946 = 1;
					arg2.anInt9960 = 0;
					if (!arg2.aBoolean773) {
						Static633.method8389(arg2.anInt9960, arg2, local50);
					}
				}
				if (local53 == 2) {
					arg2.anInt9984 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg2.anIntArray690 == null || arg2.anIntArray690[local8] == -1 || Static99.aClass2_1.method22(arg1[local8]).anInt3029 >= Static99.aClass2_1.method22(arg2.anIntArray690[local8]).anInt3029) {
				arg2.anInt10001 = arg2.anInt10003;
				arg2.anInt9934 = arg0;
				arg2.anIntArray690 = arg1;
			}
		}
		if (local6) {
			arg2.anInt10001 = arg2.anInt10003;
			arg2.anIntArray690 = arg1;
			arg2.anInt9934 = arg0;
		}
	}
}
