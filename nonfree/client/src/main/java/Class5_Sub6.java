import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
	public Class5_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = arg0;
	}
}
