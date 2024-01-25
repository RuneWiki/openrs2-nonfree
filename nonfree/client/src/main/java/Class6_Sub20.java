import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
	public final short[] aShortArray62;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub20(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray62 = arg0;
		this.aByteArray55 = arg1;
	}
}
