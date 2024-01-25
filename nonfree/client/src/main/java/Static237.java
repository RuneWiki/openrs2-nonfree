import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	public static int anInt3889;

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
	public static int anInt3891;

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V")
	public static void method3326() {
		for (@Pc(3) int local3 = 0; local3 < Static140.anInt2578; local3++) {
			@Pc(9) int local9 = Static75.anIntArray108[local3];
			@Pc(17) Class13_Sub1_Sub1_Sub1_Sub1 local17 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) local9)).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			@Pc(21) int local21 = Static53.aClass2_Sub22_Sub2_1.method8547();
			if ((local21 & 0x2) != 0) {
				local21 += Static53.aClass2_Sub22_Sub2_1.method8547() << 8;
			}
			@Pc(47) int local47;
			@Pc(50) int[] local50;
			@Pc(53) int[] local53;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if ((local21 & 0x400) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8527();
				local50 = new int[local47];
				local53 = new int[local47];
				@Pc(56) int[] local56 = new int[local47];
				for (local58 = 0; local58 < local47; local58++) {
					local64 = Static53.aClass2_Sub22_Sub2_1.method8546();
					if (local64 == 65535) {
						local64 = -1;
					}
					local50[local58] = local64;
					local53[local58] = Static53.aClass2_Sub22_Sub2_1.method8527();
					local56[local58] = Static53.aClass2_Sub22_Sub2_1.method8546();
				}
				Static233.method3200(local56, local50, local17, local53);
			}
			if ((local21 & 0x800) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local17.anInt4599 = Static53.aClass2_Sub22_Sub2_1.method8527();
				local17.anInt4578 = Static53.aClass2_Sub22_Sub2_1.method8545();
				local17.aBoolean318 = (local47 & 0x8000) != 0;
				local17.anInt4631 = local47 & 0x7FFF;
				local17.anInt4607 = local17.anInt4599 + Static262.anInt5597 + local17.anInt4631;
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt535 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local17.anInt517 = Static53.aClass2_Sub22_Sub2_1.method8520();
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt4580 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local17.anInt4580 == 65535) {
					local17.anInt4580 = -1;
				}
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt4594 = Static53.aClass2_Sub22_Sub2_1.method8491();
				local17.anInt4590 = Static53.aClass2_Sub22_Sub2_1.method8525();
				local17.anInt4597 = Static53.aClass2_Sub22_Sub2_1.method8491();
				local17.anInt4572 = Static53.aClass2_Sub22_Sub2_1.method8548();
				local17.anInt4619 = Static53.aClass2_Sub22_Sub2_1.method8521() + Static262.anInt5597;
				local17.anInt4630 = Static53.aClass2_Sub22_Sub2_1.method8546() + Static262.anInt5597;
				local17.anInt4571 = Static53.aClass2_Sub22_Sub2_1.method8496();
				local17.anInt4572 += local17.anIntArray306[0];
				local17.anInt4637 = 0;
				local17.anInt4597 += local17.anIntArray307[0];
				local17.anInt4594 += local17.anIntArray307[0];
				local17.anInt4639 = 1;
				local17.anInt4590 += local17.anIntArray306[0];
			}
			if ((local21 & 0x200) != 0) {
				local17.aByte69 = Static53.aClass2_Sub22_Sub2_1.method8499();
				local17.aByte66 = Static53.aClass2_Sub22_Sub2_1.method8548();
				local17.aByte67 = Static53.aClass2_Sub22_Sub2_1.method8548();
				local17.aByte68 = (byte) Static53.aClass2_Sub22_Sub2_1.method8545();
				local17.anInt4577 = Static262.anInt5597 + Static53.aClass2_Sub22_Sub2_1.method8520();
				local17.anInt4618 = Static262.anInt5597 + Static53.aClass2_Sub22_Sub2_1.method8544();
			}
			@Pc(315) int local315;
			@Pc(326) int local326;
			@Pc(330) int local330;
			if ((local21 & 0x20) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local315 = Static53.aClass2_Sub22_Sub2_1.method8555();
				if (local47 == 65535) {
					local47 = -1;
				}
				local326 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local330 = local326 & 0x7;
				local58 = local326 >> 3 & 0xF;
				if (local58 == 15) {
					local58 = -1;
				}
				local17.method3965(local330, false, local47, local58, local315);
			}
			if ((local21 & 0x2000) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local50 = new int[local47];
				local53 = new int[local47];
				for (local330 = 0; local330 < local47; local330++) {
					local58 = Static53.aClass2_Sub22_Sub2_1.method8520();
					if ((local58 & 0xC000) == 49152) {
						local64 = Static53.aClass2_Sub22_Sub2_1.method8521();
						local50[local330] = local64 | local58 << 16;
					} else {
						local50[local330] = local58;
					}
					local53[local330] = Static53.aClass2_Sub22_Sub2_1.method8546();
				}
				local17.method3953(local50, local53);
			}
			if ((local21 & 0x1000) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8544();
				local315 = Static53.aClass2_Sub22_Sub2_1.method8497();
				if (local47 == 65535) {
					local47 = -1;
				}
				local326 = Static53.aClass2_Sub22_Sub2_1.method8545();
				local330 = local326 & 0x7;
				local58 = local326 >> 3 & 0xF;
				if (local58 == 15) {
					local58 = -1;
				}
				local17.method3965(local330, true, local47, local58, local315);
			}
			if ((local21 & 0x4000) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8543();
				local315 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local17.method3963(Static262.anInt5597, local47, local315);
			}
			if ((local21 & 0x80) != 0) {
				if (local17.aClass150_1.method3197()) {
					Static475.method6410(local17);
				}
				local17.method405(Static409.aClass107_2.method2291(Static53.aClass2_Sub22_Sub2_1.method8546()));
				local17.method3955(local17.aClass150_1.anInt3793);
				local17.anInt4563 = local17.aClass150_1.anInt3800 << 3;
				if (local17.aClass150_1.method3197()) {
					Static222.method3036(local17.anIntArray306[0], null, local17.aByte127, local17, local17.anIntArray307[0], 0, null);
				}
			}
			if ((local21 & 0x4) != 0) {
				@Pc(540) int[] local540 = new int[4];
				for (local315 = 0; local315 < 4; local315++) {
					local540[local315] = Static53.aClass2_Sub22_Sub2_1.method8520();
					if (local540[local315] == 65535) {
						local540[local315] = -1;
					}
				}
				local326 = Static53.aClass2_Sub22_Sub2_1.method8496();
				Static337.method7188(local17, local540, local326);
			}
			if ((local21 & 0x40) != 0) {
				local17.aString48 = Static53.aClass2_Sub22_Sub2_1.method8549();
				local17.anInt4576 = 100;
			}
			if ((local21 & 0x8) != 0) {
				local47 = Static53.aClass2_Sub22_Sub2_1.method8543();
				local315 = Static53.aClass2_Sub22_Sub2_1.method8527();
				local17.method3963(Static262.anInt5597, local47, local315);
				local17.anInt4579 = Static262.anInt5597 + 300;
				local17.anInt4568 = Static53.aClass2_Sub22_Sub2_1.method8545();
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILclient!wn;)V")
	public static void method3327(@OriginalArg(1) Class2_Sub22_Sub2 arg0) {
		arg0.method8566();
		@Pc(10) int local10 = Static528.anInt8672;
		@Pc(20) Class13_Sub1_Sub1_Sub1_Sub2 local20 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local10] = new Class13_Sub1_Sub1_Sub1_Sub2();
		local20.anInt4582 = local10;
		@Pc(28) int local28 = arg0.method8569(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local28 & 0x3FFF;
		local20.anIntArray307[0] = local39 - Static132.anInt2246;
		local20.anInt10090 = (local20.anIntArray307[0] << 9) + (local20.method3950() << 8);
		local20.anIntArray306[0] = local48 - Static123.anInt2176;
		local20.anInt10089 = (local20.anIntArray306[0] << 9) + (local20.method3950() << 8);
		Static91.anInt1705 = local20.aByte127 = local20.aByte126 = local33;
		if (Static181.method2642(local20.anIntArray306[0], local20.anIntArray307[0])) {
			local20.aByte126++;
		}
		if (Static458.aClass2_Sub22Array1[local10] != null) {
			local20.method3973(Static458.aClass2_Sub22Array1[local10]);
		}
		Static580.anInt9430 = 0;
		Static6.anIntArray9[Static580.anInt9430++] = local10;
		Static166.aByteArray29[local10] = 0;
		Static339.anInt5376 = 0;
		for (@Pc(146) int local146 = 1; local146 < 2048; local146++) {
			if (local10 != local146) {
				@Pc(160) int local160 = arg0.method8569(18);
				@Pc(164) int local164 = local160 >> 16;
				@Pc(170) int local170 = local160 >> 8 & 0xFF;
				@Pc(174) int local174 = local160 & 0xFF;
				@Pc(182) Class336 local182 = Static4.aClass336Array1[local146] = new Class336();
				local182.anInt8969 = (local170 << 14) + (local164 << 28) + local174;
				local182.anInt8972 = 0;
				local182.anInt8971 = -1;
				local182.aBoolean670 = false;
				Static113.anIntArray143[Static339.anInt5376++] = local146;
				Static166.aByteArray29[local146] = 0;
			}
		}
		arg0.method8560();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	public static void method3328() {
		if (Static540.aBoolean665) {
			return;
		}
		Static249.method3415(Static316.aClass53ArrayArrayArray3);
		if (Static253.aClass53ArrayArrayArray2 != null) {
			Static249.method3415(Static253.aClass53ArrayArrayArray2);
		}
		Static540.aBoolean665 = true;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	public static void method3329(@OriginalArg(0) int arg0) {
		Static169.anInt3003 = arg0;
		@Pc(12) Class32 local12 = Static22.aClass32_6;
		synchronized (Static22.aClass32_6) {
			Static22.aClass32_6.method640();
		}
	}
}
