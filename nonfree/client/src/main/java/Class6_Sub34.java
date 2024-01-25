import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "[S")
	public final short[] aShortArray85;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub34(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray85 = arg0;
		this.aByteArray43 = arg1;
	}
}
