import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_102 = new Class134("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5450(@OriginalArg(0) String arg0) {
		if (Static382.aStringArray35 == null) {
			Static221.method2939();
		}
		@Pc(14) String[] local14 = Static203.method2715('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			for (@Pc(24) int local24 = Static166.anInt2851; local24 > 0; local24--) {
				Static382.aStringArray35[local24] = Static382.aStringArray35[local24 - 1];
			}
			Static382.aStringArray35[0] = local14[local20];
			if (Static166.anInt2851 < Static382.aStringArray35.length - 1) {
				Static166.anInt2851++;
				if (Static157.anInt2696 > 0) {
					Static157.anInt2696++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)I")
	public static int method5451(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local62 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(185) int local185 = (int) (local68 * 256.0D);
		if (local185 < 0) {
			local185 = 0;
		} else if (local185 > 255) {
			local185 = 255;
		}
		if (local185 > 243) {
			local167 >>= 0x4;
		} else if (local185 > 217) {
			local167 >>= 0x3;
		} else if (local185 > 192) {
			local167 >>= 0x2;
		} else if (local185 > 179) {
			local167 >>= 0x1;
		}
		return ((local162 >> 2 & 0x3F) << 10) - (-(local167 >> 5 << 7) - (local185 >> 1));
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "()V")
	public static void method5452() {
		Static376.anInt6257 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static10.anInt151; local3++) {
			@Pc(8) Class22 local8 = Static328.aClass22Array2[local3];
			@Pc(12) int local12;
			if (Static400.anIntArray550 != null) {
				for (local12 = 0; local12 < Static400.anIntArray550.length; local12++) {
					if (Static400.anIntArray550[local12] != -1000000 && (local8.anInt565 <= Static400.anIntArray550[local12] || local8.anInt553 <= Static400.anIntArray550[local12]) && (local8.anInt567 <= Static130.anIntArray183[local12] || local8.anInt570 <= Static130.anIntArray183[local12]) && (local8.anInt567 >= Static330.anIntArray483[local12] || local8.anInt570 >= Static330.anIntArray483[local12]) && (local8.anInt572 <= Static103.anIntArray142[local12] || local8.anInt560 <= Static103.anIntArray142[local12]) && (local8.anInt572 >= Static408.anIntArray645[local12] || local8.anInt560 >= Static408.anIntArray645[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt555 == 1) {
				local12 = local8.anInt556 + Static453.anInt7270 - Static352.anInt5986;
				if (local12 >= 0 && local12 <= Static453.anInt7270 + Static453.anInt7270) {
					local110 = local8.anInt569 + Static453.anInt7270 - Static411.anInt6740;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static453.anInt7270 + Static453.anInt7270) {
						continue;
					}
					local128 = local8.anInt561 + Static453.anInt7270 - Static411.anInt6740;
					if (local128 > Static453.anInt7270 + Static453.anInt7270) {
						local128 = Static453.anInt7270 + Static453.anInt7270;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static356.aBooleanArrayArray6[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static375.anInt6251 - local8.anInt567;
						if (local164 > Static252.anInt4056) {
							local8.anInt563 = 1;
						} else {
							if (local164 >= -Static252.anInt4056) {
								continue;
							}
							local8.anInt563 = 2;
							local164 = -local164;
						}
						local8.anInt554 = (local8.anInt572 - Static422.anInt6875 << 8) / local164;
						local8.anInt571 = (local8.anInt560 - Static422.anInt6875 << 8) / local164;
						local8.anInt568 = (local8.anInt565 - Static445.anInt7139 << 8) / local164;
						local8.anInt557 = (local8.anInt553 - Static445.anInt7139 << 8) / local164;
						Static29.aClass22Array1[Static376.anInt6257++] = local8;
					}
				}
			} else if (local8.anInt555 == 2) {
				local12 = local8.anInt569 + Static453.anInt7270 - Static411.anInt6740;
				if (local12 >= 0 && local12 <= Static453.anInt7270 + Static453.anInt7270) {
					local110 = local8.anInt556 + Static453.anInt7270 - Static352.anInt5986;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static453.anInt7270 + Static453.anInt7270) {
						continue;
					}
					local128 = local8.anInt559 + Static453.anInt7270 - Static352.anInt5986;
					if (local128 > Static453.anInt7270 + Static453.anInt7270) {
						local128 = Static453.anInt7270 + Static453.anInt7270;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static356.aBooleanArrayArray6[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static422.anInt6875 - local8.anInt572;
						if (local164 > Static252.anInt4056) {
							local8.anInt563 = 3;
						} else {
							if (local164 >= -Static252.anInt4056) {
								continue;
							}
							local8.anInt563 = 4;
							local164 = -local164;
						}
						local8.anInt566 = (local8.anInt567 - Static375.anInt6251 << 8) / local164;
						local8.anInt564 = (local8.anInt570 - Static375.anInt6251 << 8) / local164;
						local8.anInt568 = (local8.anInt565 - Static445.anInt7139 << 8) / local164;
						local8.anInt557 = (local8.anInt553 - Static445.anInt7139 << 8) / local164;
						Static29.aClass22Array1[Static376.anInt6257++] = local8;
					}
				}
			} else if (local8.anInt555 == 4) {
				local12 = local8.anInt565 - Static445.anInt7139;
				if (local12 > Static264.anInt4297) {
					local110 = local8.anInt569 + Static453.anInt7270 - Static411.anInt6740;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static453.anInt7270 + Static453.anInt7270) {
						continue;
					}
					local128 = local8.anInt561 + Static453.anInt7270 - Static411.anInt6740;
					if (local128 > Static453.anInt7270 + Static453.anInt7270) {
						local128 = Static453.anInt7270 + Static453.anInt7270;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt556 + Static453.anInt7270 - Static352.anInt5986;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static453.anInt7270 + Static453.anInt7270) {
						continue;
					}
					local164 = local8.anInt559 + Static453.anInt7270 - Static352.anInt5986;
					if (local164 > Static453.anInt7270 + Static453.anInt7270) {
						local164 = Static453.anInt7270 + Static453.anInt7270;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static356.aBooleanArrayArray6[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt563 = 5;
						local8.anInt566 = (local8.anInt567 - Static375.anInt6251 << 8) / local12;
						local8.anInt564 = (local8.anInt570 - Static375.anInt6251 << 8) / local12;
						local8.anInt554 = (local8.anInt572 - Static422.anInt6875 << 8) / local12;
						local8.anInt571 = (local8.anInt560 - Static422.anInt6875 << 8) / local12;
						Static29.aClass22Array1[Static376.anInt6257++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIZ)V")
	public static void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class2_Sub5_Sub11 local13 = Static316.method4316(10, arg1);
		local13.method3098();
		local13.anInt3916 = arg2;
		local13.anInt3911 = arg0;
		local13.anInt3906 = arg3;
	}
}
