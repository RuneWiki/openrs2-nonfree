import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class12_Sub48 extends Class12 {

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "[S")
	public final short[] aShortArray112;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([S[B)V")
	public Class12_Sub48(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray112 = arg0;
		this.aByteArray105 = arg1;
	}
}
