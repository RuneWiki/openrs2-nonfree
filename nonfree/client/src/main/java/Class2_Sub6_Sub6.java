import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class2_Sub6_Sub6 extends Class2_Sub6 {

	@OriginalMember(owner = "client!hha", name = "D", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!hha", name = "A", descriptor = "D")
	public double aDouble22;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub6_Sub6(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray4 = arg0;
		this.aDouble22 = arg1;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)J")
	public long method3365() {
		return (long) (this.aShortArrayArray4[0].length | this.aShortArrayArray4.length << 0);
	}
}
