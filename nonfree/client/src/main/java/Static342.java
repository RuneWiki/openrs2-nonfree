import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt9106;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "[I")
	public static final int[] anIntArray686 = new int[13];

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "[I")
	public static final int[] anIntArray687 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Lclient!un;")
	public static Class319 method7459(@OriginalArg(1) int arg0) {
		@Pc(10) Class319 local10 = (Class319) Static79.aClass332_39.method7502((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static310.aClass251_93.method5860(1, arg0);
		local10 = new Class319();
		local10.anInt8952 = arg0;
		if (local20 != null) {
			local10.method7331(new Class6_Sub14(local20));
		}
		local10.method7326();
		if (local10.anInt8965 == 2 && Static304.aClass212_23.method5106((long) arg0) == null) {
			Static304.aClass212_23.method5104((long) arg0, new Class6_Sub9(Static547.anInt9593));
			Static253.aClass319Array1[Static547.anInt9593++] = local10;
		}
		Static79.aClass332_39.method7498((long) arg0, local10);
		return local10;
	}
}
