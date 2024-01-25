import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
	public Class2_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray44 = arg0;
	}
}
