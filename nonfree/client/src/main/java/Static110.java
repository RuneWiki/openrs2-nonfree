import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!kh;")
	private static Class60 aClass60_824 = Static200.method3116("Take");

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "Lclient!kh;")
	public static Class60 aClass60_821 = aClass60_824;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_822 = Static200.method3116("Welt");

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "Lclient!kh;")
	public static Class60 aClass60_823 = Static200.method3116("cookiehost");

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_825 = Static200.method3116(" )2> ");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public static void method1905(@OriginalArg(0) boolean arg0) {
		Static63.aBoolean83 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(157) int local157;
		if (!Static63.aBoolean83) {
			local17 = (Static27.anInt644 - Static16.aClass1_Sub9_Sub1_1.anInt1192) / 16;
			Static146.anIntArrayArray52 = new int[local17][4];
			for (local21 = 0; local21 < local17; local21++) {
				for (local25 = 0; local25 < 4; local25++) {
					Static146.anIntArrayArray52[local21][local25] = Static16.aClass1_Sub9_Sub1_1.method905();
				}
			}
			local25 = Static16.aClass1_Sub9_Sub1_1.method901();
			local30 = Static16.aClass1_Sub9_Sub1_1.method885();
			local34 = Static16.aClass1_Sub9_Sub1_1.method946();
			local38 = Static16.aClass1_Sub9_Sub1_1.method930();
			@Pc(382) boolean local382 = false;
			if ((local34 / 8 == 48 || local34 / 8 == 49) && (local25 / 8) == 48) {
				local382 = true;
			}
			if (local34 / 8 == 48 && local25 / 8 == 148) {
				local382 = true;
			}
			local45 = Static16.aClass1_Sub9_Sub1_1.method946();
			Static159.anIntArray457 = new int[local17];
			Static173.anIntArray491 = new int[local17];
			Static12.aByteArrayArray1 = new byte[local17][];
			Static193.anIntArray536 = new int[local17];
			Static27.aByteArrayArray2 = new byte[local17][];
			local17 = 0;
			for (local149 = (local34 - 6) / 8; local149 <= (local34 + 6) / 8; local149++) {
				for (local153 = (local25 - 6) / 8; local153 <= (local25 + 6) / 8; local153++) {
					local157 = local153 + (local149 << 8);
					if (local382 && (local153 == 49 || local153 == 149 || local153 == 147 || local149 == 50 || local149 == 49 && local153 == 47)) {
						Static193.anIntArray536[local17] = local157;
						Static159.anIntArray457[local17] = -1;
						Static173.anIntArray491[local17] = -1;
					} else {
						Static193.anIntArray536[local17] = local157;
						Static159.anIntArray457[local17] = Static71.aClass7_Sub1_15.method3222(Static34.method611(new Class60[] { Static10.aClass60_93, Static40.method681(local149), Static161.aClass60_1224, Static40.method681(local153) }));
						Static173.anIntArray491[local17] = Static71.aClass7_Sub1_15.method3222(Static34.method611(new Class60[] { Static83.aClass60_646, Static40.method681(local149), Static161.aClass60_1224, Static40.method681(local153) }));
					}
					local17++;
				}
			}
			Static70.method1281(local45, local25, local30, local34, local38);
			return;
		}
		local17 = Static16.aClass1_Sub9_Sub1_1.method895();
		local21 = Static16.aClass1_Sub9_Sub1_1.method916();
		local25 = Static16.aClass1_Sub9_Sub1_1.method885();
		Static16.aClass1_Sub9_Sub1_1.method948();
		for (local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < 13; local34++) {
				for (local38 = 0; local38 < 13; local38++) {
					local45 = Static16.aClass1_Sub9_Sub1_1.method949(1);
					if (local45 == 1) {
						Static145.anIntArrayArrayArray12[local30][local34][local38] = Static16.aClass1_Sub9_Sub1_1.method949(26);
					} else {
						Static145.anIntArrayArrayArray12[local30][local34][local38] = -1;
					}
				}
			}
		}
		Static16.aClass1_Sub9_Sub1_1.method950();
		local34 = (Static27.anInt644 - Static16.aClass1_Sub9_Sub1_1.anInt1192) / 16;
		Static146.anIntArrayArray52 = new int[local34][4];
		for (local38 = 0; local38 < local34; local38++) {
			for (local45 = 0; local45 < 4; local45++) {
				Static146.anIntArrayArray52[local38][local45] = Static16.aClass1_Sub9_Sub1_1.method915();
			}
		}
		local45 = Static16.aClass1_Sub9_Sub1_1.method916();
		@Pc(130) int local130 = Static16.aClass1_Sub9_Sub1_1.method946();
		Static173.anIntArray491 = new int[local34];
		Static159.anIntArray457 = new int[local34];
		Static193.anIntArray536 = new int[local34];
		Static27.aByteArrayArray2 = new byte[local34][];
		Static12.aByteArrayArray1 = new byte[local34][];
		local34 = 0;
		for (local149 = 0; local149 < 4; local149++) {
			for (local153 = 0; local153 < 13; local153++) {
				for (local157 = 0; local157 < 13; local157++) {
					@Pc(167) int local167 = Static145.anIntArrayArrayArray12[local149][local153][local157];
					if (local167 != -1) {
						@Pc(176) int local176 = local167 >> 14 & 0x3FF;
						@Pc(182) int local182 = local167 >> 3 & 0x7FF;
						@Pc(192) int local192 = local182 / 8 + (local176 / 8 << 8);
						for (@Pc(194) int local194 = 0; local194 < local34; local194++) {
							if (Static193.anIntArray536[local194] == local192) {
								local192 = -1;
								break;
							}
						}
						if (local192 != -1) {
							@Pc(223) int local223 = local192 >> 8 & 0xFF;
							Static193.anIntArray536[local34] = local192;
							@Pc(231) int local231 = local192 & 0xFF;
							Static159.anIntArray457[local34] = Static71.aClass7_Sub1_15.method3222(Static34.method611(new Class60[] { Static10.aClass60_93, Static40.method681(local223), Static161.aClass60_1224, Static40.method681(local231) }));
							Static173.anIntArray491[local34] = Static71.aClass7_Sub1_15.method3222(Static34.method611(new Class60[] { Static83.aClass60_646, Static40.method681(local223), Static161.aClass60_1224, Static40.method681(local231) }));
							local34++;
						}
					}
				}
			}
		}
		Static70.method1281(local25, local130, local45, local21, local17);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!ai;Lclient!ai;II)Lclient!lb;")
	public static Class1_Sub1_Sub11 method1906(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int[] local10 = arg0.method3244(arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method3251(arg2, local10[local14]);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(54) byte[] local54 = arg1.method3251(local44, 0);
				if (local54 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub11(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
