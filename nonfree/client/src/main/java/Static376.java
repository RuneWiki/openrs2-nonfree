import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
	public static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)J")
	public static synchronized long method6088() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static167.aLong108) {
			Static217.aLong128 += Static167.aLong108 - local5;
		}
		Static167.aLong108 = local5;
		return local5 + Static217.aLong128;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method6089() {
		Static89.aClass3_Sub7_Sub1_2.method1500();
		@Pc(11) int local11 = Static89.aClass3_Sub7_Sub1_2.method1499(8);
		@Pc(20) int local20;
		if (local11 < Static268.anInt5680) {
			for (local20 = local11; local20 < Static268.anInt5680; local20++) {
				Static207.anIntArray274[Static401.anInt7845++] = Static304.anIntArray377[local20];
			}
		}
		if (local11 > Static268.anInt5680) {
			throw new RuntimeException("gnpov1");
		}
		Static268.anInt5680 = 0;
		for (local20 = 0; local20 < local11; local20++) {
			@Pc(60) int local60 = Static304.anIntArray377[local20];
			@Pc(68) Class2_Sub2_Sub1_Sub2 local68 = ((Class3_Sub46) Static331.aClass25_25.method946((long) local60)).aClass2_Sub2_Sub1_Sub2_2;
			@Pc(75) int local75 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
			if (local75 == 0) {
				Static304.anIntArray377[Static268.anInt5680++] = local60;
				local68.anInt7628 = Static129.anInt10429;
			} else {
				@Pc(94) int local94 = Static89.aClass3_Sub7_Sub1_2.method1499(2);
				if (local94 == 0) {
					Static304.anIntArray377[Static268.anInt5680++] = local60;
					local68.anInt7628 = Static129.anInt10429;
					Static139.anIntArray206[Static452.anInt3253++] = local60;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local94 == 1) {
						Static304.anIntArray377[Static268.anInt5680++] = local60;
						local68.anInt7628 = Static129.anInt10429;
						local135 = Static89.aClass3_Sub7_Sub1_2.method1499(3);
						local68.method6319(local135, 1);
						local145 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
						if (local145 == 1) {
							Static139.anIntArray206[Static452.anInt3253++] = local60;
						}
					} else if (local94 == 2) {
						Static304.anIntArray377[Static268.anInt5680++] = local60;
						local68.anInt7628 = Static129.anInt10429;
						if (Static89.aClass3_Sub7_Sub1_2.method1499(1) == 1) {
							local135 = Static89.aClass3_Sub7_Sub1_2.method1499(3);
							local68.method6319(local135, 2);
							local145 = Static89.aClass3_Sub7_Sub1_2.method1499(3);
							local68.method6319(local145, 2);
						} else {
							local135 = Static89.aClass3_Sub7_Sub1_2.method1499(3);
							local68.method6319(local135, 0);
						}
						local135 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
						if (local135 == 1) {
							Static139.anIntArray206[Static452.anInt3253++] = local60;
						}
					} else if (local94 == 3) {
						Static207.anIntArray274[Static401.anInt7845++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII[BI)V")
	public static void method6090(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg1 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg0 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg3 = local39 + 1;
			arg2[local39] = 1;
		}
	}
}
