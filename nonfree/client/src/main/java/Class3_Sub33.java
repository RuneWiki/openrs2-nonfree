import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[S")
	public final short[] aShortArray88;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub33(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray88 = arg0;
		this.aByteArray71 = arg1;
	}
}
