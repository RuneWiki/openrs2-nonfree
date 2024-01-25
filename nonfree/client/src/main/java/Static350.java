import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!rg;")
	public static Class27 aClass27_22;

	@OriginalMember(owner = "client!ug", name = "cb", descriptor = "Lclient!g;")
	public static Class83 aClass83_122;

	@OriginalMember(owner = "client!ug", name = "eb", descriptor = "Z")
	public static boolean aBoolean465;

	@OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
	public static int anInt6470;

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
	public static int anInt6467 = 1;

	@OriginalMember(owner = "client!ug", name = "ab", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_228 = new Class62("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ug", name = "bb", descriptor = "S")
	public static short aShort92 = 256;

	@OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
	public static int anInt6468 = 0;

	@OriginalMember(owner = "client!ug", name = "fb", descriptor = "F")
	public static float aFloat74 = 0.0F;

	@OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
	public static int anInt6469 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!vt;)V")
	public static void method5577(@OriginalArg(1) Class2_Sub24 arg0) {
		if (arg0.aByteArray100.length - arg0.anInt6669 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5732();
		if (local19 < 0 || local19 > 15) {
			return;
		}
		@Pc(62) byte local62;
		if (local19 == 15) {
			local62 = 37;
		} else if (local19 == 14) {
			local62 = 36;
		} else if (local19 == 13) {
			local62 = 35;
		} else if (local19 == 12) {
			local62 = 34;
		} else if (local19 == 11) {
			local62 = 33;
		} else if (local19 == 10) {
			local62 = 32;
		} else if (local19 == 9) {
			local62 = 31;
		} else if (local19 == 8) {
			local62 = 30;
		} else if (local19 == 7) {
			local62 = 29;
		} else if (local19 == 6) {
			local62 = 28;
		} else if (local19 == 5) {
			local62 = 28;
		} else if (local19 == 4) {
			local62 = 24;
		} else if (local19 == 3) {
			local62 = 23;
		} else if (local19 == 2) {
			local62 = 22;
		} else if (local19 == 1) {
			local62 = 23;
		} else {
			local62 = 19;
		}
		if (local62 > arg0.aByteArray100.length - arg0.anInt6669) {
			return;
		}
		Static190.anInt3986 = arg0.method5732();
		if (Static190.anInt3986 < 1) {
			Static190.anInt3986 = 1;
		} else if (Static190.anInt3986 > 4) {
			Static190.anInt3986 = 4;
		}
		Static168.method2965(arg0.method5732() == 1);
		Static314.aBoolean421 = arg0.method5732() == 1;
		Static72.aBoolean125 = arg0.method5732() == 1;
		Static308.aBoolean416 = arg0.method5732() == 1;
		Static73.anInt1628 = arg0.method5732() == 1 ? 1 : 0;
		Static74.aBoolean127 = arg0.method5732() == 1;
		Static135.aBoolean205 = arg0.method5732() == 1;
		Static183.aBoolean279 = arg0.method5732() == 1;
		Static266.anInt5047 = arg0.method5732();
		if (Static266.anInt5047 > 2) {
			Static266.anInt5047 = 2;
		}
		if (local19 < 2) {
			Static382.aBoolean487 = arg0.method5732() == 1;
			arg0.method5732();
		} else {
			Static382.aBoolean487 = arg0.method5732() == 1;
		}
		Static104.aBoolean168 = arg0.method5732() == 1;
		Static135.aBoolean204 = arg0.method5732() == 1;
		Static11.anInt210 = arg0.method5732();
		if (Static11.anInt210 > 2) {
			Static11.anInt210 = 2;
		}
		Static87.anInt1875 = Static11.anInt210;
		Static41.aBoolean51 = arg0.method5732() == 1;
		Static135.anInt2943 = arg0.method5732();
		if (Static135.anInt2943 > 127) {
			Static135.anInt2943 = 127;
		}
		Static228.anInt4592 = arg0.method5732();
		Static107.anInt2388 = arg0.method5732();
		if (Static107.anInt2388 > 127) {
			Static107.anInt2388 = 127;
		}
		if (local19 >= 1) {
			Static120.anInt2646 = arg0.method5753();
			Static260.anInt4975 = arg0.method5753();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method5732();
		}
		@Pc(396) int local396;
		if (local19 >= 4) {
			local396 = arg0.method5732();
			if (local396 < 0 || local396 > 2) {
				local396 = 0;
			}
			if (Static199.anInt4131 < 96) {
				local396 = 0;
			}
			Static133.method2326(local396);
		}
		if (local19 >= 5) {
			Static34.anInt592 = arg0.method5776();
		}
		local396 = 0;
		if (local19 >= 6) {
			Static202.anInt4200 = local396 = arg0.method5732();
		}
		if (Static202.anInt4200 != 1 && Static202.anInt4200 != 2) {
			Static202.anInt4200 = 2;
		}
		if (local19 >= 7) {
			Static70.aBoolean117 = arg0.method5732() == 1;
		}
		if (local19 >= 8) {
			Static260.aBoolean369 = arg0.method5732() == 1;
		}
		if (local19 >= 9) {
			Static42.anInt733 = arg0.method5732();
		}
		if (Static42.anInt733 < 0 || Static42.anInt733 > Static185.method3421(Static199.anInt4131)) {
			Static42.anInt733 = 0;
		}
		if (local19 >= 10) {
			Static220.aBoolean317 = arg0.method5732() != 0;
		}
		if (local19 >= 11) {
			Static224.aBoolean324 = arg0.method5732() != 0;
		}
		if (local19 >= 12) {
			Static73.anInt1628 = arg0.method5732();
		}
		if (Static73.anInt1628 < 0 || Static73.anInt1628 > 2) {
			Static73.anInt1628 = 1;
		}
		if (local19 >= 13) {
			Static73.aBoolean126 = arg0.method5732() == 1;
		}
		if (local19 >= 14) {
			Static232.anInt4637 = arg0.method5732();
		} else if (local396 == 0) {
			Static232.anInt4637 = 2;
		} else {
			Static232.anInt4637 = 1;
		}
		if (Static232.anInt4637 < 0 || Static232.anInt4637 > 3) {
			Static232.anInt4637 = 2;
		}
		if (local19 >= 15) {
			Static71.anInt1579 = arg0.method5732();
			if (Static71.anInt1579 < 0 || Static71.anInt1579 > 4) {
				Static71.anInt1579 = Static205.anInt4226 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
	public static void method5579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static179.anInt3768 <= arg2 && arg3 <= Static121.anInt6758 && arg4 >= Static317.anInt5793 && arg0 <= Static69.anInt1551) {
			Static308.method5023(arg4, arg3, arg1, arg2, arg0);
		} else {
			Static151.method3888(arg1, arg0, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZBIZ)Lclient!g;")
	public static Class83 method5580(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class93 local10 = null;
		if (Static164.aClass70_5 != null) {
			local10 = new Class93(arg0, Static164.aClass70_5, Static33.aClass70Array2[arg0], 1000000);
		}
		Static378.aClass135_Sub1Array6[arg0] = Static115.aClass45_1.method883(local10, Static324.aClass93_4, arg0);
		if (arg2) {
			Static378.aClass135_Sub1Array6[arg0].method4419();
		}
		return new Class83(Static378.aClass135_Sub1Array6[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)I")
	public static int method5581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method5582(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static383.anInt6968;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class201 local27 = Static261.aClass97_1.method2360(arg0[local18]);
			if (local27.anInt5608 != -1) {
				@Pc(40) Class27 local40 = (Class27) Static230.aClass41_53.method823((long) local27.anInt5608);
				if (local40 == null) {
					@Pc(48) Class128 local48 = Static399.method3370(Static324.aClass83_116, local27.anInt5608, 0);
					if (local48 != null) {
						local40 = Static383.aClass48_9.method2527(local48);
						Static230.aClass41_53.method832((long) local27.anInt5608, local40);
					}
				}
				if (local40 != null) {
					Static315.aClass27Array51[local11] = local40;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!qo;)I")
	public static int method5583(@OriginalArg(1) Class1_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) Class197 local8 = arg0.aClass197_1;
		if (local8.anIntArray468 != null) {
			local8 = local8.method4832(Static179.aClass115_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt5480;
		@Pc(35) Class227 local35 = arg0.method4799();
		if (arg0.aBoolean394) {
			local31 = local8.anInt5502;
		} else if (arg0.anInt5421 == local35.anInt6455 || arg0.anInt5421 == local35.anInt6462 || arg0.anInt5421 == local35.anInt6459 || local35.anInt6435 == arg0.anInt5421) {
			local31 = local8.anInt5490;
		} else if (local35.anInt6437 == arg0.anInt5421 || arg0.anInt5421 == local35.anInt6453 || arg0.anInt5421 == local35.anInt6431 || local35.anInt6457 == arg0.anInt5421) {
			local31 = local8.anInt5484;
		}
		return local31;
	}
}
