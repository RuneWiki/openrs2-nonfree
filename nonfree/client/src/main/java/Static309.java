import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "Lclient!nha;")
	public static Class251 aClass251_4;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
	public static int anInt5369;

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!kg", name = "J", descriptor = "[I")
	public static final int[] anIntArray310 = new int[3];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZII)I")
	public static int method4914(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub3 local8 = Static536.method7657(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray20.length) {
			return local8.anIntArray20[arg2];
		} else {
			return 0;
		}
	}
}
