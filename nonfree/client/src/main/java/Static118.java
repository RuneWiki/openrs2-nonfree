import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([Lclient!on;II)V")
	public static void method4597(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class146 local13 = arg0[local7];
			if (local13 != null && local13.anInt4458 == arg1 && !Static43.method1054(local13)) {
				if (local13.anInt4419 == 0) {
					method4597(arg0, local13.anInt4450);
					if (local13.aClass146Array2 != null) {
						method4597(local13.aClass146Array2, local13.anInt4450);
					}
					@Pc(51) Class2_Sub8 local51 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local13.anInt4450);
					if (local51 != null) {
						Static34.method804(local51.anInt694);
					}
				}
				if (local13.anInt4419 == 6 && local13.anInt4429 != -1) {
					@Pc(70) Class107 local70 = Static212.method3773(local13.anInt4429);
					if (local70 != null) {
						local13.anInt4433 += Static220.anInt4246;
						while (local13.anInt4433 > local70.anIntArray279[local13.anInt4441]) {
							local13.anInt4433 -= local70.anIntArray279[local13.anInt4441];
							local13.anInt4441++;
							if (local13.anInt4441 >= local70.anIntArray280.length) {
								local13.anInt4441 -= local70.anInt3276;
								if (local13.anInt4441 < 0 || local13.anInt4441 >= local70.anIntArray280.length) {
									local13.anInt4441 = 0;
								}
							}
							local13.anInt4427 = local13.anInt4441 + 1;
							if (local13.anInt4427 >= local70.anIntArray280.length) {
								local13.anInt4427 -= local70.anInt3276;
								if (local13.anInt4427 < 0 || local70.anIntArray280.length <= local13.anInt4427) {
									local13.anInt4427 = -1;
								}
							}
							Static152.method2932(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)Z")
	public static boolean method4598(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static47.aCharArray3;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (local42 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
