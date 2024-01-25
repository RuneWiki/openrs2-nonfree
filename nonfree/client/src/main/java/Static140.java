import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	public static int anInt4804;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!nb;")
	public static final Class232 aClass232_11 = new Class232("WTI", 5);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method4030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static5.method80(arg1 + 91923, arg0 - -45365, 4) + (Static5.method80(arg1 + 37821, arg0 + 10294, 2) + -128 >> 1) + (Static5.method80(arg1, arg0, 1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!caa;IIIII)V")
	public static void method4034(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static450.anInt7223) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static83.anInt1434) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static405.anInt6657 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class228 local62 = Static469.aClass228ArrayArrayArray6[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static114.aClass151Array1[local17].method7676(local32, local23) + Static114.aClass151Array1[local17].method7676(local32, local23 + 1) + Static114.aClass151Array1[local17].method7676(local32 + 1, local23) + Static114.aClass151Array1[local17].method7676(local32 + 1, local23 + 1)) / 4 - (Static114.aClass151Array1[arg1].method7676(arg3, arg2) + Static114.aClass151Array1[arg1].method7676(arg3, arg2 + 1) + Static114.aClass151Array1[arg1].method7676(arg3 + 1, arg2) + Static114.aClass151Array1[arg1].method7676(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class12_Sub2_Sub5 local151 = local62.aClass12_Sub2_Sub5_1;
									@Pc(154) Class12_Sub2_Sub5 local154 = local62.aClass12_Sub2_Sub5_2;
									if (local151 != null && local151.method7510()) {
										arg0.method7507(local148, Static337.aClass162_13, (local23 - arg2) * Static481.anInt7681 + (1 - arg4) * Static437.anInt7021, local151, local1, (local32 - arg3) * Static481.anInt7681 + (1 - arg5) * Static437.anInt7021);
									}
									if (local154 != null && local154.method7510()) {
										arg0.method7507(local148, Static337.aClass162_13, (local23 - arg2) * Static481.anInt7681 + (1 - arg4) * Static437.anInt7021, local154, local1, (local32 - arg3) * Static481.anInt7681 + (1 - arg5) * Static437.anInt7021);
									}
									for (@Pc(227) Class180 local227 = local62.aClass180_3; local227 != null; local227 = local227.aClass180_2) {
										@Pc(231) Class12_Sub2_Sub1 local231 = local227.aClass12_Sub2_Sub1_1;
										if (local231 != null && local231.method7510() && (local23 == local231.aShort120 || local23 == local3) && (local32 == local231.aShort121 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort119 + 1 - local231.aShort120;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort121;
											arg0.method7507(local148, Static337.aClass162_13, (local231.aShort120 - arg2) * Static481.anInt7681 + (local260 - arg4) * Static437.anInt7021, local231, local1, (local231.aShort121 - arg3) * Static481.anInt7681 + (local268 - arg5) * Static437.anInt7021);
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
}
