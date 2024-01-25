import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class4_Sub47 extends Class4 {

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "([B)V")
	public Class4_Sub47(@OriginalArg(0) byte[] arg0) {
		this.aByteArray96 = arg0;
	}
}
