import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!no;")
	public static final Class240 aClass240_10 = new Class240();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "[S")
	public static short[] aShortArray140 = new short[256];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!qaa;)V")
	public static void method7291(@OriginalArg(1) Class1_Sub35_Sub2 arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static172.anInt3031; local14++) {
			@Pc(20) int local20 = Static295.anIntArray391[local14];
			@Pc(24) Class8_Sub3_Sub3_Sub1_Sub1 local24 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local20];
			@Pc(28) int local28 = arg0.method5750();
			if ((local28 & 0x8) != 0) {
				local28 += arg0.method5750() << 8;
			}
			if ((local28 & 0x800) != 0) {
				local28 += arg0.method5750() << 16;
			}
			Static571.method7693(local20, local28, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
	public static boolean method7292(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!pu;Lclient!fa;)V")
	public static void method7293(@OriginalArg(1) Class270 arg0, @OriginalArg(2) Interface7 arg1) {
		Static71.anInterface7_2 = arg1;
		Static236.aClass270_51 = arg0;
	}
}
