import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([B)V")
	public Class4_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aByteArray59 = arg0;
	}
}
