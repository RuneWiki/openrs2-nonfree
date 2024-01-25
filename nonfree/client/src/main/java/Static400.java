import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_233 = new Class186(55, 4);

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
	public static final int[] anIntArray604 = new int[6];

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "[I")
	public static int[] anIntArray605 = new int[1];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)Lclient!ob;")
	public static Class170 method5318(@OriginalArg(0) int arg0) {
		@Pc(13) Class170[] local13 = Static54.method5867();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class170 local21 = local13[local15];
			if (local21.anInt4891 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
