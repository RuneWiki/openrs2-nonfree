import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[S")
	public final short[] aShortArray115;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "[B")
	public final byte[] aByteArray93;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub38(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray115 = arg0;
		this.aByteArray93 = arg1;
	}
}
