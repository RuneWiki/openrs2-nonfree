import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_162 = new Class275();

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_105 = new Class160(38, 15);

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "[I")
	public static final int[] anIntArray615 = new int[13];

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public static void method6398() {
		for (@Pc(6) Class6_Sub22 local6 = (Class6_Sub22) Static429.aClass275_156.method6366(); local6 != null; local6 = (Class6_Sub22) Static429.aClass275_156.method6364()) {
			if (local6.aBoolean212) {
				local6.method2700();
			}
		}
		for (@Pc(30) Class6_Sub22 local30 = (Class6_Sub22) Static292.aClass275_101.method6366(); local30 != null; local30 = (Class6_Sub22) Static292.aClass275_101.method6364()) {
			if (local30.aBoolean212) {
				local30.method2700();
			}
		}
	}
}
