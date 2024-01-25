import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mia", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	@OriginalMember(owner = "client!mia", name = "v", descriptor = "D")
	public double aDouble15;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub1_Sub12(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray17 = arg0;
		this.aDouble15 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)J")
	public long method5302() {
		return (long) (this.aShortArrayArray17[0].length | this.aShortArrayArray17.length << 0);
	}
}
