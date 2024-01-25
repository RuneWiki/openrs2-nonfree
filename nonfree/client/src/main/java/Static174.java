import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt3956;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_103 = new Class88("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIIZI)V")
	public static void method3476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class12_Sub23 local20 = (Class12_Sub23) Static321.aClass68_49.method1917(local14);
		if (local20 == null) {
			local20 = new Class12_Sub23();
			Static321.aClass68_49.method1916(local20, local14);
		}
		if (arg1 >= local20.anIntArray333.length) {
			@Pc(50) int[] local50 = new int[arg1 + 1];
			@Pc(55) int[] local55 = new int[arg1 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.anIntArray333.length; local57++) {
				local50[local57] = local20.anIntArray333[local57];
				local55[local57] = local20.anIntArray334[local57];
			}
			for (@Pc(83) int local83 = local20.anIntArray333.length; local83 < arg1; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.anIntArray333 = local50;
			local20.anIntArray334 = local55;
		}
		local20.anIntArray333[arg1] = arg0;
		local20.anIntArray334[arg1] = arg4;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!daa;I)Lclient!nd;")
	public static Class12_Sub1 method3479(@OriginalArg(0) Class12_Sub8 arg0) {
		arg0.method5216();
		@Pc(13) int local13 = arg0.method5216();
		@Pc(17) Class12_Sub1 local17 = Static3.method192(local13);
		local17.anInt9406 = arg0.method5216();
		@Pc(26) int local26 = arg0.method5216();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5216();
			local17.method7794(arg0, local34);
		}
		local17.method7797();
		return local17;
	}
}
