import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[B")
	public final byte[] aByteArray110;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub48(@OriginalArg(0) byte[] arg0) {
		this.aByteArray110 = arg0;
	}
}
