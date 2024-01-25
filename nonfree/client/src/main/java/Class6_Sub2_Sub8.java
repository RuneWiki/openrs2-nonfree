import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "D")
	public double aDouble19;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([[SD)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray7 = arg0;
		this.aDouble19 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)J")
	public long method3832() {
		return (long) (this.aShortArrayArray7[0].length | this.aShortArrayArray7.length << 0);
	}
}
