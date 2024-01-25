import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray6 = arg0;
	}
}
