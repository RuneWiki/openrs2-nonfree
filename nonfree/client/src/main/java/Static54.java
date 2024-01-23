import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public static int anInt1439 = 0;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "[Lclient!uj;")
	public static Class160[] aClass160Array1 = new Class160[50];

	@OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
	public static int[] anIntArray150 = new int[128];

	@OriginalMember(owner = "client!e", name = "x", descriptor = "S")
	public static short aShort9 = 32767;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "I")
	public static int anInt1455 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!lg;)V")
	public static void method1093(@OriginalArg(1) Class25_Sub1 arg0) {
		@Pc(11) Class124 local11 = arg0.method1232();
		arg0.anInt1646 = local11.anInt4578;
		if (arg0.anInt1610 == 0) {
			arg0.anInt1683 = 0;
			return;
		}
		if (arg0.anInt1625 != -1 && arg0.anInt1653 == 0) {
			@Pc(44) Class163 local44 = Static115.method1895(arg0.anInt1625);
			if (arg0.anInt1652 > 0 && local44.anInt5908 == 0) {
				arg0.anInt1683++;
				return;
			}
			if (arg0.anInt1652 <= 0 && local44.anInt5909 == 0) {
				arg0.anInt1683++;
				return;
			}
		}
		if (arg0.anInt1669 != -1 && Static32.anInt809 >= arg0.anInt1605) {
			@Pc(96) Class139 local96 = Static43.method942(arg0.anInt1669);
			if (local96.aBoolean277 && local96.anInt5107 != -1) {
				@Pc(111) Class163 local111 = Static115.method1895(local96.anInt5107);
				if (arg0.anInt1652 > 0 && local111.anInt5908 == 0) {
					arg0.anInt1683++;
					return;
				}
				if (arg0.anInt1652 <= 0 && local111.anInt5909 == 0) {
					arg0.anInt1683++;
					return;
				}
			}
		}
		@Pc(143) int local143 = arg0.anInt1635;
		@Pc(146) int local146 = arg0.anInt1604;
		@Pc(164) int local164 = arg0.anIntArray172[arg0.anInt1610 - 1] * 128 + arg0.method1243() * 64;
		@Pc(180) int local180 = arg0.anIntArray173[arg0.anInt1610 - 1] * 128 + arg0.method1243() * 64;
		if (local164 - local143 > 256 || local164 - local143 < -256 || local180 - local146 > 256 || local180 - local146 < -256) {
			arg0.anInt1635 = local164;
			arg0.anInt1604 = local180;
			return;
		}
		@Pc(220) int local220 = local11.anInt4572;
		if (local164 <= local143) {
			if (local143 <= local164) {
				if (local180 > local146) {
					arg0.anInt1628 = 1024;
				} else if (local146 > local180) {
					arg0.anInt1628 = 0;
				}
			} else if (local180 > local146) {
				arg0.anInt1628 = 768;
			} else if (local180 >= local146) {
				arg0.anInt1628 = 512;
			} else {
				arg0.anInt1628 = 256;
			}
		} else if (local180 > local146) {
			arg0.anInt1628 = 1280;
		} else if (local146 <= local180) {
			arg0.anInt1628 = 1536;
		} else {
			arg0.anInt1628 = 1792;
		}
		@Pc(308) int local308 = arg0.anInt1628 - arg0.anInt1681 & 0x7FF;
		@Pc(310) int local310 = 4;
		if (local308 > 1024) {
			local308 -= 2048;
		}
		if (local308 >= -256 && local308 <= 256) {
			local220 = local11.anInt4569;
		} else if (local308 >= 256 && local308 < 768) {
			local220 = local11.anInt4608;
		} else if (local308 >= -768 && local308 <= -256) {
			local220 = local11.anInt4574;
		}
		if (local220 == -1) {
			local220 = local11.anInt4569;
		}
		arg0.anInt1646 = local220;
		@Pc(368) byte local368 = 1;
		@Pc(370) boolean local370 = true;
		if (arg0 instanceof Class25_Sub1_Sub2) {
			local370 = ((Class25_Sub1_Sub2) arg0).aClass143_1.aBoolean281;
		}
		if (local370) {
			if (arg0.anInt1681 != arg0.anInt1628 && arg0.anInt1631 == -1 && arg0.anInt1615 != 0) {
				local310 = 2;
			}
			if (arg0.anInt1610 > 2) {
				local310 = 6;
			}
			if (arg0.anInt1610 > 3) {
				local310 = 8;
			}
			if (arg0.anInt1683 > 0 && arg0.anInt1610 > 1) {
				arg0.anInt1683--;
				local310 = 8;
			}
		} else {
			if (arg0.anInt1610 > 1) {
				local310 = 6;
			}
			if (arg0.anInt1610 > 2) {
				local310 = 8;
			}
			if (arg0.anInt1683 > 0 && arg0.anInt1610 > 1) {
				local310 = 8;
				arg0.anInt1683--;
			}
		}
		if (arg0.aByteArray15[arg0.anInt1610 - 1] == 2) {
			local368 = 2;
			local310 <<= 0x1;
		} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 0) {
			local368 = 0;
			local310 >>= 0x1;
		}
		if (local310 < 8 || local11.anInt4571 == -1) {
			if (local11.anInt4602 != -1 && local368 == 0) {
				if (arg0.anInt1646 == local11.anInt4572 && local11.anInt4580 != -1) {
					arg0.anInt1646 = local11.anInt4580;
				} else if (arg0.anInt1646 == local11.anInt4574 && local11.anInt4573 != -1) {
					arg0.anInt1646 = local11.anInt4573;
				} else if (local11.anInt4608 == arg0.anInt1646 && local11.anInt4584 != -1) {
					arg0.anInt1646 = local11.anInt4584;
				} else {
					arg0.anInt1646 = local11.anInt4602;
				}
			}
		} else if (local11.anInt4572 == arg0.anInt1646 && local11.anInt4575 != -1) {
			arg0.anInt1646 = local11.anInt4575;
		} else if (arg0.anInt1646 == local11.anInt4574 && local11.anInt4600 != -1) {
			arg0.anInt1646 = local11.anInt4600;
		} else if (arg0.anInt1646 == local11.anInt4608 && local11.anInt4597 != -1) {
			arg0.anInt1646 = local11.anInt4597;
		} else {
			arg0.anInt1646 = local11.anInt4571;
		}
		if (local11.anInt4594 != -1) {
			local310 <<= 0x7;
			if (arg0.anInt1610 == 1) {
				@Pc(701) int local701 = arg0.anInt1626 * arg0.anInt1626;
				@Pc(723) int local723 = (local180 >= arg0.anInt1604 ? local180 - arg0.anInt1604 : -local180 + arg0.anInt1604) << 7;
				@Pc(744) int local744 = (arg0.anInt1635 <= local164 ? local164 - arg0.anInt1635 : arg0.anInt1635 - local164) << 7;
				@Pc(751) int local751 = local723 >= local744 ? local723 : local744;
				@Pc(758) int local758 = local11.anInt4594 * 2 * local751;
				if (local701 > local758) {
					arg0.anInt1626 /= 2;
				} else if (local701 / 2 > local751) {
					arg0.anInt1626 -= local11.anInt4594;
					if (arg0.anInt1626 < 0) {
						arg0.anInt1626 = 0;
					}
				} else if (local310 > arg0.anInt1626) {
					arg0.anInt1626 += local11.anInt4594;
					if (local310 < arg0.anInt1626) {
						arg0.anInt1626 = local310;
					}
				}
			} else if (local310 > arg0.anInt1626) {
				arg0.anInt1626 += local11.anInt4594;
				if (arg0.anInt1626 > local310) {
					arg0.anInt1626 = local310;
				}
			} else if (arg0.anInt1626 > 0) {
				arg0.anInt1626 -= local11.anInt4594;
				if (arg0.anInt1626 < 0) {
					arg0.anInt1626 = 0;
				}
			}
			local310 = arg0.anInt1626 >> 7;
			if (local310 < 1) {
				local310 = 1;
			}
		}
		if (local146 < local180) {
			arg0.anInt1604 += local310;
			if (arg0.anInt1604 > local180) {
				arg0.anInt1604 = local180;
			}
		} else if (local180 < local146) {
			arg0.anInt1604 -= local310;
			if (local180 > arg0.anInt1604) {
				arg0.anInt1604 = local180;
			}
		}
		if (local164 > local143) {
			arg0.anInt1635 += local310;
			if (arg0.anInt1635 > local164) {
				arg0.anInt1635 = local164;
			}
		} else if (local143 > local164) {
			arg0.anInt1635 -= local310;
			if (local164 > arg0.anInt1635) {
				arg0.anInt1635 = local164;
			}
		}
		if (local164 == arg0.anInt1635 && local180 == arg0.anInt1604) {
			arg0.anInt1610--;
			if (arg0.anInt1652 > 0) {
				arg0.anInt1652--;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
	public static void method1101() {
		Static117.aClass8_1.method325();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static33.aLongArray5[local10] = 0L;
		}
		for (@Pc(32) int local32 = 0; local32 < 32; local32++) {
			Static180.aLongArray10[local32] = 0L;
		}
		Static265.anInt5772 = 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[S)[S")
	public static short[] method1104(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) short[] local12 = new short[arg0.length];
			Static302.method1378(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}
}
