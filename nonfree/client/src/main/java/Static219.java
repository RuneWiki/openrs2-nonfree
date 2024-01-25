import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!ir;")
	public static Class110 aClass110_4;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!nl;B)Lclient!fl;")
	public static Class2_Sub10_Sub8 method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg2.method3745(arg1, arg0));
		@Pc(49) Class2_Sub10_Sub8 local49 = new Class2_Sub10_Sub8(arg0, local14.method5364(), local14.method5364(), local14.method5346(), local14.method5346(), local14.method5350() == 1, local14.method5350(), local14.method5350());
		@Pc(53) int local53 = local14.method5350();
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local49.aClass30_6.method685(new Class2_Sub31(local14.method5350(), local14.method5312(), local14.method5312(), local14.method5312(), local14.method5312(), local14.method5312(), local14.method5312(), local14.method5312(), local14.method5312()));
		}
		local49.method1864();
		return local49;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
	public static void method3624(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static214.method3575(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZIIII)V")
	public static void method3626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static131.anInt2701 = arg3;
		Static296.anInt5089 = arg2;
		Static177.anInt3412 = arg0;
		Static111.anInt2355 = arg4;
		Static139.anInt2784 = arg1;
		if (Static131.anInt2701 >= 100) {
			@Pc(28) int local28 = Static139.anInt2784 * 128 + 64;
			@Pc(34) int local34 = Static296.anInt5089 * 128 + 64;
			@Pc(42) int local42 = Static170.method3006(local28, local34, Static382.anInt6523) - Static177.anInt3412;
			@Pc(47) int local47 = local28 - Static224.anInt4006;
			@Pc(51) int local51 = local42 - Static285.anInt4940;
			@Pc(56) int local56 = local34 - Static51.anInt1057;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local47 * local47));
			Static14.anInt360 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static235.anInt4191 = (int) (-2607.5945876176133D * Math.atan2((double) local47, (double) local56)) & 0x3FFF;
			if (Static14.anInt360 < 1024) {
				Static14.anInt360 = 1024;
			}
			Static288.anInt5007 = 0;
			if (Static14.anInt360 > 3072) {
				Static14.anInt360 = 3072;
			}
		}
		Static79.anInt4624 = 2;
	}
}
