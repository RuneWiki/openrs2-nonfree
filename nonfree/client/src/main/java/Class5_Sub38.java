import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[S")
	public final short[] aShortArray102;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub38(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray102 = arg0;
		this.aByteArray82 = arg1;
	}
}
