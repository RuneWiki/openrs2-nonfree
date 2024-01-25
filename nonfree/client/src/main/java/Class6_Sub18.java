import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([B)V")
	public Class6_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray34 = arg0;
	}
}
