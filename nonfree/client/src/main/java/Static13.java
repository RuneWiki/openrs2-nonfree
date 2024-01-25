import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt178 = 10;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_12 = new Class102(6, 1);

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public static int anInt181 = 0;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_9 = new Class134(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method165(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static339.method4554(Static380.method358(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
