import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_103 = new Class186(47, -1);

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_10 = new Class206(0, 8);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ur;I)I")
	public static int method4977(@OriginalArg(0) Class377 arg0) {
		if (arg0 == Static603.aClass377_4) {
			return 9216;
		} else if (arg0 == Static595.aClass377_2) {
			return 34065;
		} else if (Static254.aClass377_1 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public static void method4978() {
		if (Static500.anIntArray466 != null && Static263.anIntArray275 != null) {
			return;
		}
		Static263.anIntArray275 = new int[256];
		Static500.anIntArray466 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(24) double local24 = (double) local15 / 255.0D * 6.283185307179586D;
			Static500.anIntArray466[local15] = (int) (Math.sin(local24) * 4096.0D);
			Static263.anIntArray275[local15] = (int) (Math.cos(local24) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!lk;I)V")
	public static void method4982(@OriginalArg(1) Class3_Sub28_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) boolean local18 = arg0.method5344(1) == 1;
		if (local18) {
			Static603.anIntArray545[Static3.anInt30++] = arg1;
		}
		@Pc(37) int local37 = arg0.method5344(2);
		@Pc(41) Class19_Sub1_Sub3_Sub2_Sub2 local41 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[arg1];
		if (local37 != 0) {
			@Pc(179) int local179;
			@Pc(184) int local184;
			@Pc(189) int local189;
			if (local37 == 1) {
				local179 = arg0.method5344(3);
				local184 = local41.anIntArray430[0];
				local189 = local41.lb[0];
				if (local179 == 0) {
					local184--;
					local189--;
				} else if (local179 == 1) {
					local189--;
				} else if (local179 == 2) {
					local184++;
					local189--;
				} else if (local179 == 3) {
					local184--;
				} else if (local179 == 4) {
					local184++;
				} else if (local179 == 5) {
					local184--;
					local189++;
				} else if (local179 == 6) {
					local189++;
				} else if (local179 == 7) {
					local189++;
					local184++;
				}
				if (local18) {
					local41.anInt7852 = local189;
					local41.aBoolean601 = true;
					local41.anInt7830 = local184;
				} else {
					local41.method6620(local189, Static443.aByteArray65[arg1], local184);
				}
			} else if (local37 == 2) {
				local179 = arg0.method5344(4);
				local184 = local41.anIntArray430[0];
				local189 = local41.lb[0];
				if (local179 == 0) {
					local189 -= 2;
					local184 -= 2;
				} else if (local179 == 1) {
					local184--;
					local189 -= 2;
				} else if (local179 == 2) {
					local189 -= 2;
				} else if (local179 == 3) {
					local189 -= 2;
					local184++;
				} else if (local179 == 4) {
					local189 -= 2;
					local184 += 2;
				} else if (local179 == 5) {
					local189--;
					local184 -= 2;
				} else if (local179 == 6) {
					local184 += 2;
					local189--;
				} else if (local179 == 7) {
					local184 -= 2;
				} else if (local179 == 8) {
					local184 += 2;
				} else if (local179 == 9) {
					local189++;
					local184 -= 2;
				} else if (local179 == 10) {
					local189++;
					local184 += 2;
				} else if (local179 == 11) {
					local189 += 2;
					local184 -= 2;
				} else if (local179 == 12) {
					local189 += 2;
					local184--;
				} else if (local179 == 13) {
					local189 += 2;
				} else if (local179 == 14) {
					local184++;
					local189 += 2;
				} else if (local179 == 15) {
					local184 += 2;
					local189 += 2;
				}
				if (local18) {
					local41.anInt7852 = local189;
					local41.aBoolean601 = true;
					local41.anInt7830 = local184;
				} else {
					local41.method6620(local189, Static443.aByteArray65[arg1], local184);
				}
			} else {
				local179 = arg0.method5344(1);
				@Pc(542) int local542;
				@Pc(554) int local554;
				@Pc(568) int local568;
				@Pc(575) int local575;
				if (local179 == 0) {
					local184 = arg0.method5344(12);
					local189 = local184 >> 10;
					local542 = local184 >> 5 & 0x1F;
					if (local542 > 15) {
						local542 -= 32;
					}
					local554 = local184 & 0x1F;
					if (local554 > 15) {
						local554 -= 32;
					}
					local568 = local41.anIntArray430[0] + local542;
					local575 = local554 + local41.lb[0];
					if (local18) {
						local41.anInt7852 = local575;
						local41.anInt7830 = local568;
						local41.aBoolean601 = true;
					} else {
						local41.method6620(local575, Static443.aByteArray65[arg1], local568);
					}
					local41.aByte146 = local41.aByte145 = (byte) (local189 + local41.aByte146 & 0x3);
					if (Static135.method2226(local568, local575)) {
						local41.aByte145++;
					}
					if (arg1 == Static584.anInt9539) {
						if (Static712.anInt11117 != local41.aByte146) {
							Static70.aBoolean89 = true;
						}
						Static712.anInt11117 = local41.aByte146;
					}
				} else {
					local184 = arg0.method5344(30);
					local189 = local184 >> 28;
					local542 = local184 >> 14 & 0x3FFF;
					local554 = local184 & 0x3FFF;
					local568 = (Static714.anInt11156 + local41.anIntArray430[0] + local542 & 0x3FFF) - Static714.anInt11156;
					local575 = (local554 + Static339.anInt5859 + local41.lb[0] & 0x3FFF) - Static339.anInt5859;
					if (local18) {
						local41.aBoolean601 = true;
						local41.anInt7830 = local568;
						local41.anInt7852 = local575;
					} else {
						local41.method6620(local575, Static443.aByteArray65[arg1], local568);
					}
					local41.aByte146 = local41.aByte145 = (byte) (local41.aByte146 + local189 & 0x3);
					if (Static135.method2226(local568, local575)) {
						local41.aByte145++;
					}
					if (arg1 == Static584.anInt9539) {
						Static712.anInt11117 = local41.aByte146;
					}
				}
			}
		} else if (local18) {
			local41.aBoolean601 = false;
		} else if (arg1 == Static584.anInt9539) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(75) Class342 local75 = Static286.aClass342Array5[arg1] = new Class342();
			local75.anInt9614 = (local41.aByte146 << 28) - (-(local41.anIntArray430[0] + Static714.anInt11156 >> 6 << 14) - (Static339.anInt5859 + local41.lb[0] >> 6));
			if (local41.anInt7825 == -1) {
				local75.anInt9611 = local41.aClass340_7.method8085();
			} else {
				local75.anInt9611 = local41.anInt7825;
			}
			local75.aBoolean692 = local41.aBoolean599;
			local75.aBoolean691 = local41.aBoolean600;
			local75.anInt9615 = local41.anInt7780;
			if (local41.anInt7856 > 0) {
				Static46.method626(local41);
			}
			Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[arg1] = null;
			if (arg0.method5344(1) != 0) {
				Static414.method6154(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZIII)Lclient!lb;")
	public static Class221 method4983(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class73 local11 = null;
		if (Static431.aClass325_6 != null) {
			local11 = new Class73(arg1, Static431.aClass325_6, Static405.aClass325Array1[arg1], 1000000);
		}
		Static231.aClass171_Sub1Array1[arg1] = Static30.aClass389_1.method9070(arg1, local11, Static437.aClass73_4);
		Static231.aClass171_Sub1Array1[arg1].method4228();
		return new Class221(Static231.aClass171_Sub1Array1[arg1], arg0, arg2);
	}
}
