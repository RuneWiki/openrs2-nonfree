import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray71 = arg0;
	}
}
