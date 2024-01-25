import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class3_Sub11_Sub15 extends Class3_Sub11 {

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "[[S")
	public final short[][] aShortArrayArray27;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "D")
	public double aDouble25;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub11_Sub15(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray27 = arg0;
		this.aDouble25 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
	public long method7038() {
		return (long) (this.aShortArrayArray27[0].length | this.aShortArrayArray27.length << 0);
	}
}
