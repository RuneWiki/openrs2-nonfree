import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_52 = new Class6(98, -2);

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
	public static final int[] anIntArray269 = new int[13];

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt3353 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
	public static boolean method3003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static489.method7072(arg0, arg1) || Static495.method7109(arg1, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method3004() {
		if (Static305.aBoolean404) {
			return;
		}
		Static305.aBoolean404 = true;
		Static126.aBoolean196 = true;
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean324) {
			Static443.aFloat151 = (int) Static443.aFloat151 - 65 & 0xFFFFFF80;
		} else {
			Static28.aFloat50 += (-24.0F - Static28.aFloat50) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method3008() {
		@Pc(1) Class316 local1 = Static538.aClass316_64;
		synchronized (Static538.aClass316_64) {
			Static538.aClass316_64.method7803();
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	public static void method3009() {
		for (@Pc(8) Class1_Sub47 local8 = (Class1_Sub47) Static227.aClass38_74.method1419(); local8 != null; local8 = (Class1_Sub47) Static227.aClass38_74.method1415()) {
			if (Static313.aClass206ArrayArrayArray2 == null) {
				local8.method7983();
			} else {
				@Pc(36) int local36;
				@Pc(49) Class47_Sub4 local49;
				@Pc(85) Class47_Sub4_Sub3 local85;
				@Pc(254) Class47_Sub5 local254;
				@Pc(157) Class47_Sub2 local157;
				@Pc(114) Class47_Sub3 local114;
				@Pc(288) Class47_Sub5_Sub1 local288;
				@Pc(132) Class47_Sub3_Sub2 local132;
				if (local8.anInt8051 <= Static416.anInt7252) {
					local36 = Static438.anIntArray201[local8.anInt8041];
					if (local36 == 0) {
						local49 = Static503.method7224(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local49 instanceof Class47_Sub4_Sub3) {
							Static105.method2287(local8.anInt8045, local8.anInt8040, local8.anInt8047);
							local85 = (Class47_Sub4_Sub3) local49;
							if (local85.aClass47_Sub4_3 != null) {
								Static535.method7846(local8.anInt8045, local8.anInt8040, local8.anInt8047, local85.aClass47_Sub4_3, null);
							}
						}
					} else if (local36 == 1) {
						local254 = Static313.method5162(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local254 instanceof Class47_Sub5_Sub1) {
							Static307.method5100(local8.anInt8045, local8.anInt8040, local8.anInt8047);
							local288 = (Class47_Sub5_Sub1) local254;
							if (local288.aClass47_Sub5_3 != null) {
								Static232.method3993(local8.anInt8045, local8.anInt8040, local8.anInt8047, local288.aClass47_Sub5_3, null);
							}
						}
					} else if (local36 == 2) {
						local157 = Static52.method1507(local8.anInt8045, local8.anInt8040, local8.anInt8047, up.class);
						if (local157 instanceof Class47_Sub2_Sub1) {
							Static119.method2670(local8.anInt8045, local8.anInt8040, local8.anInt8047, up.class);
							@Pc(422) Class47_Sub2_Sub1 local422 = (Class47_Sub2_Sub1) local157;
							if (local422.aClass47_Sub2_1 != null) {
								Static346.method5547(local422.aClass47_Sub2_1, false);
							}
						}
					} else if (local36 == 3) {
						local114 = Static167.method3276(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local114 instanceof Class47_Sub3_Sub2) {
							Static196.method3648(local8.anInt8045, local8.anInt8040, local8.anInt8047);
							local132 = (Class47_Sub3_Sub2) local114;
							if (local132.aClass47_Sub3_2 != null) {
								Static248.method4217(local8.anInt8045, local8.anInt8040, local8.anInt8047, local132.aClass47_Sub3_2);
							}
						}
					}
					local8.method7983();
				} else if (Static416.anInt7252 == local8.anInt8052) {
					local36 = Static438.anIntArray201[local8.anInt8041];
					if (local36 == 0) {
						local49 = Static503.method7224(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local49 instanceof Class47_Sub4_Sub3) {
							local8.method7983();
						} else if (Static193.method3623(local8.anInt8045, local8.anInt8040, local8.anInt8047) == null) {
							local85 = new Class47_Sub4_Sub3(local8.anInt8041, local8.anInt8038, local8.anInt8046, local8.anInt8048, local8.anInt8042, local49);
							Static535.method7846(local8.anInt8045, local8.anInt8040, local8.anInt8047, local85, null);
						} else {
							local8.method7983();
						}
					} else if (local36 == 1) {
						local254 = Static313.method5162(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local254 instanceof Class47_Sub5_Sub1) {
							local8.method7983();
						} else if (Static247.method4188(local8.anInt8045, local8.anInt8040, local8.anInt8047) == null) {
							local288 = new Class47_Sub5_Sub1(local8.anInt8041, local8.anInt8038, local8.anInt8046, local8.anInt8048, local8.anInt8042, local254);
							Static232.method3993(local8.anInt8045, local8.anInt8040, local8.anInt8047, local288, null);
						} else {
							local8.method7983();
						}
					} else if (local36 == 2) {
						local157 = Static52.method1507(local8.anInt8045, local8.anInt8040, local8.anInt8047, up.class);
						if (local157 instanceof Class47_Sub2_Sub1) {
							local8.method7983();
						} else {
							Static119.method2670(local8.anInt8045, local8.anInt8040, local8.anInt8047, up.class);
							@Pc(185) Class288 local185 = Static365.aClass194_6.method5084(local8.anInt8043);
							@Pc(198) int local198;
							@Pc(201) int local201;
							if (local8.anInt8038 == 1 || local8.anInt8038 == 3) {
								local198 = local185.anInt8343;
								local201 = local185.anInt8365;
							} else {
								local201 = local185.anInt8343;
								local198 = local185.anInt8365;
							}
							@Pc(241) Class47_Sub2_Sub1 local241 = new Class47_Sub2_Sub1(local8.anInt8041, local8.anInt8038, local8.anInt8045, local8.anInt8046, local8.anInt8048, local8.anInt8042, local8.anInt8040, local198 + local8.anInt8040 - 1, local8.anInt8047, local201 + local8.anInt8047 - 1, local157);
							Static346.method5547(local241, false);
						}
					} else if (local36 == 3) {
						local114 = Static167.method3276(local8.anInt8045, local8.anInt8040, local8.anInt8047);
						if (local114 instanceof Class47_Sub3_Sub2) {
							local8.method7983();
						} else {
							local132 = new Class47_Sub3_Sub2(local8.anInt8046, local8.anInt8048, local8.anInt8042, local114);
							Static248.method4217(local8.anInt8045, local8.anInt8040, local8.anInt8047, local132);
						}
					}
				}
			}
		}
	}
}
