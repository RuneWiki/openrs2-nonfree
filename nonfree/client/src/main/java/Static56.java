import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I")
	public static int method1147() {
		if (Static166.aClass245_12 == null) {
			if (!Static228.aBoolean342 && Static179.anInt4933 > 0) {
				if (Static37.aBoolean72 && Static364.aClass101_1.method2589(81) && Static179.anInt4933 > 2) {
					return ((Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283.aClass3_283).anInt1420;
				}
				return ((Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283).anInt1420;
			}
			@Pc(44) int local44 = Static35.aClass54_1.method4074();
			@Pc(48) int local48 = Static35.aClass54_1.method4071();
			@Pc(50) int local50 = Static87.anInt1887;
			@Pc(52) int local52 = Static386.anInt7125;
			@Pc(54) int local54 = Static256.anInt5196;
			if (local50 < local44 && local50 + local54 > local44) {
				@Pc(64) int local64 = -1;
				@Pc(82) int local82;
				for (@Pc(66) int local66 = 0; local66 < Static179.anInt4933; local66++) {
					if (Static346.aBoolean416) {
						local82 = (Static179.anInt4933 - local66 - 1) * 16 + local52 + 33;
						if (local82 - 13 < local48 && local82 + 3 >= local48) {
							local64 = local66;
						}
					} else {
						local82 = local52 + (-local66 + Static179.anInt4933 + -1) * 16 + 31;
						if (local82 - 13 < local48 && local82 + 3 >= local48) {
							local64 = local66;
						}
					}
				}
				if (local64 != -1) {
					local82 = 0;
					@Pc(143) Class157 local143 = new Class157(Static255.aClass71_43);
					for (@Pc(148) Class3_Sub11 local148 = (Class3_Sub11) local143.method4203(); local148 != null; local148 = (Class3_Sub11) local143.method4206()) {
						if (local82++ == local64) {
							return local148.anInt1420;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
	public static int method1148(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([IILclient!ad;[III)Lclient!vd;")
	public static Class10_Sub3 method1149(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg0[local12] + local12 * arg4;
			for (@Pc(24) int local24 = 0; local24 < arg3[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class10_Sub3(arg2, arg4, arg1, local10);
	}
}
