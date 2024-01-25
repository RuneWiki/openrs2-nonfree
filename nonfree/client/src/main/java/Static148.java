import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Lclient!sea;")
	public static Class308 aClass308_59;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!faa;")
	public static Class91 aClass91_6 = new Class91(8);

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!ma;")
	public static final Class216 aClass216_6 = new Class216();

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_3 = new Class4();

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_12 = new Class207(4);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	public static int method2486() {
		return 16;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZII[B)V")
	public static void method2488(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		arg2 += arg1;
		@Pc(34) int local34 = arg0 - arg1 >> 2;
		while (true) {
			local34--;
			if (local34 < 0) {
				local34 = arg0 - arg1 & 0x3;
				while (true) {
					local34--;
					if (local34 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(39) int local39 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			@Pc(49) int local49 = local44 + 1;
			arg3[local44] = 1;
			arg2 = local49 + 1;
			arg3[local49] = 1;
		}
	}
}
