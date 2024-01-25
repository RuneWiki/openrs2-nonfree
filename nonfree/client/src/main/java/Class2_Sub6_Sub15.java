import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class2_Sub6_Sub15 extends Class2_Sub6 {

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "D")
	public double aDouble14;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "[[S")
	public final short[][] aShortArrayArray21;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([[SD)V")
	public Class2_Sub6_Sub15(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble14 = arg1;
		this.aShortArrayArray21 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)J")
	public long method5657() {
		return (long) (this.aShortArrayArray21.length << 0 | this.aShortArrayArray21[0].length);
	}
}
