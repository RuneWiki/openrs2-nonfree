import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
	public static int anInt6243;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "Lclient!sg;")
	public static Class97 aClass97_21;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	public static int anInt6248;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
	public static int anInt6244 = 0;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	public static int anInt6246 = 0;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	public static int anInt6249 = 0;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "[Lclient!cq;")
	public static final Class43[] aClass43Array3 = new Class43[16];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static61.method917(Static240.anInt4829, arg4, Static166.anInt3315);
		@Pc(17) int local17 = Static61.method917(Static240.anInt4829, arg1, Static166.anInt3315);
		@Pc(23) int local23 = Static61.method917(Static280.anInt212, arg2, Static346.anInt6607);
		@Pc(29) int local29 = Static61.method917(Static280.anInt212, arg0, Static346.anInt6607);
		@Pc(38) int local38 = Static61.method917(Static240.anInt4829, arg4 + arg5, Static166.anInt3315);
		@Pc(47) int local47 = Static61.method917(Static240.anInt4829, arg1 - arg5, Static166.anInt3315);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static224.method5303(Static73.anIntArrayArray6[local49], local29, arg3, local23);
		}
		for (@Pc(65) int local65 = local17; local65 > local47; local65--) {
			Static224.method5303(Static73.anIntArrayArray6[local65], local29, arg3, local23);
		}
		@Pc(87) int local87 = Static61.method917(Static280.anInt212, arg2 + arg5, Static346.anInt6607);
		@Pc(96) int local96 = Static61.method917(Static280.anInt212, arg0 - arg5, Static346.anInt6607);
		for (@Pc(98) int local98 = local38; local98 <= local47; local98++) {
			@Pc(112) int[] local112 = Static73.anIntArrayArray6[local98];
			Static224.method5303(local112, local87, arg3, local23);
			Static224.method5303(local112, local96, arg6, local87);
			Static224.method5303(local112, local29, arg3, local96);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
	public static void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass67_Sub2_1 != null) {
			local7.aClass67_Sub2_1 = null;
		}
		if (local7.aClass67_Sub2_2 != null) {
			local7.aClass67_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!nq;I)V")
	public static void method5354(@OriginalArg(0) Class144 arg0) {
		Static163.anInt3076 = arg0.method3902("titlebg");
		Static58.anInt1091 = arg0.method3902("logo");
	}
}
