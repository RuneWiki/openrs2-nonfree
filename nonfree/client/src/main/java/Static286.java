import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jo", name = "Eb", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_11 = new Class96(11, 0, 1, 2);

	@OriginalMember(owner = "client!jo", name = "Hb", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZII)V")
	public static void method4303(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg3 == Static128.anInt6986 && Static353.anInt6205 == arg0 && (Static240.anInt3974 == Static559.anInt9430 || Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 1)) {
			return;
		}
		Static559.anInt9430 = Static240.anInt3974;
		Static128.anInt6986 = arg3;
		Static353.anInt6205 = arg0;
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 1) {
			Static559.anInt9430 = 0;
		}
		Static21.method316(arg2);
		Static299.method1114(true, Static582.aClass335_13.method8349(Static323.anInt5795), Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
		@Pc(75) int local75 = Static622.anInt10188;
		Static622.anInt10188 = (Static128.anInt6986 - (Static544.anInt9261 >> 4)) * 8;
		@Pc(86) int local86 = Static668.anInt10683;
		Static668.anInt10683 = (Static353.anInt6205 - (Static282.anInt4887 >> 4)) * 8;
		Static341.aClass5_Sub5_Sub12_1 = Static629.method8384(Static128.anInt6986 * 8, Static353.anInt6205 * 8);
		Static557.aClass197_1 = null;
		@Pc(108) int local108 = Static622.anInt10188 - local75;
		@Pc(112) int local112 = Static668.anInt10683 - local86;
		@Pc(117) int local117;
		@Pc(130) int local130;
		@Pc(275) int local275;
		@Pc(204) int local204;
		if (arg2 == 11) {
			for (local117 = 0; local117 < Static230.anInt3776; local117++) {
				@Pc(123) Class5_Sub35 local123 = Static85.aClass5_Sub35Array1[local117];
				if (local123 != null) {
					@Pc(128) Class8_Sub1_Sub3_Sub2_Sub2 local128 = local123.aClass8_Sub1_Sub3_Sub2_Sub2_2;
					for (local130 = 0; local130 < 10; local130++) {
						local128.anIntArray414[local130] -= local108;
						local128.anIntArray415[local130] -= local112;
					}
					local128.anInt10355 -= local108 * 512;
					local128.anInt10363 -= local112 * 512;
				}
			}
		} else {
			@Pc(190) boolean local190 = false;
			Static247.anInt4256 = 0;
			@Pc(198) int local198 = Static544.anInt9261 * 512 - 512;
			local204 = Static282.anInt4887 * 512 - 512;
			for (local130 = 0; local130 < Static230.anInt3776; local130++) {
				@Pc(212) Class5_Sub35 local212 = Static85.aClass5_Sub35Array1[local130];
				if (local212 != null) {
					@Pc(217) Class8_Sub1_Sub3_Sub2_Sub2 local217 = local212.aClass8_Sub1_Sub3_Sub2_Sub2_2;
					local217.anInt10355 -= local108 * 512;
					local217.anInt10363 -= local112 * 512;
					if (local217.anInt10355 >= 0 && local217.anInt10355 <= local198 && local217.anInt10363 >= 0 && local204 >= local217.anInt10363) {
						@Pc(273) boolean local273 = true;
						for (local275 = 0; local275 < 10; local275++) {
							local217.anIntArray414[local275] -= local108;
							local217.anIntArray415[local275] -= local112;
							if (local217.anIntArray414[local275] < 0 || local217.anIntArray414[local275] >= Static544.anInt9261 || local217.anIntArray415[local275] < 0 || Static282.anInt4887 <= local217.anIntArray415[local275]) {
								local273 = false;
							}
						}
						if (local273) {
							Static671.anIntArray620[Static247.anInt4256++] = local217.anInt6994;
						} else {
							local217.method6004((Class227) null);
							local212.method9327(1);
							local190 = true;
						}
					} else {
						local217.method6004((Class227) null);
						local212.method9327(1);
						local190 = true;
					}
				}
			}
			if (local190) {
				Static230.anInt3776 = Static623.aClass291_43.method6995();
				Static623.aClass291_43.method6990(Static85.aClass5_Sub35Array1);
			}
		}
		for (local117 = 0; local117 < 2048; local117++) {
			@Pc(394) Class8_Sub1_Sub3_Sub2_Sub1 local394 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local117];
			if (local394 != null) {
				for (local204 = 0; local204 < 10; local204++) {
					local394.anIntArray414[local204] -= local108;
					local394.anIntArray415[local204] -= local112;
				}
				local394.anInt10363 -= local112 * 512;
				local394.anInt10355 -= local108 * 512;
			}
		}
		@Pc(452) Class28[] local452 = Static598.aClass28Array1;
		for (local204 = 0; local204 < local452.length; local204++) {
			@Pc(460) Class28 local460 = local452[local204];
			if (local460 != null) {
				local460.anInt503 -= local108 * 512;
				local460.anInt498 -= local112 * 512;
			}
		}
		@Pc(494) Class5_Sub44 local494;
		for (local494 = (Class5_Sub44) Static298.aClass102_38.method1916(); local494 != null; local494 = (Class5_Sub44) Static298.aClass102_38.method1915()) {
			local494.anInt8152 -= local112;
			local494.anInt8141 -= local108;
			if (Static452.anInt7483 != 4 && (local494.anInt8141 < 0 || local494.anInt8152 < 0 || Static544.anInt9261 <= local494.anInt8141 || local494.anInt8152 >= Static282.anInt4887)) {
				local494.method9327(1);
			}
		}
		for (local494 = (Class5_Sub44) Static605.aClass102_70.method1916(); local494 != null; local494 = (Class5_Sub44) Static605.aClass102_70.method1915()) {
			local494.anInt8152 -= local112;
			local494.anInt8141 -= local108;
			if (Static452.anInt7483 != 4 && (local494.anInt8141 < 0 || local494.anInt8152 < 0 || Static544.anInt9261 <= local494.anInt8141 || local494.anInt8152 >= Static282.anInt4887)) {
				local494.method9327(1);
			}
		}
		if (Static452.anInt7483 != 4) {
			for (@Pc(631) Class5_Sub25 local631 = (Class5_Sub25) Static466.aClass291_33.method6987(); local631 != null; local631 = (Class5_Sub25) Static466.aClass291_33.method6989()) {
				@Pc(639) int local639 = (int) (local631.aLong314 & 0x3FFFL);
				@Pc(644) int local644 = local639 - Static622.anInt10188;
				local275 = (int) (local631.aLong314 >> 14 & 0x3FFFL);
				@Pc(657) int local657 = local275 - Static668.anInt10683;
				if (local644 < 0 || local657 < 0 || local644 >= Static544.anInt9261 || local657 >= Static282.anInt4887) {
					local631.method9327(1);
				}
			}
		}
		if (Static86.anInt1451 != 0) {
			Static669.anInt10711 -= local112;
			Static86.anInt1451 -= local108;
		}
		Static78.method8194();
		if (arg2 != 11) {
			Static569.anInt9543 -= local108;
			Static650.anInt2304 -= local112;
			Static532.anInt9189 -= local108 * 512;
			Static576.anInt9663 -= local108;
			Static218.anInt3558 -= local112;
			Static489.anInt8202 -= local112 * 512;
			if (Math.abs(local108) > Static544.anInt9261 || Math.abs(local112) > Static282.anInt4887) {
				Static277.method4082();
			}
		} else if (Static79.anInt1216 == 4) {
			Static291.anInt5066 -= local112 * 512;
			Static425.anInt7328 -= local108 * 512;
			Static497.anInt10511 -= local108 * 512;
			Static349.anInt6137 -= local112 * 512;
		} else {
			Static272.anInt4763 = -1;
			Static651.anInt10529 = -1;
			Static79.anInt1216 = 1;
		}
		Static631.method8841();
		Static510.method7465();
		Static480.aClass102_51.method1932();
		Static366.aClass102_43.method1932();
		Static270.aClass98_5.method1778();
		Static607.method8678();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ib;)Lclient!fha;")
	public static Class125_Sub1 method4305(@OriginalArg(1) Class5_Sub23 arg0) {
		return new Class125_Sub1(arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8510(), arg0.method8510(), arg0.method8529());
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILclient!ib;)Lclient!uq;")
	public static Class125_Sub3 method4307(@OriginalArg(1) Class5_Sub23 arg0) {
		return new Class125_Sub3(arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8510(), arg0.method8510(), arg0.method8529());
	}
}
