import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!co", name = "m", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "([B)V")
	public Class3_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
