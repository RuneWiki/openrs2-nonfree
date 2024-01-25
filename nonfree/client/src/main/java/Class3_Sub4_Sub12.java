import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ida", name = "A", descriptor = "D")
	public double aDouble17;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub4_Sub12(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray3 = arg0;
		this.aDouble17 = arg1;
	}

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)J")
	public long method4092() {
		return (long) (this.aShortArrayArray3.length << 0 | this.aShortArrayArray3[0].length);
	}
}
