import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "Lclient!pl;")
	public static Class259 aClass259_115;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	public static int anInt6365;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "Lclient!rj;")
	public static Class287 aClass287_5;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Lclient!r;")
	public static Class100 aClass100_8;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_5 = new Class190();

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!ec;")
	public static final Class88 aClass88_11 = new Class88(4);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	public static void method5273() {
		Static565.anInt9249 = 0;
		@Pc(18) boolean local18 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
		@Pc(22) int local22 = Static133.aClass2_Sub15_Sub2_1.method4306();
		@Pc(26) int local26 = Static133.aClass2_Sub15_Sub2_1.method4291();
		@Pc(32) int local32 = Static133.aClass2_Sub15_Sub2_1.method4323();
		Static380.method5630();
		Static424.method6093(local32);
		@Pc(49) int local49 = (Static65.anInt1500 - Static133.aClass2_Sub15_Sub2_1.anInt5241) / 16;
		Static471.anIntArrayArray53 = new int[local49][4];
		@Pc(59) int local59;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static471.anIntArrayArray53[local55][local59] = Static133.aClass2_Sub15_Sub2_1.method4307();
			}
		}
		Static300.aByteArrayArray24 = new byte[local49][];
		Static135.anIntArray166 = null;
		Static585.anIntArray683 = new int[local49];
		Static529.aByteArrayArray38 = null;
		Static263.anIntArray328 = new int[local49];
		Static420.aByteArrayArray27 = new byte[local49][];
		Static296.anIntArray380 = new int[local49];
		Static234.anIntArray280 = new int[local49];
		Static394.anIntArray331 = new int[local49];
		Static266.aByteArrayArray23 = new byte[local49][];
		Static533.aByteArrayArray35 = new byte[local49][];
		local49 = 0;
		for (local59 = (local26 - (Static188.anInt3850 >> 4)) / 8; local59 <= (local26 + (Static188.anInt3850 >> 4)) / 8; local59++) {
			for (@Pc(140) int local140 = (local22 - (Static49.anInt1174 >> 4)) / 8; local140 <= ((Static49.anInt1174 >> 4) + local22) / 8; local140++) {
				Static234.anIntArray280[local49] = (local59 << 8) + local140;
				Static585.anIntArray683[local49] = Static525.aClass259_170.method5961("m" + local59 + "_" + local140);
				Static394.anIntArray331[local49] = Static525.aClass259_170.method5961("l" + local59 + "_" + local140);
				Static296.anIntArray380[local49] = Static525.aClass259_170.method5961("um" + local59 + "_" + local140);
				Static263.anIntArray328[local49] = Static525.aClass259_170.method5961("ul" + local59 + "_" + local140);
				local49++;
			}
		}
		Static277.method4190(11, local18, local26, local22);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!es;I)Lclient!qga;")
	public static Class178 method5274(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method4294();
		@Pc(14) Class62 local14 = Static92.method1451()[arg0.method4325()];
		@Pc(21) Class279 local21 = Static90.method1419()[arg0.method4325()];
		@Pc(33) int local33 = arg0.method4334();
		@Pc(37) int local37 = arg0.method4334();
		return new Class178(local7, local14, local21, local33, local37);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method5275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg4 < 1 || Static188.anInt3850 - 2 < arg3 || Static49.anInt1174 - 2 < arg4) {
			return;
		}
		@Pc(32) int local32 = arg6;
		if (arg6 < 3 && Static551.method7475(arg4, arg3)) {
			local32 = arg6 + 1;
		}
		if (!Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) && !Static199.method3279(local32, Static426.anInt7278, arg3, arg4)) {
			return;
		}
		if (Static389.aClass346ArrayArrayArray2 == null) {
			return;
		}
		Static162.aClass49_Sub1_2.method3006(arg3, Static495.aClass355Array1[arg6], arg6, arg0, arg4, Static307.aClass100_6);
		if (arg7 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static72.aClass2_Sub12_Sub1_1.aBoolean167;
		Static72.aClass2_Sub12_Sub1_1.aBoolean167 = true;
		Static162.aClass49_Sub1_2.method3013(arg2, Static495.aClass355Array1[arg6], arg5, Static307.aClass100_6, arg1, local32, arg7, arg4, arg6, arg3);
		Static72.aClass2_Sub12_Sub1_1.aBoolean167 = local76;
		return;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
	public static void method5276() {
		for (@Pc(8) int local8 = 0; local8 < Static405.anInt7060; local8++) {
			@Pc(14) int local14 = Static488.anIntArray591[local8];
			@Pc(22) Class6_Sub1_Sub1_Sub1_Sub1 local22 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) local14)).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			@Pc(26) int local26 = Static133.aClass2_Sub15_Sub2_1.method4325();
			if ((local26 & 0x80) != 0) {
				local26 += Static133.aClass2_Sub15_Sub2_1.method4325() << 8;
			}
			@Pc(49) int local49;
			if ((local26 & 0x200) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4306();
				local22.anInt7395 = Static133.aClass2_Sub15_Sub2_1.method4322();
				local22.anInt7357 = Static133.aClass2_Sub15_Sub2_1.method4322();
				local22.anInt7392 = local49 & 0x7FFF;
				local22.aBoolean571 = (local49 & 0x8000) != 0;
				local22.anInt7351 = local22.anInt7392 + Static412.anInt575 + local22.anInt7395;
			}
			@Pc(96) int local96;
			if ((local26 & 0x10) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4328();
				local96 = Static133.aClass2_Sub15_Sub2_1.method4338();
				local22.method6157(Static412.anInt575, local96, local49);
				local22.anInt7410 = Static412.anInt575 + 300;
				local22.anInt7375 = Static133.aClass2_Sub15_Sub2_1.method4323();
			}
			if ((local26 & 0x2) != 0) {
				if (local22.aClass86_1.method1577()) {
					Static121.method1779(local22);
				}
				local22.method159(Static254.aClass202_2.method4488(Static133.aClass2_Sub15_Sub2_1.method4291()));
				local22.method6156(local22.aClass86_1.anInt2152);
				local22.anInt7391 = local22.aClass86_1.anInt2155 << 3;
				if (local22.aClass86_1.method1577()) {
					Static276.method3101(null, null, 0, local22, local22.anIntArray510[0], local22.anIntArray509[0], local22.aByte112);
				}
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt7339 = Static133.aClass2_Sub15_Sub2_1.method4291();
				if (local22.anInt7339 == 65535) {
					local22.anInt7339 = -1;
				}
			}
			if ((local26 & 0x40) != 0) {
				local22.anInt269 = Static133.aClass2_Sub15_Sub2_1.method4294();
				local22.anInt277 = Static133.aClass2_Sub15_Sub2_1.method4306();
			}
			if ((local26 & 0x800) != 0) {
				local22.anInt7340 = Static133.aClass2_Sub15_Sub2_1.method4344();
				local22.anInt7397 = Static133.aClass2_Sub15_Sub2_1.method4319();
				local22.anInt7390 = Static133.aClass2_Sub15_Sub2_1.method4309();
				local22.anInt7374 = Static133.aClass2_Sub15_Sub2_1.method4304();
				local22.anInt7415 = Static133.aClass2_Sub15_Sub2_1.method4291() + Static412.anInt575;
				local22.anInt7353 = Static133.aClass2_Sub15_Sub2_1.method4291() + Static412.anInt575;
				local22.anInt7367 = Static133.aClass2_Sub15_Sub2_1.method4322();
				local22.anInt7397 += local22.anIntArray509[0];
				local22.anInt7424 = 1;
				local22.anInt7340 += local22.anIntArray510[0];
				local22.anInt7390 += local22.anIntArray510[0];
				local22.anInt7374 += local22.anIntArray509[0];
				local22.anInt7423 = 0;
			}
			if ((local26 & 0x1000) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4328();
				local96 = Static133.aClass2_Sub15_Sub2_1.method4338();
				local22.method6157(Static412.anInt575, local96, local49);
			}
			@Pc(342) int local342;
			if ((local26 & 0x100) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4343();
				local96 = Static133.aClass2_Sub15_Sub2_1.method4307();
				if (local49 == 65535) {
					local49 = -1;
				}
				local342 = Static133.aClass2_Sub15_Sub2_1.method4338();
				local22.method6159(local96, local49, local342, true);
			}
			if ((local26 & 0x1) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4291();
				local96 = Static133.aClass2_Sub15_Sub2_1.method4310();
				if (local49 == 65535) {
					local49 = -1;
				}
				local342 = Static133.aClass2_Sub15_Sub2_1.method4325();
				local22.method6159(local96, local49, local342, false);
			}
			if ((local26 & 0x400) != 0) {
				local22.aByte98 = Static133.aClass2_Sub15_Sub2_1.method4309();
				local22.aByte99 = Static133.aClass2_Sub15_Sub2_1.method4344();
				local22.aByte100 = Static133.aClass2_Sub15_Sub2_1.method4319();
				local22.aByte101 = (byte) Static133.aClass2_Sub15_Sub2_1.method4325();
				local22.anInt7417 = Static412.anInt575 + Static133.aClass2_Sub15_Sub2_1.method4306();
				local22.anInt7373 = Static412.anInt575 + Static133.aClass2_Sub15_Sub2_1.method4306();
			}
			if ((local26 & 0x2000) != 0) {
				local49 = Static133.aClass2_Sub15_Sub2_1.method4323();
				@Pc(435) int[] local435 = new int[local49];
				@Pc(438) int[] local438 = new int[local49];
				@Pc(441) int[] local441 = new int[local49];
				for (@Pc(443) int local443 = 0; local443 < local49; local443++) {
					@Pc(449) int local449 = Static133.aClass2_Sub15_Sub2_1.method4291();
					if (local449 == 65535) {
						local449 = -1;
					}
					local435[local443] = local449;
					local438[local443] = Static133.aClass2_Sub15_Sub2_1.method4323();
					local441[local443] = Static133.aClass2_Sub15_Sub2_1.method4306();
				}
				Static10.method241(local435, local438, local22, local441);
			}
			if ((local26 & 0x4) != 0) {
				@Pc(492) int[] local492 = new int[4];
				for (local96 = 0; local96 < 4; local96++) {
					local492[local96] = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (local492[local96] == 65535) {
						local492[local96] = -1;
					}
				}
				local342 = Static133.aClass2_Sub15_Sub2_1.method4323();
				Static36.method637(local492, local22, local342);
			}
			if ((local26 & 0x8) != 0) {
				local22.aString65 = Static133.aClass2_Sub15_Sub2_1.method4324();
				local22.anInt7344 = 100;
			}
		}
	}
}
