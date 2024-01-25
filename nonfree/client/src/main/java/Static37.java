import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_1 = new Class266(13, 3);

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_8 = new Class269(54, 7);

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
	public static int anInt925 = 1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Z")
	public static boolean method811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!gs;)V")
	public static void method812(@OriginalArg(0) Class11_Sub1 arg0) {
		Static328.aClass87_6.H(arg0.anInt9925, arg0.anInt9930 + (arg0.method8315() >> 1), arg0.anInt9929, Static630.anIntArray728);
		arg0.anInt9932 = Static630.anIntArray728[0];
		arg0.anInt9931 = Static630.anIntArray728[1];
		arg0.anInt9928 = Static630.anIntArray728[2];
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!dm;I)V")
	public static void method815(@OriginalArg(0) Class78 arg0) {
		if (!Static301.aBoolean423) {
			return;
		}
		if (arg0.anObjectArray19 != null) {
			@Pc(14) Class78 local14 = Static496.method7080(Static342.anInt6258, Static590.anInt9763);
			if (local14 != null) {
				@Pc(20) Class2_Sub42 local20 = new Class2_Sub42();
				local20.aClass78_9 = arg0;
				local20.aClass78_8 = local14;
				local20.anObjectArray33 = arg0.anObjectArray19;
				Static639.method8539(local20);
			}
		}
		@Pc(46) Class2_Sub50 local46 = Static595.method8194(Static610.aClass310_2, Static91.aClass269_19);
		local46.aClass2_Sub34_Sub2_2.method6864(arg0.anInt1968);
		local46.aClass2_Sub34_Sub2_2.method6857(Static352.anInt6475);
		local46.aClass2_Sub34_Sub2_2.method6887(Static342.anInt6258);
		local46.aClass2_Sub34_Sub2_2.method6916(arg0.anInt1978);
		local46.aClass2_Sub34_Sub2_2.method6916(Static590.anInt9763);
		local46.aClass2_Sub34_Sub2_2.method6900(arg0.anInt2006);
		Static311.method4754(local46);
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
	public static void method816() {
		if (!Static354.aBoolean483) {
			Static354.aBoolean483 = true;
			Static293.aFloat128 += (-12.0F - Static293.aFloat128) / 2.0F;
			Static620.aBoolean745 = true;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIIIII)V")
	public static void method820(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(17) int local17 = arg1 - 334;
		if (local17 < 0) {
			local17 = 0;
		} else if (local17 > 100) {
			local17 = 100;
		}
		@Pc(40) int local40 = Static353.aShort91 + (Static19.aShort78 - Static353.aShort91) * local17 / 100;
		if (Static283.aShort82 > local40) {
			local40 = Static283.aShort82;
		} else if (Static343.aShort86 < local40) {
			local40 = Static343.aShort86;
		}
		@Pc(66) int local66 = local40 * 512 * arg1 / (arg3 * 334);
		@Pc(107) int local107;
		@Pc(114) int local114;
		@Pc(78) short local78;
		if (Static50.aShort30 > local66) {
			local78 = Static50.aShort30;
			local40 = arg3 * 334 * local78 / (arg1 * 512);
			if (Static343.aShort86 < local40) {
				local40 = Static343.aShort86;
				local107 = arg1 * local40 * 512 / (local78 * 334);
				local114 = (arg3 - local107) / 2;
				if (arg0) {
					Static600.aClass87_15.la();
					Static600.aClass87_15.method7898(arg1, local114, -16777216, arg2, arg4);
					Static600.aClass87_15.method7898(arg1, local114, -16777216, arg2, arg4 + arg3 - local114);
				}
				arg3 -= local114 * 2;
				arg4 += local114;
			}
		} else if (Static436.aShort101 < local66) {
			local78 = Static436.aShort101;
			local40 = local78 * 334 * arg3 / (arg1 * 512);
			if (Static283.aShort82 > local40) {
				local40 = Static283.aShort82;
				local107 = arg3 * local78 * 334 / (local40 * 512);
				local114 = (arg1 - local107) / 2;
				if (arg0) {
					Static600.aClass87_15.la();
					Static600.aClass87_15.method7898(local114, arg3, -16777216, arg2, arg4);
					Static600.aClass87_15.method7898(local114, arg3, -16777216, arg1 + arg2 - local114, arg4);
				}
				arg2 += local114;
				arg1 -= local114 * 2;
			}
		}
		Static389.anInt6997 = arg2;
		Static421.anInt7650 = arg4;
		Static224.anInt4612 = (short) arg3;
		Static108.anInt2143 = (short) arg1;
		Static358.anInt6511 = local40 * arg1 / 334;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	public static void method822() {
		@Pc(14) int local14 = Static244.anInt4842 * 512 + 256;
		@Pc(20) int local20 = Static307.anInt5655 * 512 + 256;
		@Pc(28) int local28 = Static582.method8038(Static16.anInt308, local14, local20) - Static189.anInt4149;
		if (Static458.anInt7979 < 100) {
			if (local14 > Static53.anInt1153) {
				Static53.anInt1153 += (local14 - Static53.anInt1153) * Static458.anInt7979 / 1000 + Static531.anInt8872;
				if (Static53.anInt1153 > local14) {
					Static53.anInt1153 = local14;
				}
			}
			if (Static53.anInt1153 > local14) {
				Static53.anInt1153 -= Static531.anInt8872 + (Static53.anInt1153 - local14) * Static458.anInt7979 / 1000;
				if (local14 > Static53.anInt1153) {
					Static53.anInt1153 = local14;
				}
			}
			if (Static64.anInt1371 < local28) {
				Static64.anInt1371 += Static531.anInt8872 + Static458.anInt7979 * (local28 - Static64.anInt1371) / 1000;
				if (local28 < Static64.anInt1371) {
					Static64.anInt1371 = local28;
				}
			}
			if (Static64.anInt1371 > local28) {
				Static64.anInt1371 -= Static531.anInt8872 + Static458.anInt7979 * (Static64.anInt1371 - local28) / 1000;
				if (local28 > Static64.anInt1371) {
					Static64.anInt1371 = local28;
				}
			}
			if (local20 > Static395.anInt3530) {
				Static395.anInt3530 += Static531.anInt8872 + (local20 - Static395.anInt3530) * Static458.anInt7979 / 1000;
				if (local20 < Static395.anInt3530) {
					Static395.anInt3530 = local20;
				}
			}
			if (local20 < Static395.anInt3530) {
				Static395.anInt3530 -= Static458.anInt7979 * (Static395.anInt3530 - local20) / 1000 + Static531.anInt8872;
				if (local20 > Static395.anInt3530) {
					Static395.anInt3530 = local20;
				}
			}
		} else {
			Static395.anInt3530 = Static307.anInt5655 * 512 + 256;
			Static53.anInt1153 = Static244.anInt4842 * 512 + 256;
			Static64.anInt1371 = Static582.method8038(Static16.anInt308, Static53.anInt1153, Static395.anInt3530) - Static189.anInt4149;
		}
		local20 = Static597.anInt9840 * 512 + 256;
		local14 = Static556.anInt9172 * 512 + 256;
		local28 = Static582.method8038(Static16.anInt308, local14, local20) - Static299.anInt5573;
		@Pc(229) int local229 = local14 - Static53.anInt1153;
		@Pc(234) int local234 = local28 - Static64.anInt1371;
		@Pc(239) int local239 = local20 - Static395.anInt3530;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local229 * local229 + local239 * local239));
		@Pc(262) int local262 = (int) (Math.atan2((double) local234, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		@Pc(273) int local273 = (int) (Math.atan2((double) local229, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (local262 > Static512.anInt8589) {
			Static512.anInt8589 += Static259.anInt5081 + Static126.anInt2936 * (local262 - Static512.anInt8589 >> 3) / 1000 << 3;
			if (local262 < Static512.anInt8589) {
				Static512.anInt8589 = local262;
			}
		}
		if (Static512.anInt8589 > local262) {
			Static512.anInt8589 -= Static259.anInt5081 + (Static512.anInt8589 - local262 >> 3) * Static126.anInt2936 / 1000 << 3;
			if (local262 > Static512.anInt8589) {
				Static512.anInt8589 = local262;
			}
		}
		@Pc(353) int local353 = local273 - Static105.anInt2114;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static105.anInt2114 += Static259.anInt5081 + Static126.anInt2936 * local353 / 1000 << 3;
			Static105.anInt2114 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static105.anInt2114 -= Static259.anInt5081 + -local353 * Static126.anInt2936 / 1000 << 3;
			Static105.anInt2114 &= 0x3FFF;
		}
		@Pc(410) int local410 = local273 - Static105.anInt2114;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		if (local410 < 0 && local353 > 0 || local410 > 0 && local353 < 0) {
			Static105.anInt2114 = local273;
		}
		Static103.anInt2093 = 0;
	}
}
