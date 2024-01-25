import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!oh;")
	public static Class237 aClass237_148;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static int anInt10493;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B[[BLclient!fca;)V")
	public static void method8460(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt3635; local3++) {
			Static92.method2160();
			for (@Pc(9) int local9 = 0; local9 < Static372.anInt7082 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static218.anInt5023 >> 3; local13++) {
					@Pc(23) int local23 = Static346.anIntArrayArrayArray10[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean269 || local33 == 0) {
							@Pc(47) int local47 = local23 >> 1 & 0x3;
							@Pc(53) int local53 = local23 >> 14 & 0x3FF;
							@Pc(59) int local59 = local23 >> 3 & 0x7FF;
							@Pc(69) int local69 = local59 / 8 + (local53 / 8 << 8);
							for (@Pc(71) int local71 = 0; local71 < Static170.anIntArray225.length; local71++) {
								if (local69 == Static170.anIntArray225[local71] && arg0[local71] != null) {
									arg1.method3004(local33, (local59 & 0x7) * 8, arg0[local71], (local53 & 0x7) * 8, local13 * 8, local9 * 8, Static171.aClass16_5, local47, Static204.aClass48Array1, local3);
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
