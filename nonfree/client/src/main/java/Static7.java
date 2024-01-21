import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static int anInt80;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt81 = 0;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_19 = Static88.method1421("Bad session id)3");

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!va;")
	public static Class61 aClass61_17 = aClass61_19;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt87 = -1;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!va;")
	private static Class61 aClass61_18 = Static88.method1421("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!va;")
	private static Class61 aClass61_20 = Static88.method1421("Ok");

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!va;")
	public static Class61 aClass61_21 = aClass61_20;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Lclient!va;")
	public static Class61 aClass61_22 = aClass61_18;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIBII)V")
	public static void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static48.aClass54_1.method1363(arg4, arg1, arg0);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(70) int local70;
		@Pc(48) int local48;
		if (local11 != 0) {
			local23 = Static48.aClass54_1.method1365(arg4, arg1, arg0, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local35 = arg2;
			if (local11 > 0) {
				local35 = arg3;
			}
			@Pc(42) int[] local42 = Static53.aClass10_Sub1_Sub1_Sub1_33.anIntArray31;
			local48 = local11 >> 14 & 0x7FFF;
			@Pc(54) Class10_Sub1_Sub10 local54 = Static18.method405(local48);
			local70 = arg1 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
			if (local54.anInt1376 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local29 == 0) {
						local42[local70] = local35;
						local42[local70 + 512] = local35;
						local42[local70 + 1024] = local35;
						local42[local70 + 1536] = local35;
					} else if (local29 == 1) {
						local42[local70] = local35;
						local42[local70 + 1] = local35;
						local42[local70 + 2] = local35;
						local42[local70 + 3] = local35;
					} else if (local29 == 2) {
						local42[local70 + 3] = local35;
						local42[local70 + 3 + 512] = local35;
						local42[local70 + 1024 + 3] = local35;
						local42[local70 + 3 + 1536] = local35;
					} else if (local29 == 3) {
						local42[local70 + 1536] = local35;
						local42[local70 + 1536 + 1] = local35;
						local42[local70 + 1536 + 2] = local35;
						local42[local70 + 3 + 1536] = local35;
					}
				}
				if (local33 == 3) {
					if (local29 == 0) {
						local42[local70] = local35;
					} else if (local29 == 1) {
						local42[local70 + 3] = local35;
					} else if (local29 == 2) {
						local42[local70 + 1536 + 3] = local35;
					} else if (local29 == 3) {
						local42[local70 + 1536] = local35;
					}
				}
				if (local33 == 2) {
					if (local29 == 3) {
						local42[local70] = local35;
						local42[local70 + 512] = local35;
						local42[local70 + 1024] = local35;
						local42[local70 + 1536] = local35;
					} else if (local29 == 0) {
						local42[local70] = local35;
						local42[local70 + 1] = local35;
						local42[local70 + 2] = local35;
						local42[local70 + 3] = local35;
					} else if (local29 == 1) {
						local42[local70 + 3] = local35;
						local42[local70 + 3 + 512] = local35;
						local42[local70 + 1024 + 3] = local35;
						local42[local70 + 1536 + 3] = local35;
					} else if (local29 == 2) {
						local42[local70 + 1536] = local35;
						local42[local70 + 1537] = local35;
						local42[local70 + 1536 + 2] = local35;
						local42[local70 + 1539] = local35;
					}
				}
			} else {
				@Pc(79) Class10_Sub1_Sub1_Sub2 local79 = Static31.aClass10_Sub1_Sub1_Sub2Array3[local54.anInt1376];
				if (local79 != null) {
					@Pc(91) int local91 = (local54.anInt1378 * 4 - local79.anInt1566) / 2;
					@Pc(101) int local101 = (local54.anInt1369 * 4 - local79.anInt1570) / 2;
					local79.method873(local101 + arg1 * 4 + 48, 48 - -((-arg0 + 104 + -local54.anInt1378) * 4) + local91);
				}
			}
		}
		local11 = Static48.aClass54_1.method1392(arg4, arg1, arg0);
		if (local11 != 0) {
			local23 = Static48.aClass54_1.method1365(arg4, arg1, arg0, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local35 = local11 >> 14 & 0x7FFF;
			@Pc(463) Class10_Sub1_Sub10 local463 = Static18.method405(local35);
			@Pc(495) int local495;
			if (local463.anInt1376 != -1) {
				@Pc(472) Class10_Sub1_Sub1_Sub2 local472 = Static31.aClass10_Sub1_Sub1_Sub2Array3[local463.anInt1376];
				if (local472 != null) {
					local48 = (local463.anInt1369 * 4 - local472.anInt1570) / 2;
					local495 = (local463.anInt1378 * 4 - local472.anInt1566) / 2;
					local472.method873(arg1 * 4 + local48 + 48, (-arg0 + 104 + -local463.anInt1378) * 4 + 48 + local495);
				}
			} else if (local33 == 9) {
				local70 = 15658734;
				local495 = arg1 * 4 + (103 - arg0) * 2048 + 24624;
				if (local11 > 0) {
					local70 = 15597568;
				}
				@Pc(549) int[] local549 = Static53.aClass10_Sub1_Sub1_Sub1_33.anIntArray31;
				if (local29 == 0 || local29 == 2) {
					local549[local495 + 1536] = local70;
					local549[local495 + 1024 + 1] = local70;
					local549[local495 + 514] = local70;
					local549[local495 + 3] = local70;
				} else {
					local549[local495] = local70;
					local549[local495 + 1 + 512] = local70;
					local549[local495 + 1026] = local70;
					local549[local495 + 3 + 1536] = local70;
				}
			}
		}
		local11 = Static48.aClass54_1.method1385(arg4, arg1, arg0);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(631) Class10_Sub1_Sub10 local631 = Static18.method405(local23);
		if (local631.anInt1376 == -1) {
			return;
		}
		@Pc(640) Class10_Sub1_Sub1_Sub2 local640 = Static31.aClass10_Sub1_Sub1_Sub2Array3[local631.anInt1376];
		if (local640 != null) {
			local35 = (local631.anInt1369 * 4 - local640.anInt1570) / 2;
			@Pc(663) int local663 = (local631.anInt1378 * 4 - local640.anInt1566) / 2;
			local640.method873(arg1 * 4 + local35 + 48, local663 + 48 + (104 - arg0 - local631.anInt1378) * 4);
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public static void method73() {
		aClass61_22 = null;
		aClass61_18 = null;
		aClass61_17 = null;
		aClass61_19 = null;
		aClass61_20 = null;
		aClass61_21 = null;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method74() {
		for (@Pc(10) Class10_Sub1_Sub5_Sub5 local10 = (Class10_Sub1_Sub5_Sub5) Static12.aClass9_3.method72(); local10 != null; local10 = (Class10_Sub1_Sub5_Sub5) Static12.aClass9_3.method81()) {
			if (Static101.anInt2582 != local10.anInt2425 || local10.aBoolean109) {
				local10.method1654();
			} else if (Static95.anInt2442 >= local10.anInt2409) {
				local10.method1494(Static106.anInt2692);
				if (local10.aBoolean109) {
					local10.method1654();
				} else {
					Static48.aClass54_1.method1354(local10.anInt2425, local10.anInt2407, local10.anInt2418, local10.anInt2421, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class10_Sub1_Sub2 method76(@OriginalArg(0) int arg0) {
		@Pc(12) Class10_Sub1_Sub2 local12 = (Class10_Sub1_Sub2) Static66.aClass29_47.method644((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static79.aClass11_51.method203(4, arg0);
		local12 = new Class10_Sub1_Sub2();
		if (local22 != null) {
			local12.method170(new Class10_Sub10(local22), arg0);
		}
		local12.method168();
		Static66.aClass29_47.method649(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method77() {
		Static6.method64(0, null, false);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ[BI)V")
	public static void method85(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (Static5.aClass13_1 == null) {
			return;
		}
		if (Static55.anInt1488 >= 0) {
			arg0 -= 20;
			if (arg0 < 1) {
				arg0 = 1;
			}
			Static80.anInt2152 = arg0;
			if (Static55.anInt1488 == 0) {
				Static62.anInt1711 = 0;
			} else {
				@Pc(34) int local34 = Static56.method821(Static55.anInt1488);
				@Pc(38) int local38 = local34 - Static25.anInt781;
				Static62.anInt1711 = (Static62.anInt1711 + local38 + 3600 - 1) / Static62.anInt1711;
			}
			Static55.aBoolean73 = arg1;
			Static40.aByteArray4 = arg2;
			Static78.anInt2114 = arg3;
		} else if (Static80.anInt2152 == 0) {
			Static6.method64(arg3, arg2, arg1);
		} else {
			Static55.aBoolean73 = arg1;
			Static40.aByteArray4 = arg2;
			Static78.anInt2114 = arg3;
		}
	}
}
