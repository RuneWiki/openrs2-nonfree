import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!la;")
	public static Class207 aClass207_109;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!ha;")
	public static Class133 aClass133_13;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public static int anInt8880;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "[Lclient!bg;")
	public static Class34[] aClass34Array5;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public static int anInt8885 = -1;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_8 = new Class15("LIVE", "", "", 0);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!ld;")
	public static Class115 method7654(@OriginalArg(0) Component arg0) {
		return new Class115_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!aa;ZLclient!raa;IILclient!it;II)V")
	public static void method7655(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class295 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Static254.anInt4612 == 4) {
			local21 = (int) Static311.aFloat95 & 0x3FFF;
		} else {
			local21 = Static2.anInt7 + (int) Static311.aFloat95 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg1.anInt7957 / 2, arg1.anInt7985 / 2) + 10;
		@Pc(48) int local48 = arg6 * arg6 + arg3 * arg3;
		if (local40 * local40 < local48) {
			return;
		}
		@Pc(62) int local62 = Class377.anIntArray600[local21];
		@Pc(66) int local66 = Class377.anIntArray601[local21];
		if (Static254.anInt4612 != 4) {
			local62 = local62 * 256 / (Static372.anInt6183 + 256);
			local66 = local66 * 256 / (Static372.anInt6183 + 256);
		}
		@Pc(95) int local95 = local66 * arg3 + arg6 * local62 >> 14;
		@Pc(106) int local106 = arg6 * local66 - arg3 * local62 >> 14;
		arg4.method4053(arg1.anInt7957 / 2 + arg2 + local95 - arg4.method4035() / 2, arg5 - (-(arg1.anInt7985 / 2) + local106 - -(arg4.method4042() / 2)), arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public static void method7656() {
		for (@Pc(11) int local11 = 0; local11 < Static58.anInt1145; local11++) {
			@Pc(17) int local17 = Static435.anIntArray405[local11];
			@Pc(25) Class4_Sub2_Sub1_Sub1_Sub2 local25 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) local17)).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			@Pc(29) int local29 = Static257.aClass5_Sub22_Sub1_1.method5966();
			if ((local29 & 0x40) != 0) {
				local29 += Static257.aClass5_Sub22_Sub1_1.method5966() << 8;
			}
			if ((local29 & 0x1) != 0) {
				local25.anInt1291 = Static257.aClass5_Sub22_Sub1_1.method5917();
				local25.anInt1293 = Static257.aClass5_Sub22_Sub1_1.method5917();
			}
			if ((local29 & 0x100) != 0) {
				local25.aByte37 = Static257.aClass5_Sub22_Sub1_1.method5958();
				local25.aByte39 = Static257.aClass5_Sub22_Sub1_1.method5963();
				local25.aByte40 = Static257.aClass5_Sub22_Sub1_1.method5963();
				local25.aByte41 = (byte) Static257.aClass5_Sub22_Sub1_1.method5903();
				local25.anInt1236 = Static631.anInt10493 + Static257.aClass5_Sub22_Sub1_1.method5917();
				local25.anInt1234 = Static631.anInt10493 + Static257.aClass5_Sub22_Sub1_1.method5951();
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt1209 = Static257.aClass5_Sub22_Sub1_1.method5909();
				local25.anInt1217 = Static257.aClass5_Sub22_Sub1_1.method5963();
				local25.anInt1270 = Static257.aClass5_Sub22_Sub1_1.method5958();
				local25.anInt1194 = Static257.aClass5_Sub22_Sub1_1.method5958();
				local25.anInt1237 = Static257.aClass5_Sub22_Sub1_1.method5917() + Static631.anInt10493;
				local25.anInt1249 = Static257.aClass5_Sub22_Sub1_1.method5968() + Static631.anInt10493;
				local25.anInt1254 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local25.anInt1280 = 1;
				local25.anInt1194 += local25.anIntArray95[0];
				local25.anInt1217 += local25.anIntArray95[0];
				local25.anInt1281 = 0;
				local25.anInt1270 += local25.anIntArray94[0];
				local25.anInt1209 += local25.anIntArray94[0];
			}
			@Pc(200) int local200;
			@Pc(227) int local227;
			if ((local29 & 0x20) != 0) {
				@Pc(198) int[] local198 = new int[4];
				for (local200 = 0; local200 < 4; local200++) {
					local198[local200] = Static257.aClass5_Sub22_Sub1_1.method5951();
					if (local198[local200] == 65535) {
						local198[local200] = -1;
					}
				}
				local227 = Static257.aClass5_Sub22_Sub1_1.method5966();
				Static1.method7585(local25, local227, local198);
			}
			@Pc(260) int local260;
			@Pc(266) int local266;
			@Pc(243) int local243;
			if ((local29 & 0x8) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local200 = Static257.aClass5_Sub22_Sub1_1.method5913();
				if (local243 == 65535) {
					local243 = -1;
				}
				local227 = Static257.aClass5_Sub22_Sub1_1.method5903();
				local260 = local227 & 0x7;
				local266 = local227 >> 3 & 0xF;
				if (local266 == 15) {
					local266 = -1;
				}
				local25.method1032(local200, local266, local260, local243, false);
			}
			if ((local29 & 0x1000) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5917();
				local200 = Static257.aClass5_Sub22_Sub1_1.method5916();
				if (local243 == 65535) {
					local243 = -1;
				}
				local227 = Static257.aClass5_Sub22_Sub1_1.method5903();
				local260 = local227 & 0x7;
				local266 = local227 >> 3 & 0xF;
				if (local266 == 15) {
					local266 = -1;
				}
				local25.method1032(local200, local266, local260, local243, true);
			}
			if ((local29 & 0x4) != 0) {
				if (local25.aClass225_1.method4985()) {
					Static390.method5789(local25);
				}
				local25.method1045(Static439.aClass92_2.method1914(Static257.aClass5_Sub22_Sub1_1.method5917()));
				local25.method1030(local25.aClass225_1.anInt5618);
				local25.anInt1207 = local25.aClass225_1.anInt5626 << 3;
				if (local25.aClass225_1.method4985()) {
					Static475.method7020(null, local25.aByte132, local25.anIntArray94[0], null, 0, local25, local25.anIntArray95[0]);
				}
			}
			if ((local29 & 0x4000) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5917();
				local25.anInt1219 = Static257.aClass5_Sub22_Sub1_1.method5967();
				local25.anInt1203 = Static257.aClass5_Sub22_Sub1_1.method5967();
				local25.aBoolean72 = (local243 & 0x8000) != 0;
				local25.anInt1193 = local243 & 0x7FFF;
				local25.anInt1218 = local25.anInt1193 + Static631.anInt10493 + local25.anInt1219;
			}
			@Pc(469) int local469;
			@Pc(443) int[] local443;
			@Pc(446) int[] local446;
			if ((local29 & 0x2000) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local443 = new int[local243];
				local446 = new int[local243];
				for (local260 = 0; local260 < local243; local260++) {
					local266 = Static257.aClass5_Sub22_Sub1_1.method5940();
					if ((local266 & 0xC000) == 49152) {
						local469 = Static257.aClass5_Sub22_Sub1_1.method5968();
						local443[local260] = local469 | local266 << 16;
					} else {
						local443[local260] = local266;
					}
					local446[local260] = Static257.aClass5_Sub22_Sub1_1.method5968();
				}
				local25.method1020(local443, local446);
			}
			if ((local29 & 0x80) != 0) {
				local25.aString20 = Static257.aClass5_Sub22_Sub1_1.method5937();
				local25.anInt1253 = 100;
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt1272 = Static257.aClass5_Sub22_Sub1_1.method5968();
				if (local25.anInt1272 == 65535) {
					local25.anInt1272 = -1;
				}
			}
			if ((local29 & 0x10) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5924();
				if (local243 > 0) {
					for (local200 = 0; local200 < local243; local200++) {
						local260 = -1;
						local266 = -1;
						local469 = -1;
						local227 = Static257.aClass5_Sub22_Sub1_1.method5947();
						if (local227 == 32767) {
							local227 = Static257.aClass5_Sub22_Sub1_1.method5947();
							local266 = Static257.aClass5_Sub22_Sub1_1.method5947();
							local260 = Static257.aClass5_Sub22_Sub1_1.method5947();
							local469 = Static257.aClass5_Sub22_Sub1_1.method5947();
						} else if (local227 == 32766) {
							local227 = -1;
						} else {
							local266 = Static257.aClass5_Sub22_Sub1_1.method5947();
						}
						@Pc(594) int local594 = Static257.aClass5_Sub22_Sub1_1.method5947();
						@Pc(598) int local598 = Static257.aClass5_Sub22_Sub1_1.method5966();
						local25.method1033(local227, Static631.anInt10493, local266, local260, local594, local598, local469);
					}
				}
			}
			if ((local29 & 0x400) != 0) {
				local243 = Static257.aClass5_Sub22_Sub1_1.method5967();
				local443 = new int[local243];
				local446 = new int[local243];
				@Pc(633) int[] local633 = new int[local243];
				for (local266 = 0; local266 < local243; local266++) {
					local469 = Static257.aClass5_Sub22_Sub1_1.method5968();
					if (local469 == 65535) {
						local469 = -1;
					}
					local443[local266] = local469;
					local446[local266] = Static257.aClass5_Sub22_Sub1_1.method5903();
					local633[local266] = Static257.aClass5_Sub22_Sub1_1.method5940();
				}
				Static21.method257(local25, local446, local443, local633);
			}
		}
	}
}
