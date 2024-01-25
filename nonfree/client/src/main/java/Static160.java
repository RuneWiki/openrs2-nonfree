import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
	public static int anInt8856;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_16 = new Class307(8, 1);

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
	public static int anInt8862 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BII)Z")
	public static boolean method7317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static325.method7832(arg0, arg1) & Static567.method7644(arg1, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)Lclient!lv;")
	public static Class1_Sub27 method7320() {
		if (Static313.aClass361_41 == null || Static81.aClass187_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub27 local16 = (Class1_Sub27) Static81.aClass187_1.method4204(); local16 != null; local16 = (Class1_Sub27) Static81.aClass187_1.method4204()) {
			@Pc(29) Class196 local29 = Static313.aClass46_2.method1408(local16.anInt5625);
			if (local29 != null && local29.aBoolean395 && local29.method4334(Static313.anInterface15_2)) {
				return local16;
			}
		}
		return null;
	}
}
