import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[S")
	public static short[] aShortArray31;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_18;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!ai;")
	public static Class7 aClass7_20;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	public static int[] anIntArray299 = new int[2000];

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_763 = Static200.method3116("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
	public static boolean method1760(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1761() {
		if (Static176.aClass51_2 != null) {
			@Pc(12) Class51 local12 = Static176.aClass51_2;
			synchronized (Static176.aClass51_2) {
				Static176.aClass51_2 = null;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public static void method1762(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub6_Sub1 local10;
		if (Static71.aClass1_Sub1_Sub6_1 == null) {
			local10 = new Class1_Sub1_Sub6_Sub1(512, 512);
		} else {
			local10 = (Class1_Sub1_Sub6_Sub1) Static71.aClass1_Sub1_Sub6_1;
		}
		@Pc(21) int[] local21 = local10.anIntArray366;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(58) int local58;
		@Pc(60) int local60;
		for (@Pc(47) int local47 = 1; local47 < 103; local47++) {
			local58 = (103 - local47) * 2048 + 24628;
			for (local60 = 1; local60 < 103; local60++) {
				if ((Static209.aByteArrayArrayArray13[arg0][local60][local47] & 0x18) == 0) {
					Static62.method1118(local21, local58, arg0, local60, local47);
				}
				if (arg0 < 3 && (Static209.aByteArrayArrayArray13[arg0 + 1][local60][local47] & 0x8) != 0) {
					Static62.method1118(local21, local58, arg0 + 1, local60, local47);
				}
				local58 += 4;
			}
		}
		local10.method2177();
		local58 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		local60 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(169) int local169;
		for (@Pc(165) int local165 = 1; local165 < 103; local165++) {
			for (local169 = 1; local169 < 103; local169++) {
				if ((Static209.aByteArrayArrayArray13[arg0][local169][local165] & 0x18) == 0) {
					Static88.method1518(local169, local58, arg0, local60, local165);
				}
				if (arg0 < 3 && (Static209.aByteArrayArrayArray13[arg0 + 1][local169][local165] & 0x8) != 0) {
					Static88.method1518(local169, local58, arg0 + 1, local60, local165);
				}
			}
		}
		Static29.anInt708 = 0;
		for (local169 = 0; local169 < 104; local169++) {
			for (@Pc(232) int local232 = 0; local232 < 104; local232++) {
				@Pc(239) long local239 = Static184.method2913(Static180.anInt3841, local169, local232);
				if (local239 != 0L) {
					@Pc(254) Class1_Sub1_Sub23 local254 = Static44.method760(Integer.MAX_VALUE & (int) (local239 >>> 32));
					@Pc(257) int local257 = local254.anInt4035;
					if (local257 >= 0) {
						@Pc(261) int local261 = local232;
						@Pc(263) int local263 = local169;
						if (local257 != 22 && local257 != 29 && local257 != 34 && local257 != 36 && local257 != 46 && local257 != 47 && local257 != 48) {
							@Pc(297) int[][] local297 = Static153.aClass3Array1[Static180.anInt3841].anIntArrayArray1;
							for (@Pc(299) int local299 = 0; local299 < 10; local299++) {
								@Pc(306) int local306 = (int) (Math.random() * 4.0D);
								if (local306 == 0 && local263 > 0 && local169 - 3 < local263 && (local297[local263 - 1][local261] & 0x12C0108) == 0) {
									local263--;
								}
								if (local306 == 1 && local263 < 103 && local169 + 3 > local263 && (local297[local263 + 1][local261] & 0x12C0180) == 0) {
									local263++;
								}
								if (local306 == 2 && local261 > 0 && local261 > local232 - 3 && (local297[local263][local261 - 1] & 0x12C0102) == 0) {
									local261--;
								}
								if (local306 == 3 && local261 < 103 && local261 < local232 + 3 && (local297[local263][local261 + 1] & 0x12C0120) == 0) {
									local261++;
								}
							}
						}
						Static83.anIntArray230[Static29.anInt708] = local254.anInt4033;
						Static189.anIntArray530[Static29.anInt708] = local263;
						Static17.anIntArray69[Static29.anInt708] = local261;
						Static29.anInt708++;
					}
				}
			}
		}
		Static71.aClass1_Sub1_Sub6_1 = local10;
		Static21.aClass5_1.method1979();
	}
}
