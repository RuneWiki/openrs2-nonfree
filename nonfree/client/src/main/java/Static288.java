import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public static int anInt4931;

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "Lclient!r;")
	public static Class45 aClass45_9;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	public static void method4269() {
		for (@Pc(7) int local7 = 0; local7 < Static88.anInt1884; local7++) {
			@Pc(13) int local13 = Static445.anIntArray470[local7];
			@Pc(20) Class3_Sub34 local20 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local13);
			if (local20 != null) {
				@Pc(25) Class41_Sub2_Sub1_Sub4_Sub1 local25 = local20.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				Static333.method4751(local25.aClass264_1.anInt7163, local25);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZ)V")
	public static void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static60.anInt1312 == 0) {
			Static314.method4613(false);
		} else {
			Static177.anInt3457 = Static60.anInt1312;
			Static486.method6610(0);
		}
		Static586.anInt2133 = arg2;
		Static386.anInt6814 = arg0;
		Static182.aBoolean271 = arg3;
		Static44.method7648(arg1);
	}
}
