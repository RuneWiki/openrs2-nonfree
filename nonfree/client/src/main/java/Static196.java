import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt7580;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!db;")
	public static Class4_Sub7_Sub2 aClass4_Sub7_Sub2_6;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!iu;")
	public static final Class4_Sub20_Sub1 aClass4_Sub20_Sub1_4 = new Class4_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	public static final int anInt7585 = 52;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt7589 = 0;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_97 = new Class212(49, 12);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;Lclient!ee;IIIII)V")
	public static void method6074(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static227.anInt4511) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static230.anInt4581) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static268.anInt5106 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class162 local62 = Static294.aClass162ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static389.aClass14Array3[local17].oa(local23, local32) + Static389.aClass14Array3[local17].oa(local23 + 1, local32) + Static389.aClass14Array3[local17].oa(local23, local32 + 1) + Static389.aClass14Array3[local17].oa(local23 + 1, local32 + 1)) / 4 - (Static389.aClass14Array3[arg2].oa(arg3, arg4) + Static389.aClass14Array3[arg2].oa(arg3 + 1, arg4) + Static389.aClass14Array3[arg2].oa(arg3, arg4 + 1) + Static389.aClass14Array3[arg2].oa(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub2 local143 = local62.aClass11_Sub2_2;
									@Pc(146) Class11_Sub2 local146 = local62.aClass11_Sub2_1;
									if (local143 != null && local143.method6301()) {
										arg1.method6306(local140, (local32 - arg4) * Static223.anInt4452 + (1 - arg6) * Static423.anInt7318, (local23 - arg3) * Static223.anInt4452 + (1 - arg5) * Static423.anInt7318, arg0, local143, local1);
									}
									if (local146 != null && local146.method6301()) {
										arg1.method6306(local140, (local32 - arg4) * Static223.anInt4452 + (1 - arg6) * Static423.anInt7318, (local23 - arg3) * Static223.anInt4452 + (1 - arg5) * Static423.anInt7318, arg0, local146, local1);
									}
									for (@Pc(219) Class199 local219 = local62.aClass199_1; local219 != null; local219 = local219.aClass199_2) {
										@Pc(223) Class11_Sub5 local223 = local219.aClass11_Sub5_1;
										if (local223 != null && local223.method6301() && (local23 == local223.aShort95 || local23 == local3) && (local32 == local223.aShort93 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort94 + 1 - local223.aShort95;
											@Pc(260) int local260 = local223.aShort92 + 1 - local223.aShort93;
											arg1.method6306(local140, (local223.aShort93 - arg4) * Static223.anInt4452 + (local260 - arg6) * Static423.anInt7318, (local223.aShort95 - arg3) * Static223.anInt4452 + (local252 - arg5) * Static423.anInt7318, arg0, local223, local1);
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

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;BLclient!wn;)I")
	public static int method6081(@OriginalArg(0) String arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		@Pc(6) int local6 = arg1.anInt5526;
		@Pc(10) byte[] local10 = Static52.method1152(arg0);
		arg1.method4609(local10.length);
		arg1.anInt5526 += Static13.aClass147_1.method3890(local10, arg1.aByteArray77, arg1.anInt5526, local10.length, 0);
		return arg1.anInt5526 - local6;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
	public static void method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static162.anInt1715 && Static55.anInt1319 >= arg3) {
			@Pc(24) int local24 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg2);
			@Pc(30) int local30 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0);
			Static154.method2868(local24, local30, arg3, arg1);
		}
	}
}
