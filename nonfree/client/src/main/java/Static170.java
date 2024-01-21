import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!wd;")
	public static Class97 aClass97_12;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2243 = Static118.method2249("Clientscript error in: ");

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray36 = new byte[250][];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!wd;II)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2) {
		if (Static195.aClass97_13 != null || Static198.aBoolean168 || (arg1 == null || Static158.method2744(arg1) == null)) {
			return;
		}
		Static195.aClass97_13 = arg1;
		Static57.aClass97_5 = Static158.method2744(arg1);
		Static2.anInt66 = arg0;
		Static28.anInt855 = 0;
		Static166.aBoolean150 = false;
		Static28.anInt854 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = 2048 - arg2 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg3 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(25) int local25 = arg5;
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (local6 != 0) {
			local33 = Class1_Sub2_Sub5_Sub2.anIntArray138[local6];
			local37 = Class1_Sub2_Sub5_Sub2.anIntArray142[local6];
			local47 = local37 * 0 - arg5 * local33 >> 16;
			local25 = local37 * arg5 + local33 * 0 >> 16;
			local27 = local47;
		}
		if (local17 != 0) {
			local37 = Class1_Sub2_Sub5_Sub2.anIntArray142[local17];
			local33 = Class1_Sub2_Sub5_Sub2.anIntArray138[local17];
			local47 = local37 * 0 + local33 * local25 >> 16;
			local25 = local37 * local25 - local33 * 0 >> 16;
			local19 = local47;
		}
		Static126.anInt3116 = arg3;
		Static78.anInt1919 = arg0 - local19;
		Static34.anInt999 = arg2;
		Static160.anInt2779 = arg4 - local25;
		Static97.anInt2437 = arg1 - local27;
	}
}
