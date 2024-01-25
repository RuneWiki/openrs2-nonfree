import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class4_Sub53 extends Class4 {

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "[S")
	public final short[] aShortArray157;

	@OriginalMember(owner = "client!wia", name = "h", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub53(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray157 = arg0;
		this.aByteArray106 = arg1;
	}
}
