import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "[I")
	public static final int[] anIntArray556 = new int[4096];

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Ljava/lang/String;")
	public String aString43;

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray556[local7] = Static66.method4780(local7);
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	private Class2_Sub29() {
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub29(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString43 = arg0;
	}
}
