import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class5_Sub4_Sub17 extends Class5_Sub4 {

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "D")
	public double aDouble26;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub4_Sub17(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray17 = arg0;
		this.aDouble26 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)J")
	public long method7285() {
		return (long) (this.aShortArrayArray17[0].length | this.aShortArrayArray17.length << 0);
	}
}
