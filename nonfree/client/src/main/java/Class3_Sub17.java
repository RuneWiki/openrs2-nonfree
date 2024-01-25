import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
	}
}
