import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([B)V")
	public Class1_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}
}
