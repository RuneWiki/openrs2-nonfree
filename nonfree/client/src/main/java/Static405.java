import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "[Lclient!rla;")
	public static final Class325[] aClass325Array1 = new Class325[37];

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	public static int anInt7239 = 0;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
	public static int anInt7242 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method6052() {
		if (Static305.anIntArray309 != null) {
			return;
		}
		Static305.anIntArray309 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(30) int local30 = 0; local30 < 65536; local30++) {
			@Pc(44) double local44 = (double) (local30 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(55) double local55 = (double) (local30 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(62) double local62 = (double) (local30 & 0x7F) / 128.0D;
			@Pc(64) double local64 = local62;
			@Pc(66) double local66 = local62;
			@Pc(68) double local68 = local62;
			if (local55 != 0.0D) {
				@Pc(86) double local86;
				if (local62 < 0.5D) {
					local86 = local62 * (local55 + 1.0D);
				} else {
					local86 = local62 + local55 - local62 * local55;
				}
				@Pc(101) double local101 = local62 * 2.0D - local86;
				@Pc(105) double local105 = local44 + 0.3333333333333333D;
				if (local105 > 1.0D) {
					local105--;
				}
				@Pc(119) double local119 = local44 - 0.3333333333333333D;
				if (local119 < 0.0D) {
					local119++;
				}
				if (local44 * 6.0D < 1.0D) {
					local66 = local44 * 6.0D * (local86 - local101) + local101;
				} else if (local44 * 2.0D < 1.0D) {
					local66 = local86;
				} else if (local44 * 3.0D < 2.0D) {
					local66 = (0.6666666666666666D - local44) * 6.0D * (local86 - local101) + local101;
				} else {
					local66 = local101;
				}
				if (local105 * 6.0D < 1.0D) {
					local64 = (local86 - local101) * 6.0D * local105 + local101;
				} else if (local105 * 2.0D < 1.0D) {
					local64 = local86;
				} else if (local105 * 3.0D < 2.0D) {
					local64 = local101 + (local86 - local101) * (-local105 + 0.6666666666666666D) * 6.0D;
				} else {
					local64 = local101;
				}
				if (local119 * 6.0D < 1.0D) {
					local68 = local101 + (local86 - local101) * 6.0D * local119;
				} else if (local119 * 2.0D < 1.0D) {
					local68 = local86;
				} else if (local119 * 3.0D < 2.0D) {
					local68 = (0.6666666666666666D - local119) * (-local101 + local86) * 6.0D + local101;
				} else {
					local68 = local101;
				}
			}
			local64 = Math.pow(local64, local23);
			local66 = Math.pow(local66, local23);
			local68 = Math.pow(local68, local23);
			@Pc(311) int local311 = (int) (local64 * 256.0D);
			@Pc(316) int local316 = (int) (local66 * 256.0D);
			@Pc(321) int local321 = (int) (local68 * 256.0D);
			@Pc(331) int local331 = (local316 << 8) + (local311 << 16) + local321;
			Static305.anIntArray309[local30] = local331;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IBII)V")
	public static void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(44) String local44 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local44);
		Static659.method8818(true, local44, false);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)Lclient!no;")
	public static Class3_Sub31 method6056(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(8) Class local8 = Class.forName("kga");
			@Pc(12) Class3_Sub31 local12 = (Class3_Sub31) local8.getDeclaredConstructor().newInstance();
			local12.method5152(arg2, arg0, arg1);
			return local12;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class3_Sub31_Sub2 local31 = new Class3_Sub31_Sub2();
			local31.method5152(arg2, arg0, arg1);
			return local31;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)I")
	public static int method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		if (arg0 < arg1) {
			local18 = arg0;
			arg0 = arg1;
			arg1 = local18;
		}
		while (arg1 != 0) {
			local18 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local18;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I")
	public static int method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static283.anIntArrayArray26 == null ? 0 : Static283.anIntArrayArray26[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!wka;I)V")
	public static void method6061(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class19_Sub1_Sub3_Sub2 arg1) {
		@Pc(9) Class274 local9 = arg1.method6600();
		if (arg1.anInt7824 == 0) {
			arg1.anInt7821 = 0;
			Static258.anInt4778 = -1;
			Static255.anInt4769 = 0;
			return;
		}
		if (arg1.aClass100_9.method8963() && !arg1.aClass100_9.method8975()) {
			@Pc(48) Class26 local48 = arg1.aClass100_9.method8977();
			if (arg1.anInt7822 > 0 && local48.anInt778 == 0) {
				Static255.anInt4769 = 0;
				arg1.anInt7821++;
				Static258.anInt4778 = -1;
				return;
			}
			if (arg1.anInt7822 <= 0 && local48.anInt770 == 0) {
				Static255.anInt4769 = 0;
				arg1.anInt7821++;
				Static258.anInt4778 = -1;
				return;
			}
		}
		for (@Pc(96) int local96 = 0; local96 < arg1.aClass385Array3.length; local96++) {
			if (arg1.aClass385Array3[local96].anInt10760 != -1 && arg1.aClass385Array3[local96].aClass100_11.method8975()) {
				@Pc(126) Class310 local126 = Static660.aClass307_2.method7493(arg1.aClass385Array3[local96].anInt10760);
				if (local126.aBoolean661 && local126.anInt8987 != -1) {
					@Pc(141) Class26 local141 = Static59.aClass177_1.method4259(local126.anInt8987);
					if (arg1.anInt7822 > 0 && local141.anInt778 == 0) {
						Static258.anInt4778 = -1;
						Static255.anInt4769 = 0;
						arg1.anInt7821++;
						return;
					}
					if (arg1.anInt7822 <= 0 && local141.anInt770 == 0) {
						Static255.anInt4769 = 0;
						arg1.anInt7821++;
						Static258.anInt4778 = -1;
						return;
					}
				}
			}
		}
		@Pc(200) int local200 = arg1.anInt11204;
		@Pc(203) int local203 = arg1.anInt11211;
		@Pc(219) int local219 = arg1.anIntArray430[arg1.anInt7824 - 1] * 512 + arg1.method6592() * 256;
		@Pc(236) int local236 = arg1.lb[arg1.anInt7824 - 1] * 512 + arg1.method6592() * 256;
		if (local200 >= local219) {
			if (local200 <= local219) {
				if (local203 < local236) {
					arg1.method6604(8192);
				} else if (local203 > local236) {
					arg1.method6604(0);
				}
			} else if (local203 < local236) {
				arg1.method6604(6144);
			} else if (local203 <= local236) {
				arg1.method6604(4096);
			} else {
				arg1.method6604(2048);
			}
		} else if (local236 > local203) {
			arg1.method6604(10240);
		} else if (local236 < local203) {
			arg1.method6604(14336);
		} else {
			arg1.method6604(12288);
		}
		@Pc(370) byte local370 = arg1.aByteArray69[arg1.anInt7824 - 1];
		if (!arg0 && (local219 - local200 > 1024 || local219 - local200 < -1024 || local236 - local203 > 1024 || local236 - local203 < -1024)) {
			arg1.anInt11204 = local219;
			arg1.anInt11211 = local236;
			arg1.method6597(arg1.anInt7810, false);
			arg1.anInt7824--;
			Static258.anInt4778 = -1;
			Static255.anInt4769 = 0;
			if (arg1.anInt7822 > 0) {
				arg1.anInt7822--;
			}
			return;
		}
		@Pc(445) int local445 = 16;
		@Pc(447) boolean local447 = true;
		if (arg1 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
			local447 = ((Class19_Sub1_Sub3_Sub2_Sub1) arg1).aClass18_1.aBoolean18;
		}
		@Pc(491) int local491;
		if (local447) {
			local491 = arg1.anInt7810 - arg1.aClass340_7.anInt9603;
			if (local491 != 0 && arg1.anInt7780 == -1 && arg1.anInt7818 != 0) {
				local445 = 8;
			}
			if (!arg0 && arg1.anInt7824 > 2) {
				local445 = 24;
			}
			if (!arg0 && arg1.anInt7824 > 3) {
				local445 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt7824 > 1) {
				local445 = 24;
			}
			if (!arg0 && arg1.anInt7824 > 2) {
				local445 = 32;
			}
		}
		if (arg1.anInt7821 > 0 && arg1.anInt7824 > 1) {
			local445 = 32;
			arg1.anInt7821--;
		}
		if (local370 == 2) {
			local445 <<= 0x1;
		} else if (local370 == 0) {
			local445 >>= 0x1;
		}
		Static255.anInt4769 = 0;
		if (local9.anInt8156 != -1) {
			local445 <<= 0x9;
			if (arg1.anInt7824 == 1) {
				local491 = arg1.anInt7823 * arg1.anInt7823;
				@Pc(607) int local607 = (arg1.anInt11204 <= local219 ? local219 - arg1.anInt11204 : arg1.anInt11204 + -local219) << 9;
				@Pc(629) int local629 = (arg1.anInt11211 > local236 ? arg1.anInt11211 - local236 : -arg1.anInt11211 + local236) << 9;
				@Pc(637) int local637 = local629 >= local607 ? local629 : local607;
				@Pc(644) int local644 = local9.anInt8156 * 2 * local637;
				if (local491 > local644) {
					arg1.anInt7823 /= 2;
				} else if (local637 < local491 / 2) {
					arg1.anInt7823 -= local9.anInt8156;
					if (arg1.anInt7823 < 0) {
						arg1.anInt7823 = 0;
					}
				} else if (arg1.anInt7823 < local445) {
					arg1.anInt7823 += local9.anInt8156;
					if (arg1.anInt7823 > local445) {
						arg1.anInt7823 = local445;
					}
				}
			} else if (local445 > arg1.anInt7823) {
				arg1.anInt7823 += local9.anInt8156;
				if (local445 < arg1.anInt7823) {
					arg1.anInt7823 = local445;
				}
			} else if (arg1.anInt7823 > 0) {
				arg1.anInt7823 -= local9.anInt8156;
				if (arg1.anInt7823 < 0) {
					arg1.anInt7823 = 0;
				}
			}
			local445 = arg1.anInt7823 >> 9;
			if (local445 < 1) {
				local445 = 1;
			}
		}
		if (local200 == local219 && local236 == local203) {
			Static258.anInt4778 = -1;
		} else {
			if (local200 < local219) {
				arg1.anInt11204 += local445;
				Static255.anInt4769 |= 0x4;
				if (local219 < arg1.anInt11204) {
					arg1.anInt11204 = local219;
				}
			} else if (local219 < local200) {
				Static255.anInt4769 |= 0x8;
				arg1.anInt11204 -= local445;
				if (local219 > arg1.anInt11204) {
					arg1.anInt11204 = local219;
				}
			}
			if (local203 < local236) {
				Static255.anInt4769 |= 0x1;
				arg1.anInt11211 += local445;
				if (arg1.anInt11211 > local236) {
					arg1.anInt11211 = local236;
				}
			} else if (local236 < local203) {
				arg1.anInt11211 -= local445;
				Static255.anInt4769 |= 0x2;
				if (arg1.anInt11211 < local236) {
					arg1.anInt11211 = local236;
				}
			}
			if (local445 >= 32) {
				Static258.anInt4778 = 2;
			} else {
				Static258.anInt4778 = local370;
			}
		}
		if (local219 != arg1.anInt11204 || arg1.anInt11211 != local236) {
			return;
		}
		arg1.anInt7824--;
		if (arg1.anInt7822 > 0) {
			arg1.anInt7822--;
			return;
		}
	}
}
