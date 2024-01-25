import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "[B")
	public final byte[] aByteArray63;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V")
	public Class5_Sub36(@OriginalArg(0) byte[] arg0) {
		this.aByteArray63 = arg0;
	}
}
