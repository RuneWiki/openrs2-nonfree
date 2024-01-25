import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public static int anInt7260;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_177 = new Class25(15, 4);

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
	public static int anInt7267 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	public static void method5826(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static5.aClass2_Sub1_Sub14_2 != null) {
			Static360.anInt6380 = Static5.aClass2_Sub1_Sub14_2.anInt5743;
		} else {
			Static360.anInt6380 = -1;
		}
		Static415.aClass93_18 = null;
		Static382.anInt6617 = 0;
		Static463.aClass181_53 = null;
		Static5.aClass2_Sub1_Sub14_2 = null;
		Static5.method5408();
		Static5.aClass181_45.method3969();
		Static78.aClass223_1 = null;
		Static32.anInt7619 = -1;
		Static326.aClass223_6 = null;
		Static227.anInt3810 = -1;
		Static399.aClass223_8 = null;
		Static5.aClass176_3 = null;
		Static131.aClass223_2 = null;
		Static206.aClass223_3 = null;
		Static247.aClass41_11 = null;
		Static323.aClass223_5 = null;
		Static306.aClass223_4 = null;
		Static372.aClass223_7 = null;
		Static5.aClass84_4.method1954();
		Static5.aClass230_6.method5257(64, 64);
		Static5.aClass84_4.method1952(64, 128);
		Static5.aClass39_4.method752(64);
		Static371.aClass211_1.method4912(64);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method5827() {
		Static45.aBoolean34 = false;
		Static437.method5911(Static204.anInt3495, Static168.anInt6340, Static407.anInt7040, Static281.anInt4448);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Lclient!sp;")
	public static Class159 method5828() {
		try {
			return (Class159) Class.forName("Class159_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public static void method5830() {
		Static433.method5875();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static89.aClass225Array2[local8].method5185();
		}
		Static388.method5383();
		Static262.method3688();
		System.gc();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method5831(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		arg0.method5585();
		@Pc(8) int local8 = 0;
		@Pc(15) int local15;
		@Pc(42) int local42;
		for (@Pc(10) int local10 = 0; local10 < Static121.anInt2062; local10++) {
			local15 = Static311.anIntArray474[local10];
			if ((Static457.aByteArray95[local15] & 0x1) == 0) {
				if (local8 > 0) {
					local8--;
					Static457.aByteArray95[local15] = (byte) (Static457.aByteArray95[local15] | 0x2);
				} else {
					local42 = arg0.method5577(1);
					if (local42 == 0) {
						local8 = Static320.method4553(arg0);
						Static457.aByteArray95[local15] = (byte) (Static457.aByteArray95[local15] | 0x2);
					} else {
						Static210.method2978(local15, arg0);
					}
				}
			}
		}
		arg0.method5579();
		if (local8 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5585();
		@Pc(118) int local118;
		for (local15 = 0; local15 < Static121.anInt2062; local15++) {
			local42 = Static311.anIntArray474[local15];
			if ((Static457.aByteArray95[local42] & 0x1) != 0) {
				if (local8 > 0) {
					Static457.aByteArray95[local42] = (byte) (Static457.aByteArray95[local42] | 0x2);
					local8--;
				} else {
					local118 = arg0.method5577(1);
					if (local118 == 0) {
						local8 = Static320.method4553(arg0);
						Static457.aByteArray95[local42] = (byte) (Static457.aByteArray95[local42] | 0x2);
					} else {
						Static210.method2978(local42, arg0);
					}
				}
			}
		}
		arg0.method5579();
		if (local8 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5585();
		@Pc(196) int local196;
		for (local42 = 0; local42 < Static151.anInt2763; local42++) {
			local118 = Static390.anIntArray546[local42];
			if ((Static457.aByteArray95[local118] & 0x1) != 0) {
				if (local8 > 0) {
					Static457.aByteArray95[local118] = (byte) (Static457.aByteArray95[local118] | 0x2);
					local8--;
				} else {
					local196 = arg0.method5577(1);
					if (local196 == 0) {
						local8 = Static320.method4553(arg0);
						Static457.aByteArray95[local118] = (byte) (Static457.aByteArray95[local118] | 0x2);
					} else if (Static328.method4679(local118, arg0)) {
						Static457.aByteArray95[local118] = (byte) (Static457.aByteArray95[local118] | 0x2);
					}
				}
			}
		}
		arg0.method5579();
		if (local8 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5585();
		for (local118 = 0; local118 < Static151.anInt2763; local118++) {
			local196 = Static390.anIntArray546[local118];
			if ((Static457.aByteArray95[local196] & 0x1) == 0) {
				if (local8 > 0) {
					local8--;
					Static457.aByteArray95[local196] = (byte) (Static457.aByteArray95[local196] | 0x2);
				} else {
					@Pc(283) int local283 = arg0.method5577(1);
					if (local283 == 0) {
						local8 = Static320.method4553(arg0);
						Static457.aByteArray95[local196] = (byte) (Static457.aByteArray95[local196] | 0x2);
					} else if (Static328.method4679(local196, arg0)) {
						Static457.aByteArray95[local196] = (byte) (Static457.aByteArray95[local196] | 0x2);
					}
				}
			}
		}
		arg0.method5579();
		if (local8 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static151.anInt2763 = 0;
		Static121.anInt2062 = 0;
		for (local196 = 1; local196 < 2048; local196++) {
			Static457.aByteArray95[local196] = (byte) (Static457.aByteArray95[local196] >> 1);
			@Pc(349) Class11_Sub5_Sub2_Sub1 local349 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local196];
			if (local349 == null) {
				Static390.anIntArray546[Static151.anInt2763++] = local196;
			} else {
				Static311.anIntArray474[Static121.anInt2062++] = local196;
			}
		}
	}
}
