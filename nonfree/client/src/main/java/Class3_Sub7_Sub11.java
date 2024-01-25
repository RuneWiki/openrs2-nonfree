import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!hha", name = "w", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!hha", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub7_Sub11(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aDouble7 = arg1;
		this.aShortArrayArray4 = arg0;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)J")
	public long method3284() {
		return (long) (this.aShortArrayArray4.length << 0 | this.aShortArrayArray4[0].length);
	}
}
