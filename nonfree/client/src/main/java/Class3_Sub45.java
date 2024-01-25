import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
	public Class3_Sub45(@OriginalArg(0) byte[] arg0) {
		this.aByteArray73 = arg0;
	}
}
