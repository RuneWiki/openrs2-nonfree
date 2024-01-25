import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class6_Sub51 extends Class6 {

	@OriginalMember(owner = "client!ufa", name = "o", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V")
	public Class6_Sub51(@OriginalArg(0) byte[] arg0) {
		this.aByteArray103 = arg0;
	}
}
