import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}
}
