import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[S")
	public final short[] aShortArray124;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub44(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray124 = arg0;
		this.aByteArray85 = arg1;
	}
}
