import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "[B")
	public final byte[] aByteArray75;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V")
	public Class3_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aByteArray75 = arg0;
	}
}
