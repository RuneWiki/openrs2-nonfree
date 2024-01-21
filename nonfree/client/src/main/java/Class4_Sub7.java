import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class4_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray31 = arg0;
	}
}
