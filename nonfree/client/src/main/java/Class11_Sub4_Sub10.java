import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class11_Sub4_Sub10 extends Class11_Sub4 {

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "([B)V")
	public Class11_Sub4_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
	}
}
