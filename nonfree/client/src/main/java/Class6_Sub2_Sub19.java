import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class6_Sub2_Sub19 extends Class6_Sub2 {

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[B")
	public final byte[] aByteArray102;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray102 = arg0;
	}
}
