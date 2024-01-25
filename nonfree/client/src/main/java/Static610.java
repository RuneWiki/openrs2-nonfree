import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public static void method8690() {
		Static405.aClass391_35.method9274(5);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!haa;[[BB)V")
	public static void method8692(@OriginalArg(0) Class153_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt3423; local3++) {
			Static62.method873();
			for (@Pc(9) int local9 = 0; local9 < Static544.anInt9261 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static282.anInt4887 >> 3; local13++) {
					@Pc(23) int local23 = Static107.anIntArrayArrayArray7[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean274 || local33 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(69) int local69 = (local52 / 8 << 8) + (local58 / 8);
							for (@Pc(71) int local71 = 0; local71 < Static672.anIntArray621.length; local71++) {
								if (local69 == Static672.anIntArray621[local71] && arg1[local71] != null) {
									arg0.method3026(local13 * 8, arg1[local71], local46, local9 * 8, Static457.aClass57_11, Static670.aClass88Array1, local33, local3, (local58 & 0x7) * 8, (local52 & 0x7) * 8);
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
