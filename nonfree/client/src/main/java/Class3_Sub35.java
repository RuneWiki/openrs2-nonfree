import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V")
	public Class3_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray83 = arg0;
	}
}
