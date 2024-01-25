import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt6101;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public static int anInt6102 = 0;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method5271() {
		Static245.method4156();
		Static148.aBoolean241 = false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[[[Lclient!ds;)V")
	public static void method5272(@OriginalArg(1) Class84[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class84[][] local6 = arg0[local1];
			for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
				for (@Pc(11) int local11 = 0; local11 < local6[local8].length; local11++) {
					@Pc(18) Class84 local18 = local6[local8][local11];
					if (local18 != null) {
						if (local18.aClass16_Sub1_Sub3_1 instanceof Interface25) {
							((Interface25) local18.aClass16_Sub1_Sub3_1).method6209();
						}
						if (local18.aClass16_Sub1_Sub4_1 instanceof Interface25) {
							((Interface25) local18.aClass16_Sub1_Sub4_1).method6209();
						}
						if (local18.aClass16_Sub1_Sub4_2 instanceof Interface25) {
							((Interface25) local18.aClass16_Sub1_Sub4_2).method6209();
						}
						if (local18.aClass16_Sub1_Sub2_1 instanceof Interface25) {
							((Interface25) local18.aClass16_Sub1_Sub2_1).method6209();
						}
						if (local18.aClass16_Sub1_Sub2_2 instanceof Interface25) {
							((Interface25) local18.aClass16_Sub1_Sub2_2).method6209();
						}
						for (@Pc(68) Class333 local68 = local18.aClass333_1; local68 != null; local68 = local68.aClass333_3) {
							@Pc(72) Class16_Sub1_Sub1 local72 = local68.aClass16_Sub1_Sub1_1;
							if (local72 instanceof Interface25) {
								((Interface25) local72).method6209();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
	public static void method5273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static75.anInt8430 = arg0;
		Static631.anInt10242 = arg1;
		if (Static518.anInt8368 == 0) {
			Static137.anInt2915 = Static75.anInt8430 + Static514.anInt8278 * 2;
			Static431.anInt7666 = Static4.anInt49 * 2 + Static631.anInt10242;
		} else if (Static518.anInt8368 == 1) {
			Static259.anInt4870 = Static631.anInt10242 / Static5.anInt108 + Static211.anInt4053 + 2;
			Static294.anInt5311 = Static389.anInt6695 + Static75.anInt8430 / Static456.anInt7437 + 2;
			Static137.anInt2915 = Static456.anInt7437 * Static294.anInt5311;
			Static431.anInt7666 = Static5.anInt108 * Static259.anInt4870;
			Static514.anInt8278 = Static137.anInt2915 - Static75.anInt8430 >> 1;
			Static4.anInt49 = Static431.anInt7666 - Static631.anInt10242 >> 1;
		} else if (Static518.anInt8368 == 2) {
			Static137.anInt2915 = Static75.anInt8430;
			Static431.anInt7666 = Static631.anInt10242;
			return;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)Z")
	public static boolean method5274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static603.method8485(arg0, arg1) & Static444.method6367(arg1, arg0);
	}
}
