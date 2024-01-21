import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
	}
}
