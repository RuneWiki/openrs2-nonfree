import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub52(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
	}
}
