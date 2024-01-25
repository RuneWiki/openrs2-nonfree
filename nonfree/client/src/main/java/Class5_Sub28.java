import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public final class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!hka", name = "m", descriptor = "[S")
	public final short[] aShortArray52;

	@OriginalMember(owner = "client!hka", name = "l", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub28(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray52 = arg0;
		this.aByteArray35 = arg1;
	}
}
