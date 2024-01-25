import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class10_Sub1_Sub14 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class10_Sub1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray61 = arg0;
	}
}
