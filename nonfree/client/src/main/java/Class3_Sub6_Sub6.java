import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class3_Sub6_Sub6 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cha", name = "x", descriptor = "D")
	public double aDouble11;

	@OriginalMember(owner = "client!cha", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub6_Sub6(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble11 = arg1;
		this.aShortArrayArray3 = arg0;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)J")
	public long method1635() {
		return (long) (this.aShortArrayArray3[0].length | this.aShortArrayArray3.length << 0);
	}
}
