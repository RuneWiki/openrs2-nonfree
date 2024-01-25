import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_19 = new Class208(75, 4);

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject1 = null;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIZ)Lclient!sca;")
	public static Class302 method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class302 local12 = Static386.method4914(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass302Array2 == null || arg1 >= local12.aClass302Array2.length) {
			return null;
		} else {
			return local12.aClass302Array2[arg1];
		}
	}
}
