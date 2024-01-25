import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "Lclient!rk;")
	public static Class180 aClass180_86;

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "Z")
	public static boolean aBoolean431 = true;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method4999(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static131.aBoolean224) {
			try {
				@Pc(24) Class189 local24 = (Class189) Class.forName("Class189_Sub1").getDeclaredConstructor().newInstance();
				local24.method4856(arg0);
				return local24;
			} catch (@Pc(31) Throwable local31) {
				Static131.aBoolean224 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZ)V")
	public static void method5000(@OriginalArg(1) boolean arg0) {
		@Pc(7) byte local7;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local7 = 1;
			local9 = Static121.aByteArrayArray8;
		} else {
			local9 = Static58.aByteArrayArray6;
			local7 = 4;
		}
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			Static263.method4429();
			for (@Pc(21) int local21 = 0; local21 < Static15.anInt287 >> 3; local21++) {
				for (@Pc(24) int local24 = 0; local24 < Static325.anInt6173 >> 3; local24++) {
					@Pc(33) int local33 = Static142.anIntArrayArrayArray10[local16][local21][local24];
					if (local33 != -1) {
						@Pc(42) int local42 = local33 >> 24 & 0x3;
						if (!arg0 || local42 == 0) {
							@Pc(52) int local52 = local33 >> 1 & 0x3;
							@Pc(58) int local58 = local33 >> 14 & 0x3FF;
							@Pc(64) int local64 = local33 >> 3 & 0x7FF;
							@Pc(74) int local74 = (local58 / 8 << 8) + local64 / 8;
							for (@Pc(76) int local76 = 0; local76 < Static94.anIntArray311.length; local76++) {
								if (Static94.anIntArray311[local76] == local74 && local9[local76] != null) {
									Static331.method5271(Static327.aClass149Array1, local21 * 8, arg0, local9[local76], local42, (local58 & 0x7) * 8, local16, local52, local24 * 8, (local64 & 0x7) * 8, Static128.aClass89_3);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
