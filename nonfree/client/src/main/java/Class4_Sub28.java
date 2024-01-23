import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
	}
}
