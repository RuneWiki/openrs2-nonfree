import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sn", name = "J", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_36 = new Class16();

	@OriginalMember(owner = "client!sn", name = "M", descriptor = "[I")
	public static final int[] anIntArray482 = new int[13];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIIZIBI)V")
	public static void method4959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg4) {
			return;
		}
		@Pc(10) int local10 = (arg4 + arg5) / 2;
		@Pc(12) int local12 = arg4;
		@Pc(16) Class104_Sub1 local16 = Static90.aClass104_Sub1Array3[local10];
		Static90.aClass104_Sub1Array3[local10] = Static90.aClass104_Sub1Array3[arg5];
		Static90.aClass104_Sub1Array3[arg5] = local16;
		for (@Pc(28) int local28 = arg4; local28 < arg5; local28++) {
			if (Static145.method2881(arg1, Static90.aClass104_Sub1Array3[local28], arg0, arg3, arg2, local16) <= 0) {
				@Pc(48) Class104_Sub1 local48 = Static90.aClass104_Sub1Array3[local28];
				Static90.aClass104_Sub1Array3[local28] = Static90.aClass104_Sub1Array3[local12];
				Static90.aClass104_Sub1Array3[local12++] = local48;
			}
		}
		Static90.aClass104_Sub1Array3[arg5] = Static90.aClass104_Sub1Array3[local12];
		Static90.aClass104_Sub1Array3[local12] = local16;
		method4959(arg0, arg1, arg2, arg3, arg4, local12 - 1);
		method4959(arg0, arg1, arg2, arg3, local12 + 1, arg5);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V")
	public static void method4960(@OriginalArg(0) boolean arg0) {
		Static314.aBoolean592 = arg0;
		@Pc(18) int local18;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(72) int local72;
		@Pc(198) int local198;
		@Pc(202) int local202;
		if (!Static314.aBoolean592) {
			local18 = Static311.aClass1_Sub8_Sub1_8.method4532();
			@Pc(379) int local379 = Static311.aClass1_Sub8_Sub1_8.method4520();
			local33 = Static311.aClass1_Sub8_Sub1_8.method4541();
			local37 = (Static85.anInt5393 - Static311.aClass1_Sub8_Sub1_8.anInt5182) / 16;
			Static327.anIntArrayArray61 = new int[local37][4];
			for (local41 = 0; local41 < local37; local41++) {
				for (local45 = 0; local45 < 4; local45++) {
					Static327.anIntArrayArray61[local41][local45] = Static311.aClass1_Sub8_Sub1_8.method4554();
				}
			}
			local45 = Static311.aClass1_Sub8_Sub1_8.method4547();
			@Pc(434) boolean local434 = Static311.aClass1_Sub8_Sub1_8.method4536() == 1;
			local57 = Static311.aClass1_Sub8_Sub1_8.method4556();
			local61 = Static311.aClass1_Sub8_Sub1_8.method4556();
			Static169.method3380(local33);
			Static315.aByteArrayArray23 = null;
			Static145.anIntArray271 = new int[local37];
			Static261.anIntArray161 = new int[local37];
			Static318.anIntArray500 = null;
			Static8.aByteArrayArray21 = new byte[local37][];
			Static325.anIntArray507 = new int[local37];
			Static222.anIntArray416 = new int[local37];
			Static263.aByteArrayArray16 = new byte[local37][];
			Static254.anIntArray445 = new int[local37];
			Static345.aByteArrayArray25 = new byte[local37][];
			Static305.aByteArrayArray22 = new byte[local37][];
			@Pc(478) boolean local478 = false;
			if ((local61 / 8 == 48 || local61 / 8 == 49) && (local57 / 8) == 48) {
				local478 = true;
			}
			if (local61 / 8 == 48 && local57 / 8 == 148) {
				local478 = true;
			}
			local37 = 0;
			for (local72 = (local61 - (Static233.anInt5573 >> 4)) / 8; local72 <= (local61 + (Static233.anInt5573 >> 4)) / 8; local72++) {
				for (local198 = (local57 - (Static134.anInt2971 >> 4)) / 8; local198 <= ((Static134.anInt2971 >> 4) + local57) / 8; local198++) {
					local202 = local198 + (local72 << 8);
					if (local478 && (local198 == 49 || local198 == 149 || local198 == 147 || local72 == 50 || local72 == 49 && local198 == 47)) {
						Static222.anIntArray416[local37] = local202;
						Static261.anIntArray161[local37] = -1;
						Static254.anIntArray445[local37] = -1;
						Static325.anIntArray507[local37] = -1;
						Static145.anIntArray271[local37] = -1;
					} else {
						Static222.anIntArray416[local37] = local202;
						Static261.anIntArray161[local37] = Static24.aClass216_6.method5660("m" + local72 + "_" + local198);
						Static254.anIntArray445[local37] = Static24.aClass216_6.method5660("l" + local72 + "_" + local198);
						Static325.anIntArray507[local37] = Static24.aClass216_6.method5660("um" + local72 + "_" + local198);
						Static145.anIntArray271[local37] = Static24.aClass216_6.method5660("ul" + local72 + "_" + local198);
					}
					local37++;
				}
			}
			Static148.method2959(false, local379, local18, local61, local434, local45, local57);
			return;
		}
		local18 = Static311.aClass1_Sub8_Sub1_8.method4538();
		@Pc(29) boolean local29 = Static311.aClass1_Sub8_Sub1_8.method4541() == 1;
		local33 = Static311.aClass1_Sub8_Sub1_8.method4541();
		local37 = Static311.aClass1_Sub8_Sub1_8.method4547();
		local41 = Static311.aClass1_Sub8_Sub1_8.method4538();
		local45 = Static311.aClass1_Sub8_Sub1_8.method4520();
		@Pc(49) int local49 = Static311.aClass1_Sub8_Sub1_8.method4536();
		Static169.method3380(local33);
		Static311.aClass1_Sub8_Sub1_8.method3234();
		@Pc(65) int local65;
		for (local57 = 0; local57 < 4; local57++) {
			for (local61 = 0; local61 < Static233.anInt5573 >> 3; local61++) {
				for (local65 = 0; local65 < Static134.anInt2971 >> 3; local65++) {
					local72 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
					if (local72 == 1) {
						Static133.anIntArrayArrayArray8[local57][local61][local65] = Static311.aClass1_Sub8_Sub1_8.method3238(26);
					} else {
						Static133.anIntArrayArrayArray8[local57][local61][local65] = -1;
					}
				}
			}
		}
		Static311.aClass1_Sub8_Sub1_8.method3235();
		local61 = (Static85.anInt5393 - Static311.aClass1_Sub8_Sub1_8.anInt5182) / 16;
		Static327.anIntArrayArray61 = new int[local61][4];
		for (local65 = 0; local65 < local61; local65++) {
			for (local72 = 0; local72 < 4; local72++) {
				Static327.anIntArrayArray61[local65][local72] = Static311.aClass1_Sub8_Sub1_8.method4545();
			}
		}
		Static222.anIntArray416 = new int[local61];
		Static263.aByteArrayArray16 = new byte[local61][];
		Static315.aByteArrayArray23 = null;
		Static8.aByteArrayArray21 = new byte[local61][];
		Static325.anIntArray507 = new int[local61];
		Static318.anIntArray500 = null;
		Static261.anIntArray161 = new int[local61];
		Static345.aByteArrayArray25 = new byte[local61][];
		Static305.aByteArrayArray22 = new byte[local61][];
		Static145.anIntArray271 = new int[local61];
		Static254.anIntArray445 = new int[local61];
		local61 = 0;
		for (local72 = 0; local72 < 4; local72++) {
			for (local198 = 0; local198 < Static233.anInt5573 >> 3; local198++) {
				for (local202 = 0; local202 < Static134.anInt2971 >> 3; local202++) {
					@Pc(212) int local212 = Static133.anIntArrayArrayArray8[local72][local198][local202];
					if (local212 != -1) {
						@Pc(221) int local221 = local212 >> 14 & 0x3FF;
						@Pc(227) int local227 = local212 >> 3 & 0x7FF;
						@Pc(237) int local237 = local227 / 8 + (local221 / 8 << 8);
						for (@Pc(239) int local239 = 0; local239 < local61; local239++) {
							if (local237 == Static222.anIntArray416[local239]) {
								local237 = -1;
								break;
							}
						}
						if (local237 != -1) {
							Static222.anIntArray416[local61] = local237;
							@Pc(268) int local268 = local237 >> 8 & 0xFF;
							@Pc(272) int local272 = local237 & 0xFF;
							Static261.anIntArray161[local61] = Static24.aClass216_6.method5660("m" + local268 + "_" + local272);
							Static254.anIntArray445[local61] = Static24.aClass216_6.method5660("l" + local268 + "_" + local272);
							Static325.anIntArray507[local61] = Static24.aClass216_6.method5660("um" + local268 + "_" + local272);
							Static145.anIntArray271[local61] = Static24.aClass216_6.method5660("ul" + local268 + "_" + local272);
							local61++;
						}
					}
				}
			}
		}
		Static148.method2959(false, local41, local49, local37, local29, local45, local18);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIB)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static200.aByteArrayArrayArray8 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!wo;B)V")
	public static void method4963(@OriginalArg(0) Class216 arg0) {
		Static16.aClass216_3 = arg0;
	}
}
