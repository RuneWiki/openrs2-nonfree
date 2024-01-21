import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
	}
}
