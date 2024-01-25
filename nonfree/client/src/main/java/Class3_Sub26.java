import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public abstract class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "[Lclient!th;")
	private static final Class235[] aClass235Array3 = new Class235[32];

	static {
		@Pc(77) Class235[] local77 = Static107.method1791();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass235Array3[local77[local79].anInt6547] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	protected Class3_Sub26() {
	}
}
