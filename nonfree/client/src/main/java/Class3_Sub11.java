import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
	}
}
