import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class150 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "[I")
	public static final int[] anIntArray343 = new int[32];

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_13;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "J")
	public final long aLong125;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray343[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!gi;J[Lclient!sca;)V")
	public Class150(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class272[] arg2) {
		this.aClass42_Sub3_13 = arg0;
		this.aLong125 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass42_Sub3_13.method3224(this.aLong125);
		super.finalize();
	}
}
