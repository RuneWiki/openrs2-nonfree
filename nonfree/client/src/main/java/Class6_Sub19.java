import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "[S")
	public final short[] aShortArray55;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[B")
	public final byte[] aByteArray48;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub19(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray55 = arg0;
		this.aByteArray48 = arg1;
	}
}
