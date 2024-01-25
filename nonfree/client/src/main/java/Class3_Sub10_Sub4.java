import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public abstract class Class3_Sub10_Sub4 extends Class3_Sub10 {

	@OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
	public static final int[] anIntArray682 = new int[120];

	@OriginalMember(owner = "client!en", name = "q", descriptor = "I")
	public final int anInt8061;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Lclient!uk;")
	public final Interface18 anInterface18_3;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray682[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!uk;I)V")
	protected Class3_Sub10_Sub4(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1) {
		this.anInt8061 = arg1;
		this.anInterface18_3 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
	public abstract boolean method6666();

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6668();
}
