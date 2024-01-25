import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	public static int anInt3354;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!rn;")
	public static Class11_Sub34 aClass11_Sub34_1 = null;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
	public static int anInt3356 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!uo;Lclient!rr;IIIII)V")
	public static void method2769(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static279.anInt5583) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static232.anInt4703) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static300.anInt5931 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class106 local62 = Static212.aClass106ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static108.aClass77Array2[local17].method4122(local23, local32) + Static108.aClass77Array2[local17].method4122(local23 + 1, local32) + Static108.aClass77Array2[local17].method4122(local23, local32 + 1) + Static108.aClass77Array2[local17].method4122(local23 + 1, local32 + 1)) / 4 - (Static108.aClass77Array2[arg2].method4122(arg3, arg4) + Static108.aClass77Array2[arg2].method4122(arg3 + 1, arg4) + Static108.aClass77Array2[arg2].method4122(arg3, arg4 + 1) + Static108.aClass77Array2[arg2].method4122(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class67_Sub2 local143 = local62.aClass67_Sub2_1;
									@Pc(146) Class67_Sub2 local146 = local62.aClass67_Sub2_2;
									if (local143 != null && local143.method5399()) {
										arg1.method5398((local32 - arg4) * 128 + (1 - arg6) * 64, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local143, arg0, local1);
									}
									if (local146 != null && local146.method5399()) {
										arg1.method5398((local32 - arg4) * 128 + (1 - arg6) * 64, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local146, arg0, local1);
									}
									for (@Pc(219) Class64 local219 = local62.aClass64_4; local219 != null; local219 = local219.aClass64_2) {
										@Pc(223) Class67_Sub3 local223 = local219.aClass67_Sub3_1;
										if (local223 != null && local223.method5399() && (local23 == local223.aShort91 || local23 == local3) && (local32 == local223.aShort90 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort93 + 1 - local223.aShort91;
											@Pc(260) int local260 = local223.aShort92 + 1 - local223.aShort90;
											arg1.method5398((local223.aShort90 - arg4) * 128 + (local260 - arg6) * 64, local140, (local223.aShort91 - arg3) * 128 + (local252 - arg5) * 64, local223, arg0, local1);
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

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method2770(@OriginalArg(0) Class129 arg0) {
		if (Static322.anInt6250 != Static91.anInt1786 && (Static212.aClass106ArrayArrayArray2 != null && Static310.method5248(arg0, Static322.anInt6250))) {
			Static91.anInt1786 = Static322.anInt6250;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BIZIZ)Lclient!nq;")
	public static Class144 method2772(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class171 local10 = null;
		if (Static101.aClass69_3 != null) {
			local10 = new Class171(arg0, Static101.aClass69_3, Static157.aClass69Array1[arg0], 1000000);
		}
		Static350.aClass138_Sub1Array2[arg0] = Static112.aClass127_1.method3187(local10, arg0, Static356.aClass171_4);
		if (arg1) {
			Static350.aClass138_Sub1Array2[arg0].method3699();
		}
		return new Class144(Static350.aClass138_Sub1Array2[arg0], arg2, 1);
	}
}
