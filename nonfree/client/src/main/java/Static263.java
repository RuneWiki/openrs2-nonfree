import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
	public static int anInt4598 = -1;

	@OriginalMember(owner = "client!jaa", name = "J", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_31 = new Class264(5);

	@OriginalMember(owner = "client!jaa", name = "K", descriptor = "Lclient!gb;")
	public static final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!da;)V")
	public static void method3850(@OriginalArg(0) Class38 arg0) {
		Static163.aClass38_3 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZIIIIIIF)[[I")
	public static int[][] method3851(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class14_Sub1_Sub3 local13 = new Class14_Sub1_Sub3();
		local13.anInt1428 = 4;
		local13.anInt1421 = 3;
		local13.anInt1424 = 4;
		local13.anInt1419 = (int) (arg0 * (float) 4096);
		local13.aBoolean116 = false;
		local13.method8899();
		Static558.method7838(256, 64);
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			local13.method1229(local41, local9[local41]);
		}
		return local9;
	}
}
