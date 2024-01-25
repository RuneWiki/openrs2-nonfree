import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public static int anInt5338;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray40 = new boolean[200];

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_67 = new Class44(19, 8);

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "S")
	public static short aShort68 = 320;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public static int anInt5339 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIIIII)V")
	public static void method4315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(25) int local25 = arg1 - arg2 >> 2;
		arg3 += arg2;
		while (true) {
			local25--;
			if (local25 < 0) {
				local25 = arg1 - arg2 & 0x3;
				while (true) {
					local25--;
					if (local25 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(34) int local34 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local39] = 1;
			arg3 = local44 + 1;
			arg0[local44] = 1;
		}
	}
}
