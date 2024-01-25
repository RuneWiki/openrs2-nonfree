import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!so", name = "l", descriptor = "[S")
	public final short[] aShortArray111;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub41(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray111 = arg0;
		this.aByteArray83 = arg1;
	}
}
