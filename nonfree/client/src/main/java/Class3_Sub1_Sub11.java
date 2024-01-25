import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "D")
	public double aDouble36;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub1_Sub11(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble36 = arg1;
		this.aShortArrayArray8 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J")
	public long method4982() {
		return (long) (this.aShortArrayArray8.length << 0 | this.aShortArrayArray8[0].length);
	}
}
