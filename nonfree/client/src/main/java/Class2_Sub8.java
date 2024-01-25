import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!bha", name = "k", descriptor = "[B")
	public final byte[] aByteArray5;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub8(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray15 = arg0;
		this.aByteArray5 = arg1;
	}
}
