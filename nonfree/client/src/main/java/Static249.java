import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_53 = new Class243(33, 7);

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	public static final int anInt4562 = 1337;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	public static void method3955() {
		if (Static528.anInt9122 == 6) {
			Static528.anInt9122 = 7;
		}
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V")
	public static void method3957() {
		Static152.aClass231_64.method6227();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method3958(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub13_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class75 local8 = Static164.aClass75Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static315.anInt5693; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static515.anInt3809; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static175.anInt3259;
							@Pc(32) int local32 = local12 << Static175.anInt3259;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class75 local41 = Static164.aClass75Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
