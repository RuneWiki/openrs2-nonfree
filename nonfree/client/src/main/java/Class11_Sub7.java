import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[S")
	public final short[] aShortArray35;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([S[B)V")
	public Class11_Sub7(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray35 = arg0;
		this.aByteArray18 = arg1;
	}
}
