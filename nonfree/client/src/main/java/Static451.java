import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "[I")
	public static int[] anIntArray634;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Lclient!wu;")
	public static Class268 aClass268_1 = new Class268();

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub23 local17 = new Class2_Sub23(arg4);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method5469();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method5479();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method5495() >> 2;
					@Pc(85) int local85 = arg0 + local75;
					@Pc(89) int local89 = arg1 + local69;
					if (local85 > 0 && local89 > 0 && local85 < arg3 - 1 && arg2 - 1 > local89) {
						@Pc(111) Class134 local111 = Static118.aClass165_2.method3799(local19);
						if (local81 != 22 || Static12.aClass79_Sub1_1.aBoolean360 || local111.anInt3653 != 0 || local111.anInt3672 == 1 || local111.aBoolean278) {
							local36 = true;
							if (!local111.method2973()) {
								local7 = false;
								Static11.anInt282++;
							}
						}
					}
				}
				local42 = local17.method5479();
				if (local42 == 0) {
					break;
				}
				local17.method5495();
			}
		}
	}
}
