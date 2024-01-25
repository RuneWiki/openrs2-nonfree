import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public static int anInt7786;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[B)Lclient!bu;")
	public static Class3_Sub7_Sub3 method6472(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub7_Sub3 local9 = new Class3_Sub7_Sub3();
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg0);
		local14.anInt6128 = local14.aByteArray62.length - 2;
		@Pc(25) int local25 = local14.method5198();
		@Pc(36) int local36 = local14.aByteArray62.length - local25 - 2 - 12;
		local14.anInt6128 = local36;
		@Pc(43) int local43 = local14.method5186();
		local9.anInt1033 = local14.method5198();
		local9.anInt1032 = local14.method5198();
		local9.anInt1035 = local14.method5198();
		local9.anInt1037 = local14.method5198();
		@Pc(72) int local72 = local14.method5175();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass354Array1 = new Class354[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local14.method5198();
				@Pc(93) Class354 local93 = new Class354(Static371.method5424(local86));
				local9.aClass354Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local14.method5186();
					@Pc(108) int local108 = local14.method5186();
					local93.method7691(new Class3_Sub17(local108), (long) local104);
				}
			}
		}
		local14.anInt6128 = 0;
		local9.aString7 = local14.method5168();
		local9.anIntArray46 = new int[local43];
		local9.anIntArray45 = new int[local43];
		local9.aStringArray3 = new String[local43];
		local80 = 0;
		while (local14.anInt6128 < local36) {
			local86 = local14.method5198();
			if (local86 == 3) {
				local9.aStringArray3[local80] = local14.method5181().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray45[local80] = local14.method5175();
			} else {
				local9.anIntArray45[local80] = local14.method5186();
			}
			local9.anIntArray46[local80++] = local86;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
	public static String method6473(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) char[] local17 = new char[arg2];
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg2 + arg0;
		while (local25 > local21) {
			@Pc(34) int local34 = arg1[local21++] & 0xFF;
			@Pc(41) int local41;
			if (local34 < 128) {
				if (local34 == 0) {
					local41 = 65533;
				} else {
					local41 = local34;
				}
			} else if (local34 < 192) {
				local41 = 65533;
			} else if (local34 < 224) {
				if (local25 > local21 && (arg1[local21] & 0xC0) == 128) {
					local41 = arg1[local21++] & 0x3F | (local34 & 0x1F) << 6;
					if (local41 < 128) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local34 < 240) {
				if (local21 + 1 < local25 && (arg1[local21] & 0xC0) == 128 && (arg1[local21 + 1] & 0xC0) == 128) {
					local41 = (local34 & 0xF) << 12 | (arg1[local21++] & 0x3F) << 6 | arg1[local21++] & 0x3F;
					if (local41 < 2048) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local34 >= 248) {
				local41 = 65533;
			} else if (local21 + 2 < local25 && (arg1[local21] & 0xC0) == 128 && (arg1[local21 + 1] & 0xC0) == 128 && (arg1[local21 + 2] & 0xC0) == 128) {
				local41 = (local34 & 0x7) << 18 | (arg1[local21++] & 0x3F) << 12 | (arg1[local21++] & 0x3F) << 6 | arg1[local21++] & 0x3F;
				if (local41 >= 65536 && local41 <= 1114111) {
					local41 = 65533;
				} else {
					local41 = 65533;
				}
			} else {
				local41 = 65533;
			}
			local17[local19++] = (char) local41;
		}
		return new String(local17, 0, local19);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!rb;IIIII)V")
	public static void method6474(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static459.anInt7698) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static155.anInt3254) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static39.anInt747 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class299 local62 = Static309.aClass299ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static68.aClass34Array1[local17].method6525(local32, local23) + Static68.aClass34Array1[local17].method6525(local32, local23 + 1) + Static68.aClass34Array1[local17].method6525(local32 + 1, local23) + Static68.aClass34Array1[local17].method6525(local32 + 1, local23 + 1)) / 4 - (Static68.aClass34Array1[arg1].method6525(arg3, arg2) + Static68.aClass34Array1[arg1].method6525(arg3, arg2 + 1) + Static68.aClass34Array1[arg1].method6525(arg3 + 1, arg2) + Static68.aClass34Array1[arg1].method6525(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class41_Sub2_Sub3 local151 = local62.aClass41_Sub2_Sub3_1;
									@Pc(154) Class41_Sub2_Sub3 local154 = local62.aClass41_Sub2_Sub3_2;
									if (local151 != null && local151.method7839()) {
										arg0.method7840(local148, (local23 - arg2) * Static467.anInt7776 + (1 - arg4) * Static323.anInt5468, (local32 - arg3) * Static467.anInt7776 + (1 - arg5) * Static323.anInt5468, local151, Static511.aClass45_12, local1);
									}
									if (local154 != null && local154.method7839()) {
										arg0.method7840(local148, (local23 - arg2) * Static467.anInt7776 + (1 - arg4) * Static323.anInt5468, (local32 - arg3) * Static467.anInt7776 + (1 - arg5) * Static323.anInt5468, local154, Static511.aClass45_12, local1);
									}
									for (@Pc(227) Class38 local227 = local62.aClass38_2; local227 != null; local227 = local227.aClass38_1) {
										@Pc(231) Class41_Sub2_Sub1 local231 = local227.aClass41_Sub2_Sub1_1;
										if (local231 != null && local231.method7839() && (local23 == local231.aShort147 || local23 == local3) && (local32 == local231.aShort144 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort146 + 1 - local231.aShort147;
											@Pc(268) int local268 = local231.aShort145 + 1 - local231.aShort144;
											arg0.method7840(local148, (local231.aShort147 - arg2) * Static467.anInt7776 + (local260 - arg4) * Static323.anInt5468, (local231.aShort144 - arg3) * Static467.anInt7776 + (local268 - arg5) * Static323.anInt5468, local231, Static511.aClass45_12, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
