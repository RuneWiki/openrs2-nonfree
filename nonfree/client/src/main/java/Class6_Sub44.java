import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[S")
	public final short[] aShortArray133;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "[B")
	public final byte[] aByteArray109;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub44(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray133 = arg0;
		this.aByteArray109 = arg1;
	}
}
