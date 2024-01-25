import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "[S")
	public final short[] aShortArray81;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub24(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray81 = arg0;
		this.aByteArray69 = arg1;
	}
}
