import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B)V")
	public Class4_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
	}
}
