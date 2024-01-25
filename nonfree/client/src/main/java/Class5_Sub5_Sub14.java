import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public final class Class5_Sub5_Sub14 extends Class5_Sub5 {

	@OriginalMember(owner = "client!jja", name = "v", descriptor = "D")
	public double aDouble11;

	@OriginalMember(owner = "client!jja", name = "A", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub5_Sub14(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble11 = arg1;
		this.aShortArrayArray6 = arg0;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)J")
	public long method4141() {
		return (long) (this.aShortArrayArray6[0].length | this.aShortArrayArray6.length << 0);
	}
}
