import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class2_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
	}
}
