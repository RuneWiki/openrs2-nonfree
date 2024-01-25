import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class6_Sub4_Sub14 extends Class6_Sub4 {

	@OriginalMember(owner = "client!rca", name = "B", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "([B)V")
	public Class6_Sub4_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}
}
