import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public static final int anInt2422 = Static214.method3192(1600);

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
	public static final int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "[I")
	public static final int[] anIntArray161 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!gda;IIIII)V")
	public static void method2328(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static539.anInt8345) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static51.anInt1108) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static245.anInt7888 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class73 local62 = Static267.aClass73ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static140.aClass42Array4[local17].method7450(local32, local23) + Static140.aClass42Array4[local17].method7450(local32, local23 + 1) + Static140.aClass42Array4[local17].method7450(local32 + 1, local23) + Static140.aClass42Array4[local17].method7450(local32 + 1, local23 + 1)) / 4 - (Static140.aClass42Array4[arg1].method7450(arg3, arg2) + Static140.aClass42Array4[arg1].method7450(arg3, arg2 + 1) + Static140.aClass42Array4[arg1].method7450(arg3 + 1, arg2) + Static140.aClass42Array4[arg1].method7450(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class3_Sub1_Sub4 local151 = local62.aClass3_Sub1_Sub4_1;
									@Pc(154) Class3_Sub1_Sub4 local154 = local62.aClass3_Sub1_Sub4_2;
									if (local151 != null && local151.method8505()) {
										arg0.method8491(local151, Static246.aClass33_6, (local32 - arg3) * Static63.anInt1356 + (1 - arg5) * Static85.anInt1770, local148, local1, (local23 - arg2) * Static63.anInt1356 + (1 - arg4) * Static85.anInt1770);
									}
									if (local154 != null && local154.method8505()) {
										arg0.method8491(local154, Static246.aClass33_6, (local32 - arg3) * Static63.anInt1356 + (1 - arg5) * Static85.anInt1770, local148, local1, (local23 - arg2) * Static63.anInt1356 + (1 - arg4) * Static85.anInt1770);
									}
									for (@Pc(227) Class144 local227 = local62.aClass144_1; local227 != null; local227 = local227.aClass144_2) {
										@Pc(231) Class3_Sub1_Sub2 local231 = local227.aClass3_Sub1_Sub2_1;
										if (local231 != null && local231.method8505() && (local23 == local231.aShort124 || local23 == local3) && (local32 == local231.aShort125 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort123 + 1 - local231.aShort124;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort125;
											arg0.method8491(local231, Static246.aClass33_6, (local231.aShort125 - arg3) * Static63.anInt1356 + (local268 - arg5) * Static85.anInt1770, local148, local1, (local231.aShort124 - arg2) * Static63.anInt1356 + (local260 - arg4) * Static85.anInt1770);
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
