import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class8_Sub5_Sub19 extends Class8_Sub5 {

	@OriginalMember(owner = "client!us", name = "x", descriptor = "[I")
	public static final int[] anIntArray584 = new int[4096];

	@OriginalMember(owner = "client!us", name = "w", descriptor = "Lclient!aq;")
	public final Class15_Sub1_Sub2_Sub1 aClass15_Sub1_Sub2_Sub1_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray584[local4] = Static236.method4340(local4);
		}
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class8_Sub5_Sub19(@OriginalArg(0) Class15_Sub1_Sub2_Sub1 arg0) {
		this.aClass15_Sub1_Sub2_Sub1_1 = arg0;
	}
}
