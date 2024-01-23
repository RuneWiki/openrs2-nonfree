import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = arg0;
	}
}
