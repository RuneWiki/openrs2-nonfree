import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kn", name = "nb", descriptor = "I")
	public static int anInt3416;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_111 = new Class151(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!kn", name = "Jb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method2822() {
		for (@Pc(11) Class1_Sub45 local11 = (Class1_Sub45) Static50.aClass254_8.method5437(); local11 != null; local11 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			if (Static370.method4799(local11.anInt7398)) {
				Static51.method756(local11);
			}
		}
		if (Static19.anInt396 == 1) {
			Static263.aBoolean329 = false;
			Static113.method1580(Static351.anInt5784, Static360.anInt5991, Static430.anInt7189, Static163.anInt2682);
			return;
		}
		Static113.method1580(Static351.anInt5784, Static360.anInt5991, Static430.anInt7189, Static163.anInt2682);
		@Pc(58) int local58 = Static6.aClass122_1.method2464(Static328.aClass151_169.method3122(Static188.anInt3028));
		for (@Pc(63) Class1_Sub45 local63 = (Class1_Sub45) Static50.aClass254_8.method5437(); local63 != null; local63 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			@Pc(69) int local69 = Static393.method4973(local63);
			if (local69 > local58) {
				local58 = local69;
			}
		}
		Static163.anInt2682 = local58 + 8;
		Static360.anInt5991 = Static19.anInt396 * 16 + (Static411.aBoolean546 ? 26 : 22);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIBIIIZF)[[I")
	public static int[][] method2830(@OriginalArg(8) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class1_Sub1_Sub16 local18 = new Class1_Sub1_Sub16();
		local18.anInt2673 = 4;
		local18.anInt2669 = 3;
		local18.anInt2671 = 8;
		local18.anInt2677 = (int) (arg0 * 4096.0F);
		local18.aBoolean213 = false;
		local18.method5627();
		Static343.method4361(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method2234(local14[local45], local45);
		}
		return local14;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLclient!se;I)V")
	public static void method2831(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20_Sub3_Sub3_Sub2 arg1) {
		if (Static19.anInt396 >= 400) {
			return;
		}
		@Pc(16) Class246 local16 = arg1.aClass246_1;
		if (local16.anIntArray459 != null) {
			local16 = local16.method5255(Static364.aClass259_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean563) {
			return;
		}
		@Pc(34) String local34 = local16.aString59;
		if (local16.anInt6829 != 0) {
			@Pc(53) String local53 = Static357.aClass6_4 == Static43.aClass6_3 ? Static425.aClass151_215.method3122(Static188.anInt3028) : Static309.aClass151_159.method3122(Static188.anInt3028);
			local34 = local34 + Static155.method2181(local16.anInt6829, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949) + " (" + local53 + local16.anInt6829 + ")";
		}
		if (!Static360.aBoolean498) {
			if (!arg0) {
				@Pc(83) String[] local83 = local16.aStringArray54;
				if (Static64.aBoolean94) {
					local83 = Static110.method1535(local83);
				}
				@Pc(93) int local93;
				if (local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && (Static455.aClass6_5 != Static357.aClass6_4 || !local83[local93].equalsIgnoreCase(Static402.aClass151_203.method3122(Static188.anInt3028)))) {
							@Pc(113) byte local113 = 0;
							@Pc(115) int local115 = Static229.anInt3720;
							if (local93 == 0) {
								local113 = 11;
							}
							if (local93 == 1) {
								local113 = 59;
							}
							if (local93 == 2) {
								local113 = 48;
							}
							if (local93 == 3) {
								local113 = 23;
							}
							if (local93 == local16.anInt6845) {
								local115 = local16.anInt6854;
							}
							if (local93 == 4) {
								local113 = 47;
							}
							if (local93 == local16.anInt6839) {
								local115 = local16.anInt6849;
							}
							Static87.method1275(false, 0, (long) arg1.anInt6045, "<col=ffff00>" + local34, local115, true, local83[local93], -1, 0, local113);
						}
					}
				}
				if (Static357.aClass6_4 == Static455.aClass6_5 && local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && local83[local93].equalsIgnoreCase(Static402.aClass151_203.method3122(Static188.anInt3028))) {
							@Pc(220) short local220 = 0;
							if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949 < local16.anInt6829) {
								local220 = 2000;
							}
							@Pc(233) short local233 = 0;
							if (local93 == 0) {
								local233 = 11;
							}
							if (local93 == 1) {
								local233 = 59;
							}
							if (local93 == 2) {
								local233 = 48;
							}
							if (local93 == 3) {
								local233 = 23;
							}
							if (local93 == 4) {
								local233 = 47;
							}
							if (local233 != 0) {
								local233 += local220;
							}
							Static87.method1275(false, 0, (long) arg1.anInt6045, "<col=ffff00>" + local34, local16.anInt6821, true, local83[local93], -1, 0, local233);
						}
					}
				}
			}
			Static87.method1275(arg0, 0, (long) arg1.anInt6045, "<col=ffff00>" + local34, Static299.anInt5002, true, Static111.aClass151_174.method3122(Static188.anInt3028), -1, 0, 1011);
		} else if (!arg0) {
			@Pc(347) Class78 local347 = Static331.anInt5403 == -1 ? null : Static85.aClass132_5.method2771(Static331.anInt5403);
			if ((Static20.anInt436 & 0x2) != 0) {
				if (local347 == null || local16.method5259(local347.anInt1998, Static331.anInt5403) != local347.anInt1998) {
					Static87.method1275(false, 0, (long) arg1.anInt6045, Static419.aString58 + " -> <col=ffff00>" + local34, Static161.anInt1936, true, Static149.aString68, -1, 0, 21);
				}
				return;
			}
		}
	}
}
