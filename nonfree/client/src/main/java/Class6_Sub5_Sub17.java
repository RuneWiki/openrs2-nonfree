import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class6_Sub5_Sub17 extends Class6_Sub5 {

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "([[SD)V")
	public Class6_Sub5_Sub17(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray14 = arg0;
		this.aDouble5 = arg1;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)J")
	public long method4587() {
		return (long) (this.aShortArrayArray14[0].length | this.aShortArrayArray14.length << 0);
	}
}
