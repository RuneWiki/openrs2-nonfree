import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "Lclient!eu;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "Lclient!db;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_95 = new Class218(51, 4);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	public static int method5860(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
	public static void method5865(@OriginalArg(0) int arg0) {
		if (!Static27.method666(arg0)) {
			return;
		}
		@Pc(16) Class260[] local16 = Static489.aClass260ArrayArray3[arg0];
		for (@Pc(25) int local25 = 0; local25 < local16.length; local25++) {
			@Pc(31) Class260 local31 = local16[local25];
			if (local31 != null) {
				local31.anInt6988 = 0;
				local31.anInt6982 = 1;
				local31.anInt6954 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(CI)Z")
	public static boolean method5866(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
