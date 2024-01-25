import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class14_Sub2_Sub14 extends Class14_Sub2 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "D")
	public double aDouble15;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([[SD)V")
	public Class14_Sub2_Sub14(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray3 = arg0;
		this.aDouble15 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)J")
	public long method5539() {
		return (long) (this.aShortArrayArray3[0].length | this.aShortArrayArray3.length << 0);
	}
}
