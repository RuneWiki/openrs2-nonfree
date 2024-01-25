import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}
}
