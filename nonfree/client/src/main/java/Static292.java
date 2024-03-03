import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt5918;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 7)
	public static void method5382() {
		Class197.aClass135_32.method3545();
		for (@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Class92.aClass135_19.method3552(); local13 != null; local13 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			if (local13.anInt1004 < 1000) {
				local13.method6469();
				Class197.aClass135_32.method3541(local13);
			}
		}
		Class197.aClass135_32.method3543(Class92.aClass135_19);
		@Pc(41) int local41 = -1;
		if (Static345.aClass2_Sub24_1 != null) {
			local41 = Static345.aClass2_Sub24_1.method5248();
		}
		if (!Class243.aBoolean477) {
			if (local41 == 0 && (Class160.anInt4082 == 1 && Class2_Sub3_Sub24.anInt4949 > 2 || Static194.method3711())) {
				local41 = 2;
			}
			if (local41 == 2 && Class2_Sub3_Sub24.anInt4949 > 0 && Static345.aClass2_Sub24_1 != null) {
				if (Class243.aClass161_14 == null && Class229.anInt6437 == 0) {
					Static362.method6440(Static345.aClass2_Sub24_1.method5244(), Static345.aClass2_Sub24_1.method5243());
				} else {
					Class84.anInt2354 = 2;
				}
			}
			if (local41 == 0 && Class2_Sub3_Sub24.anInt4949 > 0) {
				Static136.method2697();
			}
			if (Class243.aClass161_14 == null && Class229.anInt6437 == 0) {
				Class84.anInt2354 = 0;
				Static31.aClass2_Sub5_2 = null;
			}
			return;
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		if (local41 == -1) {
			local57 = Static210.aClass119_1.method3305();
			local61 = Static210.aClass119_1.method3314();
			if (local57 < Static282.anInt5731 - 10 || local57 > Static100.anInt2217 + Static282.anInt5731 + 10 || local61 < Static338.anInt6788 - 10 || local61 > Static338.anInt6788 + Static327.anInt6507 + 10) {
				Class243.aBoolean477 = false;
				Static344.method6222(Static100.anInt2217, Static282.anInt5731, Static327.anInt6507, Static338.anInt6788);
			}
		}
		if (local41 != 0) {
			return;
		}
		local57 = Static282.anInt5731;
		local61 = Static338.anInt6788;
		@Pc(117) int local117 = Static100.anInt2217;
		@Pc(121) int local121 = Static345.aClass2_Sub24_1.method5244();
		@Pc(125) int local125 = Static345.aClass2_Sub24_1.method5243();
		@Pc(127) int local127 = -1;
		@Pc(145) int local145;
		for (@Pc(129) int local129 = 0; local129 < Class2_Sub3_Sub24.anInt4949; local129++) {
			if (Class179.aBoolean371) {
				local145 = local61 + (Class2_Sub3_Sub24.anInt4949 - (local129 + 1)) * 16 + 33;
				if (local57 < local121 && local57 + local117 > local121 && local125 > local145 - 13 && local145 + 4 > local125) {
					local127 = local129;
				}
			} else {
				local145 = local61 + (-local129 + -1 + Class2_Sub3_Sub24.anInt4949) * 16 + 31;
				if (local57 < local121 && local121 < local117 + local57 && local145 - 13 < local125 && local125 < local145 + 3) {
					local127 = local129;
				}
			}
		}
		if (local127 != -1) {
			local145 = 0;
			@Pc(232) Class75 local232 = new Class75(Class92.aClass135_19);
			for (@Pc(237) Class2_Sub5 local237 = (Class2_Sub5) local232.method2183(); local237 != null; local237 = (Class2_Sub5) local232.method2180()) {
				if (local145 == local127) {
					Static239.method4428(local237, local121, local125);
				}
				local145++;
			}
		}
		Class243.aBoolean477 = false;
		Static344.method6222(Static100.anInt2217, Static282.anInt5731, Static327.anInt6507, Static338.anInt6788);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 158)
	public static void method5383() {
		Class150.aClass2_Sub4_Sub2_3.method4870();
		@Pc(13) int local13 = Class150.aClass2_Sub4_Sub2_3.method4869(8);
		@Pc(18) int local18;
		if (local13 < Class117.anInt3183) {
			for (local18 = local13; local18 < Class117.anInt3183; local18++) {
				Class12_Sub1_Sub1.anIntArray291[OutputStream_Sub1.anInt4443++] = Class149.anIntArray230[local18];
			}
		}
		if (Class117.anInt3183 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Class117.anInt3183 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(64) int local64 = Class149.anIntArray230[local18];
			@Pc(68) Class11_Sub5_Sub2_Sub2 local68 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local64];
			@Pc(73) int local73 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
			if (local73 == 0) {
				Class149.anIntArray230[Class117.anInt3183++] = local64;
				local68.anInt4601 = Class83.anInt2345;
			} else {
				@Pc(96) int local96 = Class150.aClass2_Sub4_Sub2_3.method4869(2);
				if (local96 == 0) {
					Class149.anIntArray230[Class117.anInt3183++] = local64;
					local68.anInt4601 = Class83.anInt2345;
					Class187.anIntArray361[Class226.anInt6378++] = local64;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local96 == 1) {
						Class149.anIntArray230[Class117.anInt3183++] = local64;
						local68.anInt4601 = Class83.anInt2345;
						local140 = Class150.aClass2_Sub4_Sub2_3.method4869(3);
						local68.method4339(1, local140);
						local150 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
						if (local150 == 1) {
							Class187.anIntArray361[Class226.anInt6378++] = local64;
						}
					} else if (local96 == 2) {
						Class149.anIntArray230[Class117.anInt3183++] = local64;
						local68.anInt4601 = Class83.anInt2345;
						if (Class150.aClass2_Sub4_Sub2_3.method4869(1) == 1) {
							local140 = Class150.aClass2_Sub4_Sub2_3.method4869(3);
							local68.method4339(2, local140);
							local150 = Class150.aClass2_Sub4_Sub2_3.method4869(3);
							local68.method4339(2, local150);
						} else {
							local140 = Class150.aClass2_Sub4_Sub2_3.method4869(3);
							local68.method4339(0, local140);
						}
						local140 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
						if (local140 == 1) {
							Class187.anIntArray361[Class226.anInt6378++] = local64;
						}
					} else if (local96 == 3) {
						Class12_Sub1_Sub1.anIntArray291[OutputStream_Sub1.anInt4443++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Lclient!oo;", line = 273)
	public static Class12_Sub6 method5384() {
		@Pc(8) Class12_Sub6 local8 = (Class12_Sub6) Class11_Sub5_Sub4.aClass36_9.method1426();
		if (local8 == null) {
			return new Class12_Sub6();
		} else {
			Class191.anInt5362--;
			return local8;
		}
	}
}
