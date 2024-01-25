import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_204 = new Class221(9, 6);

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	public static final int anInt6363 = 328;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILclient!iq;)Lclient!go;")
	public static Class82 method5351(@OriginalArg(1) int arg0, @OriginalArg(2) Class104 arg1) {
		@Pc(8) byte[] local8 = arg1.method2758(arg0);
		return local8 == null ? null : new Class82(local8);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)I")
	public static int method5353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}
}
