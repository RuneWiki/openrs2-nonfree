import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}
}
