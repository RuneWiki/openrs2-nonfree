import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class6_Sub2_Sub21 extends Class6_Sub2 {

	@OriginalMember(owner = "client!wca", name = "F", descriptor = "[B")
	public final byte[] aByteArray120;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray120 = arg0;
	}
}
