import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_89 = new Class322(92, 0);

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "[I")
	public static final int[] anIntArray291 = new int[4];

	@OriginalMember(owner = "client!jt", name = "M", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_90 = new Class322(60, -2);

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
	public static int anInt5252 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4796(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static676.method8941(Static100.method1961(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
