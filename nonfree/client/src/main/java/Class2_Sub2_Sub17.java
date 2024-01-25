import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "D")
	public double aDouble35;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray24;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub2_Sub17(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble35 = arg1;
		this.aShortArrayArray24 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)J")
	public long method5164() {
		return (long) (this.aShortArrayArray24.length << 0 | this.aShortArrayArray24[0].length);
	}
}
