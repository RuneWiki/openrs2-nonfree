import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!je", name = "G", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class6_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray21 = arg0;
	}
}
