import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class14_Sub3_Sub5 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "([[SD)V")
	public Class14_Sub3_Sub5(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble3 = arg1;
		this.aShortArrayArray5 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)J")
	public long method1589() {
		return (long) (this.aShortArrayArray5[0].length | this.aShortArrayArray5.length << 0);
	}
}
