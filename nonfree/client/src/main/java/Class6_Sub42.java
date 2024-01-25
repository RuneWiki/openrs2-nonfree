import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([B)V")
	public Class6_Sub42(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
	}
}
