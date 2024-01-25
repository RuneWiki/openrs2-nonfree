import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class3_Sub7_Sub19 extends Class3_Sub7 {

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "D")
	public double aDouble19;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "([[SD)V")
	public Class3_Sub7_Sub19(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray4 = arg0;
		this.aDouble19 = arg1;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)J")
	public long method7040() {
		return (long) (this.aShortArrayArray4[0].length | this.aShortArrayArray4.length << 0);
	}
}
