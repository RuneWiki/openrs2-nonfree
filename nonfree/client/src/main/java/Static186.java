import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
	public static boolean aBoolean264;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	public static int anInt3405;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZJIBI)Ljava/lang/String;")
	public static String method3044(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(17) char local17 = '.';
		if (arg2 == 0) {
			local17 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local17 = ' ';
		}
		@Pc(30) boolean local30 = false;
		if (arg1 < 0L) {
			local30 = true;
			arg1 = -arg1;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg3 > 0) {
			for (local50 = 0; local50 < arg3; local50++) {
				local55 = (int) arg1;
				arg1 /= 10L;
				local46.append((char) (local55 + 48 - (int) arg1 * 10));
			}
			local46.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg1;
			arg1 /= 10L;
			local46.append((char) (local55 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local30) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg0) {
				local50++;
				if (local50 % 3 == 0) {
					local46.append(local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method3046() {
		for (@Pc(14) Class2_Sub47 local14 = (Class2_Sub47) Static31.aClass249_31.method6527(); local14 != null; local14 = (Class2_Sub47) Static31.aClass249_31.method6525()) {
			if (Static399.aClass262ArrayArrayArray2 == null) {
				local14.method7802();
			} else {
				@Pc(40) int local40;
				@Pc(261) Class1_Sub2 local261;
				@Pc(297) Class1_Sub2_Sub1 local297;
				@Pc(206) Class1_Sub3 local206;
				@Pc(61) Class1_Sub4 local61;
				@Pc(106) Class1_Sub1 local106;
				@Pc(242) Class1_Sub3_Sub1 local242;
				@Pc(80) Class1_Sub4_Sub3 local80;
				if (local14.anInt9145 <= Static115.anInt2326) {
					local40 = Static525.anIntArray700[local14.anInt9133];
					if (local40 == 0) {
						local261 = Static524.method7595(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local261 instanceof Class1_Sub2_Sub1) {
							Static262.method6148(local14.anInt9142, local14.anInt9139, local14.anInt9134);
							local297 = (Class1_Sub2_Sub1) local261;
							if (local297.aClass1_Sub2_1 != null) {
								Static272.method4333(local14.anInt9142, local14.anInt9139, local14.anInt9134, local297.aClass1_Sub2_1, null);
							}
						}
					} else if (local40 == 1) {
						local206 = Static55.method1029(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local206 instanceof Class1_Sub3_Sub1) {
							Static181.method2999(local14.anInt9142, local14.anInt9139, local14.anInt9134);
							local242 = (Class1_Sub3_Sub1) local206;
							if (local242.aClass1_Sub3_1 != null) {
								Static255.method4007(local14.anInt9142, local14.anInt9139, local14.anInt9134, local242.aClass1_Sub3_1, null);
							}
						}
					} else if (local40 == 2) {
						local106 = Static214.method3907(local14.anInt9142, local14.anInt9139, local14.anInt9134, ej.class);
						if (local106 instanceof Class1_Sub1_Sub6) {
							Static529.method7633(local14.anInt9142, local14.anInt9139, local14.anInt9134, ej.class);
							@Pc(468) Class1_Sub1_Sub6 local468 = (Class1_Sub1_Sub6) local106;
							if (local468.aClass1_Sub1_2 != null) {
								Static58.method1076(local468.aClass1_Sub1_2, false);
							}
						}
					} else if (local40 == 3) {
						local61 = Static427.method6584(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local61 instanceof Class1_Sub4_Sub3) {
							Static108.method2071(local14.anInt9142, local14.anInt9139, local14.anInt9134);
							local80 = (Class1_Sub4_Sub3) local61;
							if (local80.aClass1_Sub4_2 != null) {
								Static156.method2702(local14.anInt9142, local14.anInt9139, local14.anInt9134, local80.aClass1_Sub4_2);
							}
						}
					}
					local14.method7802();
				} else if (Static115.anInt2326 == local14.anInt9135) {
					local40 = Static525.anIntArray700[local14.anInt9133];
					if (local40 == 0) {
						local261 = Static524.method7595(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local261 instanceof Class1_Sub2_Sub1) {
							local14.method7802();
						} else if (Static382.method5982(local14.anInt9142, local14.anInt9139, local14.anInt9134) == null) {
							local297 = new Class1_Sub2_Sub1(local14.anInt9133, local14.anInt9138, local14.anInt9136, local14.anInt9143, local14.anInt9140, local261);
							Static272.method4333(local14.anInt9142, local14.anInt9139, local14.anInt9134, local297, null);
						} else {
							local14.method7802();
						}
					} else if (local40 == 1) {
						local206 = Static55.method1029(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local206 instanceof Class1_Sub3_Sub1) {
							local14.method7802();
						} else if (Static134.method2420(local14.anInt9142, local14.anInt9139, local14.anInt9134) == null) {
							local242 = new Class1_Sub3_Sub1(local14.anInt9133, local14.anInt9138, local14.anInt9136, local14.anInt9143, local14.anInt9140, local206);
							Static255.method4007(local14.anInt9142, local14.anInt9139, local14.anInt9134, local242, null);
						} else {
							local14.method7802();
						}
					} else if (local40 == 2) {
						local106 = Static214.method3907(local14.anInt9142, local14.anInt9139, local14.anInt9134, ej.class);
						if (local106 instanceof Class1_Sub1_Sub6) {
							local14.method7802();
						} else {
							Static529.method7633(local14.anInt9142, local14.anInt9139, local14.anInt9134, ej.class);
							@Pc(135) Class129 local135 = Static505.aClass206_4.method5326(local14.anInt9129);
							@Pc(151) int local151;
							@Pc(148) int local148;
							if (local14.anInt9138 == 1 || local14.anInt9138 == 3) {
								local148 = local135.anInt3653;
								local151 = local135.anInt3650;
							} else {
								local148 = local135.anInt3650;
								local151 = local135.anInt3653;
							}
							@Pc(192) Class1_Sub1_Sub6 local192 = new Class1_Sub1_Sub6(local14.anInt9133, local14.anInt9138, local14.anInt9142, local14.anInt9136, local14.anInt9143, local14.anInt9140, local14.anInt9139, local151 + local14.anInt9139 - 1, local14.anInt9134, local148 + local14.anInt9134 - 1, local106);
							Static58.method1076(local192, false);
						}
					} else if (local40 == 3) {
						local61 = Static427.method6584(local14.anInt9142, local14.anInt9139, local14.anInt9134);
						if (local61 instanceof Class1_Sub4_Sub3) {
							local14.method7802();
						} else {
							local80 = new Class1_Sub4_Sub3(local14.anInt9136, local14.anInt9143, local14.anInt9140, local61);
							Static156.method2702(local14.anInt9142, local14.anInt9139, local14.anInt9134, local80);
						}
					}
				}
			}
		}
	}
}
