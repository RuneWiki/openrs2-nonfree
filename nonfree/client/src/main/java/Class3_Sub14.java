import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V")
	public Class3_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
	}
}
