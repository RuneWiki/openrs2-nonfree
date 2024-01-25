import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
	public static int anInt2767;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBILclient!ha;)V")
	public static void method2460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class143 arg2) {
		Static322.aClass378ArrayArray1 = new Class378[arg0][arg1];
		Static96.aClass143_3 = arg2;
		if (Static287.anIntArray266 != null) {
			Static403.aClass11_3 = Static115.method1841(Static287.anIntArray266[5], Static287.anIntArray266[4], Static287.anIntArray266[1], Static287.anIntArray266[3], Static287.anIntArray266[0], Static287.anIntArray266[2]);
		}
		Static477.aClass378_4 = new Class378();
		Static237.method3381();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIZIIIIF)[I")
	public static int[] method2466(@OriginalArg(7) float arg0) {
		@Pc(14) int[] local14 = new int[2048];
		@Pc(18) Class5_Sub6_Sub13 local18 = new Class5_Sub6_Sub13();
		local18.anInt2712 = 8;
		local18.anInt2714 = 4;
		local18.anInt2704 = 8;
		local18.aBoolean188 = true;
		local18.anInt2708 = (int) (arg0 * 4096.0F);
		local18.anInt2705 = 35;
		local18.method8118();
		Static289.method3978(1, 2048);
		local18.method2419(0, local14);
		return local14;
	}
}
