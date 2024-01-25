import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
	public static int anInt5239;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_159 = new Class202("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_160 = new Class202("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)I")
	public static int method4504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static267.aByteArrayArrayArray19[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static267.aByteArrayArrayArray19[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
