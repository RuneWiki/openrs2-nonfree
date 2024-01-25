import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class10_Sub30 extends Class10 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
	public final short[] aShortArray74;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([S[B)V")
	public Class10_Sub30(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray74 = arg0;
		this.aByteArray56 = arg1;
	}
}
