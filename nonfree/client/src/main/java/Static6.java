import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_4 = new Class217(83, 12);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIII)I")
	public static int method48(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	public static void method49() {
		for (@Pc(15) Class10_Sub34 local15 = (Class10_Sub34) Static99.aClass163_18.method3620(); local15 != null; local15 = (Class10_Sub34) Static99.aClass163_18.method3621()) {
			if (Static309.aClass11ArrayArrayArray2 == null) {
				local15.method6033();
			} else {
				@Pc(33) int local33;
				@Pc(129) Class24_Sub4 local129;
				@Pc(142) Class24_Sub4_Sub3 local142;
				@Pc(172) Class24_Sub3 local172;
				@Pc(85) Class24_Sub1 local85;
				@Pc(46) Class24_Sub5 local46;
				@Pc(98) Class24_Sub1_Sub2 local98;
				@Pc(59) Class24_Sub5_Sub1 local59;
				if (Static400.anInt6752 >= local15.anInt5326) {
					local33 = Static164.anIntArray417[local15.anInt5328];
					if (local33 == 0) {
						local46 = Static96.method1755(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local46 instanceof Class24_Sub5_Sub1) {
							Static45.method5775(local15.anInt5317, local15.anInt5320, local15.anInt5327);
							local59 = (Class24_Sub5_Sub1) local46;
							if (local59.aClass24_Sub5_3 != null) {
								Static327.method3799(local15.anInt5317, local15.anInt5320, local15.anInt5327, local59.aClass24_Sub5_3, null);
							}
						}
					} else if (local33 == 1) {
						local85 = Static137.method2391(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local85 instanceof Class24_Sub1_Sub2) {
							Static125.method2189(local15.anInt5317, local15.anInt5320, local15.anInt5327);
							local98 = (Class24_Sub1_Sub2) local85;
							if (local98.aClass24_Sub1_3 != null) {
								Static267.method3810(local15.anInt5317, local15.anInt5320, local15.anInt5327, local98.aClass24_Sub1_3, null);
							}
						}
					} else if (local33 == 2) {
						local172 = Static106.method1867(local15.anInt5317, local15.anInt5320, local15.anInt5327, rj.class);
						if (local172 instanceof Class24_Sub3_Sub3) {
							Static425.method5654(local15.anInt5317, local15.anInt5320, local15.anInt5327, rj.class);
							@Pc(193) Class24_Sub3_Sub3 local193 = (Class24_Sub3_Sub3) local172;
							if (local193.aClass24_Sub3_2 != null) {
								Static10.method119(local193.aClass24_Sub3_2, false);
							}
						}
					} else if (local33 == 3) {
						local129 = Static447.method5138(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local129 instanceof Class24_Sub4_Sub3) {
							Static191.method3042(local15.anInt5317, local15.anInt5320, local15.anInt5327);
							local142 = (Class24_Sub4_Sub3) local129;
							if (local142.aClass24_Sub4_2 != null) {
								Static191.method3040(local15.anInt5317, local15.anInt5320, local15.anInt5327, local142.aClass24_Sub4_2);
							}
						}
					}
					local15.method6033();
				} else if (Static400.anInt6752 == local15.anInt5319) {
					local33 = Static164.anIntArray417[local15.anInt5328];
					if (local33 == 0) {
						local46 = Static96.method1755(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local46 instanceof Class24_Sub5_Sub1) {
							local15.method6033();
						} else if (Static140.method2396(local15.anInt5317, local15.anInt5320, local15.anInt5327) == null) {
							local59 = new Class24_Sub5_Sub1(local15.anInt5328, local15.anInt5321, local15.anInt5331, local15.anInt5322, local15.anInt5318, local46);
							Static327.method3799(local15.anInt5317, local15.anInt5320, local15.anInt5327, local59, null);
						} else {
							local15.method6033();
						}
					} else if (local33 == 1) {
						local85 = Static137.method2391(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local85 instanceof Class24_Sub1_Sub2) {
							local15.method6033();
						} else if (Static337.method4524(local15.anInt5317, local15.anInt5320, local15.anInt5327) == null) {
							local98 = new Class24_Sub1_Sub2(local15.anInt5328, local15.anInt5321, local15.anInt5331, local15.anInt5322, local15.anInt5318, local85);
							Static267.method3810(local15.anInt5317, local15.anInt5320, local15.anInt5327, local98, null);
						} else {
							local15.method6033();
						}
					} else if (local33 == 2) {
						local172 = Static106.method1867(local15.anInt5317, local15.anInt5320, local15.anInt5327, rj.class);
						if (local172 instanceof Class24_Sub3_Sub3) {
							local15.method6033();
						} else {
							Static425.method5654(local15.anInt5317, local15.anInt5320, local15.anInt5327, rj.class);
							@Pc(326) Class126 local326 = Static342.aClass237_4.method5212(local15.anInt5325);
							@Pc(344) int local344;
							@Pc(341) int local341;
							if (local15.anInt5321 == 1 || local15.anInt5321 == 3) {
								local341 = local326.anInt3785;
								local344 = local326.anInt3782;
							} else {
								local341 = local326.anInt3782;
								local344 = local326.anInt3785;
							}
							@Pc(385) Class24_Sub3_Sub3 local385 = new Class24_Sub3_Sub3(local15.anInt5328, local15.anInt5321, local15.anInt5317, local15.anInt5331, local15.anInt5322, local15.anInt5318, local15.anInt5320, local15.anInt5320 + local344 - 1, local15.anInt5327, local341 + local15.anInt5327 - 1, local172);
							Static10.method119(local385, false);
						}
					} else if (local33 == 3) {
						local129 = Static447.method5138(local15.anInt5317, local15.anInt5320, local15.anInt5327);
						if (local129 instanceof Class24_Sub4_Sub3) {
							local15.method6033();
						} else {
							local142 = new Class24_Sub4_Sub3(local15.anInt5331, local15.anInt5322, local15.anInt5318, local129);
							Static191.method3040(local15.anInt5317, local15.anInt5320, local15.anInt5327, local142);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
	public static int method50(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZBII)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static300.anInt5179 = arg2;
		Static387.anInt6600 = arg4;
		Static200.anInt3979 = arg5;
		Static281.anInt6554 = arg0;
		Static125.anInt2573 = arg1;
		if (arg3 && Static281.anInt6554 >= 100) {
			Static50.anInt906 = Static200.anInt3979 * 128 + 64;
			Static80.anInt1679 = Static125.anInt2573 * 128 + 64;
			Static8.anInt121 = Static326.method4459(Static96.anInt1983, Static80.anInt1679, Static50.anInt906) - Static387.anInt6600;
		}
		Static157.anInt3176 = 2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIII)I")
	public static int method52(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg2;
		@Pc(31) int local31 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return ((local8 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8) + local31;
	}
}
