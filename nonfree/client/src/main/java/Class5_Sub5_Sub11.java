import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class5_Sub5_Sub11 extends Class5_Sub5 {

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V")
	public Class5_Sub5_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}
}
