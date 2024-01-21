import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray32 = arg0;
	}
}
