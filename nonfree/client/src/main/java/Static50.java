import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
	public static final boolean aBoolean49 = false;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "F")
	public static float aFloat16 = 0.25F;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
	public static void method879() {
		if (Static399.aClass100_13 != null) {
			Static399.aClass100_13.method8789();
			Static467.aClass50_10 = null;
			Static399.aClass100_13 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!dv;IIBI)V")
	public static void method880(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) long local21 = (long) (arg2 << 28 | arg1 << 14 | arg3);
		@Pc(27) Class6_Sub41 local27 = (Class6_Sub41) Static333.aClass128_46.method3560(local21);
		if (local27 == null) {
			local27 = new Class6_Sub41();
			Static333.aClass128_46.method3551(local21, local27);
			local27.aClass8_57.method157(arg0);
			return;
		}
		@Pc(50) Class347 local50 = Static266.aClass138_1.method3730(arg0.anInt2255);
		@Pc(53) int local53 = local50.anInt9718;
		if (local50.anInt9717 == 1) {
			local53 *= arg0.anInt2253 + 1;
		}
		for (@Pc(72) Class6_Sub14 local72 = (Class6_Sub14) local27.aClass8_57.method149(); local72 != null; local72 = (Class6_Sub14) local27.aClass8_57.method155()) {
			local50 = Static266.aClass138_1.method3730(local72.anInt2255);
			@Pc(83) int local83 = local50.anInt9718;
			if (local50.anInt9717 == 1) {
				local83 *= local72.anInt2253 + 1;
			}
			if (local53 > local83) {
				Static18.method330(local72, arg0);
				return;
			}
		}
		local27.aClass8_57.method157(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	public static void method881() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static118.aClass173Array1[local7] = null;
		}
		Static103.anInt2053 = 0;
	}
}
