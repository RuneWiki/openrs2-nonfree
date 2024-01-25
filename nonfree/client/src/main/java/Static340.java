import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
	public static int anInt6247;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "Lclient!ek;")
	public static final Class94 aClass94_5 = new Class94();

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "[I")
	public static int[] anIntArray413 = null;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public static void method5228() {
		Static104.aClass97_26.anInt3014 = 1;
		Static22.method8509();
		Static540.aBoolean661 = true;
		Static94.aBoolean158 = true;
		Static102.method7316();
		for (@Pc(8102) int local8102 = 0; local8102 < Static388.aClass60Array1.length; local8102++) {
			Static388.aClass60Array1[local8102] = null;
		}
		Static301.aBoolean423 = false;
		Static188.method3423();
		Static477.anInt8153 = (int) (Math.random() * 100.0D) - 50;
		Static574.anInt9439 = (int) (Math.random() * 110.0D) - 55;
		Static378.aFloat160 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static479.anInt9936 = (int) (Math.random() * 80.0D) - 40;
		Static415.anInt7576 = (int) (Math.random() * 120.0D) - 60;
		Static30.anInt6668 = (int) (Math.random() * 30.0D) - 20;
		Static448.method6633();
		for (@Pc(8167) int local8167 = 0; local8167 < 2048; local8167++) {
			Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local8167] = null;
		}
		Static228.anInt4647 = 0;
		Static225.anInt4616 = 0;
		Static357.aClass222_23.method5469();
		Static280.aClass238_29.method5841();
		Static147.aClass238_25.method5841();
		Static18.aClass143_1.method3537();
		Static64.aClass222_5.method5469();
		Static234.aClass238_27 = new Class238();
		Static438.aClass198_1.method4753();
		Static617.method8395();
		Static307.anInt5655 = 0;
		Static189.anInt4149 = 0;
		Static597.anInt9840 = 0;
		Static259.anInt5081 = 0;
		Static556.anInt9172 = 0;
		Static126.anInt2936 = 0;
		Static531.anInt8872 = 0;
		Static299.anInt5573 = 0;
		Static458.anInt7979 = 0;
		Static244.anInt4842 = 0;
		for (@Pc(8226) int local8226 = 0; local8226 < Static608.anIntArray246.length; local8226++) {
			if (!Static276.aBooleanArray33[local8226]) {
				Static608.anIntArray246[local8226] = -1;
			}
		}
		if (Static387.anInt6978 != -1) {
			Static535.method7477(Static387.anInt6978);
		}
		for (@Pc(8256) Class2_Sub37 local8256 = (Class2_Sub37) Static206.aClass222_14.method5474(); local8256 != null; local8256 = (Class2_Sub37) Static206.aClass222_14.method5472()) {
			if (!local8256.method8600()) {
				local8256 = (Class2_Sub37) Static206.aClass222_14.method5474();
				if (local8256 == null) {
					break;
				}
			}
			Static450.method4870(local8256, true, false);
		}
		Static387.anInt6978 = -1;
		Static206.aClass222_14 = new Class222(8);
		Static588.method8118();
		Static97.aClass78_2 = null;
		for (@Pc(8294) int local8294 = 0; local8294 < 8; local8294++) {
			Static182.aStringArray10[local8294] = null;
			Static433.aBooleanArray39[local8294] = false;
			Static117.anIntArray202[local8294] = -1;
		}
		Static389.method5848();
		Static631.aBoolean749 = true;
		for (@Pc(8317) int local8317 = 0; local8317 < 100; local8317++) {
			Static618.aBooleanArray50[local8317] = true;
		}
		for (@Pc(8330) int local8330 = 0; local8330 < 6; local8330++) {
			Static470.aClass37Array1[local8330] = new Class37();
		}
		for (@Pc(8343) int local8343 = 0; local8343 < 25; local8343++) {
			Static459.anIntArray583[local8343] = 0;
			Static206.anIntArray296[local8343] = 0;
			Static516.anIntArray594[local8343] = 0;
		}
		Static57.method1058();
		Static239.aShortArray108 = Static591.aShortArray146 = Static268.aShortArray59 = Static397.aShortArray93 = new short[256];
		Static620.aBoolean745 = true;
		Static256.aString51 = Static628.aClass369_26.method8475(Static377.anInt6756);
		Static404.aClass2_Sub13_2.method1383(Static404.aClass2_Sub13_2.aClass33_Sub10_2.method4036(), Static404.aClass2_Sub13_2.aClass33_Sub10_1);
		Static404.aClass2_Sub13_2.method1383(Static404.aClass2_Sub13_2.aClass33_Sub26_2.method8294(), Static404.aClass2_Sub13_2.aClass33_Sub26_1);
		Static43.anInt967 = 0;
		Static448.method6632();
		Static501.method7137();
		Static308.aLong166 = 0L;
		Static442.aClass2_Sub35_1 = null;
		Static104.aClass97_26.anInt3014 = 2;
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(II)Z")
	public static boolean method5229(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class2_Sub5_Sub20 local15 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local15 != null; local15 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
			if (Static539.method7533(local15.anInt10077) && (long) arg0 == local15.aLong278) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(II)V")
	public static void method5230(@OriginalArg(0) int arg0) {
		Static476.anInt8134 = arg0;
		Static526.aClass233_52.method5663();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!eq;Lclient!eq;[II)V")
	public static void method5231(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int[] arg2) {
		Static40.aClass97_5 = arg1;
		Static51.aClass97_7 = arg0;
		if (arg2 != null) {
			anIntArray413 = arg2;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)I")
	public static int method5233(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(18) int local18 = (arg0 & 0x7F) * 96 >> 7;
		if (local18 < 2) {
			local18 = 2;
		} else if (local18 > 126) {
			local18 = 126;
		}
		return (arg0 & 0xFF80) + local18;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)I")
	public static int method5235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
