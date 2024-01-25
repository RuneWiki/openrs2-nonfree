import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public static int anInt2236;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "[I")
	public static final int[] anIntArray157 = new int[5];

	@OriginalMember(owner = "client!du", name = "y", descriptor = "I")
	public static int anInt2246 = 0;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public static void method1877() {
		if (!Static223.aBoolean310) {
			Static223.aBoolean310 = true;
			Static246.aBoolean346 = true;
			Static495.aFloat180 += (12.0F - Static495.aFloat180) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(DB)V")
	public static void method1879(@OriginalArg(0) double arg0) {
		if (Static270.aDouble11 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static283.anIntArray370[local11] = local23 <= 255 ? local23 : 255;
		}
		Static270.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!vs;IIIII)V")
	public static void method1880(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static535.anInt9275) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static544.anInt9353) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static608.anInt10072 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class97 local62 = Static272.aClass97ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static195.aClass199Array1[local17].method8532(local23, local32) + Static195.aClass199Array1[local17].method8532(local23 + 1, local32) + Static195.aClass199Array1[local17].method8532(local23, local32 + 1) + Static195.aClass199Array1[local17].method8532(local23 + 1, local32 + 1)) / 4 - (Static195.aClass199Array1[arg1].method8532(arg2, arg3) + Static195.aClass199Array1[arg1].method8532(arg2 + 1, arg3) + Static195.aClass199Array1[arg1].method8532(arg2, arg3 + 1) + Static195.aClass199Array1[arg1].method8532(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class20_Sub2_Sub1 local151 = local62.aClass20_Sub2_Sub1_1;
									@Pc(154) Class20_Sub2_Sub1 local154 = local62.aClass20_Sub2_Sub1_2;
									if (local151 != null && local151.method9011()) {
										arg0.method9018(local151, local1, local148, Static565.aClass100_15, (local32 - arg3) * Static246.anInt4917 + (1 - arg5) * Static557.anInt9470, (local23 - arg2) * Static246.anInt4917 + (1 - arg4) * Static557.anInt9470);
									}
									if (local154 != null && local154.method9011()) {
										arg0.method9018(local154, local1, local148, Static565.aClass100_15, (local32 - arg3) * Static246.anInt4917 + (1 - arg5) * Static557.anInt9470, (local23 - arg2) * Static246.anInt4917 + (1 - arg4) * Static557.anInt9470);
									}
									for (@Pc(227) Class196 local227 = local62.aClass196_2; local227 != null; local227 = local227.aClass196_3) {
										@Pc(231) Class20_Sub2_Sub2 local231 = local227.aClass20_Sub2_Sub2_1;
										if (local231 != null && local231.method9011() && (local23 == local231.aShort124 || local23 == local3) && (local32 == local231.aShort123 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort125 + 1 - local231.aShort124;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort123;
											arg0.method9018(local231, local1, local148, Static565.aClass100_15, (local231.aShort123 - arg3) * Static246.anInt4917 + (local268 - arg5) * Static557.anInt9470, (local231.aShort124 - arg2) * Static246.anInt4917 + (local260 - arg4) * Static557.anInt9470);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Lclient!gt;")
	public static Class20_Sub5 method1881() {
		@Pc(8) Class20_Sub5 local8 = (Class20_Sub5) Static403.aClass81_7.method2127();
		if (local8 == null) {
			return new Class20_Sub5();
		} else {
			Static600.anInt10017--;
			return local8;
		}
	}
}
