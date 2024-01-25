import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pha", name = "u", descriptor = "Lclient!mba;")
	public static Class223 aClass223_42;

	@OriginalMember(owner = "client!pha", name = "y", descriptor = "[Lclient!oq;")
	public static Class272[] aClass272Array44;

	@OriginalMember(owner = "client!pha", name = "z", descriptor = "I")
	public static int anInt10709;

	@OriginalMember(owner = "client!pha", name = "n", descriptor = "Lclient!fea;")
	public static final Class112 aClass112_52 = new Class112();

	@OriginalMember(owner = "client!pha", name = "f", descriptor = "(I)V")
	public static void method8783() {
		for (@Pc(7) int local7 = 0; local7 < Static317.anInt5304; local7++) {
			@Pc(13) int local13 = Static388.anIntArray342[local7];
			@Pc(21) Class34_Sub1_Sub1_Sub2_Sub2 local21 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) local13)).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(25) int local25 = Static459.aClass3_Sub4_Sub1_1.method7954();
			if ((local25 & 0x8) != 0) {
				local25 += Static459.aClass3_Sub4_Sub1_1.method7954() << 8;
			}
			if ((local25 & 0x8000) != 0) {
				local25 += Static459.aClass3_Sub4_Sub1_1.method7954() << 16;
			}
			@Pc(66) int local66;
			@Pc(69) int[] local69;
			@Pc(72) int[] local72;
			@Pc(74) int local74;
			@Pc(80) int local80;
			@Pc(91) int local91;
			if ((local25 & 0x100) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7914();
				local69 = new int[local66];
				local72 = new int[local66];
				for (local74 = 0; local74 < local66; local74++) {
					local80 = Static459.aClass3_Sub4_Sub1_1.method7926();
					if ((local80 & 0xC000) == 49152) {
						local91 = Static459.aClass3_Sub4_Sub1_1.method7926();
						local69[local74] = local80 << 16 | local91;
					} else {
						local69[local74] = local80;
					}
					local72[local74] = Static459.aClass3_Sub4_Sub1_1.method7926();
				}
				local21.method7877(local69, local72);
			}
			if ((local25 & 0x2000) != 0) {
				local21.anInt9643 = Static459.aClass3_Sub4_Sub1_1.method7906();
				local21.anInt9656 = Static459.aClass3_Sub4_Sub1_1.method7960();
				local21.anInt9677 = Static459.aClass3_Sub4_Sub1_1.method7906();
				local21.anInt9640 = Static459.aClass3_Sub4_Sub1_1.method7903();
				local21.anInt9685 = Static459.aClass3_Sub4_Sub1_1.method7935() + Static122.anInt2190;
				local21.anInt9642 = Static459.aClass3_Sub4_Sub1_1.method7959() + Static122.anInt2190;
				local21.anInt9645 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local21.anInt9656 += local21.anIntArray528[0];
				local21.anInt9677 += local21.anIntArray529[0];
				local21.anInt9703 = 1;
				local21.anInt9705 = 0;
				local21.anInt9640 += local21.anIntArray528[0];
				local21.anInt9643 += local21.anIntArray529[0];
			}
			if ((local25 & 0x400) != 0) {
				local21.aByte137 = Static459.aClass3_Sub4_Sub1_1.method7906();
				local21.aByte135 = Static459.aClass3_Sub4_Sub1_1.method7960();
				local21.aByte136 = Static459.aClass3_Sub4_Sub1_1.method7960();
				local21.aByte138 = (byte) Static459.aClass3_Sub4_Sub1_1.method7899();
				local21.anInt9700 = Static122.anInt2190 + Static459.aClass3_Sub4_Sub1_1.method7959();
				local21.anInt9657 = Static122.anInt2190 + Static459.aClass3_Sub4_Sub1_1.method7935();
			}
			if ((local25 & 0x1000) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7914();
				local69 = new int[local66];
				local72 = new int[local66];
				@Pc(278) int[] local278 = new int[local66];
				for (local80 = 0; local80 < local66; local80++) {
					local91 = Static459.aClass3_Sub4_Sub1_1.method7935();
					if (local91 == 65535) {
						local91 = -1;
					}
					local69[local80] = local91;
					local72[local80] = Static459.aClass3_Sub4_Sub1_1.method7934();
					local278[local80] = Static459.aClass3_Sub4_Sub1_1.method7926();
				}
				Static615.method8332(local21, local278, local69, local72);
			}
			if ((local25 & 0x80000) != 0) {
				local21.anInt9726 = Static459.aClass3_Sub4_Sub1_1.method7935();
				if (local21.anInt9726 == 65535) {
					local21.anInt9726 = local21.aClass261_1.anInt6815;
				}
			}
			@Pc(419) int local419;
			@Pc(446) int local446;
			@Pc(354) int local354;
			@Pc(385) int[] local385;
			@Pc(434) short[] local434;
			@Pc(409) short[] local409;
			@Pc(473) long local473;
			if ((local25 & 0x20000) != 0) {
				local66 = local21.aClass261_1.anIntArray366.length;
				local354 = 0;
				if (local21.aClass261_1.aShortArray80 != null) {
					local354 = local21.aClass261_1.aShortArray80.length;
				}
				if (local21.aClass261_1.aShortArray81 != null) {
					local354 = local21.aClass261_1.aShortArray81.length;
				}
				local74 = Static459.aClass3_Sub4_Sub1_1.method7914();
				if ((local74 & 0x1) != 1) {
					local385 = null;
					if ((local74 & 0x2) == 2) {
						local385 = new int[local66];
						for (local91 = 0; local91 < local66; local91++) {
							local385[local91] = Static459.aClass3_Sub4_Sub1_1.method7935();
						}
					}
					local409 = null;
					if ((local74 & 0x4) == 4) {
						local409 = new short[local354];
						for (local419 = 0; local419 < local354; local419++) {
							local409[local419] = (short) Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					local434 = null;
					if ((local74 & 0x8) == 8) {
						local434 = new short[0];
						for (local446 = 0; local446 < 0; local446++) {
							local434[local446] = (short) Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					local473 = (long) local13 | (long) local21.anInt9725++ << 32;
					new Class269(local473, local385, local409, local434);
				}
			}
			if ((local25 & 0x800) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local21.anInt9659 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local21.anInt9676 = Static459.aClass3_Sub4_Sub1_1.method7914();
				local21.aBoolean675 = (local66 & 0x8000) != 0;
				local21.anInt9682 = local66 & 0x7FFF;
				local21.anInt9658 = local21.anInt9659 + Static122.anInt2190 + local21.anInt9682;
			}
			if ((local25 & 0x10000) != 0) {
				local21.aString109 = Static459.aClass3_Sub4_Sub1_1.method7922();
				if ("".equals(local21.aString109) || local21.aString109.equals(local21.aClass261_1.aString85)) {
					local21.aString109 = local21.aClass261_1.aString85;
				}
			}
			@Pc(589) int local589;
			if ((local25 & 0x1) != 0) {
				@Pc(562) int[] local562 = new int[4];
				for (local354 = 0; local354 < 4; local354++) {
					local562[local354] = Static459.aClass3_Sub4_Sub1_1.method7926();
					if (local562[local354] == 65535) {
						local562[local354] = -1;
					}
				}
				local589 = Static459.aClass3_Sub4_Sub1_1.method7899();
				Static9.method173(local21, local562, local589);
			}
			if ((local25 & 0x40) != 0) {
				local21.aString108 = Static459.aClass3_Sub4_Sub1_1.method7922();
				local21.anInt9661 = 100;
			}
			if ((local25 & 0x40000) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7935();
				if (local66 == 65535) {
					local66 = -1;
				}
				local354 = Static459.aClass3_Sub4_Sub1_1.method7929();
				local589 = Static459.aClass3_Sub4_Sub1_1.method7954();
				local74 = local589 & 0x7;
				local80 = local589 >> 3 & 0xF;
				if (local80 == 15) {
					local80 = -1;
				}
				local21.method7859(2, local74, local80, local66, local354);
			}
			if ((local25 & 0x4000) != 0) {
				local66 = local21.aClass261_1.anIntArray365.length;
				local354 = 0;
				if (local21.aClass261_1.aShortArray80 != null) {
					local354 = local21.aClass261_1.aShortArray80.length;
				}
				local589 = 0;
				if (local21.aClass261_1.aShortArray81 != null) {
					local589 = local21.aClass261_1.aShortArray81.length;
				}
				local74 = Static459.aClass3_Sub4_Sub1_1.method7899();
				if ((local74 & 0x1) == 1) {
					local21.aClass269_1 = null;
				} else {
					local385 = null;
					if ((local74 & 0x2) == 2) {
						local385 = new int[local66];
						for (local91 = 0; local91 < local66; local91++) {
							local385[local91] = Static459.aClass3_Sub4_Sub1_1.method7935();
						}
					}
					local409 = null;
					if ((local74 & 0x4) == 4) {
						local409 = new short[local354];
						for (local419 = 0; local419 < local354; local419++) {
							local409[local419] = (short) Static459.aClass3_Sub4_Sub1_1.method7959();
						}
					}
					local434 = null;
					if ((local74 & 0x8) == 8) {
						local434 = new short[local589];
						for (local446 = 0; local446 < local589; local446++) {
							local434[local446] = (short) Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					local473 = (long) local13 | (long) local21.anInt9721++ << 32;
					local21.aClass269_1 = new Class269(local473, local385, local409, local434);
				}
			}
			if ((local25 & 0x20) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7899();
				if (local66 > 0) {
					for (local354 = 0; local354 < local66; local354++) {
						local74 = -1;
						local80 = -1;
						local589 = Static459.aClass3_Sub4_Sub1_1.method7896();
						local91 = -1;
						if (local589 == 32767) {
							local589 = Static459.aClass3_Sub4_Sub1_1.method7896();
							local80 = Static459.aClass3_Sub4_Sub1_1.method7896();
							local74 = Static459.aClass3_Sub4_Sub1_1.method7896();
							local91 = Static459.aClass3_Sub4_Sub1_1.method7896();
						} else if (local589 == 32766) {
							local589 = -1;
						} else {
							local80 = Static459.aClass3_Sub4_Sub1_1.method7896();
						}
						local419 = Static459.aClass3_Sub4_Sub1_1.method7896();
						local446 = Static459.aClass3_Sub4_Sub1_1.method7914();
						local21.method7873(local589, local74, local419, Static122.anInt2190, local91, local80, local446);
					}
				}
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt9673 = Static459.aClass3_Sub4_Sub1_1.method7926();
				if (local21.anInt9673 == 65535) {
					local21.anInt9673 = -1;
				}
			}
			if ((local25 & 0x2) != 0) {
				if (local21.aClass261_1.method5767()) {
					Static487.method6426(local21);
				}
				local21.method7886(Static267.aClass196_1.method4478(Static459.aClass3_Sub4_Sub1_1.method7959()));
				local21.method7862(local21.aClass261_1.anInt6807);
				local21.anInt9639 = local21.aClass261_1.anInt6806 << 3;
				if (local21.aClass261_1.method5767()) {
					Static266.method3928(0, local21.aByte132, (Class216) null, local21.anIntArray529[0], local21, local21.anIntArray528[0], (Class34_Sub1_Sub1_Sub2_Sub1) null);
				}
			}
			if ((local25 & 0x200) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7926();
				if (local66 == 65535) {
					local66 = -1;
				}
				local354 = Static459.aClass3_Sub4_Sub1_1.method7921();
				local589 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local74 = local589 & 0x7;
				local80 = local589 >> 3 & 0xF;
				if (local80 == 15) {
					local80 = -1;
				}
				local21.method7859(1, local74, local80, local66, local354);
			}
			if ((local25 & 0x80) != 0) {
				local21.anInt9713 = Static459.aClass3_Sub4_Sub1_1.method7959();
				local21.anInt9714 = Static459.aClass3_Sub4_Sub1_1.method7959();
			}
			if ((local25 & 0x10) != 0) {
				local66 = Static459.aClass3_Sub4_Sub1_1.method7959();
				if (local66 == 65535) {
					local66 = -1;
				}
				local354 = Static459.aClass3_Sub4_Sub1_1.method7895();
				local589 = Static459.aClass3_Sub4_Sub1_1.method7899();
				local74 = local589 & 0x7;
				local80 = local589 >> 3 & 0xF;
				if (local80 == 15) {
					local80 = -1;
				}
				local21.method7859(0, local74, local80, local66, local354);
			}
		}
	}
}
