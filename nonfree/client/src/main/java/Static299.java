import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!vh;")
	public static Class177 aClass177_7;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt5734;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt5730 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public static void method4596(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class4 local7 = Static65.aClass163_37.method4192(); local7 != null; local7 = Static65.aClass163_37.method4183()) {
			if ((long) arg0 == (local7.aLong211 >> 48 & 0xFFFFL)) {
				local7.method4690();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BB)I")
	public static int method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class46.anIntArray135[(arg2[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!wc;)V")
	public static void method4598(@OriginalArg(1) Class13_Sub5 arg0) {
		@Pc(13) Class33 local13 = arg0.method4212();
		arg0.anInt5307 = local13.anInt1156;
		if (arg0.anInt5271 == 0) {
			arg0.anInt5322 = 0;
			return;
		}
		if (arg0.anInt5305 != -1 && arg0.anInt5251 == 0) {
			@Pc(43) Class186 local43 = Static51.method992(arg0.anInt5305);
			if (arg0.anInt5316 > 0 && local43.anInt5820 == 0) {
				arg0.anInt5322++;
				return;
			}
			if (arg0.anInt5316 <= 0 && local43.anInt5824 == 0) {
				arg0.anInt5322++;
				return;
			}
		}
		if (arg0.anInt5291 != -1 && Static50.anInt1118 >= arg0.anInt5325) {
			@Pc(93) Class120 local93 = Static32.method639(arg0.anInt5291);
			if (local93.aBoolean241 && local93.anInt3877 != -1) {
				@Pc(105) Class186 local105 = Static51.method992(local93.anInt3877);
				if (arg0.anInt5316 > 0 && local105.anInt5820 == 0) {
					arg0.anInt5322++;
					return;
				}
				if (arg0.anInt5316 <= 0 && local105.anInt5824 == 0) {
					arg0.anInt5322++;
					return;
				}
			}
		}
		@Pc(143) int local143 = arg0.anInt5334;
		@Pc(146) int local146 = arg0.anInt5294;
		@Pc(162) int local162 = arg0.anIntArray411[arg0.anInt5271 - 1] * 128 + arg0.method4219() * 64;
		@Pc(179) int local179 = arg0.anIntArray418[arg0.anInt5271 - 1] * 128 + arg0.method4219() * 64;
		if (local162 - local143 > 256 || local162 - local143 < -256 || local179 - local146 > 256 || local179 - local146 < -256) {
			arg0.anInt5334 = local162;
			arg0.anInt5294 = local179;
			return;
		}
		if (local162 <= local143) {
			if (local143 > local162) {
				if (local146 < local179) {
					arg0.anInt5266 = 768;
				} else if (local146 > local179) {
					arg0.anInt5266 = 256;
				} else {
					arg0.anInt5266 = 512;
				}
			} else if (local179 > local146) {
				arg0.anInt5266 = 1024;
			} else if (local179 < local146) {
				arg0.anInt5266 = 0;
			}
		} else if (local179 > local146) {
			arg0.anInt5266 = 1280;
		} else if (local179 >= local146) {
			arg0.anInt5266 = 1536;
		} else {
			arg0.anInt5266 = 1792;
		}
		@Pc(302) int local302 = arg0.anInt5266 - arg0.anInt5261 & 0x7FF;
		if (local302 > 1024) {
			local302 -= 2048;
		}
		@Pc(311) int local311 = 4;
		@Pc(314) int local314 = local13.anInt1127;
		@Pc(316) boolean local316 = true;
		if (local302 >= -256 && local302 <= 256) {
			local314 = local13.anInt1128;
		} else if (local302 >= 256 && local302 < 768) {
			local314 = local13.anInt1136;
		} else if (local302 >= -768 && local302 <= -256) {
			local314 = local13.anInt1150;
		}
		if (local314 == -1) {
			local314 = local13.anInt1128;
		}
		arg0.anInt5307 = local314;
		if (arg0 instanceof Class13_Sub5_Sub2) {
			local316 = ((Class13_Sub5_Sub2) arg0).aClass185_1.aBoolean398;
		}
		@Pc(373) boolean local373 = true;
		if (local316) {
			if (arg0.anInt5266 != arg0.anInt5261 && arg0.anInt5256 == -1 && arg0.anInt5290 != 0) {
				local311 = 2;
			}
			if (arg0.anInt5271 > 2) {
				local311 = 6;
			}
			if (arg0.anInt5271 > 3) {
				local311 = 8;
			}
			if (arg0.anInt5322 > 0 && arg0.anInt5271 > 1) {
				arg0.anInt5322--;
				local311 = 8;
			}
		} else {
			if (arg0.anInt5271 > 1) {
				local311 = 6;
			}
			if (arg0.anInt5271 > 2) {
				local311 = 8;
			}
			if (arg0.anInt5322 > 0 && arg0.anInt5271 > 1) {
				local311 = 8;
				arg0.anInt5322--;
			}
		}
		if (arg0.aByteArray61[arg0.anInt5271 - 1] == 2) {
			local311 <<= 0x1;
			local373 = true;
		} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 0) {
			local373 = false;
			local311 >>= 0x1;
		}
		if (local311 < 8 || local13.anInt1139 == -1) {
			if (local13.anInt1157 != -1 && !local373) {
				if (local13.anInt1127 == arg0.anInt5307 && local13.anInt1160 != -1) {
					arg0.anInt5307 = local13.anInt1160;
				} else if (arg0.anInt5307 == local13.anInt1150 && local13.anInt1153 != -1) {
					arg0.anInt5307 = local13.anInt1153;
				} else if (local13.anInt1136 == arg0.anInt5307 && local13.anInt1130 != -1) {
					arg0.anInt5307 = local13.anInt1130;
				} else {
					arg0.anInt5307 = local13.anInt1157;
				}
			}
		} else if (local13.anInt1127 == arg0.anInt5307 && local13.anInt1142 != -1) {
			arg0.anInt5307 = local13.anInt1142;
		} else if (local13.anInt1150 == arg0.anInt5307 && local13.anInt1135 != -1) {
			arg0.anInt5307 = local13.anInt1135;
		} else if (local13.anInt1136 == arg0.anInt5307 && local13.anInt1140 != -1) {
			arg0.anInt5307 = local13.anInt1140;
		} else {
			arg0.anInt5307 = local13.anInt1139;
		}
		if (local13.anInt1154 != -1) {
			local311 <<= 0x7;
			if (arg0.anInt5271 == 1) {
				@Pc(658) int local658 = arg0.anInt5308 * arg0.anInt5308;
				@Pc(680) int local680 = (arg0.anInt5334 <= local162 ? local162 - arg0.anInt5334 : -local162 + arg0.anInt5334) << 7;
				@Pc(698) int local698 = (local179 >= arg0.anInt5294 ? local179 - arg0.anInt5294 : -local179 + arg0.anInt5294) << 7;
				@Pc(705) int local705 = local680 <= local698 ? local698 : local680;
				@Pc(712) int local712 = local705 * local13.anInt1154 * 2;
				if (local712 < local658) {
					arg0.anInt5308 /= 2;
				} else if (local658 / 2 > local705) {
					arg0.anInt5308 -= local13.anInt1154;
					if (arg0.anInt5308 < 0) {
						arg0.anInt5308 = 0;
					}
				} else if (local311 > arg0.anInt5308) {
					arg0.anInt5308 += local13.anInt1154;
					if (local311 < arg0.anInt5308) {
						arg0.anInt5308 = local311;
					}
				}
			} else if (local311 > arg0.anInt5308) {
				arg0.anInt5308 += local13.anInt1154;
				if (local311 < arg0.anInt5308) {
					arg0.anInt5308 = local311;
				}
			} else if (arg0.anInt5308 > 0) {
				arg0.anInt5308 -= local13.anInt1154;
				if (arg0.anInt5308 < 0) {
					arg0.anInt5308 = 0;
				}
			}
			local311 = arg0.anInt5308 >> 7;
			if (local311 < 1) {
				local311 = 1;
			}
		}
		if (local179 > local146) {
			arg0.anInt5294 += local311;
			if (arg0.anInt5294 > local179) {
				arg0.anInt5294 = local179;
			}
		} else if (local146 > local179) {
			arg0.anInt5294 -= local311;
			if (arg0.anInt5294 < local179) {
				arg0.anInt5294 = local179;
			}
		}
		if (local162 > local143) {
			arg0.anInt5334 += local311;
			if (arg0.anInt5334 > local162) {
				arg0.anInt5334 = local162;
			}
		} else if (local162 < local143) {
			arg0.anInt5334 -= local311;
			if (arg0.anInt5334 < local162) {
				arg0.anInt5334 = local162;
			}
		}
		if (arg0.anInt5334 == local162 && arg0.anInt5294 == local179) {
			if (arg0.anInt5316 > 0) {
				arg0.anInt5316--;
			}
			arg0.anInt5271--;
		}
	}
}
