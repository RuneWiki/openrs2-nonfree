import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
