import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!in", name = "k", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_60 = new Class252(9, 2);

	@OriginalMember(owner = "client!in", name = "o", descriptor = "[I")
	public static final int[] anIntArray325 = new int[14];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method3820(@OriginalArg(1) Class4 arg0) {
		if (Static317.aClass295_35.method7548() == 0) {
			return;
		}
		@Pc(59) Class1_Sub31 local59;
		if (Static449.anInt7876 == 0) {
			for (local59 = (Class1_Sub31) Static317.aClass295_35.method7543(); local59 != null; local59 = (Class1_Sub31) Static317.aClass295_35.method7540()) {
				Static181.aClass316_1.method8109(false, arg0, arg0, local59.anInt5081, Static403.aClass36_3, false, local59.anInt5079, local59.anInt5075, local59.anInt5084, local59.aBoolean378 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null, local59.anInt5083);
				local59.method8239();
			}
			Static402.method6385();
			return;
		}
		if (Static80.aClass4_4 == null) {
			@Pc(29) Canvas local29 = new Canvas();
			local29.setSize(36, 32);
			Static80.aClass4_4 = Static386.method7191(local29, 0, Static405.aClass69_77, Static67.anInterface13_6, 0);
			Static311.aClass36_2 = Static80.aClass4_4.method7193(Static363.method5898(Static447.anInt7829, Static61.aClass69_18), Static547.method1918(Static46.aClass69_14, Static447.anInt7829));
		}
		for (local59 = (Class1_Sub31) Static317.aClass295_35.method7543(); local59 != null; local59 = (Class1_Sub31) Static317.aClass295_35.method7540()) {
			Static181.aClass316_1.method8109(false, arg0, Static80.aClass4_4, local59.anInt5081, Static311.aClass36_2, false, local59.anInt5079, local59.anInt5075, local59.anInt5084, local59.aBoolean378 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null, local59.anInt5083);
			local59.method8239();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!md;IZ)V")
	public static void method3822(@OriginalArg(0) Class20_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class299 local9 = arg0.method7819();
		if (arg0.anInt9035 == 0) {
			arg0.anInt9036 = 0;
			Static470.anInt6888 = 0;
			Static141.anInt2827 = -1;
			return;
		}
		if (arg0.anInt9022 != -1 && arg0.anInt9009 == 0) {
			@Pc(34) Class176 local34 = Static35.aClass152_1.method4045(arg0.anInt9022);
			if (arg0.anInt9037 > 0 && local34.anInt5280 == 0) {
				Static141.anInt2827 = -1;
				Static470.anInt6888 = 0;
				arg0.anInt9036++;
				return;
			}
			if (arg0.anInt9037 <= 0 && local34.anInt5285 == 0) {
				Static141.anInt2827 = -1;
				Static470.anInt6888 = 0;
				arg0.anInt9036++;
				return;
			}
		}
		@Pc(106) Class176 local106;
		@Pc(93) Class87 local93;
		if (arg0.anInt8970 != -1 && arg0.anInt8991 <= Static445.anInt7791) {
			local93 = Static530.aClass195_2.method5439(arg0.anInt8970);
			if (local93.aBoolean193 && local93.anInt2314 != -1) {
				local106 = Static35.aClass152_1.method4045(local93.anInt2314);
				if (arg0.anInt9037 > 0 && local106.anInt5280 == 0) {
					arg0.anInt9036++;
					Static470.anInt6888 = 0;
					Static141.anInt2827 = -1;
					return;
				}
				if (arg0.anInt9037 <= 0 && local106.anInt5285 == 0) {
					Static470.anInt6888 = 0;
					arg0.anInt9036++;
					Static141.anInt2827 = -1;
					return;
				}
			}
		}
		if (arg0.anInt8970 != -1 && Static445.anInt7791 >= arg0.anInt8991) {
			local93 = Static530.aClass195_2.method5439(arg0.anInt8970);
			if (local93.aBoolean193 && local93.anInt2314 != -1) {
				local106 = Static35.aClass152_1.method4045(local93.anInt2314);
				if (arg0.anInt9037 > 0 && local106.anInt5280 == 0) {
					arg0.anInt9036++;
					Static470.anInt6888 = 0;
					Static141.anInt2827 = -1;
					return;
				}
				if (arg0.anInt9037 <= 0 && local106.anInt5285 == 0) {
					Static470.anInt6888 = 0;
					Static141.anInt2827 = -1;
					arg0.anInt9036++;
					return;
				}
			}
		}
		@Pc(223) int local223 = arg0.anInt8954;
		@Pc(226) int local226 = arg0.anInt8949;
		@Pc(242) int local242 = arg0.anIntArray780[arg0.anInt9035 - 1] * 128 + arg0.method7808() * 64;
		@Pc(259) int local259 = arg0.anIntArray781[arg0.anInt9035 - 1] * 128 + arg0.method7808() * 64;
		if (local223 < local242) {
			if (local259 > local226) {
				arg0.method7820(10240);
			} else if (local226 <= local259) {
				arg0.method7820(12288);
			} else {
				arg0.method7820(14336);
			}
		} else if (local223 > local242) {
			if (local259 > local226) {
				arg0.method7820(6144);
			} else if (local259 < local226) {
				arg0.method7820(2048);
			} else {
				arg0.method7820(4096);
			}
		} else if (local259 > local226) {
			arg0.method7820(8192);
		} else if (local259 < local226) {
			arg0.method7820(0);
		}
		@Pc(345) byte local345 = arg0.aByteArray116[arg0.anInt9035 - 1];
		if (!arg1 && (local242 - local223 > 256 || local242 - local223 < -256 || local259 - local226 > 256 || local259 - local226 < -256)) {
			arg0.anInt8954 = local242;
			arg0.anInt8949 = local259;
			arg0.method7821(false, arg0.anInt9006);
			Static141.anInt2827 = -1;
			Static470.anInt6888 = 0;
			arg0.anInt9035--;
			if (arg0.anInt9037 > 0) {
				arg0.anInt9037--;
			}
			return;
		}
		@Pc(419) int local419 = 4;
		@Pc(421) boolean local421 = true;
		if (arg0 instanceof Class20_Sub1_Sub1_Sub2) {
			local421 = ((Class20_Sub1_Sub1_Sub2) arg0).aClass283_1.aBoolean620;
		}
		@Pc(459) int local459;
		if (local421) {
			local459 = arg0.anInt9006 - arg0.aClass209_7.anInt6278;
			if (local459 != 0 && arg0.anInt9034 == -1 && arg0.anInt9018 != 0) {
				local419 = 2;
			}
			if (!arg1 && arg0.anInt9035 > 2) {
				local419 = 6;
			}
			if (!arg1 && arg0.anInt9035 > 3) {
				local419 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt9035 > 1) {
				local419 = 6;
			}
			if (!arg1 && arg0.anInt9035 > 2) {
				local419 = 8;
			}
		}
		if (arg0.anInt9036 > 0 && arg0.anInt9035 > 1) {
			arg0.anInt9036--;
			local419 = 8;
		}
		if (local345 == 2) {
			local419 <<= 0x1;
		} else if (local345 == 0) {
			local419 >>= 0x1;
		}
		if (local9.anInt8811 != -1) {
			local419 <<= 0x7;
			if (arg0.anInt9035 == 1) {
				local459 = arg0.anInt9038 * arg0.anInt9038;
				@Pc(616) int local616 = (local242 < arg0.anInt8954 ? arg0.anInt8954 - local242 : local242 + -arg0.anInt8954) << 7;
				@Pc(638) int local638 = (arg0.anInt8949 <= local259 ? local259 - arg0.anInt8949 : -local259 + arg0.anInt8949) << 7;
				@Pc(649) int local649 = local638 >= local616 ? local638 : local616;
				@Pc(656) int local656 = local649 * 2 * local9.anInt8811;
				if (local459 > local656) {
					arg0.anInt9038 /= 2;
				} else if (local649 < local459 / 2) {
					arg0.anInt9038 -= local9.anInt8811;
					if (arg0.anInt9038 < 0) {
						arg0.anInt9038 = 0;
					}
				} else if (local419 > arg0.anInt9038) {
					arg0.anInt9038 += local9.anInt8811;
					if (arg0.anInt9038 > local419) {
						arg0.anInt9038 = local419;
					}
				}
			} else if (local419 > arg0.anInt9038) {
				arg0.anInt9038 += local9.anInt8811;
				if (local419 < arg0.anInt9038) {
					arg0.anInt9038 = local419;
				}
			} else if (arg0.anInt9038 > 0) {
				arg0.anInt9038 -= local9.anInt8811;
				if (arg0.anInt9038 < 0) {
					arg0.anInt9038 = 0;
				}
			}
			local419 = arg0.anInt9038 >> 7;
			if (local419 < 1) {
				local419 = 1;
			}
		}
		Static470.anInt6888 = 0;
		if (local242 == local223 && local259 == local226) {
			Static141.anInt2827 = -1;
		} else {
			if (local242 > local223) {
				arg0.anInt8954 += local419;
				Static470.anInt6888 |= 0x4;
				if (arg0.anInt8954 > local242) {
					arg0.anInt8954 = local242;
				}
			} else if (local242 < local223) {
				arg0.anInt8954 -= local419;
				Static470.anInt6888 |= 0x8;
				if (local242 > arg0.anInt8954) {
					arg0.anInt8954 = local242;
				}
			}
			if (local419 >= 8) {
				Static141.anInt2827 = 2;
			} else {
				Static141.anInt2827 = local345;
			}
			if (local226 < local259) {
				arg0.anInt8949 += local419;
				Static470.anInt6888 |= 0x1;
				if (arg0.anInt8949 > local259) {
					arg0.anInt8949 = local259;
				}
			} else if (local226 > local259) {
				Static470.anInt6888 |= 0x2;
				arg0.anInt8949 -= local419;
				if (local259 > arg0.anInt8949) {
					arg0.anInt8949 = local259;
				}
			}
		}
		if (local242 == arg0.anInt8954 && local259 == arg0.anInt8949) {
			if (arg0.anInt9037 > 0) {
				arg0.anInt9037--;
			}
			arg0.anInt9035--;
		}
	}
}
