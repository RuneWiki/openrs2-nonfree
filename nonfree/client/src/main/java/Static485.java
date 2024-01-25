import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt8265;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!pia;")
	public static Class272 aClass272_16;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_140 = new Class337(26, 4);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIII)I")
	public static int method7189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(19) int local19 = local12 < 8 ? arg2 : arg1;
		@Pc(36) int local36 = local12 < 4 ? arg1 : local12 == 12 || local12 == 14 ? arg2 : arg0;
		return ((local12 & 0x2) == 0 ? local36 : -local36) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
	public static boolean method7190(@OriginalArg(0) int arg0) {
		return arg0 == 21 || arg0 == 5 || arg0 == 45 || arg0 == 48 || arg0 == 51 || arg0 == 20 || arg0 == 10;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method7191(@OriginalArg(1) Class133 arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (Static428.aBoolean526) {
			local12 = Static584.method8436();
			local14 = Static88.method1487();
		}
		Static353.method5272(local14 + Static612.anInt10212, Static644.anInt10625, arg0, Static115.anInt2157, local12 + Static346.anInt4654);
		Static16.aClass55_1.method6023(-10660793, Static346.anInt4654 + local12 + 3, Static174.aClass120_24.method2690(Static266.anInt4796), local14 + Static612.anInt10212 + 14, -1);
		@Pc(63) int local63 = local12 + Static3.aClass3_3.method8875();
		@Pc(70) int local70 = Static3.aClass3_3.method8879() + local14;
		@Pc(74) int local74;
		@Pc(96) int local96;
		if (Static266.aBoolean355) {
			local74 = 0;
			for (@Pc(131) Class5_Sub5_Sub4 local131 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local131 != null; local131 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
				local96 = local74 * 16 + local14 + Static612.anInt10212 + 31;
				local74++;
				if (local131.anInt2287 == 1) {
					Static260.method4255(local14 + Static612.anInt10212, arg0, local96, local63, Static644.anInt10625, (Class5_Sub5_Sub15) local131.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66, local70, Static115.anInt2157, -256, Static346.anInt4654 + local12, -1);
				} else {
					Static554.method8071(-256, local63, local96, Static115.anInt2157, Static644.anInt10625, arg0, local70, local12 + Static346.anInt4654, Static612.anInt10212 + local14, -1, local131);
				}
			}
			if (Static281.aClass5_Sub5_Sub4_1 != null) {
				Static353.method5272(Static14.anInt240, Static239.anInt4414, arg0, Static565.anInt9564, Static129.anInt2304);
				Static16.aClass55_1.method6023(-10660793, Static129.anInt2304 + 3, Static281.aClass5_Sub5_Sub4_1.aString26, Static14.anInt240 + 14, -1);
				local74 = 0;
				for (@Pc(228) Class5_Sub5_Sub15 local228 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8702(); local228 != null; local228 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8710()) {
					@Pc(239) int local239 = Static14.anInt240 + local74 * 16 + 31;
					Static260.method4255(Static14.anInt240, arg0, local239, local63, Static239.anInt4414, local228, local70, Static565.anInt9564, -256, Static129.anInt2304, -1);
					local74++;
				}
				Static436.method6649(Static565.anInt9564, Static14.anInt240, Static239.anInt4414, Static129.anInt2304);
			}
		} else {
			local74 = 0;
			for (@Pc(79) Class5_Sub5_Sub15 local79 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local79 != null; local79 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				local96 = (Static491.anInt8293 - local74 - 1) * 16 + local14 + Static612.anInt10212 + 31;
				Static260.method4255(Static612.anInt10212 + local14, arg0, local96, local63, Static644.anInt10625, local79, local70, Static115.anInt2157, -256, Static346.anInt4654 + local12, -1);
				local74++;
			}
		}
		Static436.method6649(Static115.anInt2157, Static612.anInt10212 + local14, Static644.anInt10625, local12 + Static346.anInt4654);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public static void method7193() {
		Static461.aClass87_191.method1801();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	public static void method7194() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static57.aBoolean65) {
			local9 = 4096;
			if (Static375.aBoolean446) {
				local7 = 2048;
			}
		}
		if ((float) local7 > Static552.aFloat176) {
			Static552.aFloat176 = local7;
		}
		while (Static311.aFloat95 >= 16384.0F) {
			Static311.aFloat95 -= 16384.0F;
		}
		if (Static552.aFloat176 > (float) local9) {
			Static552.aFloat176 = local9;
		}
		while (Static311.aFloat95 < 0.0F) {
			Static311.aFloat95 += 16384.0F;
		}
		@Pc(57) int local57 = Static343.anInt5775 >> 9;
		@Pc(61) int local61 = Static57.anInt1135 >> 9;
		@Pc(67) int local67 = Static644.method9021(Static57.anInt1135, Static343.anInt5775, Static636.anInt10567);
		@Pc(69) int local69 = 0;
		@Pc(97) int local97;
		if (local57 > 3 && local61 > 3 && Static326.anInt5541 - 4 > local57 && local61 < Static448.anInt7637 - 4) {
			for (local97 = local57 - 4; local97 <= local57 + 4; local97++) {
				for (@Pc(103) int local103 = local61 - 4; local103 <= local61 + 4; local103++) {
					@Pc(107) int local107 = Static636.anInt10567;
					if (local107 < 3 && Static23.method285(local97, local103)) {
						local107++;
					}
					@Pc(120) int local120 = 0;
					if (Static294.aClass104_Sub1_1.aByteArrayArrayArray14 != null && Static294.aClass104_Sub1_1.aByteArrayArrayArray14[local107] != null) {
						local120 = (Static294.aClass104_Sub1_1.aByteArrayArrayArray14[local107][local97][local103] & 0xFF) * 8 << 2;
					}
					if (Static11.aClass61Array1 != null && Static11.aClass61Array1[local107] != null) {
						@Pc(162) int local162 = local67 + local120 - Static11.aClass61Array1[local107].method8580(local103, local97);
						if (local69 < local162) {
							local69 = local162;
						}
					}
				}
			}
		}
		local97 = (local69 >> 2) * 1536;
		if (local97 > 786432) {
			local97 = 786432;
		}
		if (local97 < 262144) {
			local97 = 262144;
		}
		if (local97 > Static304.anInt5321) {
			Static304.anInt5321 += (local97 - Static304.anInt5321) / 24;
		} else if (Static304.anInt5321 > local97) {
			Static304.anInt5321 += (local97 - Static304.anInt5321) / 80;
		}
	}
}
