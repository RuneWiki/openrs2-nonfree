import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "D")
	public double aDouble29;

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "[[S")
	public final short[][] aShortArrayArray22;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub1_Sub21(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble29 = arg1;
		this.aShortArrayArray22 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)J")
	public long method9383() {
		return (long) (this.aShortArrayArray22[0].length | this.aShortArrayArray22.length << 0);
	}
}
