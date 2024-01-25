import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class7_Sub1_Sub19 extends Class7_Sub1 {

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([B)V")
	public Class7_Sub1_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91 = arg0;
	}
}
