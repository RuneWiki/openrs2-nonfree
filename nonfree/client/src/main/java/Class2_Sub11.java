import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
	}
}
