import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class5_Sub5_Sub9 extends Class5_Sub5 {

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "([[SD)V")
	public Class5_Sub5_Sub9(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray7 = arg0;
		this.aDouble9 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)J")
	public long method2914() {
		return (long) (this.aShortArrayArray7[0].length | this.aShortArrayArray7.length << 0);
	}
}
