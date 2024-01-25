import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString58;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_120 = new Class169(12, -1);

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!vt;")
	public static final Class381 aClass381_4 = new Class381();

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!kja;I)Z")
	public static boolean method4269(@OriginalArg(1) Class2_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method5233(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg0.method5233(1) != 0) {
				method4269(arg0, arg1);
			}
			local25 = arg0.method5233(6);
			local30 = arg0.method5233(6);
			@Pc(42) boolean local42 = arg0.method5233(1) == 1;
			if (local42) {
				Static257.anIntArray250[Static318.anInt5798++] = arg1;
			}
			if (Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class245 local65 = Static221.aClass245Array1[arg1];
			@Pc(73) Class15_Sub3_Sub3_Sub1_Sub1 local73 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[arg1] = new Class15_Sub3_Sub3_Sub1_Sub1();
			local73.anInt3977 = arg1;
			if (Static510.aClass2_Sub8Array1[arg1] != null) {
				local73.method2225(Static510.aClass2_Sub8Array1[arg1]);
			}
			local73.method3686(local65.anInt7393, true);
			local73.anInt3979 = local65.anInt7392;
			local99 = local65.anInt7390;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			@Pc(113) int local113 = local99 & 0xFF;
			@Pc(122) int local122 = local25 + (local109 << 6) - Static640.anInt11085;
			local73.aBoolean173 = local65.aBoolean554;
			@Pc(135) int local135 = local30 + (local113 << 6) - Static490.anInt8763;
			local73.aBoolean172 = local65.aBoolean555;
			local73.aByteArray33[0] = Static15.aByteArray6[arg1];
			local73.aByte142 = local73.aByte141 = (byte) local103;
			if (Static45.method947(local122, local135)) {
				local73.aByte141++;
			}
			local73.method2221(local122, local135);
			local73.aBoolean174 = false;
			Static221.aClass245Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method5233(2);
			local30 = Static221.aClass245Array1[arg1].anInt7390;
			Static221.aClass245Array1[arg1].anInt7390 = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(233) int local233;
			@Pc(238) int local238;
			@Pc(246) int local246;
			if (local8 != 2) {
				local25 = arg0.method5233(18);
				local30 = local25 >> 16;
				local233 = local25 >> 8 & 0xFF;
				local238 = local25 & 0xFF;
				local246 = Static221.aClass245Array1[arg1].anInt7390;
				local99 = local30 + (local246 >> 28) & 0x3;
				local103 = (local246 >> 14) + local233 & 0xFF;
				local109 = local238 + local246 & 0xFF;
				Static221.aClass245Array1[arg1].anInt7390 = (local103 << 14) + (local99 << 28) + local109;
				return false;
			}
			local25 = arg0.method5233(5);
			local30 = local25 >> 3;
			local233 = local25 & 0x7;
			local238 = Static221.aClass245Array1[arg1].anInt7390;
			local246 = local30 + (local238 >> 28) & 0x3;
			local99 = local238 >> 14 & 0xFF;
			local103 = local238 & 0xFF;
			if (local233 == 0) {
				local103--;
				local99--;
			}
			if (local233 == 1) {
				local103--;
			}
			if (local233 == 2) {
				local99++;
				local103--;
			}
			if (local233 == 3) {
				local99--;
			}
			if (local233 == 4) {
				local99++;
			}
			if (local233 == 5) {
				local99--;
				local103++;
			}
			if (local233 == 6) {
				local103++;
			}
			if (local233 == 7) {
				local99++;
				local103++;
			}
			Static221.aClass245Array1[arg1].anInt7390 = local103 + (local246 << 28) + (local99 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIILclient!bv;I)V")
	public static void method4271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub12 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt1211 == -1 && arg3.anIntArray64 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg3.anInt1206 * Static230.aClass2_Sub54_15.aClass4_Sub22_4.method7520() >> 8;
		if (arg0 > arg3.anInt1200) {
			local15 = arg0 - arg3.anInt1200;
		} else if (arg0 < arg3.anInt1207) {
			local15 = arg3.anInt1207 - arg0;
		}
		if (arg2 > arg3.anInt1201) {
			local15 += arg2 - arg3.anInt1201;
		} else if (arg2 < arg3.anInt1202) {
			local15 += arg3.anInt1202 - arg2;
		}
		if (arg3.anInt1212 == 0 || local15 - 256 > arg3.anInt1212 || Static230.aClass2_Sub54_15.aClass4_Sub22_4.method7520() == 0 || arg4 != arg3.anInt1210) {
			if (arg3.aClass2_Sub26_Sub5_1 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(arg3.aClass2_Sub26_Sub5_1);
				arg3.aClass2_Sub26_Sub5_1 = null;
				arg3.aClass2_Sub44_Sub1_2 = null;
				arg3.aClass2_Sub46_2 = null;
			}
			if (arg3.aClass2_Sub26_Sub5_2 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(arg3.aClass2_Sub26_Sub5_2);
				arg3.aClass2_Sub26_Sub5_2 = null;
				arg3.aClass2_Sub46_1 = null;
				arg3.aClass2_Sub44_Sub1_1 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(150) int local150 = arg3.anInt1212 - arg3.anInt1208;
		if (local150 < 0) {
			local150 = arg3.anInt1212;
		}
		@Pc(160) int local160 = local25;
		@Pc(166) int local166 = local15 - arg3.anInt1208;
		if (local166 > 0 && local150 > 0) {
			local160 = local25 * (local150 - local166) / local150;
		}
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690();
		@Pc(188) int local188 = 8192;
		@Pc(200) int local200 = (arg3.anInt1200 + arg3.anInt1207) / 2 - arg0;
		@Pc(210) int local210 = (arg3.anInt1202 + arg3.anInt1201) / 2 - arg2;
		@Pc(249) int local249;
		if (local200 != 0 || local210 != 0) {
			@Pc(234) int local234 = -Static152.anInt3290 - (int) (Math.atan2((double) local200, (double) local210) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local234 > 8192) {
				local234 = 16384 - local234;
			}
			if (local15 <= 0) {
				local249 = 8192;
			} else if (local15 >= 4096) {
				local249 = 16384;
			} else {
				local249 = local15 * 8192 / 4096 + 8192;
			}
			local188 = (16384 - local249 >> 1) + local249 * local234 / 8192;
		}
		@Pc(365) Class2_Sub26_Sub5 local365;
		if (arg3.aClass2_Sub26_Sub5_1 != null) {
			arg3.aClass2_Sub26_Sub5_1.method9776(local160);
			arg3.aClass2_Sub26_Sub5_1.method9770(local188);
		} else if (arg3.anInt1211 >= 0) {
			local249 = arg3.anInt1195 == 256 && arg3.anInt1199 == 256 ? 256 : Static237.method4263(arg3.anInt1195, arg3.anInt1199);
			if (arg3.aBoolean65) {
				if (arg3.aClass2_Sub46_2 == null) {
					arg3.aClass2_Sub46_2 = Static529.method8217(Static40.aClass124_9, arg3.anInt1211);
				}
				if (arg3.aClass2_Sub46_2 != null) {
					if (arg3.aClass2_Sub44_Sub1_2 == null) {
						arg3.aClass2_Sub44_Sub1_2 = arg3.aClass2_Sub46_2.method8218(new int[] { 22050 });
					}
					if (arg3.aClass2_Sub44_Sub1_2 != null) {
						local365 = Static686.method9797(arg3.aClass2_Sub44_Sub1_2, local249, local160 << 6, local188);
						local365.method9763(-1);
						Static270.aClass2_Sub26_Sub4_2.method7391(local365);
						arg3.aClass2_Sub26_Sub5_1 = local365;
					}
				}
			} else {
				@Pc(382) Class116 local382 = Static678.method3543(Static437.aClass124_88, arg3.anInt1211, 0);
				if (local382 != null) {
					@Pc(389) Class2_Sub44_Sub1 local389 = local382.method3542().method8940(Static471.aClass269_2);
					@Pc(397) Class2_Sub26_Sub5 local397 = Static686.method9797(local389, local249, local160 << 6, local188);
					local397.method9763(-1);
					Static270.aClass2_Sub26_Sub4_2.method7391(local397);
					arg3.aClass2_Sub26_Sub5_1 = local397;
				}
			}
		}
		if (arg3.aClass2_Sub26_Sub5_2 != null) {
			arg3.aClass2_Sub26_Sub5_2.method9776(local160);
			arg3.aClass2_Sub26_Sub5_2.method9770(local188);
			if (arg3.aClass2_Sub26_Sub5_2.method9823()) {
				return;
			}
			arg3.aClass2_Sub46_1 = null;
			arg3.aClass2_Sub26_Sub5_2 = null;
			arg3.aClass2_Sub44_Sub1_1 = null;
		} else if (arg3.anIntArray64 != null && (arg3.anInt1209 -= arg1) <= 0) {
			local249 = arg3.anInt1195 == 256 && arg3.anInt1199 == 256 ? 256 : (int) ((double) (arg3.anInt1195 - arg3.anInt1199) * Math.random()) + arg3.anInt1199;
			@Pc(465) int local465;
			if (arg3.aBoolean66) {
				if (arg3.aClass2_Sub46_1 == null) {
					local465 = (int) (Math.random() * (double) arg3.anIntArray64.length);
					arg3.aClass2_Sub46_1 = Static529.method8217(Static40.aClass124_9, arg3.anIntArray64[local465]);
				}
				if (arg3.aClass2_Sub46_1 != null) {
					if (arg3.aClass2_Sub44_Sub1_1 == null) {
						arg3.aClass2_Sub44_Sub1_1 = arg3.aClass2_Sub46_1.method8218(new int[] { 22050 });
					}
					if (arg3.aClass2_Sub44_Sub1_1 != null) {
						local365 = Static686.method9797(arg3.aClass2_Sub44_Sub1_1, local249, local160 << 6, local188);
						local365.method9763(0);
						Static270.aClass2_Sub26_Sub4_2.method7391(local365);
						arg3.anInt1209 = arg3.anInt1204 + (int) ((double) (arg3.anInt1197 - arg3.anInt1204) * Math.random());
						arg3.aClass2_Sub26_Sub5_2 = local365;
						return;
					}
				}
				return;
			}
			local465 = (int) (Math.random() * (double) arg3.anIntArray64.length);
			@Pc(543) Class116 local543 = Static678.method3543(Static437.aClass124_88, arg3.anIntArray64[local465], 0);
			if (local543 != null) {
				@Pc(550) Class2_Sub44_Sub1 local550 = local543.method3542().method8940(Static471.aClass269_2);
				@Pc(558) Class2_Sub26_Sub5 local558 = Static686.method9797(local550, local249, local160 << 6, local188);
				local558.method9763(0);
				Static270.aClass2_Sub26_Sub4_2.method7391(local558);
				arg3.aClass2_Sub26_Sub5_2 = local558;
				arg3.anInt1209 = (int) (Math.random() * (double) (arg3.anInt1197 - arg3.anInt1204)) + arg3.anInt1204;
				return;
			}
		}
	}
}
