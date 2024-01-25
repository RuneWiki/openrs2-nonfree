import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class309 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public static final int[] anIntArray580 = new int[120];

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_35;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "J")
	public final long aLong372;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 120; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray580[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ag;J[Lclient!vk;)V")
	public Class309(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class344[] arg2) {
		this.aClass12_Sub1_35 = arg0;
		this.aLong372 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub1_35.method391(this.aLong372);
		super.finalize();
	}
}
