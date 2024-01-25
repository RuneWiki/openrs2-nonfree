import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!qp;")
	public static Class239 aClass239_147;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public static int anInt7572 = -2;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public static int anInt7574 = -1;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	public static int anInt7577 = 0;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public static int anInt7578 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(JJ)J")
	public static long method6345(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!cd;ZB)V")
	public static void method6346(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class24 local9 = arg0.method4393();
		if (arg0.anInt5102 == 0) {
			arg0.anInt5104 = 0;
			Static484.anInt8591 = 0;
			Static38.anInt735 = -1;
			return;
		}
		if (arg0.anInt5051 != -1 && arg0.anInt5094 == 0) {
			@Pc(37) Class4 local37 = Static396.aClass157_2.method3745(arg0.anInt5051);
			if (arg0.anInt5105 > 0 && local37.anInt121 == 0) {
				arg0.anInt5104++;
				Static484.anInt8591 = 0;
				Static38.anInt735 = -1;
				return;
			}
			if (arg0.anInt5105 <= 0 && local37.anInt126 == 0) {
				arg0.anInt5104++;
				Static38.anInt735 = -1;
				Static484.anInt8591 = 0;
				return;
			}
		}
		@Pc(108) Class4 local108;
		@Pc(94) Class226 local94;
		if (arg0.anInt5097 != -1 && Static115.anInt2326 >= arg0.anInt5061) {
			local94 = Static305.aClass14_1.method555(arg0.anInt5097);
			if (local94.aBoolean524 && local94.anInt6964 != -1) {
				local108 = Static396.aClass157_2.method3745(local94.anInt6964);
				if (arg0.anInt5105 > 0 && local108.anInt121 == 0) {
					arg0.anInt5104++;
					Static38.anInt735 = -1;
					Static484.anInt8591 = 0;
					return;
				}
				if (arg0.anInt5105 <= 0 && local108.anInt126 == 0) {
					Static484.anInt8591 = 0;
					Static38.anInt735 = -1;
					arg0.anInt5104++;
					return;
				}
			}
		}
		if (arg0.anInt5097 != -1 && arg0.anInt5061 <= Static115.anInt2326) {
			local94 = Static305.aClass14_1.method555(arg0.anInt5097);
			if (local94.aBoolean524 && local94.anInt6964 != -1) {
				local108 = Static396.aClass157_2.method3745(local94.anInt6964);
				if (arg0.anInt5105 > 0 && local108.anInt121 == 0) {
					Static484.anInt8591 = 0;
					arg0.anInt5104++;
					Static38.anInt735 = -1;
					return;
				}
				if (arg0.anInt5105 <= 0 && local108.anInt126 == 0) {
					Static38.anInt735 = -1;
					arg0.anInt5104++;
					Static484.anInt8591 = 0;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg0.anInt7660;
		@Pc(222) int local222 = arg0.anInt7659;
		@Pc(240) int local240 = arg0.anIntArray450[arg0.anInt5102 - 1] * 128 + arg0.method4394() * 64;
		@Pc(259) int local259 = arg0.anIntArray449[arg0.anInt5102 - 1] * 128 + arg0.method4394() * 64;
		if (local219 < local240) {
			if (local222 < local259) {
				arg0.method4380(10240);
			} else if (local259 < local222) {
				arg0.method4380(14336);
			} else {
				arg0.method4380(12288);
			}
		} else if (local240 >= local219) {
			if (local222 < local259) {
				arg0.method4380(8192);
			} else if (local222 > local259) {
				arg0.method4380(0);
			}
		} else if (local222 < local259) {
			arg0.method4380(6144);
		} else if (local222 > local259) {
			arg0.method4380(2048);
		} else {
			arg0.method4380(4096);
		}
		@Pc(355) byte local355 = arg0.aByteArray87[arg0.anInt5102 - 1];
		if (!arg1 && (local240 - local219 > 256 || local240 - local219 < -256 || local259 - local222 > 256 || local259 - local222 < -256)) {
			arg0.anInt7659 = local259;
			arg0.anInt7660 = local240;
			arg0.method4383(arg0.anInt5069, false);
			arg0.anInt5102--;
			Static484.anInt8591 = 0;
			if (arg0.anInt5105 > 0) {
				arg0.anInt5105--;
			}
			Static38.anInt735 = -1;
			return;
		}
		@Pc(420) int local420 = 4;
		@Pc(422) boolean local422 = true;
		if (arg0 instanceof Class1_Sub1_Sub2_Sub2) {
			local422 = ((Class1_Sub1_Sub2_Sub2) arg0).aClass12_1.aBoolean25;
		}
		@Pc(460) int local460;
		if (local422) {
			local460 = arg0.anInt5069 - arg0.aClass151_7.anInt4209;
			if (local460 != 0 && arg0.anInt5062 == -1 && arg0.anInt5082 != 0) {
				local420 = 2;
			}
			if (!arg1 && arg0.anInt5102 > 2) {
				local420 = 6;
			}
			if (!arg1 && arg0.anInt5102 > 3) {
				local420 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5102 > 1) {
				local420 = 6;
			}
			if (!arg1 && arg0.anInt5102 > 2) {
				local420 = 8;
			}
		}
		if (arg0.anInt5104 > 0 && arg0.anInt5102 > 1) {
			local420 = 8;
			arg0.anInt5104--;
		}
		if (local355 == 2) {
			local420 <<= 0x1;
		} else if (local355 == 0) {
			local420 >>= 0x1;
		}
		if (local9.anInt655 != -1) {
			local420 <<= 0x7;
			if (arg0.anInt5102 == 1) {
				local460 = arg0.anInt5103 * arg0.anInt5103;
				@Pc(602) int local602 = (local240 < arg0.anInt7660 ? arg0.anInt7660 - local240 : -arg0.anInt7660 + local240) << 7;
				@Pc(622) int local622 = (local259 < arg0.anInt7659 ? arg0.anInt7659 - local259 : local259 - arg0.anInt7659) << 7;
				@Pc(633) int local633 = local622 >= local602 ? local622 : local602;
				@Pc(640) int local640 = local9.anInt655 * 2 * local633;
				if (local460 > local640) {
					arg0.anInt5103 /= 2;
				} else if (local460 / 2 > local633) {
					arg0.anInt5103 -= local9.anInt655;
					if (arg0.anInt5103 < 0) {
						arg0.anInt5103 = 0;
					}
				} else if (local420 > arg0.anInt5103) {
					arg0.anInt5103 += local9.anInt655;
					if (arg0.anInt5103 > local420) {
						arg0.anInt5103 = local420;
					}
				}
			} else if (local420 > arg0.anInt5103) {
				arg0.anInt5103 += local9.anInt655;
				if (local420 < arg0.anInt5103) {
					arg0.anInt5103 = local420;
				}
			} else if (arg0.anInt5103 > 0) {
				arg0.anInt5103 -= local9.anInt655;
				if (arg0.anInt5103 < 0) {
					arg0.anInt5103 = 0;
				}
			}
			local420 = arg0.anInt5103 >> 7;
			if (local420 < 1) {
				local420 = 1;
			}
		}
		Static484.anInt8591 = 0;
		if (local219 == local240 && local222 == local259) {
			Static38.anInt735 = -1;
		} else {
			if (local240 > local219) {
				arg0.anInt7660 += local420;
				Static484.anInt8591 |= 0x4;
				if (arg0.anInt7660 > local240) {
					arg0.anInt7660 = local240;
				}
			} else if (local240 < local219) {
				arg0.anInt7660 -= local420;
				Static484.anInt8591 |= 0x8;
				if (arg0.anInt7660 < local240) {
					arg0.anInt7660 = local240;
				}
			}
			if (local420 >= 8) {
				Static38.anInt735 = 2;
			} else {
				Static38.anInt735 = local355;
			}
			if (local222 < local259) {
				Static484.anInt8591 |= 0x1;
				arg0.anInt7659 += local420;
				if (arg0.anInt7659 > local259) {
					arg0.anInt7659 = local259;
				}
			} else if (local222 > local259) {
				arg0.anInt7659 -= local420;
				Static484.anInt8591 |= 0x2;
				if (arg0.anInt7659 < local259) {
					arg0.anInt7659 = local259;
				}
			}
		}
		if (arg0.anInt7660 == local240 && arg0.anInt7659 == local259) {
			if (arg0.anInt5105 > 0) {
				arg0.anInt5105--;
			}
			arg0.anInt5102--;
		}
	}
}
