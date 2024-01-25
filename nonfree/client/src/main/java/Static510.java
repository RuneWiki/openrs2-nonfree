import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_441 = new Class305(63, 2);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
	public static boolean method7784() {
		return Static259.method4668("jaclib") ? Static259.method4668("hw3d") : false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
	public static void method7785(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(8) Class248[] local8 = Static261.aClass248Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class248 local16 = local8[local10];
			if (local16 != null && local16.anInt7271 == 2) {
				Static524.method8019(local16.anInt7264, local16.anInt7261, arg0 >> 1, local16.anInt7262, arg2 >> 1, local16.anInt7269 * 2);
				if (Static32.anIntArray66[0] > -1 && Static445.anInt7791 % 20 < 10) {
					Static321.aClass104Array55[local16.anInt7270].method7716(Static32.anIntArray66[0] + arg1 - 12, arg3 + -28 - -Static32.anIntArray66[1]);
				}
			}
		}
	}
}
