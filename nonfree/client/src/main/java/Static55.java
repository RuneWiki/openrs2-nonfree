import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!f", name = "I", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_33;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "Lclient!sc;")
	public static Class107 aClass107_388 = Static231.method3737("(R");

	@OriginalMember(owner = "client!f", name = "H", descriptor = "Lclient!sc;")
	public static Class107 aClass107_389 = Static231.method3737("k");

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public static int anInt1393 = 1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method1108() {
		Static218.aClass1_Sub6_Sub2_3.method1451();
		Static16.aClass28_7 = null;
		Static116.anInt2569 = 1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIIII)V")
	public static void method1110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static222.method2957(arg1, arg3, arg0);
		@Pc(33) int local33;
		@Pc(18) int local18;
		@Pc(62) int local62;
		if (local10 != 0L) {
			local18 = arg4;
			if (local10 > 0L) {
				local18 = arg2;
			}
			@Pc(26) int[] local26 = Static205.anIntArray358;
			local33 = (int) local10 >> 14 & 0x1F;
			@Pc(48) int local48 = arg3 * 4 + (103 - arg0) * 4 * 512 + 24624;
			@Pc(55) int local55 = (int) local10 >> 20 & 0x3;
			local62 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(66) Class101 local66 = Static170.method2725(local62);
			if (local66.anInt3914 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local55 == 0) {
						local26[local48] = local18;
						local26[local48 + 512] = local18;
						local26[local48 + 1024] = local18;
						local26[local48 + 1536] = local18;
					} else if (local55 == 1) {
						local26[local48] = local18;
						local26[local48 + 1] = local18;
						local26[local48 + 2] = local18;
						local26[local48 + 3] = local18;
					} else if (local55 == 2) {
						local26[local48 + 3] = local18;
						local26[local48 + 3 + 512] = local18;
						local26[local48 + 3 + 1024] = local18;
						local26[local48 + 3 + 1536] = local18;
					} else if (local55 == 3) {
						local26[local48 + 1536] = local18;
						local26[local48 + 1537] = local18;
						local26[local48 + 1536 + 2] = local18;
						local26[local48 + 1536 + 3] = local18;
					}
				}
				if (local33 == 3) {
					if (local55 == 0) {
						local26[local48] = local18;
					} else if (local55 == 1) {
						local26[local48 + 3] = local18;
					} else if (local55 == 2) {
						local26[local48 + 1539] = local18;
					} else if (local55 == 3) {
						local26[local48 + 1536] = local18;
					}
				}
				if (local33 == 2) {
					if (local55 == 3) {
						local26[local48] = local18;
						local26[local48 + 512] = local18;
						local26[local48 + 1024] = local18;
						local26[local48 + 1536] = local18;
					} else if (local55 == 0) {
						local26[local48] = local18;
						local26[local48 + 1] = local18;
						local26[local48 + 2] = local18;
						local26[local48 + 3] = local18;
					} else if (local55 == 1) {
						local26[local48 + 3] = local18;
						local26[local48 + 3 + 512] = local18;
						local26[local48 + 1024 + 3] = local18;
						local26[local48 + 1536 + 3] = local18;
					} else if (local55 == 2) {
						local26[local48 + 1536] = local18;
						local26[local48 + 1536 + 1] = local18;
						local26[local48 + 2 + 1536] = local18;
						local26[local48 + 1536 + 3] = local18;
					}
				}
			} else {
				@Pc(374) Class64_Sub1 local374 = null;
				if (!local66.aBoolean352) {
					local374 = Static213.aClass64_Sub1Array10[local66.anInt3914];
				} else if (local55 == 0) {
					local374 = Static213.aClass64_Sub1Array10[local66.anInt3914];
				} else if (local55 == 1) {
					local374 = Static63.aClass64_Sub1Array4[local66.anInt3914];
				} else if (local55 == 2) {
					local374 = Static201.aClass64_Sub1Array9[local66.anInt3914];
				} else if (local55 == 3) {
					local374 = Static37.aClass64_Sub1Array1[local66.anInt3914];
				}
				if (local374 != null) {
					@Pc(432) int local432 = (local66.anInt3922 * 4 - local374.anInt2356) / 2;
					@Pc(443) int local443 = (local66.anInt3904 * 4 - local374.anInt2361) / 2;
					local374.method1870(local432 + arg3 * 4 + 48, 48 - -((-local66.anInt3904 + 104 + -arg0) * 4) - -local443);
				}
			}
		}
		local10 = Static111.method1949(arg1, arg3, arg0);
		@Pc(577) int local577;
		if (local10 != 0L) {
			local33 = (int) local10 >> 20 & 0x3;
			local18 = (int) local10 >> 14 & 0x1F;
			@Pc(507) int local507 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			@Pc(511) Class101 local511 = Static170.method2725(local507);
			@Pc(588) int local588;
			if (local511.anInt3914 != -1) {
				@Pc(517) Class64_Sub1 local517 = null;
				if (!local511.aBoolean352) {
					local517 = Static213.aClass64_Sub1Array10[local511.anInt3914];
				} else if (local33 == 0) {
					local517 = Static213.aClass64_Sub1Array10[local511.anInt3914];
				} else if (local33 == 1) {
					local517 = Static63.aClass64_Sub1Array4[local511.anInt3914];
				} else if (local33 == 2) {
					local517 = Static201.aClass64_Sub1Array9[local511.anInt3914];
				} else if (local33 == 3) {
					local517 = Static37.aClass64_Sub1Array1[local511.anInt3914];
				}
				if (local517 != null) {
					local577 = (local511.anInt3922 * 4 - local517.anInt2356) / 2;
					local588 = (local511.anInt3904 * 4 - local517.anInt2361) / 2;
					local517.method1870(local577 + arg3 * 4 + 48, (-local511.anInt3904 + 104 + -arg0) * 4 + 48 + local588);
				}
			} else if (local18 == 9) {
				local62 = 15658734;
				@Pc(621) int[] local621 = Static205.anIntArray358;
				if (local10 > 0L) {
					local62 = 15597568;
				}
				local588 = (52736 - arg0 * 512) * 4 + arg3 * 4 + 24624;
				if (local33 == 0 || local33 == 2) {
					local621[local588 + 1536] = local62;
					local621[local588 + 1 + 1024] = local62;
					local621[local588 + 514] = local62;
					local621[local588 + 3] = local62;
				} else {
					local621[local588] = local62;
					local621[local588 + 513] = local62;
					local621[local588 + 1024 + 2] = local62;
					local621[local588 + 3 + 1536] = local62;
				}
			}
		}
		local10 = Static59.method1131(arg1, arg3, arg0);
		if (local10 == 0L) {
			return;
		}
		local18 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		local33 = (int) local10 >> 20 & 0x3;
		@Pc(728) Class101 local728 = Static170.method2725(local18);
		if (local728.anInt3914 == -1) {
			return;
		}
		@Pc(734) Class64_Sub1 local734 = null;
		if (!local728.aBoolean352) {
			local734 = Static213.aClass64_Sub1Array10[local728.anInt3914];
		} else if (local33 == 0) {
			local734 = Static213.aClass64_Sub1Array10[local728.anInt3914];
		} else if (local33 == 1) {
			local734 = Static63.aClass64_Sub1Array4[local728.anInt3914];
		} else if (local33 == 2) {
			local734 = Static201.aClass64_Sub1Array9[local728.anInt3914];
		} else if (local33 == 3) {
			local734 = Static37.aClass64_Sub1Array1[local728.anInt3914];
		}
		if (local734 != null) {
			local577 = (local728.anInt3904 * 4 - local734.anInt2361) / 2;
			local62 = (local728.anInt3922 * 4 - local734.anInt2356) / 2;
			local734.method1870(local62 + arg3 * 4 + 48, (-local728.anInt3904 + -arg0 + 104) * 4 + 48 - -local577);
			return;
		}
	}
}
