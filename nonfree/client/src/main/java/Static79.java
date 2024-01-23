import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "[Lclient!rf;")
	public static Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
	public static void method1419(@OriginalArg(0) int arg0) {
		@Pc(2) Class158 local2 = Static191.aClass158_1;
		synchronized (Static191.aClass158_1) {
			Static99.anInt2208 = arg0;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z")
	public static boolean method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static225.anInt4954; local1++) {
			@Pc(8) Class3 local8 = Static58.aClass3Array3[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt96 == 1) {
				local17 = local8.anInt104 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt102 + (local8.anInt97 * local17 >> 8);
					local39 = local8.anInt93 + (local8.anInt100 * local17 >> 8);
					local49 = local8.anInt90 + (local8.anInt88 * local17 >> 8);
					local59 = local8.anInt105 + (local8.anInt94 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt96 == 2) {
				local17 = arg0 - local8.anInt104;
				if (local17 > 0) {
					local29 = local8.anInt102 + (local8.anInt97 * local17 >> 8);
					local39 = local8.anInt93 + (local8.anInt100 * local17 >> 8);
					local49 = local8.anInt90 + (local8.anInt88 * local17 >> 8);
					local59 = local8.anInt105 + (local8.anInt94 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt96 == 3) {
				local17 = local8.anInt102 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt104 + (local8.anInt101 * local17 >> 8);
					local39 = local8.anInt91 + (local8.anInt95 * local17 >> 8);
					local49 = local8.anInt90 + (local8.anInt88 * local17 >> 8);
					local59 = local8.anInt105 + (local8.anInt94 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt96 == 4) {
				local17 = arg2 - local8.anInt102;
				if (local17 > 0) {
					local29 = local8.anInt104 + (local8.anInt101 * local17 >> 8);
					local39 = local8.anInt91 + (local8.anInt95 * local17 >> 8);
					local49 = local8.anInt90 + (local8.anInt88 * local17 >> 8);
					local59 = local8.anInt105 + (local8.anInt94 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt96 == 5) {
				local17 = arg1 - local8.anInt90;
				if (local17 > 0) {
					local29 = local8.anInt104 + (local8.anInt101 * local17 >> 8);
					local39 = local8.anInt91 + (local8.anInt95 * local17 >> 8);
					local49 = local8.anInt102 + (local8.anInt97 * local17 >> 8);
					local59 = local8.anInt93 + (local8.anInt100 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!im;I)V")
	public static void method1423(@OriginalArg(0) Class1_Sub16 arg0) {
		if (arg0.aByteArray39.length - arg0.anInt3328 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2655();
		if (local21 < 0 || local21 > 11) {
			return;
		}
		@Pc(50) byte local50;
		if (local21 == 11) {
			local50 = 33;
		} else if (local21 == 10) {
			local50 = 32;
		} else if (local21 == 9) {
			local50 = 31;
		} else if (local21 == 8) {
			local50 = 30;
		} else if (local21 == 7) {
			local50 = 29;
		} else if (local21 == 6) {
			local50 = 28;
		} else if (local21 == 5) {
			local50 = 28;
		} else if (local21 == 4) {
			local50 = 24;
		} else if (local21 == 3) {
			local50 = 23;
		} else if (local21 == 2) {
			local50 = 22;
		} else if (local21 == 1) {
			local50 = 23;
		} else {
			local50 = 19;
		}
		if (arg0.aByteArray39.length - arg0.anInt3328 < local50) {
			return;
		}
		Static20.anInt5576 = arg0.method2655();
		if (Static20.anInt5576 < 1) {
			Static20.anInt5576 = 1;
		} else if (Static20.anInt5576 > 4) {
			Static20.anInt5576 = 4;
		}
		Static15.method319(arg0.method2655() == 1);
		Static53.aBoolean84 = arg0.method2655() == 1;
		Static135.aBoolean157 = arg0.method2655() == 1;
		Static45.aBoolean75 = arg0.method2655() == 1;
		Static64.aBoolean92 = arg0.method2655() == 1;
		Static135.aBoolean154 = arg0.method2655() == 1;
		Static50.aBoolean80 = arg0.method2655() == 1;
		Static263.aBoolean302 = arg0.method2655() == 1;
		Static265.anInt5769 = arg0.method2655();
		if (Static265.anInt5769 > 2) {
			Static265.anInt5769 = 2;
		}
		if (local21 >= 2) {
			Static10.aBoolean12 = arg0.method2655() == 1;
		} else {
			Static10.aBoolean12 = arg0.method2655() == 1;
			arg0.method2655();
		}
		Static119.aBoolean141 = arg0.method2655() == 1;
		Static70.aBoolean96 = arg0.method2655() == 1;
		Static8.anInt4429 = arg0.method2655();
		if (Static8.anInt4429 > 2) {
			Static8.anInt4429 = 2;
		}
		Static171.anInt3870 = Static8.anInt4429;
		Static153.aBoolean183 = arg0.method2655() == 1;
		Static11.anInt2931 = arg0.method2655();
		if (Static11.anInt2931 > 127) {
			Static11.anInt2931 = 127;
		}
		Static239.anInt5264 = arg0.method2655();
		Static210.anInt4682 = arg0.method2655();
		if (Static210.anInt4682 > 127) {
			Static210.anInt4682 = 127;
		}
		if (local21 >= 1) {
			Static180.anInt4075 = arg0.method2652();
			Static275.anInt5914 = arg0.method2652();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method2655();
		}
		if (local21 >= 4) {
			@Pc(384) int local384 = arg0.method2655();
			if (Static98.anInt2197 < 96) {
				local384 = 0;
			}
			Static155.method2876(local384);
		}
		if (local21 >= 5) {
			Static265.anInt5770 = arg0.method2610();
		}
		if (local21 >= 6) {
			Static272.anInt5852 = arg0.method2655();
		}
		if (local21 >= 7) {
			Static157.aBoolean187 = arg0.method2655() == 1;
		}
		if (local21 >= 8) {
			Static205.aBoolean243 = arg0.method2655() == 1;
		}
		if (local21 >= 9) {
			Static204.anInt4555 = arg0.method2655();
		}
		if (local21 >= 10) {
			Static28.aBoolean42 = arg0.method2655() != 0;
		}
		if (local21 >= 11) {
			Static111.aBoolean136 = arg0.method2655() != 0;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
	public static void method1426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static152.anInt3532 <= arg1 && Static223.anInt1245 >= arg1) {
			@Pc(24) int local24 = Static223.method941(arg0, Static88.anInt2052, Static102.anInt2239);
			@Pc(30) int local30 = Static223.method941(arg3, Static88.anInt2052, Static102.anInt2239);
			Static153.method2861(local24, local30, arg1, arg2);
		}
	}
}
