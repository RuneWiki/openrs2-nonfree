import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class3_Sub7_Sub14 extends Class3_Sub7 {

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray41 = arg0;
	}
}
