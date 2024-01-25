import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bu", name = "D", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "D")
	public double aDouble21;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "([[SD)V")
	public Class6_Sub4_Sub2(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray3 = arg0;
		this.aDouble21 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)J")
	public long method1100() {
		return (long) (this.aShortArrayArray3.length << 0 | this.aShortArrayArray3[0].length);
	}
}
