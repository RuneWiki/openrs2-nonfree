import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static716 {

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_113 = new Class144(64, 11);

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public static int anInt11157 = 0;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public static int anInt11158 = 0;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray69 = new int[128][128];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!ik;I)Lclient!gt;")
	public static Class145 method9500(@OriginalArg(1) int arg0, @OriginalArg(2) Class182 arg1) {
		@Pc(9) byte[] local9 = arg1.method3985(0, arg0);
		return local9 == null ? null : new Class145(local9);
	}
}
