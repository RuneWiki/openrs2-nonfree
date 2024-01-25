import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
	public Class6_Sub47(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}
}
