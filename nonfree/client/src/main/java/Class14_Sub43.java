import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public final class Class14_Sub43 extends Class14 {

	@OriginalMember(owner = "client!pja", name = "m", descriptor = "[S")
	public final short[] aShortArray119;

	@OriginalMember(owner = "client!pja", name = "l", descriptor = "[B")
	public final byte[] aByteArray93;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "([S[B)V")
	public Class14_Sub43(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray119 = arg0;
		this.aByteArray93 = arg1;
	}
}
