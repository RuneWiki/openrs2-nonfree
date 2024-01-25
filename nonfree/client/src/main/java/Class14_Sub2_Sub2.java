import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class14_Sub2_Sub2 extends Class14_Sub2 {

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V")
	public Class14_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}
}
