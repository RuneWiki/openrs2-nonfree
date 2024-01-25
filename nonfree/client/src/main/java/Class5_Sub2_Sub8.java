import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}
}
