import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!fo;")
	public static Class129 aClass129_9;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public static int anInt5053 = -1;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZLclient!uv;)V")
	public static void method4290(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class23_Sub2_Sub1_Sub2 arg1) {
		@Pc(9) Class351 local9 = arg1.method8630();
		if (arg1.anInt10190 == 0) {
			arg1.anInt10191 = 0;
			Static156.anInt5829 = 0;
			Static82.anInt1891 = -1;
			return;
		}
		if (arg1.anInt10135 != -1 && arg1.anInt10186 == 0) {
			@Pc(33) Class48 local33 = Static483.aClass373_2.method8323(arg1.anInt10135);
			if (arg1.anInt10189 > 0 && local33.anInt1555 == 0) {
				Static156.anInt5829 = 0;
				Static82.anInt1891 = -1;
				arg1.anInt10191++;
				return;
			}
			if (arg1.anInt10189 <= 0 && local33.anInt1541 == 0) {
				Static156.anInt5829 = 0;
				arg1.anInt10191++;
				Static82.anInt1891 = -1;
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < arg1.aClass375Array3.length; local75++) {
			if (arg1.aClass375Array3[local75].anInt9871 != -1 && Static621.anInt9665 >= arg1.aClass375Array3[local75].anInt9870) {
				@Pc(105) Class34 local105 = Static196.aClass315_2.method7420(arg1.aClass375Array3[local75].anInt9871);
				if (local105.aBoolean105 && local105.anInt1217 != -1) {
					@Pc(119) Class48 local119 = Static483.aClass373_2.method8323(local105.anInt1217);
					if (arg1.anInt10189 > 0 && local119.anInt1555 == 0) {
						Static82.anInt1891 = -1;
						Static156.anInt5829 = 0;
						arg1.anInt10191++;
						return;
					}
					if (arg1.anInt10189 <= 0 && local119.anInt1541 == 0) {
						arg1.anInt10191++;
						Static156.anInt5829 = 0;
						Static82.anInt1891 = -1;
						return;
					}
				}
			}
		}
		@Pc(168) int local168 = arg1.anInt10108;
		@Pc(171) int local171 = arg1.anInt10109;
		@Pc(187) int local187 = arg1.anIntArray659[arg1.anInt10190 - 1] * 512 + arg1.method8625() * 256;
		@Pc(204) int local204 = arg1.anIntArray660[arg1.anInt10190 - 1] * 512 + arg1.method8625() * 256;
		if (local168 < local187) {
			if (local171 < local204) {
				arg1.method8615(10240);
			} else if (local171 <= local204) {
				arg1.method8615(12288);
			} else {
				arg1.method8615(14336);
			}
		} else if (local168 > local187) {
			if (local171 < local204) {
				arg1.method8615(6144);
			} else if (local204 >= local171) {
				arg1.method8615(4096);
			} else {
				arg1.method8615(2048);
			}
		} else if (local204 > local171) {
			arg1.method8615(8192);
		} else if (local171 > local204) {
			arg1.method8615(0);
		}
		@Pc(294) byte local294 = arg1.aByteArray109[arg1.anInt10190 - 1];
		if (!arg0 && (local187 - local168 > 1024 || local187 - local168 < -1024 || local204 - local171 > 1024 || local204 - local171 < -1024)) {
			arg1.anInt10108 = local187;
			arg1.anInt10109 = local204;
			arg1.method8623(arg1.anInt10181, false);
			Static156.anInt5829 = 0;
			Static82.anInt1891 = -1;
			arg1.anInt10190--;
			if (arg1.anInt10189 > 0) {
				arg1.anInt10189--;
			}
			return;
		}
		@Pc(361) int local361 = 16;
		@Pc(363) boolean local363 = true;
		if (arg1 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
			local363 = ((Class23_Sub2_Sub1_Sub2_Sub2) arg1).aClass5_1.aBoolean7;
		}
		@Pc(399) int local399;
		if (local363) {
			local399 = arg1.anInt10181 - arg1.aClass314_7.anInt8733;
			if (local399 != 0 && arg1.anInt10178 == -1 && arg1.anInt10133 != 0) {
				local361 = 8;
			}
			if (!arg0 && arg1.anInt10190 > 2) {
				local361 = 24;
			}
			if (!arg0 && arg1.anInt10190 > 3) {
				local361 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt10190 > 1) {
				local361 = 24;
			}
			if (!arg0 && arg1.anInt10190 > 2) {
				local361 = 32;
			}
		}
		if (arg1.anInt10191 > 0 && arg1.anInt10190 > 1) {
			arg1.anInt10191--;
			local361 = 32;
		}
		if (local294 == 2) {
			local361 <<= 0x1;
		} else if (local294 == 0) {
			local361 >>= 0x1;
		}
		if (local9.anInt9412 != -1) {
			local361 <<= 0x9;
			if (arg1.anInt10190 == 1) {
				local399 = arg1.anInt10188 * arg1.anInt10188;
				@Pc(509) int local509 = (arg1.anInt10108 <= local187 ? local187 - arg1.anInt10108 : -local187 + arg1.anInt10108) << 9;
				@Pc(527) int local527 = (local204 >= arg1.anInt10109 ? local204 - arg1.anInt10109 : -local204 + arg1.anInt10109) << 9;
				@Pc(534) int local534 = local527 >= local509 ? local527 : local509;
				@Pc(541) int local541 = local534 * 2 * local9.anInt9412;
				if (local399 > local541) {
					arg1.anInt10188 /= 2;
				} else if (local399 / 2 > local534) {
					arg1.anInt10188 -= local9.anInt9412;
					if (arg1.anInt10188 < 0) {
						arg1.anInt10188 = 0;
					}
				} else if (arg1.anInt10188 < local361) {
					arg1.anInt10188 += local9.anInt9412;
					if (arg1.anInt10188 > local361) {
						arg1.anInt10188 = local361;
					}
				}
			} else if (local361 > arg1.anInt10188) {
				arg1.anInt10188 += local9.anInt9412;
				if (arg1.anInt10188 > local361) {
					arg1.anInt10188 = local361;
				}
			} else if (arg1.anInt10188 > 0) {
				arg1.anInt10188 -= local9.anInt9412;
				if (arg1.anInt10188 < 0) {
					arg1.anInt10188 = 0;
				}
			}
			local361 = arg1.anInt10188 >> 9;
			if (local361 < 1) {
				local361 = 1;
			}
		}
		Static156.anInt5829 = 0;
		if (local187 == local168 && local204 == local171) {
			Static82.anInt1891 = -1;
		} else {
			if (local168 < local187) {
				Static156.anInt5829 |= 0x4;
				arg1.anInt10108 += local361;
				if (local187 < arg1.anInt10108) {
					arg1.anInt10108 = local187;
				}
			} else if (local187 < local168) {
				arg1.anInt10108 -= local361;
				Static156.anInt5829 |= 0x8;
				if (local187 > arg1.anInt10108) {
					arg1.anInt10108 = local187;
				}
			}
			if (local361 >= 32) {
				Static82.anInt1891 = 2;
			} else {
				Static82.anInt1891 = local294;
			}
			if (local204 > local171) {
				Static156.anInt5829 |= 0x1;
				arg1.anInt10109 += local361;
				if (local204 < arg1.anInt10109) {
					arg1.anInt10109 = local204;
				}
			} else if (local171 > local204) {
				Static156.anInt5829 |= 0x2;
				arg1.anInt10109 -= local361;
				if (local204 > arg1.anInt10109) {
					arg1.anInt10109 = local204;
				}
			}
		}
		if (arg1.anInt10108 != local187 || local204 != arg1.anInt10109) {
			return;
		}
		arg1.anInt10190--;
		if (arg1.anInt10189 > 0) {
			arg1.anInt10189--;
			return;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V")
	public static void method4296() {
		@Pc(14) Class3_Sub44 local14 = Static275.method5689(Static427.aClass376_102, Static540.aClass282_4);
		Static616.method8089(local14);
		for (@Pc(22) Class3_Sub28 local22 = (Class3_Sub28) Static222.aClass62_21.method1680(); local22 != null; local22 = (Class3_Sub28) Static222.aClass62_21.method1681()) {
			if (!local22.method8771()) {
				local22 = (Class3_Sub28) Static222.aClass62_21.method1680();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt5253 == 0) {
				Static414.method5937(true, local22, true);
			}
		}
		if (Static339.aClass208_8 != null) {
			Static374.method5525(Static339.aClass208_8);
			Static339.aClass208_8 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[Ljava/lang/Object;[IZ)V")
	public static void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local28;
		@Pc(42) Object local42 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg0; local61++) {
			if (arg3[local61] < local28 + (local61 & local59)) {
				@Pc(80) int local80 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24] = local80;
				@Pc(94) Object local94 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24++] = local94;
			}
		}
		arg3[arg0] = arg3[local24];
		arg3[local24] = local28;
		arg2[arg0] = arg2[local24];
		arg2[local24] = local42;
		method4302(local24 - 1, arg1, arg2, arg3);
		method4302(arg0, local24 + 1, arg2, arg3);
	}
}
