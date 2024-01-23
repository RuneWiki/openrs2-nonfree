import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
	public Class2_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray32 = arg0;
	}
}
