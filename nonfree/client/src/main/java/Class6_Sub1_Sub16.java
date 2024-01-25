import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class6_Sub1_Sub16 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([B)V")
	public Class6_Sub1_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
	}
}
