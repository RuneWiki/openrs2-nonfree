import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class6_Sub2_Sub17 extends Class6_Sub2 {

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
	}
}
