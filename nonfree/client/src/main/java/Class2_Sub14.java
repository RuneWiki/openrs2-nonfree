import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray34 = arg0;
	}
}
