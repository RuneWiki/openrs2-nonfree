import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "Lclient!ri;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!wba", name = "K", descriptor = "I")
	public static int anInt9981;

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_134 = new Class130(66, 0);

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	public static void method8552() {
		Static7.anImage6 = null;
		Static195.aFont1 = null;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBIIILclient!fj;)V")
	public static void method8553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub22 arg4) {
		if (arg4.anInt3101 == -1 && arg4.anIntArray158 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg4.anInt3111 * Static262.aClass3_Sub27_12.aClass21_Sub14_5.method5405() >> 8;
		if (arg4.anInt3106 < arg0) {
			local16 = arg0 - arg4.anInt3106;
		} else if (arg4.anInt3116 > arg0) {
			local16 = arg4.anInt3116 - arg0;
		}
		if (arg3 > arg4.anInt3108) {
			local16 += arg3 - arg4.anInt3108;
		} else if (arg3 < arg4.anInt3103) {
			local16 += arg4.anInt3103 - arg3;
		}
		if (arg4.anInt3117 == 0 || local16 - 256 > arg4.anInt3117 || Static262.aClass3_Sub27_12.aClass21_Sub14_5.method5405() == 0 || arg1 != arg4.anInt3110) {
			if (arg4.aClass3_Sub7_Sub3_1 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(arg4.aClass3_Sub7_Sub3_1);
				arg4.aClass3_Sub7_Sub3_1 = null;
				arg4.aClass3_Sub43_2 = null;
				arg4.aClass3_Sub30_Sub1_2 = null;
			}
			if (arg4.aClass3_Sub7_Sub3_2 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(arg4.aClass3_Sub7_Sub3_2);
				arg4.aClass3_Sub43_1 = null;
				arg4.aClass3_Sub7_Sub3_2 = null;
				arg4.aClass3_Sub30_Sub1_1 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(164) int local164 = (arg4.anInt3117 - local16) * local26 / arg4.anInt3117;
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059();
		@Pc(170) int local170 = 8192;
		@Pc(181) int local181 = (arg4.anInt3116 + arg4.anInt3106) / 2 - arg0;
		@Pc(193) int local193 = (arg4.anInt3108 + arg4.anInt3103) / 2 - arg3;
		@Pc(220) int local220;
		@Pc(233) int local233;
		if (local181 != 0 || local193 != 0) {
			local220 = -Static185.anInt5215 - (int) (Math.atan2((double) local181, (double) local193) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local220 > 8192) {
				local220 = 16384 - local220;
			}
			if (local16 <= 0) {
				local233 = 8192;
			} else if (local16 >= 4096) {
				local233 = 16384;
			} else {
				local233 = local16 * 8192 / 4096 + 8192;
			}
			local170 = local220 * local233 / 8192 + (16384 - local233 >> 1);
		}
		@Pc(361) Class3_Sub7_Sub3 local361;
		if (arg4.aClass3_Sub7_Sub3_1 != null) {
			arg4.aClass3_Sub7_Sub3_1.method4077(local164);
			arg4.aClass3_Sub7_Sub3_1.method4072(local170);
		} else if (arg4.anInt3101 >= 0) {
			local220 = arg4.anInt3114 == 256 && arg4.anInt3118 == 256 ? 256 : Static109.method2232(arg4.anInt3118, arg4.anInt3114);
			if (arg4.aBoolean204) {
				if (arg4.aClass3_Sub43_2 == null) {
					arg4.aClass3_Sub43_2 = Static425.method6656(Static342.aClass196_67, arg4.anInt3101);
				}
				if (arg4.aClass3_Sub43_2 != null) {
					if (arg4.aClass3_Sub30_Sub1_2 == null) {
						arg4.aClass3_Sub30_Sub1_2 = arg4.aClass3_Sub43_2.method6658(new int[] { 22050 });
					}
					if (arg4.aClass3_Sub30_Sub1_2 != null) {
						local361 = Static647.method4058(arg4.aClass3_Sub30_Sub1_2, local220, local164 << 6, local170);
						local361.method4068(-1);
						Static204.aClass3_Sub7_Sub1_1.method1626(local361);
						arg4.aClass3_Sub7_Sub3_1 = local361;
					}
				}
			} else {
				@Pc(297) Class217 local297 = Static651.method5786(Static294.aClass196_53, arg4.anInt3101, 0);
				if (local297 != null) {
					@Pc(304) Class3_Sub30_Sub1 local304 = local297.method5785().method4292(Static166.aClass97_1);
					@Pc(312) Class3_Sub7_Sub3 local312 = Static647.method4058(local304, local220, local164 << 6, local170);
					local312.method4068(-1);
					Static204.aClass3_Sub7_Sub1_1.method1626(local312);
					arg4.aClass3_Sub7_Sub3_1 = local312;
				}
			}
		}
		if (arg4.aClass3_Sub7_Sub3_2 != null) {
			arg4.aClass3_Sub7_Sub3_2.method4077(local164);
			arg4.aClass3_Sub7_Sub3_2.method4072(local170);
			if (!arg4.aClass3_Sub7_Sub3_2.method8770()) {
				arg4.aClass3_Sub7_Sub3_2 = null;
				arg4.aClass3_Sub43_1 = null;
				arg4.aClass3_Sub30_Sub1_1 = null;
			}
		} else if (arg4.anIntArray158 != null && (arg4.anInt3104 -= arg2) <= 0) {
			local220 = arg4.anInt3114 == 256 && arg4.anInt3118 == 256 ? 256 : (int) ((double) (arg4.anInt3114 - arg4.anInt3118) * Math.random()) + arg4.anInt3118;
			if (!arg4.aBoolean206) {
				local233 = (int) (Math.random() * (double) arg4.anIntArray158.length);
				@Pc(468) Class217 local468 = Static651.method5786(Static294.aClass196_53, arg4.anIntArray158[local233], 0);
				if (local468 != null) {
					@Pc(475) Class3_Sub30_Sub1 local475 = local468.method5785().method4292(Static166.aClass97_1);
					@Pc(483) Class3_Sub7_Sub3 local483 = Static647.method4058(local475, local220, local164 << 6, local170);
					local483.method4068(0);
					Static204.aClass3_Sub7_Sub1_1.method1626(local483);
					arg4.anInt3104 = (int) ((double) (arg4.anInt3105 - arg4.anInt3115) * Math.random()) + arg4.anInt3115;
					arg4.aClass3_Sub7_Sub3_2 = local483;
					return;
				}
				return;
			}
			if (arg4.aClass3_Sub43_1 == null) {
				local233 = (int) ((double) arg4.anIntArray158.length * Math.random());
				arg4.aClass3_Sub43_1 = Static425.method6656(Static342.aClass196_67, arg4.anIntArray158[local233]);
			}
			if (arg4.aClass3_Sub43_1 != null) {
				if (arg4.aClass3_Sub30_Sub1_1 == null) {
					arg4.aClass3_Sub30_Sub1_1 = arg4.aClass3_Sub43_1.method6658(new int[] { 22050 });
				}
				if (arg4.aClass3_Sub30_Sub1_1 != null) {
					local361 = Static647.method4058(arg4.aClass3_Sub30_Sub1_1, local220, local164 << 6, local170);
					local361.method4068(0);
					Static204.aClass3_Sub7_Sub1_1.method1626(local361);
					arg4.anInt3104 = arg4.anInt3115 + (int) (Math.random() * (double) (arg4.anInt3105 - arg4.anInt3115));
					arg4.aClass3_Sub7_Sub3_2 = local361;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZZ)V")
	public static void method8554(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(15) Class3_Sub14 local15 = Static139.method2308(Static65.aClass130_27, Static24.aClass233_1);
			local15.aClass3_Sub3_Sub2_2.method4201(arg0);
			Static562.method8096(local15);
		} else {
			Static304.method4842(Static544.aClass311_12, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!jw;[Lclient!wh;)V")
	public static void method8555(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		@Pc(6) int local6;
		if (Static633.aBoolean721) {
			local6 = arg0.method7698(arg1);
			Static232.aClass5_8.method7521(local6, arg1);
		}
		if (Static2.aClass51Array1 == Static364.aClass51Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class4_Sub1_Sub2) {
				local6 = ((Class4_Sub1_Sub2) arg0).aShort118;
				local28 = ((Class4_Sub1_Sub2) arg0).aShort116;
			} else {
				local6 = arg0.anInt8916 >> Static308.anInt5834;
				local28 = arg0.anInt8911 >> Static308.anInt5834;
			}
			Static232.aClass5_8.EA(Static559.aClass51Array4[0].method7839(arg0.anInt8916, arg0.anInt8911), Static568.method8121(local6, local28), Static191.method3261(local6, local28), Static511.method7625(local6, local28));
		}
		@Pc(64) Class4_Sub8 local64 = arg0.method7692(Static232.aClass5_8);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean637) {
			@Pc(72) Class4_Sub5[] local72 = local64.aClass4_Sub5Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class4_Sub5 local79 = local72[local74];
				if (local79.aBoolean514) {
					Static520.method8069(local79.anInt7142 - local79.anInt7146, local79.anInt7144 - local79.anInt7146, local79.anInt7143 + local79.anInt7146, local79.anInt7145 + local79.anInt7146);
				}
			}
		}
		if (local64.aBoolean581) {
			local64.aClass4_Sub1_2 = arg0;
			if (Static557.aBoolean669) {
				@Pc(119) Class301 local119 = Static374.aClass301_3;
				synchronized (Static374.aClass301_3) {
					Static374.aClass301_3.method7459(local64);
					return;
				}
			}
			Static374.aClass301_3.method7459(local64);
			return;
		}
		Static427.method6667(local64);
	}
}
