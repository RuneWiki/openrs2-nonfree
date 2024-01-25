import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class2_Sub6_Sub14 extends Class2_Sub6 {

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "[B")
	public final byte[] aByteArray89;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray89 = arg0;
	}
}
