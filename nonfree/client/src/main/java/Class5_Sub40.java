import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[B")
	public final byte[] aByteArray102;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V")
	public Class5_Sub40(@OriginalArg(0) byte[] arg0) {
		this.aByteArray102 = arg0;
	}
}
