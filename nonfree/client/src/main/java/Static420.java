import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	public static int anInt7401;

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_10 = new Class295(12, 5);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Lclient!in;")
	public static Class160 method5959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class160 local7 = Static512.method7155(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass160Array1 == null || arg1 >= local7.aClass160Array1.length) {
			return null;
		} else {
			return local7.aClass160Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III[B)I")
	public static int method5960(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg1; local9++) {
			local7 = local7 >>> 8 ^ Class162.anIntArray213[(arg2[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(JI)V")
	public static void method5961(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static576.anInt4080;
		@Pc(13) int local13 = Static273.anInt1191;
		@Pc(24) int local24;
		@Pc(32) int local32;
		if (local11 != Static183.anInt3630) {
			local24 = local11 - Static183.anInt3630;
			local32 = (int) ((long) local24 * arg0 / 320L);
			if (local24 > 0) {
				if (local32 == 0) {
					local32 = 1;
				} else if (local32 > local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = -1;
			} else if (local24 > local32) {
				local32 = local24;
			}
			Static183.anInt3630 += local32;
		}
		if (!Static86.aClass1_Sub30_Sub1_1.aBoolean485) {
			Static331.aFloat172 += Static240.aFloat125 * (float) arg0 / 40.0F * 8.0F;
			Static487.aFloat206 += Static372.aFloat179 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local13 != Static173.anInt3244) {
			local24 = local13 - Static173.anInt3244;
			local32 = (int) (arg0 * (long) local24 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local32 < local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local32 > local24) {
				local32 = local24;
			}
			Static173.anInt3244 += local32;
		}
		Static220.method4685();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!r;IIZIIII)V")
	public static void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Interface15 local16 = (Interface15) Static316.method4694(arg2, arg6, arg5);
		@Pc(25) Class178 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (local16 != null) {
			local25 = Static347.aClass122_4.method2770(local16.method7232());
			local31 = local16.method7230() & 0x3;
			local35 = local16.method7227();
			if (local25.anInt4633 == -1) {
				local42 = arg7;
				if (local25.anInt4662 > 0) {
					local42 = arg3;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg1.method6803(arg0, 4, arg4, local42);
					} else if (local31 == 1) {
						arg1.method6806(4, arg4, arg0, local42);
					} else if (local31 == 2) {
						arg1.method6803(arg0 + 3, 4, arg4, local42);
					} else if (local31 == 3) {
						arg1.method6806(4, arg4 + 3, arg0, local42);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg1.method6800(local42, 1, arg0, 1, arg4);
					} else if (local31 == 1) {
						arg1.method6800(local42, 1, arg0 + 3, 1, arg4);
					} else if (local31 == 2) {
						arg1.method6800(local42, 1, arg0 + 3, 1, arg4 + 3);
					} else if (local31 == 3) {
						arg1.method6800(local42, 1, arg0, 1, arg4 + 3);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg1.method6806(4, arg4, arg0, local42);
					} else if (local31 == 1) {
						arg1.method6803(arg0 + 3, 4, arg4, local42);
					} else if (local31 == 2) {
						arg1.method6806(4, arg4 + 3, arg0, local42);
					} else if (local31 == 3) {
						arg1.method6803(arg0, 4, arg4, local42);
					}
				}
			} else {
				Static309.method4633(arg4, arg0, local31, arg1, local25);
			}
		}
		local16 = (Interface15) Static432.method6172(arg2, arg6, arg5, kj.class);
		if (local16 != null) {
			local25 = Static347.aClass122_4.method2770(local16.method7232());
			local31 = local16.method7230() & 0x3;
			local35 = local16.method7227();
			if (local25.anInt4633 != -1) {
				Static309.method4633(arg4, arg0, local31, arg1, local25);
			} else if (local35 == 9) {
				local42 = -1118482;
				if (local25.anInt4662 > 0) {
					local42 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg1.method6835(arg4 + 3, local42, arg0, arg0 + 3, arg4);
				} else {
					arg1.method6835(arg4, local42, arg0, arg0 + 3, arg4 - -3);
				}
			}
		}
		local16 = (Interface15) Static481.method6668(arg2, arg6, arg5);
		if (local16 == null) {
			return;
		}
		local25 = Static347.aClass122_4.method2770(local16.method7232());
		local31 = local16.method7230() & 0x3;
		if (local25.anInt4633 != -1) {
			Static309.method4633(arg4, arg0, local31, arg1, local25);
			return;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!kj;)Z")
	public static boolean method5963(@OriginalArg(1) Interface15 arg0) {
		@Pc(10) Class178 local10 = Static347.aClass122_4.method2770(arg0.method7232());
		if (local10.anInt4633 == -1) {
			return true;
		} else {
			@Pc(22) Class40 local22 = Static191.aClass33_2.method794(local10.anInt4633);
			return local22.anInt1134 == -1 ? true : local22.method999();
		}
	}
}
