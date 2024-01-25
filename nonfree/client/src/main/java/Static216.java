import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_67 = new Class27(70, -1);

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	public static int anInt4132 = 0;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method3294(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class10_Sub8 local12 = new Class10_Sub8(arg0);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local12.method2463();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local12.method2469();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(78) int local78 = local12.method2502() >> 2;
					@Pc(82) int local82 = local72 + arg2;
					@Pc(87) int local87 = local66 + arg1;
					if (local82 > 0 && local87 > 0 && local82 < arg4 - 1 && arg3 - 1 > local87) {
						@Pc(117) Class126 local117 = Static342.aClass237_4.method5212(local19);
						if (local78 != 22 || Static361.aClass85_Sub1_1.aBoolean165 || local117.anInt3778 != 0 || local117.anInt3791 == 1 || local117.aBoolean251) {
							local33 = true;
							if (!local117.method3018()) {
								Static378.anInt6503++;
								local7 = false;
							}
						}
					}
				}
				local39 = local12.method2469();
				if (local39 == 0) {
					break;
				}
				local12.method2502();
			}
		}
	}
}
