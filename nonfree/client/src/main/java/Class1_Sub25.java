import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	public static final int[] anIntArray359 = new int[99];

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "J")
	public long aLong105;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local10 += local30;
			anIntArray359[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	private Class1_Sub25() {
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J)V")
	public Class1_Sub25(@OriginalArg(0) long arg0) {
		this.aLong105 = arg0;
	}
}
