import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!tq;")
	public static Class191 aClass191_129;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public static int anInt3876;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt3879;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_114 = new Class119(8);

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	public static final int[] anIntArray304 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public static int anInt3877 = 0;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt3878 = -1;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_77 = new Class93("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class211 local12 = Static40.method942(arg1);
		@Pc(15) int local15 = local12.anInt6888;
		@Pc(18) int local18 = local12.anInt6893;
		@Pc(21) int local21 = local12.anInt6895;
		@Pc(28) int local28 = Class61.anIntArray237[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static24.method738(local15, Static133.anIntArray238[local15] & ~local28 | local28 & arg0 << local18);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3549(@OriginalArg(0) String arg0) {
		Static66.method1501(arg0, 0, 0, "", "");
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!ae;IBLclient!jh;)V")
	public static void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class96 arg4) {
		@Pc(8) Class182 local8 = Static77.method1775(arg4.anInt3159);
		if (local8.anInt5813 == -1) {
			return;
		}
		if (arg4.aBoolean273) {
			@Pc(26) int local26 = arg3 + arg4.anInt3118;
			arg3 = local26 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(38) Class31 local38 = local8.method5127(arg4.aBoolean275, arg2, arg3);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg4.anInt3120;
		@Pc(47) int local47 = arg4.anInt3135;
		if ((arg3 & 0x1) == 1) {
			local44 = arg4.anInt3135;
			local47 = arg4.anInt3120;
		}
		@Pc(69) int local69 = local38.method4376();
		@Pc(72) int local72 = local38.method4378();
		if (local8.aBoolean516) {
			local69 = local44 * 4;
			local72 = local47 * 4;
		}
		if (local8.anInt5811 == 0) {
			local38.method4390(arg0, arg1 - (local47 - 1) * 4, local69, local72);
		} else {
			local38.method4391(arg0, arg1 - (local47 - 1) * 4, local69, local72, 1, local8.anInt5811 | 0xFF000000, 1);
		}
	}
}
