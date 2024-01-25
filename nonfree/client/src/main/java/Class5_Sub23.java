import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "[S")
	public final short[] aShortArray34;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub23(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray34 = arg0;
		this.aByteArray49 = arg1;
	}
}
