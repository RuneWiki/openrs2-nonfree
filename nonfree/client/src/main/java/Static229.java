import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public static int anInt4389 = 0;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_36 = new Class5(50);

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_154 = new Class184(35, 6);

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!jr;")
	public static final Class127 aClass127_24 = new Class127(32);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method3575(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static120.aClass64Array1 == Static401.aClass64Array3) {
			return;
		}
		@Pc(9) int local9 = Static205.aClass64Array2[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class64 local22 = Static205.aClass64Array2[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public static void method3576() {
		@Pc(5) Class5 local5 = Static122.aClass5_23;
		synchronized (Static122.aClass5_23) {
			Static122.aClass5_23.method116();
		}
		local5 = Static227.aClass5_49;
		synchronized (Static227.aClass5_49) {
			Static227.aClass5_49.method116();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method3577() {
		for (@Pc(8) Class3_Sub11 local8 = (Class3_Sub11) Static207.aClass229_27.method5328(); local8 != null; local8 = (Class3_Sub11) Static207.aClass229_27.method5325()) {
			if (Static151.aClass217ArrayArrayArray3 == null) {
				local8.method5987();
			} else {
				@Pc(33) int local33;
				@Pc(99) Class1_Sub3 local99;
				@Pc(57) Class1_Sub2 local57;
				@Pc(137) Class1_Sub1 local137;
				@Pc(172) Class1_Sub5 local172;
				@Pc(70) Class1_Sub2_Sub3 local70;
				@Pc(150) Class1_Sub1_Sub2 local150;
				@Pc(185) Class1_Sub5_Sub1 local185;
				if (local8.anInt1451 <= Static290.anInt5325) {
					local33 = Static188.anIntArray293[local8.anInt1461];
					if (local33 == 0) {
						local172 = Static391.method5292(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local172 instanceof Class1_Sub5_Sub1) {
							Static413.method3225(local8.anInt1465, local8.anInt1457, local8.anInt1459);
							local185 = (Class1_Sub5_Sub1) local172;
							if (local185.aClass1_Sub5_1 != null) {
								Static224.method3531(local8.anInt1465, local8.anInt1457, local8.anInt1459, local185.aClass1_Sub5_1, null);
							}
						}
					} else if (local33 == 1) {
						local137 = Static35.method4618(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local137 instanceof Class1_Sub1_Sub2) {
							Static19.method563(local8.anInt1465, local8.anInt1457, local8.anInt1459);
							local150 = (Class1_Sub1_Sub2) local137;
							if (local150.aClass1_Sub1_1 != null) {
								Static265.method3995(local8.anInt1465, local8.anInt1457, local8.anInt1459, local150.aClass1_Sub1_1, null);
							}
						}
					} else if (local33 == 2) {
						local99 = Static372.method1267(local8.anInt1465, local8.anInt1457, local8.anInt1459, wk.class);
						if (local99 instanceof Class1_Sub3_Sub1) {
							Static182.method3086(local8.anInt1465, local8.anInt1457, local8.anInt1459, wk.class);
							@Pc(120) Class1_Sub3_Sub1 local120 = (Class1_Sub3_Sub1) local99;
							if (local120.aClass1_Sub3_1 != null) {
								Static199.method3242(local120.aClass1_Sub3_1, false);
							}
						}
					} else if (local33 == 3) {
						local57 = Static11.method399(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local57 instanceof Class1_Sub2_Sub3) {
							Static347.method4972(local8.anInt1465, local8.anInt1457, local8.anInt1459);
							local70 = (Class1_Sub2_Sub3) local57;
							if (local70.aClass1_Sub2_2 != null) {
								Static205.method3371(local8.anInt1465, local8.anInt1457, local8.anInt1459, local70.aClass1_Sub2_2);
							}
						}
					}
					local8.method5987();
				} else if (Static290.anInt5325 == local8.anInt1467) {
					local33 = Static188.anIntArray293[local8.anInt1461];
					if (local33 == 0) {
						local172 = Static391.method5292(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local172 instanceof Class1_Sub5_Sub1) {
							local8.method5987();
						} else if (Static307.method4518(local8.anInt1465, local8.anInt1457, local8.anInt1459) == null) {
							local185 = new Class1_Sub5_Sub1(local8.anInt1461, local8.anInt1452, local8.anInt1455, local8.anInt1454, local8.anInt1463, local172);
							Static224.method3531(local8.anInt1465, local8.anInt1457, local8.anInt1459, local185, null);
						} else {
							local8.method5987();
						}
					} else if (local33 == 1) {
						local137 = Static35.method4618(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local137 instanceof Class1_Sub1_Sub2) {
							local8.method5987();
						} else if (Static352.method4303(local8.anInt1465, local8.anInt1457, local8.anInt1459) == null) {
							local150 = new Class1_Sub1_Sub2(local8.anInt1461, local8.anInt1452, local8.anInt1455, local8.anInt1454, local8.anInt1463, local137);
							Static265.method3995(local8.anInt1465, local8.anInt1457, local8.anInt1459, local150, null);
						} else {
							local8.method5987();
						}
					} else if (local33 == 2) {
						local99 = Static372.method1267(local8.anInt1465, local8.anInt1457, local8.anInt1459, wk.class);
						if (local99 instanceof Class1_Sub3_Sub1) {
							local8.method5987();
						} else {
							Static182.method3086(local8.anInt1465, local8.anInt1457, local8.anInt1459, wk.class);
							@Pc(361) Class128 local361 = Static55.aClass25_1.method855(local8.anInt1466);
							@Pc(376) int local376;
							@Pc(379) int local379;
							if (local8.anInt1452 == 1 || local8.anInt1452 == 3) {
								local376 = local361.anInt4036;
								local379 = local361.anInt4004;
							} else {
								local379 = local361.anInt4036;
								local376 = local361.anInt4004;
							}
							@Pc(420) Class1_Sub3_Sub1 local420 = new Class1_Sub3_Sub1(local8.anInt1461, local8.anInt1452, local8.anInt1465, local8.anInt1455, local8.anInt1454, local8.anInt1463, local8.anInt1457, local376 + local8.anInt1457 - 1, local8.anInt1459, local8.anInt1459 + local379 - 1, local99);
							Static199.method3242(local420, false);
						}
					} else if (local33 == 3) {
						local57 = Static11.method399(local8.anInt1465, local8.anInt1457, local8.anInt1459);
						if (local57 instanceof Class1_Sub2_Sub3) {
							local8.method5987();
						} else {
							local70 = new Class1_Sub2_Sub3(local8.anInt1455, local8.anInt1454, local8.anInt1463, local57);
							Static205.method3371(local8.anInt1465, local8.anInt1457, local8.anInt1459, local70);
						}
					}
				}
			}
		}
	}
}
