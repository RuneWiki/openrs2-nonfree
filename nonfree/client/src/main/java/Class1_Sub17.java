import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}
}
