import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class2_Sub7_Sub19 extends Class2_Sub7 {

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "[I")
	public static final int[] anIntArray667 = new int[4096];

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "D")
	public double aDouble21;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray667[local7] = Static270.method4445(local7);
		}
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub7_Sub19(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble21 = arg1;
		this.aShortArrayArray17 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)J")
	public long method7887() {
		return (long) (this.aShortArrayArray17.length << 0 | this.aShortArrayArray17[0].length);
	}
}
