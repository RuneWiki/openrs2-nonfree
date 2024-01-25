import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt10775;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
	public static final int[] anIntArray593 = new int[2048];

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_159 = new Class171(123, 10);

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_71 = new Class295(30);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8853(@OriginalArg(0) Class95 arg0) {
		if (Static318.anInt5310 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 && (Static254.aClass368ArrayArrayArray2 != null && Static510.method2861(arg0, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132))) {
			Static318.anInt5310 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method8855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg5 < 512 || arg4 < 512 || arg5 > (Static98.anInt361 - 2) * 512 || arg4 > (Static438.anInt7120 - 2) * 512) {
			Static33.anIntArray465[0] = Static33.anIntArray465[1] = -1;
			return;
		}
		@Pc(52) int local52 = Static662.method8831(arg4, arg5, arg3) - arg2;
		if (Static498.aBoolean757) {
			Static277.method4054(true);
		} else {
			Static360.aClass17_3.method6235(arg6, 0, 0);
			Static119.aClass95_4.method8037(Static360.aClass17_3);
		}
		if (Static375.aBoolean532) {
			Static119.aClass95_4.HA(arg5, local52, arg4, Static501.anInt7929, Static33.anIntArray465);
		} else {
			Static119.aClass95_4.da(arg5, local52, arg4, Static33.anIntArray465);
		}
		if (Static498.aBoolean757) {
			Static599.method6442();
		} else {
			Static360.aClass17_3.method6235(-arg6, 0, 0);
			Static119.aClass95_4.method8037(Static360.aClass17_3);
		}
	}
}
