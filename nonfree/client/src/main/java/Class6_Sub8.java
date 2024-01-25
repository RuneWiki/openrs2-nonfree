import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "([B)V")
	public Class6_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
	}
}
