import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class1_Sub6_Sub7 extends Class1_Sub6 {

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}
}
