import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!ija", name = "l", descriptor = "[S")
	public final short[] aShortArray50;

	@OriginalMember(owner = "client!ija", name = "m", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub25(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray50 = arg0;
		this.aByteArray41 = arg1;
	}
}
