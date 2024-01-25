import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "[S")
	public final short[] aShortArray71;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub34(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray71 = arg0;
		this.aByteArray71 = arg1;
	}
}
