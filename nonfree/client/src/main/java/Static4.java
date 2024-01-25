import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	public static int anInt80;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!wu;")
	public static final Class366 aClass366_1 = new Class366(2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B)Lclient!lc;")
	public static Class2_Sub2_Sub11 method52(@OriginalArg(1) byte[] arg0) {
		@Pc(21) Class2_Sub2_Sub11 local21 = new Class2_Sub2_Sub11();
		@Pc(26) Class2_Sub7 local26 = new Class2_Sub7(arg0);
		local26.anInt5186 = local26.aByteArray52.length - 2;
		@Pc(37) int local37 = local26.method4518();
		@Pc(47) int local47 = local26.aByteArray52.length - local37 - 2 - 12;
		local26.anInt5186 = local47;
		@Pc(54) int local54 = local26.method4509();
		local21.anInt4989 = local26.method4518();
		local21.anInt4988 = local26.method4518();
		local21.anInt4986 = local26.method4518();
		local21.anInt4985 = local26.method4518();
		@Pc(78) int local78 = local26.method4464();
		@Pc(89) int local89;
		@Pc(95) int local95;
		if (local78 > 0) {
			local21.aClass90Array1 = new Class90[local78];
			for (local89 = 0; local89 < local78; local89++) {
				local95 = local26.method4518();
				@Pc(102) Class90 local102 = new Class90(Static355.method5078(local95));
				local21.aClass90Array1[local89] = local102;
				while (local95-- > 0) {
					@Pc(113) int local113 = local26.method4509();
					@Pc(117) int local117 = local26.method4509();
					local102.method1684(new Class2_Sub44(local117), (long) local113);
				}
			}
		}
		local26.anInt5186 = 0;
		local21.aString61 = local26.method4479();
		local21.anIntArray339 = new int[local54];
		local21.anIntArray340 = new int[local54];
		local21.aStringArray26 = new String[local54];
		local89 = 0;
		while (local47 > local26.anInt5186) {
			local95 = local26.method4518();
			if (local95 == 3) {
				local21.aStringArray26[local89] = local26.method4494().intern();
			} else if (local95 >= 100 || local95 == 21 || local95 == 38 || local95 == 39) {
				local21.anIntArray339[local89] = local26.method4464();
			} else {
				local21.anIntArray339[local89] = local26.method4509();
			}
			local21.anIntArray340[local89++] = local95;
		}
		return local21;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZIII)V")
	public static void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg0 - arg6;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg4; local17 < local15; local17++) {
			Static437.method5735(arg3, Static238.anIntArrayArray36[local17], arg5, arg2);
		}
		for (@Pc(33) int local33 = arg0; local33 > local10; local33--) {
			Static437.method5735(arg3, Static238.anIntArrayArray36[local33], arg5, arg2);
		}
		@Pc(56) int local56 = arg3 + arg6;
		@Pc(61) int local61 = arg5 - arg6;
		for (@Pc(68) int local68 = local15; local68 <= local10; local68++) {
			@Pc(74) int[] local74 = Static238.anIntArrayArray36[local68];
			Static437.method5735(arg3, local74, local56, arg2);
			Static437.method5735(local56, local74, local61, arg1);
			Static437.method5735(local61, local74, arg5, arg2);
		}
	}
}
