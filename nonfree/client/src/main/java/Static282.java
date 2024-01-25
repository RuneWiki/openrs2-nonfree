import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jja", name = "l", descriptor = "Lclient!bt;")
	public static Class34 aClass34_63;

	@OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "Lclient!gp;")
	public static final Class137 aClass137_1 = new Class137();

	@OriginalMember(owner = "client!jja", name = "i", descriptor = "Lclient!ft;")
	public static final Class125 aClass125_10 = new Class125();

	@OriginalMember(owner = "client!jja", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_82 = new Class216(13, 16);

	@OriginalMember(owner = "client!jja", name = "k", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_102 = new Class151(57, -2);

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
	public static void method4074() {
		if (Static181.anIntArray229 != null && Static190.anIntArray170 != null) {
			return;
		}
		Static190.anIntArray170 = new int[256];
		Static181.anIntArray229 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static181.anIntArray229[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static190.anIntArray170[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
