import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V")
	public Class6_Sub1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
