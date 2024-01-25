import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!l;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Lclient!ks;")
	public static Class148 aClass148_3;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_14 = new Class265(23, 8);

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public static void method544() {
		@Pc(9) int[] local9 = new int[Static318.aClass144_6.anInt3987];
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static318.aClass144_6.anInt3987; local18++) {
			@Pc(25) Class45 local25 = Static318.aClass144_6.method3265(local18);
			if (local25.anInt1094 >= 0 || local25.anInt1118 >= 0) {
				local9[local11++] = local18;
			}
		}
		Static381.anIntArray533 = new int[local11];
		for (@Pc(53) int local53 = 0; local53 < local11; local53++) {
			Static381.anIntArray533[local53] = local9[local53];
		}
	}
}
