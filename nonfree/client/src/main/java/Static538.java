import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!ci;")
	public static Class55 aClass55_9;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
	public static boolean aBoolean680 = false;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_13 = new Class98("", 14);

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_152 = new Class45(42, -2);

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_95 = new Class77(11, 0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg2 == arg3 && arg4 == arg5 && arg6 == arg8) {
			Static308.method4986(arg6, arg2, arg5, arg1, arg7);
			return;
		}
		@Pc(35) int local35 = arg1;
		@Pc(37) int local37 = arg2;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg2 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(61) int local61 = arg8 * 3;
		@Pc(70) int local70 = local49 + arg5 - arg1 - local57;
		@Pc(78) int local78 = local53 + arg6 - local61 - arg2;
		@Pc(86) int local86 = local41 + local57 - local49 - local49;
		@Pc(95) int local95 = local61 + local45 - local53 - local53;
		@Pc(100) int local100 = local49 - local41;
		@Pc(104) int local104 = local53 - local45;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local114 * local106 >> 12;
			@Pc(124) int local124 = local70 * local120;
			@Pc(128) int local128 = local120 * local78;
			@Pc(132) int local132 = local86 * local114;
			@Pc(136) int local136 = local114 * local95;
			@Pc(140) int local140 = local106 * local100;
			@Pc(144) int local144 = local104 * local106;
			@Pc(155) int local155 = (local132 + local124 + local140 >> 12) + arg1;
			@Pc(168) int local168 = arg2 + (local128 + local136 + local144 >> 12);
			Static308.method4986(local168, local37, local155, local35, arg7);
			local37 = local168;
			local35 = local155;
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method7929() {
		Static381.anInt7254 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static494.aClass12_Sub8Array1[local9] = null;
			Static219.aByteArray58[local9] = 1;
			Static111.aClass211Array1[local9] = null;
		}
	}
}
