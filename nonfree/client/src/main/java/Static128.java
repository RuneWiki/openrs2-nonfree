import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_102 = new Class27(28, -1);

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public static int anInt7164 = 0;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public static int anInt7165 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ms;IZ)V")
	public static void method5643(@OriginalArg(0) Class24_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class6 local9 = arg0.method4923();
		if (arg0.anInt6288 == 0) {
			Static5.anInt78 = 0;
			arg0.anInt6290 = 0;
			Static130.anInt2653 = -1;
			return;
		}
		if (arg0.anInt6211 != -1 && arg0.anInt6250 == 0) {
			@Pc(40) Class137 local40 = Static281.aClass98_3.method2405(arg0.anInt6211);
			if (arg0.anInt6291 > 0 && local40.anInt4044 == 0) {
				Static130.anInt2653 = -1;
				Static5.anInt78 = 0;
				arg0.anInt6290++;
				return;
			}
			if (arg0.anInt6291 <= 0 && local40.anInt4038 == 0) {
				arg0.anInt6290++;
				Static5.anInt78 = 0;
				Static130.anInt2653 = -1;
				return;
			}
		}
		@Pc(109) Class137 local109;
		@Pc(95) Class156 local95;
		if (arg0.anInt6274 != -1 && Static400.anInt6752 >= arg0.anInt6240) {
			local95 = Static147.aClass107_1.method2639(arg0.anInt6274);
			if (local95.aBoolean289 && local95.anInt4316 != -1) {
				local109 = Static281.aClass98_3.method2405(local95.anInt4316);
				if (arg0.anInt6291 > 0 && local109.anInt4044 == 0) {
					Static130.anInt2653 = -1;
					Static5.anInt78 = 0;
					arg0.anInt6290++;
					return;
				}
				if (arg0.anInt6291 <= 0 && local109.anInt4038 == 0) {
					arg0.anInt6290++;
					Static5.anInt78 = 0;
					Static130.anInt2653 = -1;
					return;
				}
			}
		}
		if (arg0.anInt6274 != -1 && Static400.anInt6752 >= arg0.anInt6240) {
			local95 = Static147.aClass107_1.method2639(arg0.anInt6274);
			if (local95.aBoolean289 && local95.anInt4316 != -1) {
				local109 = Static281.aClass98_3.method2405(local95.anInt4316);
				if (arg0.anInt6291 > 0 && local109.anInt4044 == 0) {
					arg0.anInt6290++;
					Static130.anInt2653 = -1;
					Static5.anInt78 = 0;
					return;
				}
				if (arg0.anInt6291 <= 0 && local109.anInt4038 == 0) {
					arg0.anInt6290++;
					Static5.anInt78 = 0;
					Static130.anInt2653 = -1;
					return;
				}
			}
		}
		@Pc(231) int local231 = arg0.anInt7092;
		@Pc(234) int local234 = arg0.anInt7094;
		@Pc(250) int local250 = arg0.anIntArray610[arg0.anInt6288 - 1] * 128 + arg0.method4919() * 64;
		@Pc(266) int local266 = arg0.anIntArray611[arg0.anInt6288 - 1] * 128 + arg0.method4919() * 64;
		if (local231 < local250) {
			if (local266 > local234) {
				arg0.method4920(10240);
			} else if (local266 >= local234) {
				arg0.method4920(12288);
			} else {
				arg0.method4920(14336);
			}
		} else if (local231 > local250) {
			if (local266 > local234) {
				arg0.method4920(6144);
			} else if (local266 >= local234) {
				arg0.method4920(4096);
			} else {
				arg0.method4920(2048);
			}
		} else if (local234 < local266) {
			arg0.method4920(8192);
		} else if (local266 < local234) {
			arg0.method4920(0);
		}
		@Pc(368) byte local368 = arg0.aByteArray80[arg0.anInt6288 - 1];
		if (!arg1 && (local250 - local231 > 256 || local250 - local231 < -256 || local266 - local234 > 256 || local266 - local234 < -256)) {
			arg0.anInt7092 = local250;
			arg0.anInt7094 = local266;
			arg0.method4907(false, arg0.anInt6243);
			Static5.anInt78 = 0;
			Static130.anInt2653 = -1;
			arg0.anInt6288--;
			if (arg0.anInt6291 > 0) {
				arg0.anInt6291--;
			}
			return;
		}
		@Pc(434) int local434 = 4;
		@Pc(436) boolean local436 = true;
		if (arg0 instanceof Class24_Sub3_Sub2_Sub1) {
			local436 = ((Class24_Sub3_Sub2_Sub1) arg0).aClass222_1.aBoolean414;
		}
		@Pc(474) int local474;
		if (local436) {
			local474 = arg0.anInt6243 - arg0.aClass145_7.anInt4147;
			if (local474 != 0 && arg0.anInt6241 == -1 && arg0.anInt6219 != 0) {
				local434 = 2;
			}
			if (!arg1 && arg0.anInt6288 > 2) {
				local434 = 6;
			}
			if (!arg1 && arg0.anInt6288 > 3) {
				local434 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6288 > 1) {
				local434 = 6;
			}
			if (!arg1 && arg0.anInt6288 > 2) {
				local434 = 8;
			}
		}
		if (arg0.anInt6290 > 0 && arg0.anInt6288 > 1) {
			local434 = 8;
			arg0.anInt6290--;
		}
		if (local368 == 2) {
			local434 <<= 0x1;
		} else if (local368 == 0) {
			local434 >>= 0x1;
		}
		if (local9.anInt62 != -1) {
			local434 <<= 0x7;
			if (arg0.anInt6288 == 1) {
				local474 = arg0.anInt6289 * arg0.anInt6289;
				@Pc(617) int local617 = (local250 >= arg0.anInt7092 ? local250 - arg0.anInt7092 : -local250 + arg0.anInt7092) << 7;
				@Pc(635) int local635 = (arg0.anInt7094 <= local266 ? local266 - arg0.anInt7094 : -local266 + arg0.anInt7094) << 7;
				@Pc(642) int local642 = local635 >= local617 ? local635 : local617;
				@Pc(649) int local649 = local642 * local9.anInt62 * 2;
				if (local649 < local474) {
					arg0.anInt6289 /= 2;
				} else if (local642 < local474 / 2) {
					arg0.anInt6289 -= local9.anInt62;
					if (arg0.anInt6289 < 0) {
						arg0.anInt6289 = 0;
					}
				} else if (local434 > arg0.anInt6289) {
					arg0.anInt6289 += local9.anInt62;
					if (local434 < arg0.anInt6289) {
						arg0.anInt6289 = local434;
					}
				}
			} else if (arg0.anInt6289 < local434) {
				arg0.anInt6289 += local9.anInt62;
				if (local434 < arg0.anInt6289) {
					arg0.anInt6289 = local434;
				}
			} else if (arg0.anInt6289 > 0) {
				arg0.anInt6289 -= local9.anInt62;
				if (arg0.anInt6289 < 0) {
					arg0.anInt6289 = 0;
				}
			}
			local434 = arg0.anInt6289 >> 7;
			if (local434 < 1) {
				local434 = 1;
			}
		}
		Static5.anInt78 = 0;
		if (local250 > local231) {
			Static5.anInt78 |= 0x4;
			arg0.anInt7092 += local434;
			if (local250 < arg0.anInt7092) {
				arg0.anInt7092 = local250;
			}
		} else if (local250 < local231) {
			Static5.anInt78 |= 0x8;
			arg0.anInt7092 -= local434;
			if (local250 > arg0.anInt7092) {
				arg0.anInt7092 = local250;
			}
		}
		if (local266 > local234) {
			Static5.anInt78 |= 0x1;
			arg0.anInt7094 += local434;
			if (local266 < arg0.anInt7094) {
				arg0.anInt7094 = local266;
			}
		} else if (local266 < local234) {
			arg0.anInt7094 -= local434;
			Static5.anInt78 |= 0x2;
			if (local266 > arg0.anInt7094) {
				arg0.anInt7094 = local266;
			}
		}
		if (local434 >= 8) {
			Static130.anInt2653 = 2;
		} else {
			Static130.anInt2653 = local368;
		}
		if (local250 != arg0.anInt7092 || local266 != arg0.anInt7094) {
			return;
		}
		arg0.anInt6288--;
		if (arg0.anInt6291 > 0) {
			arg0.anInt6291--;
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
	public static boolean method5644() {
		return Static110.aClass151_5 != Static284.aClass151_8 || Static200.anInt3974 >= 2;
	}
}
