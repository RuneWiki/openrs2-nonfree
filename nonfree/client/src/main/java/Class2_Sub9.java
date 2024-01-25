import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[S")
	public final short[] aShortArray11;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub9(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray11 = arg0;
		this.aByteArray22 = arg1;
	}
}
