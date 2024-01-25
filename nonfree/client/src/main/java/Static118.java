import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "[[[Lclient!jd;")
	public static Class106[][][] aClass106ArrayArrayArray1;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BC)Z")
	public static boolean method1783(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[ILclient!qa;[I[I)V")
	public static void method1784(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class67_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg3[local12];
			@Pc(26) int local26 = arg2[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg1.aClass72Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass72Array3[local28] = null;
					} else {
						@Pc(45) Class111 local45 = Static306.method5143(local18);
						@Pc(48) int local48 = local45.anInt2720;
						@Pc(53) Class72 local53 = arg1.aClass72Array3[local28];
						if (local53 != null) {
							if (local18 == local53.anInt1550) {
								if (local48 == 0) {
									local53 = arg1.aClass72Array3[local28] = null;
								} else if (local48 == 1) {
									local53.anInt1545 = 1;
									local53.anInt1549 = 0;
									local53.anInt1552 = 0;
									local53.anInt1544 = 0;
									local53.anInt1555 = local26;
									Static354.method5681(arg1.anInt6310, arg1.anInt6308, local45, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg1, 0);
								} else if (local48 == 2) {
									local53.anInt1549 = 0;
								}
							} else if (local45.anInt2716 >= Static306.method5143(local53.anInt1550).anInt2716) {
								local53 = arg1.aClass72Array3[local28] = null;
							}
						}
						if (local53 == null) {
							local53 = arg1.aClass72Array3[local28] = new Class72();
							local53.anInt1549 = 0;
							local53.anInt1545 = 1;
							local53.anInt1555 = local26;
							local53.anInt1552 = 0;
							local53.anInt1550 = local18;
							local53.anInt1544 = 0;
							Static354.method5681(arg1.anInt6310, arg1.anInt6308, local45, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg1, 0);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method1785() {
		if (Static75.aBoolean86) {
			return;
		}
		Static81.aBoolean92 = true;
		Static75.aBoolean86 = true;
		if (Static210.aBoolean290) {
			Static246.aFloat51 = (int) Static246.aFloat51 - 65 & 0xFFFFFF80;
		} else {
			Static209.aFloat44 += (-Static209.aFloat44 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method1786(@OriginalArg(0) Class129 arg0) {
		@Pc(7) int local7 = Static204.anInt4174;
		@Pc(14) int local14 = Static24.anInt452;
		@Pc(16) int local16 = Static101.anInt1790;
		@Pc(18) int local18 = Static45.anInt880;
		arg0.method4941(local7, local14, local16, -10660793, local18);
		arg0.method4941(local7 + 1, local14 + 1, local16 - 2, -16777216, 16);
		arg0.method4993(local16 - 2, local18 + -19, local7 + 1, local14 + 18, -16777216);
		Static106.aClass9_2.method3573(-1, local14 + 14, Static349.aClass117_118.method2684(Static230.anInt4634), local7 + 3, -10660793);
		@Pc(81) int local81 = Static214.aClass29_1.method384();
		@Pc(85) int local85 = Static214.aClass29_1.method381();
		@Pc(87) int local87 = 0;
		for (@Pc(92) Class11_Sub14 local92 = (Class11_Sub14) Static119.aClass16_21.method193(); local92 != null; local92 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			@Pc(106) int local106 = (Static13.anInt245 - local87 - 1) * 16 + local14 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local81 && local81 < local16 + local7 && local106 - 13 < local85 && local85 < local106 + 3) {
				local108 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static264.method4577(local92.anInt1765)) {
				local138 = Static283.method4717((int) local92.aLong67).anIntArray403;
			} else if (Static59.method900(local92.anInt1765)) {
				@Pc(193) Class67_Sub3_Sub3_Sub1 local193 = Static356.aClass67_Sub3_Sub3_Sub1Array1[(int) local92.aLong67];
				if (local193 != null) {
					local138 = local193.aClass82_1.anIntArray135;
				}
			} else if (Static53.method798(local92.anInt1765)) {
				if (local92.anInt1765 == 1003) {
					local138 = Static108.method1650((int) local92.aLong67).anIntArray145;
				} else {
					local138 = Static108.method1650((int) (local92.aLong67 >>> 32 & 0x7FFFFFFFL)).anIntArray145;
				}
			}
			@Pc(203) String local203 = Static278.method5396(local92);
			if (local138 != null) {
				local203 = local203 + Static174.method2823(local138);
			}
			local87++;
			Static106.aClass9_2.method3585(local108, Static209.aClass97Array16, local7 + 3, Static229.anIntArray350, local106, local203);
		}
		Static100.method1483(Static45.anInt880, Static24.anInt452, Static101.anInt1790, Static204.anInt4174);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public static void method1787() {
		if (Static186.anInt3761 > 0) {
			Static25.method5367();
		} else {
			Static255.aClass156_90 = Static291.aClass156_103;
			Static291.aClass156_103 = null;
			Static284.method4731(40);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!tr;")
	public static Class29 method1788(@OriginalArg(0) Component arg0) {
		return new Class29_Sub1(arg0, true);
	}
}
