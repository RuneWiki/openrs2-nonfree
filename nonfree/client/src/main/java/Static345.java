import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!du;")
	public static final Class62 aClass62_33 = new Class62(5, 14);

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_14 = new Class165(13, 0, 1, 0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4487(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4488(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static350.aClass185_88.anInt5029 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static285.aClass226_2.anInt5944; local18++) {
			@Pc(25) Class135 local25 = Static285.aClass226_2.method4788(local18);
			if ((!arg1 || local25.aBoolean356) && local25.anInt3863 == -1 && local25.anInt3861 == -1 && local25.anInt3852 == 0 && local25.aString41.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static376.aShortArray104 = null;
					Static86.anInt7441 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static376.aShortArray104 = local14;
		Static257.anInt4526 = 0;
		Static86.anInt7441 = local16;
		@Pc(114) String[] local114 = new String[Static86.anInt7441];
		for (@Pc(124) int local124 = 0; local124 < Static86.anInt7441; local124++) {
			local114[local124] = Static285.aClass226_2.method4788(local14[local124]).aString41;
		}
		Static166.method2177(Static376.aShortArray104, local114);
		Static350.aClass185_88.method4023();
		Static350.aClass185_88.anInt5029 = 2;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
	public static void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg2 * Static126.aClass19_Sub1_1.anInt4225 >> 8;
		if (arg1 == -1 && !Static461.aBoolean648) {
			Static54.method708();
		} else if (arg1 != -1 && (arg1 != Static299.anInt5002 || !Static458.method5895()) && local6 != 0 && !Static461.aBoolean648) {
			Static297.method3935(Static355.aClass185_89, arg0, arg1, local6);
		}
		Static299.anInt5002 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public static void method4491() {
		for (@Pc(8) int local8 = 0; local8 < Static249.anInt4440; local8++) {
			@Pc(14) Class43 local14 = Static234.aClass43Array1[local8];
			@Pc(16) boolean local16 = false;
			@Pc(227) int local227;
			if (local14.aClass1_Sub9_Sub4_1 == null) {
				local14.anInt924--;
				if (local14.anInt924 >= (local14.aByte20 == 2 ? -1500 : -10)) {
					if (local14.aByte20 == 1 && local14.aClass194_1 == null) {
						local14.aClass194_1 = Static473.method4118(Static84.aClass185_26, local14.anInt919, 0);
						if (local14.aClass194_1 == null) {
							continue;
						}
						local14.anInt924 += local14.aClass194_1.method4119();
					} else if (local14.aByte20 == 2 && (local14.aClass1_Sub33_1 == null || local14.aClass1_Sub8_Sub1_1 == null)) {
						if (local14.aClass1_Sub33_1 == null) {
							local14.aClass1_Sub33_1 = Static287.method3798(Static429.aClass185_114, local14.anInt919);
						}
						if (local14.aClass1_Sub33_1 == null) {
							continue;
						}
						if (local14.aClass1_Sub8_Sub1_1 == null) {
							local14.aClass1_Sub8_Sub1_1 = local14.aClass1_Sub33_1.method3802(new int[] { 22050 });
							if (local14.aClass1_Sub8_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local14.anInt924 < 0) {
						if (local14.anInt920 == 0) {
							local227 = local14.anInt916 * Static126.aClass19_Sub1_1.anInt4226 >> 8;
						} else {
							@Pc(132) int local132 = local14.anInt920 >> 24 & 0x3;
							if (Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local132) {
								@Pc(143) int local143 = (local14.anInt920 & 0xFF) << 7;
								@Pc(150) int local150 = local14.anInt920 >> 16 & 0xFF;
								@Pc(160) int local160 = (local150 << 7) + 64 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428;
								if (local160 < 0) {
									local160 = -local160;
								}
								@Pc(172) int local172 = local14.anInt920 >> 8 & 0xFF;
								@Pc(182) int local182 = (local172 << 7) + 64 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(196) int local196 = local182 + local160 - 128;
								if (local196 > local143) {
									local14.anInt924 = -99999;
									continue;
								}
								if (local196 < 0) {
									local196 = 0;
								}
								local227 = (local143 - local196) * Static126.aClass19_Sub1_1.anInt4221 * local14.anInt916 / local143 >> 8;
							} else {
								local227 = 0;
							}
						}
						if (local227 > 0) {
							@Pc(248) Class1_Sub8_Sub1 local248 = null;
							if (local14.aByte20 == 1) {
								local248 = local14.aClass194_1.method4120().method697(Static14.aClass35_1);
							} else if (local14.aByte20 == 2) {
								local248 = local14.aClass1_Sub8_Sub1_1;
							}
							@Pc(278) Class1_Sub9_Sub4 local278 = local14.aClass1_Sub9_Sub4_1 = Static474.method5051(local248, local227);
							local278.method5040(local14.anInt921 - 1);
							Static123.aClass1_Sub9_Sub1_1.method4260(local278);
						}
					}
				} else {
					local16 = true;
				}
			} else if (!local14.aClass1_Sub9_Sub4_1.method5956()) {
				local16 = true;
			}
			if (local16) {
				Static249.anInt4440--;
				for (local227 = local8; local227 < Static249.anInt4440; local227++) {
					Static234.aClass43Array1[local227] = Static234.aClass43Array1[local227 + 1];
				}
				local8--;
			}
		}
		if (Static461.aBoolean648 && !Static458.method5895()) {
			if (Static126.aClass19_Sub1_1.anInt4225 != 0 && Static299.anInt5002 != -1) {
				Static175.method2512(Static126.aClass19_Sub1_1.anInt4225, Static355.aClass185_89, Static299.anInt5002);
			}
			Static461.aBoolean648 = false;
		} else if (Static126.aClass19_Sub1_1.anInt4225 != 0 && Static299.anInt5002 != -1 && !Static458.method5895()) {
			Static178.method2589(Static187.aClass242_50);
			Static426.aClass1_Sub19_Sub2_2.method2912(Static299.anInt5002);
			Static299.anInt5002 = -1;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method4492(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(23) int local23 = arg1.length();
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) char local29 = 0;
		@Pc(31) char local31 = 0;
		while (local8 > local25 - local29 || local27 - local31 < local23) {
			if (local25 - local29 >= local8) {
				return -1;
			}
			if (local23 <= local27 - local31) {
				return 1;
			}
			@Pc(69) char local69;
			if (local29 == '\u0000') {
				local69 = arg2.charAt(local25++);
			} else {
				local69 = local29;
			}
			@Pc(79) char local79;
			if (local31 == '\u0000') {
				local79 = arg1.charAt(local27++);
			} else {
				local79 = local31;
			}
			local29 = Static7.method120(local69);
			local31 = Static7.method120(local79);
			local69 = Static85.method5069(local69, arg0);
			local79 = Static85.method5069(local79, arg0);
			if (local69 != local79 && Character.toUpperCase(local69) != Character.toUpperCase(local79)) {
				local69 = Character.toLowerCase(local69);
				local79 = Character.toLowerCase(local79);
				if (local69 != local79) {
					return Static109.method1381(local69, arg0) - Static109.method1381(local79, arg0);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local23);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg0 == 2) {
				local25 = local8 - local140 - 1;
				local27 = local23 - local140 - 1;
			} else {
				local27 = local140;
				local25 = local140;
			}
			@Pc(170) char local170 = arg2.charAt(local25);
			@Pc(174) char local174 = arg1.charAt(local27);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static109.method1381(local170, arg0) - Static109.method1381(local174, arg0);
				}
			}
		}
		@Pc(215) int local215 = local8 - local23;
		if (local215 != 0) {
			return local215;
		}
		for (@Pc(224) int local224 = 0; local224 < local138; local224++) {
			@Pc(230) char local230 = arg2.charAt(local224);
			@Pc(234) char local234 = arg1.charAt(local224);
			if (local234 != local230) {
				return Static109.method1381(local230, arg0) - Static109.method1381(local234, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg2 < 0 || Static147.anInt2300 - 1 <= arg0 || Static293.anInt4886 - 1 <= arg2) {
			return;
		}
		if (Static259.aClass216ArrayArrayArray3 == null) {
			return;
		}
		@Pc(44) Interface7 local44;
		if (arg6 == 0) {
			local44 = (Interface7) Static464.method5366(arg4, arg0, arg2);
			@Pc(50) Interface7 local50 = (Interface7) Static114.method1407(arg4, arg0, arg2);
			if (local44 != null && arg3 != 2) {
				if (local44 instanceof Class11_Sub3_Sub3) {
					((Class11_Sub3_Sub3) local44).aClass267_4.method5509(arg5);
				} else {
					Static298.method3979(arg3, arg4, arg2, arg1, arg0, local44.method4895(), arg6, arg5);
				}
			}
			if (local50 != null) {
				if (local50 instanceof Class11_Sub3_Sub3) {
					((Class11_Sub3_Sub3) local50).aClass267_4.method5509(arg5);
					return;
				}
				Static298.method3979(arg3, arg4, arg2, arg1, arg0, local50.method4895(), arg6, arg5);
				return;
			}
			return;
		}
		if (arg6 != 1) {
			if (arg6 == 2) {
				local44 = (Interface7) Static423.method5398(arg4, arg0, arg2, nc.class);
				if (local44 != null) {
					if (arg3 == 11) {
						arg3 = 10;
					}
					if (local44 instanceof Class11_Sub1_Sub4) {
						((Class11_Sub1_Sub4) local44).aClass267_3.method5509(arg5);
						return;
					}
					Static298.method3979(arg3, arg4, arg2, arg1, arg0, local44.method4895(), arg6, arg5);
					return;
				}
			} else if (arg6 == 3) {
				local44 = (Interface7) Static168.method2856(arg4, arg0, arg2);
				if (local44 == null) {
					return;
				}
				if (local44 instanceof Class11_Sub2_Sub2) {
					((Class11_Sub2_Sub2) local44).aClass267_1.method5509(arg5);
					return;
				}
				Static298.method3979(arg3, arg4, arg2, arg1, arg0, local44.method4895(), arg6, arg5);
			} else {
				return;
			}
			return;
		}
		local44 = (Interface7) Static282.method3773(arg4, arg0, arg2);
		if (local44 == null) {
			return;
		}
		if (!(local44 instanceof Class11_Sub4_Sub1)) {
			@Pc(204) int local204 = local44.method4895();
			if (arg3 != 4 && arg3 != 5) {
				if (arg3 == 6) {
					Static298.method3979(4, arg4, arg2, arg1 + 4, arg0, local204, arg6, arg5);
					return;
				}
				if (arg3 == 7) {
					Static298.method3979(4, arg4, arg2, (arg1 + 2 & 0x3) + 4, arg0, local204, arg6, arg5);
				} else if (arg3 == 8) {
					Static298.method3979(4, arg4, arg2, arg1 + 4, arg0, local204, arg6, arg5);
					Static298.method3979(4, arg4, arg2, (arg1 + 2 & 0x3) + 4, arg0, local204, arg6, arg5);
					return;
				}
				return;
			}
			Static298.method3979(4, arg4, arg2, arg1, arg0, local204, arg6, arg5);
			return;
		}
		((Class11_Sub4_Sub1) local44).aClass267_2.method5509(arg5);
		return;
	}
}
