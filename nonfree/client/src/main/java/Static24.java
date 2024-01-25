import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!ac;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	public static int anInt380;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!us;")
	public static final Class344 aClass344_4 = new Class344(50, 0);

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_4 = new Class218(78, 3);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZBLclient!kba;)V")
	public static void method417(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3_Sub1_Sub2 arg1) {
		@Pc(9) Class232 local9 = arg1.method5304();
		if (arg1.anInt6343 == 0) {
			Static344.anInt6771 = -1;
			arg1.anInt6345 = 0;
			Static363.anInt6997 = 0;
			return;
		}
		if (arg1.anInt6306 != -1 && arg1.anInt6297 == 0) {
			@Pc(39) Class290 local39 = Static618.aClass222_2.method5867(arg1.anInt6306);
			if (arg1.anInt6346 > 0 && local39.anInt8691 == 0) {
				Static344.anInt6771 = -1;
				Static363.anInt6997 = 0;
				arg1.anInt6345++;
				return;
			}
			if (arg1.anInt6346 <= 0 && local39.anInt8693 == 0) {
				arg1.anInt6345++;
				Static363.anInt6997 = 0;
				Static344.anInt6771 = -1;
				return;
			}
		}
		@Pc(105) Class290 local105;
		@Pc(91) Class268 local91;
		if (arg1.anInt6321 != -1 && Static251.anInt5580 >= arg1.anInt6311) {
			local91 = Static35.aClass343_1.method8033(arg1.anInt6321);
			if (local91.aBoolean688 && local91.anInt8068 != -1) {
				local105 = Static618.aClass222_2.method5867(local91.anInt8068);
				if (arg1.anInt6346 > 0 && local105.anInt8691 == 0) {
					arg1.anInt6345++;
					Static344.anInt6771 = -1;
					Static363.anInt6997 = 0;
					return;
				}
				if (arg1.anInt6346 <= 0 && local105.anInt8693 == 0) {
					Static344.anInt6771 = -1;
					Static363.anInt6997 = 0;
					arg1.anInt6345++;
					return;
				}
			}
		}
		if (arg1.anInt6321 != -1 && Static251.anInt5580 >= arg1.anInt6311) {
			local91 = Static35.aClass343_1.method8033(arg1.anInt6321);
			if (local91.aBoolean688 && local91.anInt8068 != -1) {
				local105 = Static618.aClass222_2.method5867(local91.anInt8068);
				if (arg1.anInt6346 > 0 && local105.anInt8691 == 0) {
					arg1.anInt6345++;
					Static363.anInt6997 = 0;
					Static344.anInt6771 = -1;
					return;
				}
				if (arg1.anInt6346 <= 0 && local105.anInt8693 == 0) {
					Static363.anInt6997 = 0;
					Static344.anInt6771 = -1;
					arg1.anInt6345++;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt10428;
		@Pc(222) int local222 = arg1.anInt10424;
		@Pc(239) int local239 = arg1.anIntArray378[arg1.anInt6343 - 1] * 512 + arg1.method5308() * 256;
		@Pc(262) int local262 = arg1.anIntArray377[arg1.anInt6343 - 1] * 512 + arg1.method5308() * 256;
		if (local239 > local219) {
			if (local262 > local222) {
				arg1.method5319(10240);
			} else if (local262 < local222) {
				arg1.method5319(14336);
			} else {
				arg1.method5319(12288);
			}
		} else if (local219 > local239) {
			if (local222 < local262) {
				arg1.method5319(6144);
			} else if (local222 > local262) {
				arg1.method5319(2048);
			} else {
				arg1.method5319(4096);
			}
		} else if (local262 > local222) {
			arg1.method5319(8192);
		} else if (local222 > local262) {
			arg1.method5319(0);
		}
		@Pc(368) byte local368 = arg1.aByteArray69[arg1.anInt6343 - 1];
		if (!arg0 && (local239 - local219 > 1024 || local239 - local219 < -1024 || local262 - local222 > 1024 || local262 - local222 < -1024)) {
			arg1.anInt10424 = local262;
			arg1.anInt10428 = local239;
			arg1.method5322(arg1.anInt6302, false);
			arg1.anInt6343--;
			Static344.anInt6771 = -1;
			Static363.anInt6997 = 0;
			if (arg1.anInt6346 > 0) {
				arg1.anInt6346--;
			}
			return;
		}
		@Pc(438) int local438 = 16;
		@Pc(440) boolean local440 = true;
		if (arg1 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
			local440 = ((Class2_Sub3_Sub1_Sub2_Sub1) arg1).aClass22_1.aBoolean39;
		}
		@Pc(457) int local457;
		if (local440) {
			local457 = arg1.anInt6302 - arg1.aClass145_7.anInt5347;
			if (local457 != 0 && arg1.anInt6331 == -1 && arg1.anInt6275 != 0) {
				local438 = 8;
			}
			if (!arg0 && arg1.anInt6343 > 2) {
				local438 = 24;
			}
			if (!arg0 && arg1.anInt6343 > 3) {
				local438 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt6343 > 1) {
				local438 = 24;
			}
			if (!arg0 && arg1.anInt6343 > 2) {
				local438 = 32;
			}
		}
		if (arg1.anInt6345 > 0 && arg1.anInt6343 > 1) {
			arg1.anInt6345--;
			local438 = 32;
		}
		if (local368 == 2) {
			local438 <<= 0x1;
		} else if (local368 == 0) {
			local438 >>= 0x1;
		}
		if (local9.anInt7166 != -1) {
			local438 <<= 0x9;
			if (arg1.anInt6343 == 1) {
				local457 = arg1.anInt6344 * arg1.anInt6344;
				@Pc(632) int local632 = (local239 >= arg1.anInt10428 ? local239 - arg1.anInt10428 : -local239 + arg1.anInt10428) << 9;
				@Pc(650) int local650 = (local262 >= arg1.anInt10424 ? local262 - arg1.anInt10424 : -local262 + arg1.anInt10424) << 9;
				@Pc(661) int local661 = local632 > local650 ? local632 : local650;
				@Pc(668) int local668 = local9.anInt7166 * 2 * local661;
				if (local457 > local668) {
					arg1.anInt6344 /= 2;
				} else if (local661 < local457 / 2) {
					arg1.anInt6344 -= local9.anInt7166;
					if (arg1.anInt6344 < 0) {
						arg1.anInt6344 = 0;
					}
				} else if (arg1.anInt6344 < local438) {
					arg1.anInt6344 += local9.anInt7166;
					if (arg1.anInt6344 > local438) {
						arg1.anInt6344 = local438;
					}
				}
			} else if (arg1.anInt6344 < local438) {
				arg1.anInt6344 += local9.anInt7166;
				if (local438 < arg1.anInt6344) {
					arg1.anInt6344 = local438;
				}
			} else if (arg1.anInt6344 > 0) {
				arg1.anInt6344 -= local9.anInt7166;
				if (arg1.anInt6344 < 0) {
					arg1.anInt6344 = 0;
				}
			}
			local438 = arg1.anInt6344 >> 9;
			if (local438 < 1) {
				local438 = 1;
			}
		}
		Static363.anInt6997 = 0;
		if (local239 == local219 && local222 == local262) {
			Static344.anInt6771 = -1;
		} else {
			if (local239 > local219) {
				Static363.anInt6997 |= 0x4;
				arg1.anInt10428 += local438;
				if (arg1.anInt10428 > local239) {
					arg1.anInt10428 = local239;
				}
			} else if (local239 < local219) {
				arg1.anInt10428 -= local438;
				Static363.anInt6997 |= 0x8;
				if (arg1.anInt10428 < local239) {
					arg1.anInt10428 = local239;
				}
			}
			if (local262 > local222) {
				Static363.anInt6997 |= 0x1;
				arg1.anInt10424 += local438;
				if (local262 < arg1.anInt10424) {
					arg1.anInt10424 = local262;
				}
			} else if (local262 < local222) {
				Static363.anInt6997 |= 0x2;
				arg1.anInt10424 -= local438;
				if (local262 > arg1.anInt10424) {
					arg1.anInt10424 = local262;
				}
			}
			if (local438 >= 32) {
				Static344.anInt6771 = 2;
			} else {
				Static344.anInt6771 = local368;
			}
		}
		if (arg1.anInt10428 != local239 || arg1.anInt10424 != local262) {
			return;
		}
		arg1.anInt6343--;
		if (arg1.anInt6346 > 0) {
			arg1.anInt6346--;
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[B)[B")
	public static byte[] method418(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static655.method6406(arg0, 0, local17, 0, local14);
		return local17;
	}
}
