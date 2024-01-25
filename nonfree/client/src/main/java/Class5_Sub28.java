import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "[B")
	public final byte[] aByteArray36;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
	public Class5_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aByteArray36 = arg0;
	}
}
