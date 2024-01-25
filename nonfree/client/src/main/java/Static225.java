import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!jda", name = "B", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!jda", name = "G", descriptor = "I")
	public static int anInt4647;

	@OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
	public static int anInt4650;

	@OriginalMember(owner = "client!jda", name = "H", descriptor = "I")
	public static int anInt4648 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)Z")
	public static boolean method4015(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 4;
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(B)V")
	public static void method4017() {
		Static587.aClass6_Sub18_Sub2_3.method3293();
		Static171.anInt3648 = 1;
		Static377.aClass251_90 = null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ww;I)V")
	public static void method4018(@OriginalArg(0) Class98_Sub8 arg0) {
		arg0.aClass4_1 = null;
		@Pc(12) int local12 = arg0.aClass98_Sub5Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			arg0.aClass98_Sub5Array1[local18].aBoolean491 = false;
		}
		@Pc(32) Class40[] local32 = Class128.aClass40Array1;
		synchronized (Class128.aClass40Array1) {
			if (local12 < Class128.aClass40Array1.length && Static541.anIntArray496[local12] < 200) {
				Class128.aClass40Array1[local12].method1131(arg0);
				@Pc(55) int local55 = Static541.anIntArray496[local12]++;
			}
		}
	}
}
