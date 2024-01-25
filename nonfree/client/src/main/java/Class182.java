import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class182 implements Interface11 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
	public static final int[] anIntArray335 = new int[32];

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public final int anInt5150;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray335[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5150 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
