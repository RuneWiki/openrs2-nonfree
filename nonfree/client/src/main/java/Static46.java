import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!fn;")
	public static Class77 aClass77_19;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	public static final int anInt930 = 1407;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public static int anInt931 = 0;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I")
	public static int method908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static212.anIntArray485[arg0 & 0x3] : Static34.anIntArray112[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public static void method910() {
		@Pc(7) int local7 = Static168.anInt3003;
		@Pc(9) int[] local9 = Static7.anIntArray24;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class12_Sub1_Sub2_Sub2 local19 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static190.method3040(local19.method4706(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZBII)V")
	public static void method911(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static123.anInt2363 == 0) {
			Static140.method5082(false);
		} else {
			Static358.anInt6274 = Static123.anInt2363;
			Static200.method3348(0);
		}
		Static119.aBoolean182 = arg1;
		Static66.anInt5488 = arg2;
		Static262.anInt2982 = arg0;
		Static302.method467(arg3);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Lclient!de;")
	public static Class22_Sub3 method912() {
		@Pc(8) Class22_Sub3 local8 = (Class22_Sub3) Static80.aClass56_3.method1256();
		if (local8 == null) {
			return new Class22_Sub3();
		} else {
			Static332.anInt5819--;
			return local8;
		}
	}
}
