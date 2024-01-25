import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public static int anInt3947 = 1;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
	public static final int[] anIntArray340 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[BI)Z")
	public static boolean method3344(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class4_Sub7 local17 = new Class4_Sub7(arg1);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method2399();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method2413();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(80) int local80 = local17.method2380() >> 2;
					@Pc(84) int local84 = arg0 + local72;
					@Pc(88) int local88 = arg2 + local66;
					if (local84 > 0 && local88 > 0 && local84 < Static92.anInt2048 - 1 && local88 < Static290.anInt5893 - 1) {
						@Pc(117) Class56 local117 = Static320.method5290(local19);
						if (local80 != 22 || Static135.aBoolean261 || local117.anInt1336 != 0 || local117.anInt1350 == 1 || local117.aBoolean114) {
							if (!local117.method1089()) {
								Static339.anInt6678++;
								local12 = false;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method2413();
				if (local39 == 0) {
					break;
				}
				local17.method2380();
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V")
	public static void method3346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) float local18 = (float) Static42.anInt2439 / (float) Static42.anInt2443;
		@Pc(20) int local20 = arg2;
		@Pc(22) int local22 = arg1;
		if (local18 < 1.0F) {
			local22 = (int) ((float) arg2 * local18);
		} else {
			local20 = (int) ((float) arg1 / local18);
		}
		@Pc(48) int local48 = arg0 - (arg2 - local20) / 2;
		@Pc(57) int local57 = arg3 - (arg1 - local22) / 2;
		Static307.anInt3771 = Static42.anInt2443 * local48 / local20;
		Static35.anInt732 = Static42.anInt2439 - Static42.anInt2439 * local57 / local22;
		Static157.anInt3513 = -1;
		Static352.anInt6599 = -1;
		Static18.method358();
	}
}
