import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!dc;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_3;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt1267;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public static int anInt1268;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString74 = "Allocated memory";

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "S")
	public static short aShort16 = 1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!da;")
	public static Class27 method1067(@OriginalArg(0) int arg0) {
		@Pc(16) Class27 local16 = (Class27) Static279.aClass135_40.method3316((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static177.aClass91_143.method2495(30, arg0);
		local16 = new Class27();
		if (local26 != null) {
			local16.method827(new Class1_Sub11(local26), arg0);
		}
		Static279.aClass135_40.method3321((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z")
	public static boolean method1068() {
		return Static277.aBoolean412 ? true : Static278.aBoolean421;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!bo;)V")
	public static void method1069(@OriginalArg(1) Class14_Sub2 arg0) {
		@Pc(17) Class164 local17 = arg0.method3650();
		arg0.anInt4658 = local17.anInt5190;
		if (arg0.anInt4678 == 0) {
			arg0.anInt4614 = 0;
			return;
		}
		if (arg0.anInt4620 != -1 && arg0.anInt4695 == 0) {
			@Pc(41) Class125 local41 = Static90.method1591(arg0.anInt4620);
			if (arg0.anInt4665 > 0 && local41.anInt3964 == 0) {
				arg0.anInt4614++;
				return;
			}
			if (arg0.anInt4665 <= 0 && local41.anInt3959 == 0) {
				arg0.anInt4614++;
				return;
			}
		}
		if (arg0.anInt4656 != -1 && arg0.anInt4652 <= Static237.anInt4710) {
			@Pc(95) Class157 local95 = Static242.method3711(arg0.anInt4656);
			if (local95.aBoolean375 && local95.anInt4951 != -1) {
				@Pc(108) Class125 local108 = Static90.method1591(local95.anInt4951);
				if (arg0.anInt4665 > 0 && local108.anInt3964 == 0) {
					arg0.anInt4614++;
					return;
				}
				if (arg0.anInt4665 <= 0 && local108.anInt3959 == 0) {
					arg0.anInt4614++;
					return;
				}
			}
		}
		@Pc(143) int local143 = arg0.anInt4680;
		@Pc(146) int local146 = arg0.anInt4630;
		@Pc(162) int local162 = arg0.anIntArray415[arg0.anInt4678 - 1] * 128 + arg0.method3656() * 64;
		@Pc(179) int local179 = arg0.anIntArray418[arg0.anInt4678 - 1] * 128 + arg0.method3656() * 64;
		if (local162 - local143 > 256 || local162 - local143 < -256 || local179 - local146 > 256 || local179 - local146 < -256) {
			arg0.anInt4630 = local179;
			arg0.anInt4680 = local162;
			return;
		}
		if (local162 > local143) {
			if (local146 < local179) {
				arg0.anInt4618 = 1280;
			} else if (local179 >= local146) {
				arg0.anInt4618 = 1536;
			} else {
				arg0.anInt4618 = 1792;
			}
		} else if (local162 >= local143) {
			if (local146 < local179) {
				arg0.anInt4618 = 1024;
			} else if (local179 < local146) {
				arg0.anInt4618 = 0;
			}
		} else if (local179 > local146) {
			arg0.anInt4618 = 768;
		} else if (local179 >= local146) {
			arg0.anInt4618 = 512;
		} else {
			arg0.anInt4618 = 256;
		}
		@Pc(300) int local300 = arg0.anInt4618 - arg0.anInt4681 & 0x7FF;
		if (local300 > 1024) {
			local300 -= 2048;
		}
		@Pc(308) int local308 = 4;
		@Pc(310) boolean local310 = true;
		@Pc(313) int local313 = local17.anInt5193;
		if (local300 >= -256 && local300 <= 256) {
			local313 = local17.anInt5224;
		} else if (local300 >= 256 && local300 < 768) {
			local313 = local17.anInt5213;
		} else if (local300 >= -768 && local300 <= -256) {
			local313 = local17.anInt5225;
		}
		@Pc(354) byte local354 = 1;
		if (local313 == -1) {
			local313 = local17.anInt5224;
		}
		arg0.anInt4658 = local313;
		if (arg0 instanceof Class14_Sub2_Sub2) {
			local310 = ((Class14_Sub2_Sub2) arg0).aClass46_1.aBoolean114;
		}
		if (local310) {
			if (arg0.anInt4681 != arg0.anInt4618 && arg0.anInt4627 == -1 && arg0.anInt4617 != 0) {
				local308 = 2;
			}
			if (arg0.anInt4678 > 2) {
				local308 = 6;
			}
			if (arg0.anInt4678 > 3) {
				local308 = 8;
			}
			if (arg0.anInt4614 > 0 && arg0.anInt4678 > 1) {
				arg0.anInt4614--;
				local308 = 8;
			}
		} else {
			if (arg0.anInt4678 > 1) {
				local308 = 6;
			}
			if (arg0.anInt4678 > 2) {
				local308 = 8;
			}
			if (arg0.anInt4614 > 0 && arg0.anInt4678 > 1) {
				local308 = 8;
				arg0.anInt4614--;
			}
		}
		if (arg0.aByteArray63[arg0.anInt4678 - 1] == 2) {
			local308 <<= 0x1;
			local354 = 2;
		} else if (arg0.aByteArray63[arg0.anInt4678 - 1] == 0) {
			local308 >>= 0x1;
			local354 = 0;
		}
		if (local308 < 8 || local17.anInt5207 == -1) {
			if (local17.anInt5221 != -1 && local354 == 0) {
				if (arg0.anInt4658 == local17.anInt5193 && local17.anInt5192 != -1) {
					arg0.anInt4658 = local17.anInt5192;
				} else if (arg0.anInt4658 == local17.anInt5225 && local17.anInt5209 != -1) {
					arg0.anInt4658 = local17.anInt5209;
				} else if (local17.anInt5213 == arg0.anInt4658 && local17.anInt5195 != -1) {
					arg0.anInt4658 = local17.anInt5195;
				} else {
					arg0.anInt4658 = local17.anInt5221;
				}
			}
		} else if (local17.anInt5193 == arg0.anInt4658 && local17.anInt5215 != -1) {
			arg0.anInt4658 = local17.anInt5215;
		} else if (arg0.anInt4658 == local17.anInt5225 && local17.anInt5222 != -1) {
			arg0.anInt4658 = local17.anInt5222;
		} else if (arg0.anInt4658 == local17.anInt5213 && local17.anInt5205 != -1) {
			arg0.anInt4658 = local17.anInt5205;
		} else {
			arg0.anInt4658 = local17.anInt5207;
		}
		if (local17.anInt5200 != -1) {
			local308 <<= 0x7;
			if (arg0.anInt4678 == 1) {
				@Pc(641) int local641 = arg0.anInt4642 * arg0.anInt4642;
				@Pc(659) int local659 = (arg0.anInt4680 > local162 ? arg0.anInt4680 - local162 : local162 + -arg0.anInt4680) << 7;
				@Pc(681) int local681 = (local179 < arg0.anInt4630 ? arg0.anInt4630 - local179 : local179 + -arg0.anInt4630) << 7;
				@Pc(692) int local692 = local681 < local659 ? local659 : local681;
				@Pc(699) int local699 = local17.anInt5200 * 2 * local692;
				if (local641 > local699) {
					arg0.anInt4642 /= 2;
				} else if (local692 < local641 / 2) {
					arg0.anInt4642 -= local17.anInt5200;
					if (arg0.anInt4642 < 0) {
						arg0.anInt4642 = 0;
					}
				} else if (arg0.anInt4642 < local308) {
					arg0.anInt4642 += local17.anInt5200;
					if (arg0.anInt4642 > local308) {
						arg0.anInt4642 = local308;
					}
				}
			} else if (local308 > arg0.anInt4642) {
				arg0.anInt4642 += local17.anInt5200;
				if (arg0.anInt4642 > local308) {
					arg0.anInt4642 = local308;
				}
			} else if (arg0.anInt4642 > 0) {
				arg0.anInt4642 -= local17.anInt5200;
				if (arg0.anInt4642 < 0) {
					arg0.anInt4642 = 0;
				}
			}
			local308 = arg0.anInt4642 >> 7;
			if (local308 < 1) {
				local308 = 1;
			}
		}
		if (local146 < local179) {
			arg0.anInt4630 += local308;
			if (local179 < arg0.anInt4630) {
				arg0.anInt4630 = local179;
			}
		} else if (local146 > local179) {
			arg0.anInt4630 -= local308;
			if (arg0.anInt4630 < local179) {
				arg0.anInt4630 = local179;
			}
		}
		if (local162 > local143) {
			arg0.anInt4680 += local308;
			if (local162 < arg0.anInt4680) {
				arg0.anInt4680 = local162;
			}
		} else if (local162 < local143) {
			arg0.anInt4680 -= local308;
			if (local162 > arg0.anInt4680) {
				arg0.anInt4680 = local162;
			}
		}
		if (local162 == arg0.anInt4680 && arg0.anInt4630 == local179) {
			if (arg0.anInt4665 > 0) {
				arg0.anInt4665--;
			}
			arg0.anInt4678--;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass72_1 != null && local7.aClass72_1.aLong105 == arg3) {
			return true;
		} else if (local7.aClass67_1 != null && local7.aClass67_1.aLong97 == arg3) {
			return true;
		} else if (local7.aClass44_1 != null && local7.aClass44_1.aLong55 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt4090; local46++) {
				if (local7.aClass25Array4[local46].aLong39 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
	public static int method1071() {
		if ((double) Static220.aFloat43 == 3.0D) {
			return 37;
		} else if ((double) Static220.aFloat43 == 4.0D) {
			return 50;
		} else if ((double) Static220.aFloat43 == 6.0D) {
			return 75;
		} else if ((double) Static220.aFloat43 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
