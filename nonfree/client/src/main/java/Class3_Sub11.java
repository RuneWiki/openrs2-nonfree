import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = arg0;
	}
}
