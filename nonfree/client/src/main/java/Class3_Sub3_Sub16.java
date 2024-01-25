import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class3_Sub3_Sub16 extends Class3_Sub3 {

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray59 = arg0;
	}
}
