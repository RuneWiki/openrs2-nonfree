import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!hea", name = "y", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "([[SD)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray7 = arg0;
		this.aDouble6 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)J")
	public long method3577() {
		return (long) (this.aShortArrayArray7[0].length | this.aShortArrayArray7.length << 0);
	}
}
