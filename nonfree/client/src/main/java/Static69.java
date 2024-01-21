import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	public static int anInt1535;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "[Lclient!mb;")
	public static final Class3_Sub17[] aClass3_Sub17Array1 = new Class3_Sub17[2048];

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_597 = Static120.method1824(")1j");

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!af;")
	public static final Class5 aClass5_20 = new Class5(5);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public static void method1031(@OriginalArg(1) int arg0) {
		if (!Static188.method3068(arg0)) {
			return;
		}
		@Pc(19) Class77[] local19 = Static57.aClass77ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class77 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt3211 = 0;
				local27.anInt3243 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public static void method1033(@OriginalArg(0) int arg0) {
		Static166.anInt3714 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static64.anInt1390; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static49.anInt1086; local6++) {
				if (Static185.aClass3_Sub15ArrayArrayArray1[arg0][local3][local6] == null) {
					Static185.aClass3_Sub15ArrayArrayArray1[arg0][local3][local6] = new Class3_Sub15(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
	public static void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method1035() {
		@Pc(8) int local8;
		if (Static9.anInt239 > 0) {
			for (local8 = 0; local8 < 256; local8++) {
				if (Static9.anInt239 > 768) {
					Static31.anIntArray94[local8] = Static192.method3102(1024 - Static9.anInt239, Static144.anIntArray408[local8], Static151.anIntArray431[local8]);
				} else if (Static9.anInt239 > 256) {
					Static31.anIntArray94[local8] = Static151.anIntArray431[local8];
				} else {
					Static31.anIntArray94[local8] = Static192.method3102(256 - Static9.anInt239, Static151.anIntArray431[local8], Static144.anIntArray408[local8]);
				}
			}
		} else if (Static185.anInt4181 <= 0) {
			for (local8 = 0; local8 < 256; local8++) {
				Static31.anIntArray94[local8] = Static144.anIntArray408[local8];
			}
		} else {
			for (local8 = 0; local8 < 256; local8++) {
				if (Static185.anInt4181 > 768) {
					Static31.anIntArray94[local8] = Static192.method3102(1024 - Static185.anInt4181, Static144.anIntArray408[local8], Static130.anIntArray380[local8]);
				} else if (Static185.anInt4181 <= 256) {
					Static31.anIntArray94[local8] = Static192.method3102(256 - Static185.anInt4181, Static130.anIntArray380[local8], Static144.anIntArray408[local8]);
				} else {
					Static31.anIntArray94[local8] = Static130.anIntArray380[local8];
				}
			}
		}
		local8 = 0;
		@Pc(151) int local151 = 0;
		@Pc(156) int local156 = Static147.aClass3_Sub1_Sub4_Sub4_31.anInt3602 * 9;
		@Pc(177) int local177;
		@Pc(187) int local187;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(209) int local209;
		for (@Pc(158) int local158 = 1; local158 < 255; local158++) {
			local177 = Static10.anIntArray34[local158] * (256 - local158) / 256 + 22;
			if (local177 < 0) {
				local177 = 0;
			}
			local8 += local177;
			for (local187 = local177; local187 < 128; local187++) {
				local194 = Static59.anIntArray172[local8++];
				local200 = Static147.aClass3_Sub1_Sub4_Sub4_31.anIntArray449[local156++];
				if (local194 == 0) {
					Static190.aClass3_Sub1_Sub4_Sub4_40.anIntArray449[local151++] = local200;
				} else {
					local204 = local194;
					local209 = 256 - local194;
					local194 = Static31.anIntArray94[local194];
					Static190.aClass3_Sub1_Sub4_Sub4_40.anIntArray449[local151++] = (local209 * (local200 & 0xFF00) + (local194 & 0xFF00) * local204 & 0xFF0000) + ((local194 & 0xFF00FF) * local204 + local209 * (local200 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local194 = 0; local194 < local177; local194++) {
				Static190.aClass3_Sub1_Sub4_Sub4_40.anIntArray449[local151++] = Static147.aClass3_Sub1_Sub4_Sub4_31.anIntArray449[local156++];
			}
			local156 += Static147.aClass3_Sub1_Sub4_Sub4_31.anInt3602 - 128;
		}
		local8 = 0;
		local151 = 0;
		Static190.aClass3_Sub1_Sub4_Sub4_40.method2599(0, 9);
		local156 = Static147.aClass3_Sub1_Sub4_Sub4_31.anInt3602 * 9 + 128;
		for (local177 = 1; local177 < 255; local177++) {
			local187 = (256 - local177) * Static10.anIntArray34[local177] / 256 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			for (local194 = 0; local194 < local187; local194++) {
				@Pc(343) int local343 = local151++;
				local156--;
				Static170.aClass3_Sub1_Sub4_Sub4_34.anIntArray449[local343] = Static147.aClass3_Sub1_Sub4_Sub4_31.anIntArray449[local156];
			}
			for (local200 = local187; local200 < 128; local200++) {
				local204 = Static59.anIntArray172[local8++];
				local156--;
				local209 = Static147.aClass3_Sub1_Sub4_Sub4_31.anIntArray449[local156];
				if (local204 == 0) {
					Static170.aClass3_Sub1_Sub4_Sub4_34.anIntArray449[local151++] = local209;
				} else {
					@Pc(384) int local384 = 256 - local204;
					@Pc(386) int local386 = local204;
					local204 = Static31.anIntArray94[local204];
					Static170.aClass3_Sub1_Sub4_Sub4_34.anIntArray449[local151++] = (local386 * (local204 & 0xFF00) + (local209 & 0xFF00) * local384 & 0xFF0000) + (local384 * (local209 & 0xFF00FF) + local386 * (local204 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local156 += Static147.aClass3_Sub1_Sub4_Sub4_31.anInt3602 + 128;
			local8 += local187;
		}
		Static170.aClass3_Sub1_Sub4_Sub4_34.method2599(637, 9);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public static void method1036() {
		if (Static88.aClass78_2 != null) {
			Static88.aClass78_2.method2417();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V")
	public static void method1037(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = Static27.aClass3_Sub1_Sub4_Sub4_41.anIntArray449;
		@Pc(19) int local19 = local16.length;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			local16[local21] = 1;
		}
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(33) int local33 = 1; local33 < 103; local33++) {
			local47 = (103 - local33) * 512 * 4 + 24628;
			for (local49 = 1; local49 < 103; local49++) {
				if ((Static18.aByteArrayArrayArray1[arg0][local49][local33] & 0x18) == 0) {
					Static169.method693(local16, local47, arg0, local49, local33);
				}
				if (arg0 < 3 && (Static18.aByteArrayArrayArray1[arg0 + 1][local49][local33] & 0x8) != 0) {
					Static169.method693(local16, local47, arg0 + 1, local49, local33);
				}
				local47 += 4;
			}
		}
		Static27.aClass3_Sub1_Sub4_Sub4_41.method2592();
		local49 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local47 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
			for (local155 = 1; local155 < 103; local155++) {
				if ((Static18.aByteArrayArrayArray1[arg0][local155][local151] & 0x18) == 0) {
					Static29.method493(local49, arg0, local47, local155, local151);
				}
				if (arg0 < 3 && (Static18.aByteArrayArrayArray1[arg0 + 1][local155][local151] & 0x8) != 0) {
					Static29.method493(local49, arg0 + 1, local47, local155, local151);
				}
			}
		}
		Static150.anInt3386 = 0;
		for (local155 = 0; local155 < 104; local155++) {
			for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
				@Pc(228) long local228 = Static31.method496(Static153.anInt673, local155, local221);
				if (local228 != 0L) {
					@Pc(242) int local242 = Static162.method2627(Integer.MAX_VALUE & (int) (local228 >>> 32)).anInt141;
					if (local242 >= 0) {
						@Pc(246) int local246 = local221;
						@Pc(248) int local248 = local155;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(282) int[][] local282 = Static32.aClass82Array11[Static153.anInt673].anIntArrayArray38;
							for (@Pc(284) int local284 = 0; local284 < 10; local284++) {
								@Pc(291) int local291 = (int) (Math.random() * 4.0D);
								if (local291 == 0 && local248 > 0 && local248 > local155 - 3 && (local282[local248 - 1][local246] & 0x12C0108) == 0) {
									local248--;
								}
								if (local291 == 1 && local248 < 103 && local248 < local155 + 3 && (local282[local248 + 1][local246] & 0x12C0180) == 0) {
									local248++;
								}
								if (local291 == 2 && local246 > 0 && local221 - 3 < local246 && (local282[local248][local246 - 1] & 0x12C0102) == 0) {
									local246--;
								}
								if (local291 == 3 && local246 < 103 && local246 < local221 + 3 && (local282[local248][local246 + 1] & 0x12C0120) == 0) {
									local246++;
								}
							}
						}
						Static194.aClass3_Sub1_Sub4_Sub4Array17[Static150.anInt3386] = Static42.aClass3_Sub1_Sub4_Sub4Array7[local242];
						Static84.anIntArray501[Static150.anInt3386] = local248;
						Static98.anIntArray286[Static150.anInt3386] = local246;
						Static150.anInt3386++;
					}
				}
			}
		}
		Static60.aClass32_1.method1279();
	}
}
