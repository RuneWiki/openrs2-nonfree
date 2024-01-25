import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public final class Class8_Sub5_Sub10 extends Class8_Sub5 {

	@OriginalMember(owner = "client!mda", name = "v", descriptor = "D")
	public double aDouble13;

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "([[SD)V")
	public Class8_Sub5_Sub10(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble13 = arg1;
		this.aShortArrayArray9 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)J")
	public long method5407() {
		return (long) (this.aShortArrayArray9.length << 0 | this.aShortArrayArray9[0].length);
	}
}
