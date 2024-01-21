import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray32 = arg0;
	}
}
