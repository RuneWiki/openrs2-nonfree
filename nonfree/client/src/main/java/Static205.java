import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!cw;")
	public static Class61 aClass61_19;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "I")
	public static int anInt6316 = 1;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "I")
	public static int anInt6319 = 0;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "I")
	public static int anInt6320 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method5464(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(23) Class2_Sub22 local23 = new Class2_Sub22(arg1);
		@Pc(25) int local25 = -1;
		label56: while (true) {
			@Pc(29) int local29 = local23.method8533();
			if (local29 == 0) {
				return local7;
			}
			local25 += local29;
			@Pc(40) int local40 = 0;
			@Pc(42) boolean local42 = false;
			while (true) {
				@Pc(50) int local50;
				while (!local42) {
					local50 = local23.method8543();
					if (local50 == 0) {
						continue label56;
					}
					local40 += local50 - 1;
					@Pc(77) int local77 = local40 & 0x3F;
					@Pc(83) int local83 = local40 >> 6 & 0x3F;
					@Pc(89) int local89 = local23.method8547() >> 2;
					@Pc(93) int local93 = local83 + arg3;
					@Pc(97) int local97 = arg2 + local77;
					if (local93 > 0 && local97 > 0 && arg4 - 1 > local93 && local97 < arg0 - 1) {
						@Pc(119) Class191 local119 = Static319.aClass141_4.method2971(local25);
						if (local89 != 22 || Static234.aClass2_Sub5_48.aClass6_Sub4_1.method2457() != 0 || local119.anInt4828 != 0 || local119.anInt4830 == 1 || local119.aBoolean349) {
							if (!local119.method4050()) {
								local7 = false;
								Static483.anInt7695++;
							}
							local42 = true;
						}
					}
				}
				local50 = local23.method8543();
				if (local50 == 0) {
					break;
				}
				local23.method8547();
			}
		}
	}
}
