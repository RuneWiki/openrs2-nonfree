import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[S")
	public final short[] aShortArray92;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub28(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray92 = arg0;
		this.aByteArray47 = arg1;
	}
}
