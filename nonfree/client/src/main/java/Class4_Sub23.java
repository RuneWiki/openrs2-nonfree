import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[S")
	public final short[] aShortArray84;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub23(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray84 = arg0;
		this.aByteArray47 = arg1;
	}
}
