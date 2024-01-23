import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt570;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!ui;")
	public static Class175 aClass175_6 = new Class175(4);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt569 = 0;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt571 = -1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[Lclient!db;")
	public static Class1_Sub5_Sub4[] aClass1_Sub5_Sub4Array2 = new Class1_Sub5_Sub4[14];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method533() {
		Static34.aClass175_7.method4294();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)[Lclient!oh;")
	public static Class57[] method534() {
		@Pc(14) Class57[] local14 = new Class57[Static48.anInt1075];
		for (@Pc(16) int local16 = 0; local16 < Static48.anInt1075; local16++) {
			if (Static71.aBoolean165) {
				local14[local16] = new Class57_Sub2(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local16], Static173.anIntArray353[local16], Static69.anIntArray119[local16], Static206.anIntArray419[local16], Static25.aByteArrayArray19[local16], Static5.anIntArray17);
			} else {
				local14[local16] = new Class57_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local16], Static173.anIntArray353[local16], Static69.anIntArray119[local16], Static206.anIntArray419[local16], Static25.aByteArrayArray19[local16], Static5.anIntArray17);
			}
		}
		Static176.method3009();
		return local14;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method535() {
		if (Static103.anInt2203 == -1 || Static236.anInt4437 == -1) {
			return;
		}
		@Pc(27) int local27 = (Static23.anInt476 * (Static99.anInt2121 - Static59.anInt1254) >> 16) + Static59.anInt1254;
		@Pc(30) float[] local30 = new float[3];
		Static23.anInt476 += local27;
		if (Static23.anInt476 >= 65535) {
			Static23.anInt476 = 65535;
			if (Static13.aBoolean25) {
				Static133.aBoolean233 = false;
			} else {
				Static133.aBoolean233 = true;
			}
			Static13.aBoolean25 = true;
		} else {
			Static13.aBoolean25 = false;
			Static133.aBoolean233 = false;
		}
		@Pc(62) float local62 = (float) Static23.anInt476 / 65535.0F;
		@Pc(66) int local66 = Static140.anInt2744 * 2;
		@Pc(103) int local103;
		@Pc(85) int local85;
		@Pc(140) int local140;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(169) int local169;
		@Pc(159) int local159;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			local85 = Static41.anIntArrayArrayArray6[Static103.anInt2203][local66 + 1][local68] * 3;
			local93 = Static41.anIntArrayArrayArray6[Static103.anInt2203][local66][local68];
			local103 = Static41.anIntArrayArrayArray6[Static103.anInt2203][local66][local68] * 3;
			local108 = local85 - local103;
			local140 = (Static41.anIntArrayArrayArray6[Static103.anInt2203][local66 + 2][local68] + Static41.anIntArrayArrayArray6[Static103.anInt2203][local66 + 2][local68] - Static41.anIntArrayArrayArray6[Static103.anInt2203][local66 + 3][local68]) * 3;
			local159 = Static41.anIntArrayArrayArray6[Static103.anInt2203][local66 + 2][local68] + local85 - local140 - local93;
			local169 = local103 + local140 - local85 * 2;
			local30[local68] = ((local62 * (float) local159 + (float) local169) * local62 + (float) local108) * local62 + (float) local93;
		}
		@Pc(200) float[] local200 = new float[3];
		Static87.anInt1875 = (int) local30[2] - Static135.anInt2659 * 128;
		Static273.anInt5035 = (int) local30[0] - Static38.anInt714 * 128;
		Static283.anInt5144 = (int) local30[1] * -1;
		local103 = Static102.anInt2179 * 2;
		for (local85 = 0; local85 < 3; local85++) {
			local140 = Static41.anIntArrayArrayArray6[Static236.anInt4437][local103][local85] * 3;
			local93 = Static41.anIntArrayArrayArray6[Static236.anInt4437][local103 + 1][local85] * 3;
			local169 = Static41.anIntArrayArrayArray6[Static236.anInt4437][local103][local85];
			local108 = (Static41.anIntArrayArrayArray6[Static236.anInt4437][local103 + 2][local85] + Static41.anIntArrayArrayArray6[Static236.anInt4437][local103 + 2][local85] - Static41.anIntArrayArrayArray6[Static236.anInt4437][local103 + 3][local85]) * 3;
			local159 = local93 - local140;
			@Pc(315) int local315 = local108 + local140 - local93 * 2;
			@Pc(333) int local333 = local93 + Static41.anIntArrayArrayArray6[Static236.anInt4437][local103 - -2][local85] - local108 - local169;
			local200[local85] = (float) local169 + local62 * ((float) local159 + local62 * ((float) local333 * local62 + (float) local315));
		}
		@Pc(365) float local365 = local200[2] - local30[2];
		@Pc(376) float local376 = -1.0F * (local200[1] - local30[1]);
		@Pc(385) float local385 = local200[0] - local30[0];
		@Pc(395) double local395 = Math.sqrt((double) (local385 * local385 + local365 * local365));
		Static241.aFloat80 = (float) Math.atan2((double) local376, local395);
		Static138.aFloat82 = -((float) Math.atan2((double) local385, (double) local365));
		Static305.anInt5484 = (int) ((double) Static138.aFloat82 * 325.949D) & 0x7FF;
		Static53.anInt1161 = (int) ((double) Static241.aFloat80 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
	public static boolean method537(@OriginalArg(0) int arg0) {
		if (Static201.anInt3953 == arg0) {
			return false;
		}
		Static287.anIntArrayArray39 = new int[104][104];
		Static291.anIntArrayArrayArray14 = new int[4][13][13];
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			Static122.aClass60Array1[local25] = new Class60(104, 104);
		}
		Static17.aByteArrayArrayArray1 = new byte[4][104][104];
		Static35.aByteArrayArrayArray2 = new byte[4][104][104];
		Static203.aClass96ArrayArrayArray5 = new Class96[4][104][104];
		if (Static71.aBoolean165) {
			Static151.method2643();
			Static15.method226();
			Static54.aClass43ArrayArray1 = new Class43[13][13];
		}
		Static201.anInt3953 = arg0;
		return true;
	}
}
