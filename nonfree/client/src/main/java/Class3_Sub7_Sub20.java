import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class3_Sub7_Sub20 extends Class3_Sub7 {

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "[B")
	public final byte[] aByteArray88;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = arg0;
	}
}
