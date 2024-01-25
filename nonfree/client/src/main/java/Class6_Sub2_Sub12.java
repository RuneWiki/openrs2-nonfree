import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "[B")
	public final byte[] aByteArray63;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray63 = arg0;
	}
}
