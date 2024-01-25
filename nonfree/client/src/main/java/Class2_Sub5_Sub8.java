import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class2_Sub5_Sub8 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray61 = arg0;
	}
}
