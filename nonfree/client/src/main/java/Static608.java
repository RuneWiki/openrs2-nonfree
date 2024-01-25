import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "Lclient!tg;")
	public static Class330 aClass330_62;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_61 = new Class330();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method8682() {
		@Pc(16) Class5_Sub5_Sub21 local16 = Static101.method1629(15, 0);
		local16.method8961();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method8683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class5_Sub22 local17 = new Class5_Sub22(arg3);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method5920();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method5947();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method5966() >> 2;
					@Pc(85) int local85 = arg1 + local75;
					@Pc(89) int local89 = arg4 + local69;
					if (local85 > 0 && local89 > 0 && local85 < arg2 - 1 && arg0 - 1 > local89) {
						@Pc(114) Class181 local114 = Static61.aClass246_7.method5497(local19);
						if (local81 != 22 || Static97.aClass5_Sub25_8.aClass6_Sub20_1.method6668() != 0 || local114.anInt4779 != 0 || local114.anInt4744 == 1 || local114.aBoolean343) {
							local36 = true;
							if (!local114.method4284()) {
								local7 = false;
								Static143.anInt2485++;
							}
						}
					}
				}
				local42 = local17.method5947();
				if (local42 == 0) {
					break;
				}
				local17.method5966();
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public static void method8684() {
		if (Static151.anInt2620 == 3) {
			Static358.method5312(4);
		} else if (Static151.anInt2620 == 7) {
			Static358.method5312(8);
		} else if (Static151.anInt2620 == 10) {
			Static358.method5312(11);
		}
	}
}
