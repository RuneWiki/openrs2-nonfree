import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V")
	public Class6_Sub38(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
