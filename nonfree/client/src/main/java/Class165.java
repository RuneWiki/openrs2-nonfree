import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class165 implements Interface27 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
	public static final int[] anIntArray205 = new int[120];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString39;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!gda;")
	private final Class126 aClass126_120;

	static {
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < 120; local51++) {
			@Pc(56) int local56 = local51 + 1;
			@Pc(69) int local69 = (int) ((double) local56 + Math.pow(2.0D, (double) local56 / 7.0D) * 300.0D);
			local49 += local69;
			anIntArray205[local51] = local49 / 4;
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!gda;Ljava/lang/String;)V")
	public Class165(@OriginalArg(0) Class126 arg0, @OriginalArg(1) String arg1) {
		this.aString39 = arg1;
		this.aClass126_120 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class171 method4357() {
		return Static246.aClass171_2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	@Override
	public int method4358() {
		return this.aClass126_120.method3085(this.aString39) ? 100 : 0;
	}
}
