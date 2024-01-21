import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
	public static final int[] anIntArray265 = new int[99];

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public final int anInt2702;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	public final int anInt2704;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray265[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2702 = arg1;
		this.anInt2704 = arg0;
	}
}
