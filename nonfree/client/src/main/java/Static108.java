import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
	public static int anInt2490;

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
	public static int anInt2487 = 0;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1167 = Static56.method816("Standort");

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1168 = Static56.method816("compass");

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1171 = Static56.method816("Loading config )2 ");

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1169 = aClass34_1171;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1170 = Static56.method816(")1j");

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array18 = new Class34[100];

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ic;Lclient!ic;BLclient!dd;)Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 method1526(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(8) int local8 = arg2.method1164(arg0);
		@Pc(19) int local19 = arg2.method1159(local8, arg1);
		return Static88.method1452(arg2, local8, local19);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public static void method1527() {
		@Pc(1) Object local1 = Static60.anObject4;
		synchronized (Static60.anObject4) {
			if (Static73.anInt1778 != 0) {
				Static73.anInt1778 = 1;
				try {
					Static60.anObject4.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method1528() {
		aClass34_1169 = null;
		aClass34_1171 = null;
		aClass34_1170 = null;
		aClass34Array18 = null;
		aClass34_1168 = null;
		aClass34_1167 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ic;Lclient!ic;II)V")
	public static void method1530(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2) {
		Static52.method772(null, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBII)V")
	public static void method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = Static3.aClass64_1.method1397(arg3, arg4, arg2);
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(62) int local62;
		@Pc(68) int local68;
		if (local19 != 0) {
			local28 = Static3.aClass64_1.method1389(arg3, arg4, arg2, local19);
			local32 = local28 & 0x1F;
			local38 = local28 >> 6 & 0x3;
			local40 = arg1;
			@Pc(43) int[] local43 = Static41.aClass8_Sub1_Sub3_Sub3_1.anIntArray342;
			if (local19 > 0) {
				local40 = arg0;
			}
			local62 = arg4 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
			local68 = local19 >> 14 & 0x7FFF;
			@Pc(72) Class8_Sub1_Sub4 local72 = Static50.method752(local68);
			if (local72.anInt442 == -1) {
				if (local32 == 0 || local32 == 2) {
					if (local38 == 0) {
						local43[local62] = local40;
						local43[local62 + 512] = local40;
						local43[local62 + 1024] = local40;
						local43[local62 + 1536] = local40;
					} else if (local38 == 1) {
						local43[local62] = local40;
						local43[local62 + 1] = local40;
						local43[local62 + 2] = local40;
						local43[local62 + 3] = local40;
					} else if (local38 == 2) {
						local43[local62 + 3] = local40;
						local43[local62 + 515] = local40;
						local43[local62 + 1024 + 3] = local40;
						local43[local62 + 1536 + 3] = local40;
					} else if (local38 == 3) {
						local43[local62 + 1536] = local40;
						local43[local62 + 1 + 1536] = local40;
						local43[local62 + 2 + 1536] = local40;
						local43[local62 + 1536 + 3] = local40;
					}
				}
				if (local32 == 3) {
					if (local38 == 0) {
						local43[local62] = local40;
					} else if (local38 == 1) {
						local43[local62 + 3] = local40;
					} else if (local38 == 2) {
						local43[local62 + 1539] = local40;
					} else if (local38 == 3) {
						local43[local62 + 1536] = local40;
					}
				}
				if (local32 == 2) {
					if (local38 == 3) {
						local43[local62] = local40;
						local43[local62 + 512] = local40;
						local43[local62 + 1024] = local40;
						local43[local62 + 1536] = local40;
					} else if (local38 == 0) {
						local43[local62] = local40;
						local43[local62 + 1] = local40;
						local43[local62 + 2] = local40;
						local43[local62 + 3] = local40;
					} else if (local38 == 1) {
						local43[local62 + 3] = local40;
						local43[local62 + 515] = local40;
						local43[local62 + 3 + 1024] = local40;
						local43[local62 + 1539] = local40;
					} else if (local38 == 2) {
						local43[local62 + 1536] = local40;
						local43[local62 + 1537] = local40;
						local43[local62 + 1538] = local40;
						local43[local62 + 1536 + 3] = local40;
					}
				}
			} else {
				@Pc(386) Class8_Sub1_Sub3_Sub2 local386 = Static34.aClass8_Sub1_Sub3_Sub2Array2[local72.anInt442];
				if (local386 != null) {
					@Pc(399) int local399 = (local72.anInt443 * 4 - local386.anInt484) / 2;
					@Pc(410) int local410 = (local72.anInt455 * 4 - local386.anInt485) / 2;
					local386.method300(local399 + arg4 * 4 + 48, local410 + (-local72.anInt455 + -arg2 + 104) * 4 + 48);
				}
			}
		}
		local19 = Static3.aClass64_1.method1435(arg3, arg4, arg2);
		if (local19 != 0) {
			local28 = Static3.aClass64_1.method1389(arg3, arg4, arg2, local19);
			local32 = local28 & 0x1F;
			local38 = local28 >> 6 & 0x3;
			local40 = local19 >> 14 & 0x7FFF;
			@Pc(471) Class8_Sub1_Sub4 local471 = Static50.method752(local40);
			@Pc(508) int local508;
			if (local471.anInt442 != -1) {
				@Pc(578) Class8_Sub1_Sub3_Sub2 local578 = Static34.aClass8_Sub1_Sub3_Sub2Array2[local471.anInt442];
				if (local578 != null) {
					local508 = (local471.anInt455 * 4 - local578.anInt485) / 2;
					local68 = (local471.anInt443 * 4 - local578.anInt484) / 2;
					local578.method300(arg4 * 4 + local68 + 48, local508 + 48 + (104 - (arg2 - -local471.anInt455)) * 4);
				}
			} else if (local32 == 9) {
				local62 = 15658734;
				if (local19 > 0) {
					local62 = 15597568;
				}
				@Pc(493) int[] local493 = Static41.aClass8_Sub1_Sub3_Sub3_1.anIntArray342;
				local508 = arg4 * 4 + (-arg2 + 103) * 4 * 512 + 24624;
				if (local38 == 0 || local38 == 2) {
					local493[local508 + 1536] = local62;
					local493[local508 + 1024 + 1] = local62;
					local493[local508 + 512 + 2] = local62;
					local493[local508 + 3] = local62;
				} else {
					local493[local508] = local62;
					local493[local508 + 1 + 512] = local62;
					local493[local508 + 1024 + 2] = local62;
					local493[local508 + 3 + 1536] = local62;
				}
			}
		}
		local19 = Static3.aClass64_1.method1427(arg3, arg4, arg2);
		if (local19 == 0) {
			return;
		}
		local28 = local19 >> 14 & 0x7FFF;
		@Pc(643) Class8_Sub1_Sub4 local643 = Static50.method752(local28);
		if (local643.anInt442 == -1) {
			return;
		}
		@Pc(652) Class8_Sub1_Sub3_Sub2 local652 = Static34.aClass8_Sub1_Sub3_Sub2Array2[local643.anInt442];
		if (local652 != null) {
			local40 = (local643.anInt443 * 4 - local652.anInt484) / 2;
			@Pc(675) int local675 = (local643.anInt455 * 4 - local652.anInt485) / 2;
			local652.method300(arg4 * 4 + local40 + 48, local675 + (104 - arg2 - local643.anInt455) * 4 + 48);
			return;
		}
	}
}
