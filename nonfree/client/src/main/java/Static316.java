import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_59 = new Class387(30, -1);

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "[I")
	public static int[] anIntArray310 = null;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
	public static int anInt5608 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public static void method4802() {
		for (@Pc(7) int local7 = 0; local7 < Static171.anInt2921; local7++) {
			@Pc(19) int local19 = Static92.method1361(Static171.anInt2921, local7 + Static32.anInt566) * Static3.anInt23;
			for (@Pc(21) int local21 = 0; local21 < Static3.anInt23; local21++) {
				@Pc(33) int local33 = local19 + Static92.method1361(Static3.anInt23, local21 + Static213.anInt3473);
				if (Static615.anIntArray561[local33] == Static156.anInt2449) {
					Static376.anInterface6Array1[local33].method9030(0, 0, Static324.anInt10471, Static625.anInt10198, local21 * Static324.anInt10471, Static625.anInt10198 * local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Z")
	public static boolean method4803(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
