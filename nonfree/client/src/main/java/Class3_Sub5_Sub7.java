import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class3_Sub5_Sub7 extends Class3_Sub5 {

	@OriginalMember(owner = "client!eka", name = "r", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "([B)V")
	public Class3_Sub5_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
