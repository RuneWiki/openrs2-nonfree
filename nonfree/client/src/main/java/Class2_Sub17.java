import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([B)V")
	public Class2_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
