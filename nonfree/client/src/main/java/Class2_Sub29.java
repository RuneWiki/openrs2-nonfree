import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "[S")
	public final short[] aShortArray108;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([S[B)V", line = 4)
	public Class2_Sub29(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray108 = arg0;
		this.aByteArray71 = arg1;
	}
}
