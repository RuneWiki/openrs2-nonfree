import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class8_Sub42 extends Class8 {

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V")
	public Class8_Sub42(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
