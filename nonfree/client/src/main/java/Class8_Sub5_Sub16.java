import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class8_Sub5_Sub16 extends Class8_Sub5 {

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V")
	public Class8_Sub5_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray76 = arg0;
	}
}
