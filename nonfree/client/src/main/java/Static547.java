import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tha", name = "o", descriptor = "[Lclient!gg;")
	public static Class9_Sub4[] aClass9_Sub4Array2;

	@OriginalMember(owner = "client!tha", name = "B", descriptor = "I")
	public static int anInt513;

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "I")
	public static int anInt512 = 0;

	@OriginalMember(owner = "client!tha", name = "z", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_3 = new Class73(13, 1);

	@OriginalMember(owner = "client!tha", name = "C", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_5 = new Class185(41, -1);

	@OriginalMember(owner = "client!tha", name = "D", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_3 = new Class101(11, 8);

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(IB)Z")
	public static boolean method478(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BIIII[B)V")
	public static void method479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		arg0 += arg1;
		@Pc(29) int local29 = arg2 - arg1 >> 2;
		while (true) {
			local29--;
			if (local29 < 0) {
				local29 = arg2 - arg1 & 0x3;
				while (true) {
					local29--;
					if (local29 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(34) int local34 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			arg0 = local44 + 1;
			arg3[local44] = 1;
		}
	}
}
