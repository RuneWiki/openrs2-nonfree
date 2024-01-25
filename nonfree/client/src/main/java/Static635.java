import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!wu;")
	public static Class384 aClass384_137;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public static int anInt10309 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lclient!tia;")
	public static Class5_Sub4_Sub19 method8767(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub4_Sub19 local12 = (Class5_Sub4_Sub19) Static368.aClass368_2.method8528((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static416.aClass384_104.method8885(arg0, 0);
		if (local27 == null || local27.length <= 1) {
			return null;
		}
		try {
			local12 = Static407.method6233(local27);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static368.aClass368_2.method8527((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
	public static void method8768(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static210.anInt3641 = arg0;
		Static270.aClass14_Sub8Array1 = new Class14_Sub8[Static316.anIntArray398[Static210.anInt3641] + 1];
		Static362.anInt6388 = 0;
		Static214.anInt3693 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
	public static void method8769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static304.anInt4824 <= arg1 && Static231.anInt3977 >= arg1) {
			@Pc(19) int local19 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg0);
			@Pc(25) int local25 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3);
			Static267.method4042(arg1, local25, local19, arg2);
		}
	}
}
