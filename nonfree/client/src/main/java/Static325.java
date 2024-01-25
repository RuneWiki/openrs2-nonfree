import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
	public static int anInt6146;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
	public static void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static434.anInt7518 = 2;
		Static361.anInt6516 = arg0;
		Static212.method3940(false, arg1, arg2);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!kj;B)V")
	public static void method5581(@OriginalArg(0) Class1_Sub17_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static28.anInt772; local3++) {
			@Pc(9) int local9 = Static241.anIntArray356[local3];
			@Pc(13) Class20_Sub1_Sub1_Sub1 local13 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local9];
			@Pc(19) int local19 = arg0.method4487();
			if ((local19 & 0x2) != 0) {
				local19 += arg0.method4487() << 8;
			}
			if ((local19 & 0x1000) != 0) {
				local19 += arg0.method4487() << 16;
			}
			Static158.method2880(local19, local13, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method5582() {
		if (Static286.aClass1_Sub15_Sub1_1.method6378(Static449.anInt7876) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static389.anInt6904 - 4 & 0xFF);
		@Pc(23) int local23 = Static389.anInt6904 % Static237.anInt4563;
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local31 = 0; local31 < Static373.anInt6694; local31++) {
				Static314.aByteArrayArrayArray12[local25][local23][local31] = local19;
			}
		}
		if (Static322.anInt6113 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static204.anIntArray322[local31] = -1000000;
			Static265.anIntArray281[local31] = 1000000;
			Static348.anIntArray622[local31] = 0;
			Static220.anIntArray340[local31] = 1000000;
			Static279.anIntArray261[local31] = 0;
		}
		@Pc(133) int local133;
		if (Static170.anInt3418 != 1) {
			local133 = Static508.method7754(Static46.anInt1256, Static321.anInt6064, Static322.anInt6113);
			if (local133 - Static276.anInt8653 >= 800 || (Static379.aByteArrayArrayArray13[Static322.anInt6113][Static321.anInt6064 >> 7][Static46.anInt1256 >> 7] & 0x4) == 0) {
				return;
			}
			Static172.method3204(Static46.anInt1256 >> 7, Static321.anInt6064 >> 7, Static263.aClass64ArrayArrayArray3, 1, false);
			return;
		}
		if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7][Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7] & 0x4) != 0) {
			Static172.method3204(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7, Static263.aClass64ArrayArrayArray3, 0, false);
		}
		if (Static536.anInt9434 >= 2560) {
			return;
		}
		local133 = Static321.anInt6064 >> 7;
		@Pc(137) int local137 = Static46.anInt1256 >> 7;
		@Pc(142) int local142 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7;
		@Pc(147) int local147 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7;
		@Pc(154) int local154;
		if (local133 >= local142) {
			local154 = local133 - local142;
		} else {
			local154 = local142 - local133;
		}
		@Pc(172) int local172;
		if (local147 <= local137) {
			local172 = local137 - local147;
		} else {
			local172 = local147 - local137;
		}
		if ((local154 != 0 || local172 != 0) && local154 > -Static237.anInt4563 && Static237.anInt4563 > local154 && local172 > -Static373.anInt6694 && Static373.anInt6694 > local172) {
			@Pc(251) int local251;
			@Pc(253) int local253;
			if (local172 < local154) {
				local251 = local172 * 65536 / local154;
				local253 = 32768;
				while (local142 != local133) {
					if (local142 > local133) {
						local133++;
					} else if (local142 < local133) {
						local133--;
					}
					if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][local133][local137] & 0x4) != 0) {
						Static172.method3204(local137, local133, Static263.aClass64ArrayArrayArray3, 1, false);
						return;
					}
					local253 += local251;
					if (local253 >= 65536) {
						if (local147 > local137) {
							local137++;
						} else if (local147 < local137) {
							local137--;
						}
						local253 -= 65536;
						if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][local133][local137] & 0x4) != 0) {
							Static172.method3204(local137, local133, Static263.aClass64ArrayArrayArray3, 1, false);
							return;
						}
					}
				}
				return;
			}
			local251 = local154 * 65536 / local172;
			local253 = 32768;
			while (local137 != local147) {
				if (local137 < local147) {
					local137++;
				} else if (local137 > local147) {
					local137--;
				}
				if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][local133][local137] & 0x4) != 0) {
					Static172.method3204(local137, local133, Static263.aClass64ArrayArrayArray3, 1, false);
					return;
				}
				local253 += local251;
				if (local253 >= 65536) {
					local253 -= 65536;
					if (local133 < local142) {
						local133++;
					} else if (local142 < local133) {
						local133--;
					}
					if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][local133][local137] & 0x4) != 0) {
						Static172.method3204(local137, local133, Static263.aClass64ArrayArrayArray3, 1, false);
						return;
					}
				}
			}
			return;
		}
		Static25.method773(null, "RC: " + local133 + "," + local137 + " " + local142 + "," + local147 + " " + Static538.anInt9485 + "," + Static282.anInt5380);
		return;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method5583() {
		@Pc(1) Class277 local1 = Static332.aClass277_47;
		synchronized (Static332.aClass277_47) {
			Static332.aClass277_47.method7019();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[B)Lclient!pj;")
	public static Class1_Sub2_Sub13 method5584(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub2_Sub13 local9 = new Class1_Sub2_Sub13();
		@Pc(14) Class1_Sub17 local14 = new Class1_Sub17(arg0);
		local14.anInt4872 = local14.aByteArray58.length - 2;
		@Pc(25) int local25 = local14.method4494();
		@Pc(36) int local36 = local14.aByteArray58.length - local25 - 2 - 12;
		local14.anInt4872 = local36;
		@Pc(43) int local43 = local14.method4481();
		local9.anInt6708 = local14.method4494();
		local9.anInt6707 = local14.method4494();
		local9.anInt6705 = local14.method4494();
		local9.anInt6706 = local14.method4494();
		@Pc(67) int local67 = local14.method4487();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass230Array1 = new Class230[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method4494();
				@Pc(91) Class230 local91 = new Class230(Static184.method3549(local84));
				local9.aClass230Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method4481();
					@Pc(106) int local106 = local14.method4481();
					local91.method6139((long) local102, new Class1_Sub14(local106));
				}
			}
		}
		local14.anInt4872 = 0;
		local9.aString162 = local14.method4463();
		local9.anIntArray652 = new int[local43];
		local9.anIntArray651 = new int[local43];
		local9.aStringArray30 = new String[local43];
		local78 = 0;
		while (local36 > local14.anInt4872) {
			local84 = local14.method4494();
			if (local84 == 3) {
				local9.aStringArray30[local78] = local14.method4491().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray652[local78] = local14.method4487();
			} else {
				local9.anIntArray652[local78] = local14.method4481();
			}
			local9.anIntArray651[local78++] = local84;
		}
		return local9;
	}
}
