import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt6269;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_205 = new Class123(65, 8);

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_206 = new Class123(62, 12);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)Z")
	public static boolean method5049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static370.method5107(arg0, arg1) | (arg0 & 0x70000) != 0 || Static230.method3739(arg1, arg0);
	}
}
