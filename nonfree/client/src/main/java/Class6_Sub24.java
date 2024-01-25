import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
	public Class6_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aByteArray53 = arg0;
	}
}
