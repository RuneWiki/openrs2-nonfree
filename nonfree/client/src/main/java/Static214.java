import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public static int anInt4356 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)Lclient!sj;")
	public static Class181 method3735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class181 local15 = Static20.method415(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass181Array2 == null || local15.aClass181Array2.length <= arg1) {
			return null;
		} else {
			return local15.aClass181Array2[arg1];
		}
	}
}
