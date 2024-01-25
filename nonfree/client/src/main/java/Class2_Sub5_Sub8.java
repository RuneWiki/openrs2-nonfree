import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class2_Sub5_Sub8 extends Class2_Sub5 {

	@OriginalMember(owner = "client!hga", name = "y", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "[[S")
	public final short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub5_Sub8(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble8 = arg1;
		this.aShortArrayArray14 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)J")
	public long method3615() {
		return (long) (this.aShortArrayArray14[0].length | this.aShortArrayArray14.length << 0);
	}
}
