import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V")
	public Class4_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
	}
}
