import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[S")
	public final short[] aShortArray10;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub11(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray10 = arg0;
		this.aByteArray10 = arg1;
	}
}
