import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_70 = null;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_71 = Static60.method1113("Hidden)2use");

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_72 = Static60.method1113("mn");

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_75 = Static60.method1113("Please wait)3)3)3");

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_73 = aClass22_75;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_74 = Static60.method1113("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILclient!h;Z)V")
	public static void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub2_Sub2 arg4) {
		@Pc(16) int local16 = arg0 * arg0 + arg3 * arg3;
		if (local16 <= 4225 || local16 >= 90000) {
			Static114.method1819(arg2, arg1, arg3, arg4, arg0);
			return;
		}
		@Pc(41) int local41 = Static111.anInt2754 + Static23.anInt552 & 0x7FF;
		@Pc(45) int local45 = Class4_Sub1_Sub2_Sub1.anIntArray12[local41];
		@Pc(53) int local53 = local45 * 256 / (Static25.anInt574 + 256);
		@Pc(57) int local57 = Class4_Sub1_Sub2_Sub1.anIntArray9[local41];
		@Pc(65) int local65 = local57 * 256 / (Static25.anInt574 + 256);
		@Pc(75) int local75 = arg0 * local53 + arg3 * local65 >> 16;
		@Pc(86) int local86 = arg3 * local53 - arg0 * local65 >> 16;
		@Pc(92) double local92 = Math.atan2((double) local75, (double) local86);
		@Pc(98) int local98 = (int) (Math.sin(local92) * 63.0D);
		@Pc(104) int local104 = (int) (Math.cos(local92) * 57.0D);
		Static42.aClass4_Sub1_Sub2_Sub2_4.method811(arg2 + local98 + 94 - 6, -20 + 83 + arg1 + -local104, local92);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)I")
	public static int method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class4_Sub1_Sub2_Sub1.anIntArray12[arg1 * 1024 / arg0] >> 1;
		return (local15 * arg2 >> 16) + (arg3 * (65536 - local15) >> 16);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method153() {
		aClass4_Sub1_Sub2_Sub2Array4 = null;
		aClass22_73 = null;
		aClass22_75 = null;
		aClass22_74 = null;
		aClass22_70 = null;
		aClass22_71 = null;
		aClass22_72 = null;
	}
}
