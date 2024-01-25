import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "[I")
	public static final int[] anIntArray524 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!tl;)Lclient!nc;")
	public static Class4_Sub2 method4532(@OriginalArg(1) Class4_Sub30 arg0) {
		arg0.method4864();
		@Pc(13) int local13 = arg0.method4864();
		@Pc(17) Class4_Sub2 local17 = Static447.method5735(local13);
		local17.anInt7578 = arg0.method4864();
		@Pc(26) int local26 = arg0.method4864();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method4864();
			local17.method5843(local39, arg0);
		}
		local17.method5845();
		return local17;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[I)V")
	public static void method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg2) {
			@Pc(19) int local19 = arg2 + 1;
			arg3[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg3[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg3[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg3[local49] = arg1;
			arg2 = local49 + 1;
			arg3[arg2] = arg1;
		}
		while (arg2 < local11) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}
}
