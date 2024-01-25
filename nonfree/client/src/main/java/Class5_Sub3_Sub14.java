import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class5_Sub3_Sub14 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "D")
	public double aDouble19;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub3_Sub14(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray12 = arg0;
		this.aDouble19 = arg1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)J")
	public long method6594() {
		return (long) (this.aShortArrayArray12[0].length | this.aShortArrayArray12.length << 0);
	}
}
