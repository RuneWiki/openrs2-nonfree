import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "[S")
	public final short[] aShortArray97;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "[B")
	public final byte[] aByteArray66;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub38(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray97 = arg0;
		this.aByteArray66 = arg1;
	}
}
