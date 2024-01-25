import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	public static int anInt5381;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_118 = new Class253(7, 6);

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
	public static final int[] anIntArray489 = new int[8];

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	public static int anInt5380 = 0;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "[I")
	public static final int[] anIntArray490 = new int[2048];

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	public static int anInt5382 = -1;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lclient!kq;")
	public static Class136 method4312(@OriginalArg(0) int arg0) {
		@Pc(8) Class136[] local8 = Static288.method3812();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class136 local21 = local8[local15];
			if (arg0 == local21.anInt3863) {
				return local21;
			}
		}
		return null;
	}
}
