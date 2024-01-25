import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub4_Sub7(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray6 = arg0;
		this.aDouble8 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)J")
	public long method2863() {
		return (long) (this.aShortArrayArray6.length << 0 | this.aShortArrayArray6[0].length);
	}
}
