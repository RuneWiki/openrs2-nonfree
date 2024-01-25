import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qf", name = "Ib", descriptor = "[S")
	public static short[] aShortArray98;

	@OriginalMember(owner = "client!qf", name = "Lb", descriptor = "I")
	public static int anInt5725;

	@OriginalMember(owner = "client!qf", name = "Pb", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_91 = new Class96("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "(B)V")
	public static void method4561() {
		Static223.aClass151_103.method3298();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!hh;B)V")
	public static void method4563(@OriginalArg(0) Class109 arg0) {
		Static185.aClass109_50 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
	public static int method4564(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "(I)V")
	public static void method4565() {
		for (@Pc(7) int local7 = 0; local7 < Static186.anInt3458; local7++) {
			@Pc(18) int local18 = Static295.anIntArray380[local7];
			@Pc(22) Class47_Sub1_Sub5_Sub1 local22 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local18];
			@Pc(26) int local26 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if ((local26 & 0x4) != 0) {
				local26 += Static116.aClass1_Sub14_Sub2_1.method4548() << 8;
			}
			@Pc(46) int local46;
			@Pc(50) int local50;
			if ((local26 & 0x40) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4521();
				local50 = Static116.aClass1_Sub14_Sub2_1.method4524();
				local22.method4314(Static123.anInt2333, local46, local50);
			}
			if ((local26 & 0x8) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4521();
				local50 = Static116.aClass1_Sub14_Sub2_1.method4548();
				local22.method4314(Static123.anInt2333, local46, local50);
				local22.anInt5363 = Static123.anInt2333 + 300;
				local22.anInt5377 = Static116.aClass1_Sub14_Sub2_1.method4491();
			}
			if ((local26 & 0x10) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4498();
				if (local46 == 65535) {
					local46 = -1;
				}
				local50 = Static116.aClass1_Sub14_Sub2_1.method4491();
				Static62.method950(local50, local22, local46);
			}
			if ((local26 & 0x800) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4524();
				@Pc(122) int[] local122 = new int[local46];
				@Pc(125) int[] local125 = new int[local46];
				@Pc(128) int[] local128 = new int[local46];
				for (@Pc(130) int local130 = 0; local130 < local46; local130++) {
					@Pc(136) int local136 = Static116.aClass1_Sub14_Sub2_1.method4533();
					if (local136 == 65535) {
						local136 = -1;
					}
					local122[local130] = local136;
					local125[local130] = Static116.aClass1_Sub14_Sub2_1.method4491();
					local128[local130] = Static116.aClass1_Sub14_Sub2_1.method4533();
				}
				Static282.method3883(local122, local125, local128, local22);
			}
			if ((local26 & 0x100) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4533();
				local22.anInt5417 = Static116.aClass1_Sub14_Sub2_1.method4524();
				local22.anInt5402 = Static116.aClass1_Sub14_Sub2_1.method4491();
				local22.aBoolean431 = (local46 & 0x8000) != 0;
				local22.anInt5367 = local46 & 0x7FFF;
				local22.anInt5352 = local22.anInt5367 + Static123.anInt2333 + local22.anInt5417;
			}
			if ((local26 & 0x80) != 0) {
				if (local22.aClass196_1.method4406()) {
					Static315.method4338(local22);
				}
				local22.method3157(Static268.aClass26_1.method429(Static116.aClass1_Sub14_Sub2_1.method4499()));
				local22.method4330(local22.aClass196_1.anInt5550);
				local22.anInt5404 = local22.aClass196_1.anInt5547 << 3;
				if (local22.aClass196_1.method4406()) {
					Static174.method2767(local22.aByte97, local22, local22.anIntArray407[0], null, 0, null, local22.anIntArray408[0]);
				}
			}
			if ((local26 & 0x2) != 0) {
				local22.aString64 = Static116.aClass1_Sub14_Sub2_1.method4509();
				local22.anInt5369 = 100;
			}
			if ((local26 & 0x2000) != 0) {
				local22.anInt3755 = Static116.aClass1_Sub14_Sub2_1.method4518();
				local22.anInt3752 = Static116.aClass1_Sub14_Sub2_1.method4533();
			}
			@Pc(320) int local320;
			if ((local26 & 0x400) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4533();
				if (local46 == 65535) {
					local46 = -1;
				}
				local50 = Static116.aClass1_Sub14_Sub2_1.method4528();
				local320 = Static116.aClass1_Sub14_Sub2_1.method4524();
				local22.method4318(local46, local50, local320, true);
			}
			if ((local26 & 0x1000) != 0) {
				local22.aByte75 = Static116.aClass1_Sub14_Sub2_1.method4552();
				local22.aByte74 = Static116.aClass1_Sub14_Sub2_1.method4529();
				local22.aByte76 = Static116.aClass1_Sub14_Sub2_1.method4514();
				local22.aByte77 = (byte) Static116.aClass1_Sub14_Sub2_1.method4494();
				local22.anInt5340 = Static123.anInt2333 + Static116.aClass1_Sub14_Sub2_1.method4498();
				local22.anInt5386 = Static123.anInt2333 + Static116.aClass1_Sub14_Sub2_1.method4518();
			}
			if ((local26 & 0x1) != 0) {
				local46 = Static116.aClass1_Sub14_Sub2_1.method4533();
				local50 = Static116.aClass1_Sub14_Sub2_1.method4500();
				if (local46 == 65535) {
					local46 = -1;
				}
				local320 = Static116.aClass1_Sub14_Sub2_1.method4524();
				local22.method4318(local46, local50, local320, false);
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt5378 = Static116.aClass1_Sub14_Sub2_1.method4499();
				if (local22.anInt5378 == 65535) {
					local22.anInt5378 = -1;
				}
			}
			if ((local26 & 0x200) != 0) {
				local22.anInt5394 = Static116.aClass1_Sub14_Sub2_1.method4514();
				local22.anInt5342 = Static116.aClass1_Sub14_Sub2_1.method4513();
				local22.anInt5405 = Static116.aClass1_Sub14_Sub2_1.method4529();
				local22.anInt5413 = Static116.aClass1_Sub14_Sub2_1.method4514();
				local22.anInt5344 = Static116.aClass1_Sub14_Sub2_1.method4518() + Static123.anInt2333;
				local22.anInt5380 = Static116.aClass1_Sub14_Sub2_1.method4518() + Static123.anInt2333;
				local22.anInt5355 = Static116.aClass1_Sub14_Sub2_1.method4524();
				local22.anInt5342 += local22.anIntArray408[0];
				local22.anInt5421 = 1;
				local22.anInt5394 += local22.anIntArray407[0];
				local22.anInt5420 = 0;
				local22.anInt5413 += local22.anIntArray408[0];
				local22.anInt5405 += local22.anIntArray407[0];
			}
		}
	}
}
