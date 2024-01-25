import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[S")
	public final short[] aShortArray48;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub12(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray48 = arg0;
		this.aByteArray38 = arg1;
	}
}
