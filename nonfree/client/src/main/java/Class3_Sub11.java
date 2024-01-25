import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "[B")
	public final byte[] aByteArray25;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub11(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray15 = arg0;
		this.aByteArray25 = arg1;
	}
}
