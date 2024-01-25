import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
	public static int[] anIntArray722;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!lu;")
	public static final Class207 aClass207_10 = new Class207();

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "Lclient!li;")
	public static final Class199 aClass199_6 = new Class199(128);

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public static int anInt8629 = 0;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
	public static void method7204() {
		Static420.method7870();
		Static186.method3607();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)I")
	public static int method7206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
	public static void method7207() {
		Static405.aClass211_61 = new Class211();
	}
}
