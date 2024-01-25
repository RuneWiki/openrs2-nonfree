import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "[S")
	public final short[] aShortArray9;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub7(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray9 = arg0;
		this.aByteArray6 = arg1;
	}
}
