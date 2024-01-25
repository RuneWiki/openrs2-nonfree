import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class6_Sub54 extends Class6 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[S")
	public final short[] aShortArray139;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub54(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray139 = arg0;
		this.aByteArray99 = arg1;
	}
}
