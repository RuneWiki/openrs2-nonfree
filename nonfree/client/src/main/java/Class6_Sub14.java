import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[S")
	public final short[] aShortArray24;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray24 = arg0;
		this.aByteArray29 = arg1;
	}
}
