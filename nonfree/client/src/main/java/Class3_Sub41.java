import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "[B")
	public final byte[] aByteArray90;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V")
	public Class3_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray90 = arg0;
	}
}
