import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}
}
