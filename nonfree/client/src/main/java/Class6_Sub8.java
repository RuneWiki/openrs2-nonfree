import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V")
	public Class6_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
