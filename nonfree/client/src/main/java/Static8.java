import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Lclient!cq;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Lclient!qp;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public static int anInt109 = 0;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	public static int anInt112 = 13156520;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
	public static boolean aBoolean13 = true;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIB)V")
	public static void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static338.method5614(arg0, arg3, arg4, arg2);
			}
		} else if (local15 == 0) {
			Static288.method5030(arg4, arg1, arg0, arg3);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(53) int local53 = arg0 - (local44 * arg3 >> 12);
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (Static60.anInt1399 > arg1) {
				local71 = (Static60.anInt1399 * local44 >> 12) + local53;
				local69 = Static60.anInt1399;
			} else if (arg1 <= Static138.anInt6334) {
				local69 = arg1;
				local71 = arg2;
			} else {
				local71 = (local44 * Static138.anInt6334 >> 12) + local53;
				local69 = Static138.anInt6334;
			}
			@Pc(104) int local104;
			@Pc(113) int local113;
			if (Static60.anInt1399 > arg3) {
				local104 = Static60.anInt1399;
				local113 = local53 + (local44 * Static60.anInt1399 >> 12);
			} else if (arg3 <= Static138.anInt6334) {
				local113 = arg0;
				local104 = arg3;
			} else {
				local104 = Static138.anInt6334;
				local113 = local53 + (Static138.anInt6334 * local44 >> 12);
			}
			if (local113 < Static41.anInt1131) {
				local113 = Static41.anInt1131;
				local104 = (Static41.anInt1131 - local53 << 12) / local44;
			} else if (Static165.anInt3409 < local113) {
				local104 = (Static165.anInt3409 - local53 << 12) / local44;
				local113 = Static165.anInt3409;
			}
			if (Static41.anInt1131 > local71) {
				local71 = Static41.anInt1131;
				local69 = (Static41.anInt1131 - local53 << 12) / local44;
			} else if (Static165.anInt3409 < local71) {
				local69 = (Static165.anInt3409 - local53 << 12) / local44;
				local71 = Static165.anInt3409;
			}
			Static90.method1436(local104, local113, arg4, local71, local69);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
	public static void method113() {
		while (true) {
			@Pc(20) Class1_Sub40 local20 = (Class1_Sub40) Static274.aClass14_29.method310();
			if (local20 == null) {
				return;
			}
			if (Static347.aClass83ArrayArrayArray3 != null) {
				@Pc(36) Class10_Sub1_Sub2 local36;
				@Pc(32) int local32;
				if (local20.anInt5973 >= 0) {
					local32 = local20.anInt5973 - 1;
					local36 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local32];
				} else {
					local32 = -local20.anInt5973 - 1;
					if (Static301.anInt6030 == local32) {
						local36 = Static127.aClass10_Sub1_Sub2_Sub2_1;
					} else {
						local36 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local32];
					}
				}
				if (local36 != null) {
					@Pc(66) Class79 local66 = Static129.method2097(local20.anInt5983);
					@Pc(81) int local81;
					@Pc(84) int local84;
					if (local20.anInt5972 == 1 || local20.anInt5972 == 3) {
						local81 = local66.anInt1897;
						local84 = local66.anInt1884;
					} else {
						local81 = local66.anInt1884;
						local84 = local66.anInt1897;
					}
					@Pc(100) int local100 = local20.anInt5979 + (local81 >> 1);
					@Pc(109) int local109 = (local81 + 1 >> 1) + local20.anInt5979;
					@Pc(116) int local116 = (local84 >> 1) + local20.anInt5975;
					@Pc(126) int local126 = local20.anInt5975 + (local84 + 1 >> 1);
					@Pc(131) Class12 local131 = Static263.aClass12Array2[local36.aByte73];
					@Pc(153) int local153 = local131.method2704(local100, local116) + local131.method2704(local109, local116) + local131.method2704(local100, local126) + local131.method2704(local109, local126) >> 2;
					@Pc(155) Interface4 local155 = null;
					@Pc(160) int local160 = Static151.anIntArray300[local20.anInt5974];
					if (local160 == 0) {
						local155 = (Interface4) Static107.method1713(local36.aByte73, local20.anInt5979, local20.anInt5975);
					} else if (local160 == 1) {
						local155 = (Interface4) Static14.method198(local36.aByte73, local20.anInt5979, local20.anInt5975);
					} else if (local160 == 2) {
						local155 = (Interface4) Static183.method3234(local36.aByte73, local20.anInt5979, local20.anInt5975, jb.class);
					} else if (local160 == 3) {
						local155 = (Interface4) Static137.method4969(local36.aByte73, local20.anInt5979, local20.anInt5975);
					}
					if (local155 != null) {
						Static231.method4186(local20.anInt5976, 0, 0, local20.anInt5980 + 1, -1, local20.anInt5979, local36.aByte73, local160, local20.anInt5975);
						local36.anInt4080 = local81 * 64 + local20.anInt5979 * 128;
						local36.anInt4077 = local20.anInt5980 + Static282.anInt3516;
						local36.anInt4086 = local153;
						local36.anInterface4_3 = local155;
						local36.anInt4083 = local20.anInt5975 * 128 + local84 * 64;
						local36.anInt4079 = Static282.anInt3516 + local20.anInt5976;
						@Pc(285) int local285 = local20.anInt5970;
						@Pc(288) int local288 = local20.anInt5969;
						@Pc(291) int local291 = local20.anInt5977;
						@Pc(294) int local294 = local20.anInt5971;
						@Pc(299) int local299;
						if (local288 < local285) {
							local299 = local285;
							local285 = local288;
							local288 = local299;
						}
						local36.anInt4078 = local285 + local20.anInt5979;
						if (local291 > local294) {
							local299 = local291;
							local291 = local294;
							local294 = local299;
						}
						local36.anInt4087 = local288 + local20.anInt5979;
						local36.anInt4082 = local20.anInt5975 + local294;
						local36.anInt4084 = local20.anInt5975 + local291;
					}
				}
			}
		}
	}
}
