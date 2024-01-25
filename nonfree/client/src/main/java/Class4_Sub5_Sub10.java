import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class4_Sub5_Sub10 extends Class4_Sub5 {

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([B)V")
	public Class4_Sub5_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray56 = arg0;
	}
}
