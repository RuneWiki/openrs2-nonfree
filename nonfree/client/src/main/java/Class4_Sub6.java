import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "[S")
	public final short[] aShortArray21;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub6(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray21 = arg0;
		this.aByteArray19 = arg1;
	}
}
