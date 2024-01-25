import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([B)V")
	public Class6_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
	}
}
