import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!of", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray15;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "D")
	public double aDouble14;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub2_Sub17(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray15 = arg0;
		this.aDouble14 = arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
	public long method6180() {
		return (long) (this.aShortArrayArray15.length << 0 | this.aShortArrayArray15[0].length);
	}
}
