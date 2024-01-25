import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!du", name = "j", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[B")
	public final byte[] aByteArray13;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "([S[B)V")
	public Class6_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray37 = arg0;
		this.aByteArray13 = arg1;
	}
}
