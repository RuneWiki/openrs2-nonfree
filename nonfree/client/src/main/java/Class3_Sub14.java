import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "[S")
	public final short[] aShortArray22;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray22 = arg0;
		this.aByteArray9 = arg1;
	}
}
