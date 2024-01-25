import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lclient!am;")
	public static Class20 aClass20_21;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	public static int anInt9053;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	public static int anInt9056 = 0;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method7920(@OriginalArg(1) String arg0) {
		return Static443.method2067(16, arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Lclient!ue;")
	public static Class6_Sub2_Sub21 method7926(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub21 local10 = (Class6_Sub2_Sub21) Static72.aClass379_2.method8729((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static314.aClass223_70.method5267(0, arg0);
		if (local21 == null || local21.length <= 1) {
			return null;
		}
		try {
			local10 = Static169.method3316(local21);
		} catch (@Pc(40) Exception local40) {
			throw new RuntimeException(local40.getMessage() + " S: " + arg0);
		}
		Static72.aClass379_2.method8733((long) arg0, local10);
		return local10;
	}
}
