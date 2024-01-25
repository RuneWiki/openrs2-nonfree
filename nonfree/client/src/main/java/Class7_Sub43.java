import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class7_Sub43 extends Class7 {

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
	public final short[] aShortArray119;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([S[B)V")
	public Class7_Sub43(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray119 = arg0;
		this.aByteArray95 = arg1;
	}
}
