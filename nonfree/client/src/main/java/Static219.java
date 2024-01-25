import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_106 = new Class160(56, 1);

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_107 = new Class160(83, 4);

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_108 = new Class160(111, -1);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIFFLclient!ra;FIF[BZFII)V")
	public static void method3790(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class295 arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) byte[] arg5, @OriginalArg(10) float arg6, @OriginalArg(11) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static571.method8150(arg7, arg3, local1, arg2, arg5, arg6, arg0, arg4, arg1);
			arg7 += 16384;
		}
	}
}
