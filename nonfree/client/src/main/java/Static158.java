import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "[Lclient!jc;")
	public static Class47[] aClass47Array4;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_386 = Static161.method2452("<br>(X");

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_387 = Static161.method2452("blinken1:");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public static void method936() {
		Static157.aBoolean140 = false;
		Static14.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public static void method937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) long local15 = Static31.method509(arg4, arg0, arg3);
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(66) int local66;
		@Pc(50) int local50;
		if (local15 != 0L) {
			local26 = (int) local15 >> 20 & 0x3;
			local33 = (int) local15 >> 14 & 0x1F;
			local35 = arg2;
			if (local15 > 0L) {
				local35 = arg1;
			}
			@Pc(43) int[] local43 = Static42.anIntArray92;
			local50 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local66 = (103 - arg3) * 4 * 512 + arg0 * 4 + 24624;
			@Pc(70) Class5_Sub2_Sub7 local70 = Static63.method1046(local50);
			if (local70.anInt511 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local26 == 0) {
						local43[local66] = local35;
						local43[local66 + 512] = local35;
						local43[local66 + 1024] = local35;
						local43[local66 + 1536] = local35;
					} else if (local26 == 1) {
						local43[local66] = local35;
						local43[local66 + 1] = local35;
						local43[local66 + 2] = local35;
						local43[local66 + 3] = local35;
					} else if (local26 == 2) {
						local43[local66 + 3] = local35;
						local43[local66 + 512 + 3] = local35;
						local43[local66 + 1024 + 3] = local35;
						local43[local66 + 1536 + 3] = local35;
					} else if (local26 == 3) {
						local43[local66 + 1536] = local35;
						local43[local66 + 1 + 1536] = local35;
						local43[local66 + 2 + 1536] = local35;
						local43[local66 + 1536 + 3] = local35;
					}
				}
				if (local33 == 3) {
					if (local26 == 0) {
						local43[local66] = local35;
					} else if (local26 == 1) {
						local43[local66 + 3] = local35;
					} else if (local26 == 2) {
						local43[local66 + 1539] = local35;
					} else if (local26 == 3) {
						local43[local66 + 1536] = local35;
					}
				}
				if (local33 == 2) {
					if (local26 == 3) {
						local43[local66] = local35;
						local43[local66 + 512] = local35;
						local43[local66 + 1024] = local35;
						local43[local66 + 1536] = local35;
					} else if (local26 == 0) {
						local43[local66] = local35;
						local43[local66 + 1] = local35;
						local43[local66 + 2] = local35;
						local43[local66 + 3] = local35;
					} else if (local26 == 1) {
						local43[local66 + 3] = local35;
						local43[local66 + 3 + 512] = local35;
						local43[local66 + 1024 + 3] = local35;
						local43[local66 + 1536 + 3] = local35;
					} else if (local26 == 2) {
						local43[local66 + 1536] = local35;
						local43[local66 + 1 + 1536] = local35;
						local43[local66 + 2 + 1536] = local35;
						local43[local66 + 3 + 1536] = local35;
					}
				}
			} else {
				@Pc(79) Class47_Sub1 local79 = Static191.aClass47_Sub1Array2[local70.anInt511];
				if (local79 != null) {
					@Pc(92) int local92 = (local70.anInt517 * 4 - local79.anInt2707) / 2;
					@Pc(103) int local103 = (local70.anInt519 * 4 - local79.anInt2709) / 2;
					local79.method2016(arg0 * 4 + local92 + 48, local103 + (104 - (arg3 - -local70.anInt519)) * 4 + 48);
				}
			}
		}
		local15 = Static178.method2696(arg4, arg0, arg3);
		if (local15 != 0L) {
			local26 = (int) local15 >> 20 & 0x3;
			local35 = (int) (local15 >>> 32) & Integer.MAX_VALUE;
			@Pc(466) Class5_Sub2_Sub7 local466 = Static63.method1046(local35);
			local33 = (int) local15 >> 14 & 0x1F;
			@Pc(507) int local507;
			if (local466.anInt511 != -1) {
				@Pc(483) Class47_Sub1 local483 = Static191.aClass47_Sub1Array2[local466.anInt511];
				if (local483 != null) {
					local50 = (local466.anInt517 * 4 - local483.anInt2707) / 2;
					local507 = (local466.anInt519 * 4 - local483.anInt2709) / 2;
					local483.method2016(local50 + arg0 * 4 + 48, local507 + 48 + (-arg3 + 104 + -local466.anInt519) * 4);
				}
			} else if (local33 == 9) {
				local66 = 15658734;
				@Pc(541) int[] local541 = Static42.anIntArray92;
				local507 = arg0 * 4 + (52736 - arg3 * 512) * 4 + 24624;
				if (local15 > 0L) {
					local66 = 15597568;
				}
				if (local26 == 0 || local26 == 2) {
					local541[local507 + 1536] = local66;
					local541[local507 + 1025] = local66;
					local541[local507 + 512 + 2] = local66;
					local541[local507 + 3] = local66;
				} else {
					local541[local507] = local66;
					local541[local507 + 1 + 512] = local66;
					local541[local507 + 2 + 1024] = local66;
					local541[local507 + 1539] = local66;
				}
			}
		}
		local15 = Static216.method3183(arg4, arg0, arg3);
		if (local15 == 0L) {
			return;
		}
		local26 = Integer.MAX_VALUE & (int) (local15 >>> 32);
		@Pc(647) Class5_Sub2_Sub7 local647 = Static63.method1046(local26);
		if (local647.anInt511 == -1) {
			return;
		}
		@Pc(657) Class47_Sub1 local657 = Static191.aClass47_Sub1Array2[local647.anInt511];
		if (local657 != null) {
			@Pc(670) int local670 = (local647.anInt517 * 4 - local657.anInt2707) / 2;
			local66 = (local647.anInt519 * 4 - local657.anInt2709) / 2;
			local657.method2016(local670 + arg0 * 4 + 48, (-local647.anInt519 + 104 - arg3) * 4 + (48 - -local66));
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!li;B)V")
	public static void method938(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static85.anInt1876 != 1) {
			return;
		}
		if (Static179.anInt3572 >= 280 && Static179.anInt3572 <= 294 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(0, 0);
			return;
		}
		if (Static179.anInt3572 >= 295 && Static179.anInt3572 <= 360 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(1, 0);
			return;
		}
		if (Static179.anInt3572 >= 390 && Static179.anInt3572 <= 404 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(0, 1);
			return;
		}
		if (Static179.anInt3572 >= 405 && Static179.anInt3572 <= 470 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(1, 1);
			return;
		}
		if (Static179.anInt3572 >= 500 && Static179.anInt3572 <= 514 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(0, 2);
			return;
		}
		if (Static179.anInt3572 >= 515 && Static179.anInt3572 <= 580 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(1, 2);
			return;
		}
		if (Static179.anInt3572 >= 610 && Static179.anInt3572 <= 624 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(0, 3);
			return;
		}
		if (Static179.anInt3572 >= 625 && Static179.anInt3572 <= 690 && Static175.anInt3521 >= 4 && Static175.anInt3521 <= 18) {
			Static73.method1189(1, 3);
			return;
		}
		if (Static179.anInt3572 >= 700 && Static175.anInt3521 >= 4 && Static179.anInt3572 <= 758 && Static175.anInt3521 <= 20) {
			aBoolean67 = false;
			Static209.method3117();
			return;
		}
		if (Static5.anInt123 == -1) {
			return;
		}
		@Pc(269) Class85 local269 = Static4.aClass85Array1[Static5.anInt123];
		if (Static148.aBoolean131 == local269.aBoolean142) {
			@Pc(289) byte[] local289 = Static70.method1166(new Class20[] { local269.aClass20_1199, Static82.aClass20_665 }).method558();
			Static199.aString5 = new String(local289, 0, local289.length);
			if (Static44.anInt1016 != 0) {
				Static141.anInt2946 = 43594;
				Static67.anInt3982 = 43594;
				Static63.anInt1382 = 443;
				Static44.anInt1016 = 0;
			}
			Static40.anInt844 = local269.anInt3230;
			aBoolean67 = false;
			Static209.method3117();
			return;
		}
		@Pc(375) Class20 local375 = Static70.method1166(new Class20[] { Static214.aClass20_1534, local269.aClass20_1199, Static55.aClass20_396, Static132.method2805(Static140.anInt2923), Static132.aClass20_1368, Static132.method2805(Static14.aBoolean14 ? 1 : 0), Static93.aClass20_1194, Static132.method2805(Static94.anInt2006), Static41.aClass20_302, Static132.method2805(Static57.anInt1309) });
		try {
			arg0.getAppletContext().showDocument(local375.method564(), "_self");
			return;
		} catch (@Pc(384) Exception local384) {
			return;
		}
	}
}
