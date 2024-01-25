import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_158 = new Class145(28, -1);

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_159 = new Class145(23, 6);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIII)V")
	public static void method7576(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class110[] local7 = Static448.aClass110Array1;
		for (@Pc(13) int local13 = 0; local13 < local7.length; local13++) {
			@Pc(19) Class110 local19 = local7[local13];
			if (local19 != null && local19.anInt3142 == 2) {
				Static565.method7890(local19.anInt3139, local19.anInt3143, arg0 >> 1, local19.anInt3144, arg2 >> 1, local19.anInt3137 * 2);
				if (Static197.anIntArray250[0] > -1 && Static389.anInt6694 % 20 < 10) {
					@Pc(63) Class31 local63 = Static435.aClass31Array13[local19.anInt3135];
					@Pc(71) int local71 = arg1 + Static197.anIntArray250[0] - 12;
					@Pc(79) int local79 = arg3 + Static197.anIntArray250[1] - 28;
					local63.method8793(local71, local79);
					Static103.method1953(local79, local63.method8788() + local71, local71, local79 + local63.method8807());
				}
			}
		}
	}
}
