import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_222 = new Class150(7, 2);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!gp;Lclient!gp;I)I")
	public static int method7159(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method2973(Static220.anInt4154)) {
			local5++;
		}
		if (arg1.method2973(Static357.anInt6718)) {
			local5++;
		}
		if (arg1.method2973(Static59.anInt1209)) {
			local5++;
		}
		if (arg0.method2973(Static220.anInt4154)) {
			local5++;
		}
		if (arg0.method2973(Static357.anInt6718)) {
			local5++;
		}
		if (arg0.method2973(Static59.anInt1209)) {
			local5++;
		}
		return local5;
	}
}
