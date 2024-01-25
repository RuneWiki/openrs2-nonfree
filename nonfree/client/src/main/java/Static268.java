import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static final int anInt4862 = 1;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
	public static final int[] anIntArray479 = new int[8];

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
	public static final int[] anIntArray480 = new int[50];

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public static int anInt4867 = 0;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!s;")
	public static final Class217 aClass217_110 = new Class217(105, 3);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BIIII)V")
	public static void method3929(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(21) int local21 = arg2 - arg1 >> 2;
		arg3 += arg1;
		while (true) {
			local21--;
			if (local21 < 0) {
				local21 = arg2 - arg1 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(30) int local30 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local35] = 1;
			arg3 = local40 + 1;
			arg0[local40] = 1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3931(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(3, arg1);
		local8.method5345();
		local8.aString66 = arg0;
	}
}
