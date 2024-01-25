import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62 = arg0;
	}
}
