import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
	public final short[] aShortArray29;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub16(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray29 = arg0;
		this.aByteArray21 = arg1;
	}
}
