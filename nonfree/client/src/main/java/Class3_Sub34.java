import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "[S")
	public final short[] aShortArray79;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub34(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray79 = arg0;
		this.aByteArray61 = arg1;
	}
}
