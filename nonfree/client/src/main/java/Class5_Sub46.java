import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public final class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!qja", name = "n", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "([B)V")
	public Class5_Sub46(@OriginalArg(0) byte[] arg0) {
		this.aByteArray76 = arg0;
	}
}
