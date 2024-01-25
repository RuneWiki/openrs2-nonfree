import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
	public final short[] aShortArray10;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub5(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray10 = arg0;
		this.aByteArray14 = arg1;
	}
}
