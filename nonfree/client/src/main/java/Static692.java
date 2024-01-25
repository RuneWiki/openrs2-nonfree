import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static692 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!ik;")
	public static Class182 aClass182_126;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_92 = new Class307(20);

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_108 = new Class144(74, 4);

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray67 = new int[6][];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Lclient!sk;")
	public static Class343 method9171(@OriginalArg(1) int arg0) {
		@Pc(10) Class343 local10 = (Class343) Static342.aClass307_59.method7002((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static568.aClass182_110.method3985(arg0, 0);
		local10 = new Class343();
		if (local21 != null) {
			local10.method7658(arg0, new Class3_Sub2(local21));
		}
		Static342.aClass307_59.method7000(local10, (long) arg0);
		return local10;
	}
}
