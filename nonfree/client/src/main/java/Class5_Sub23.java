import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub23(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray30 = arg0;
		this.aByteArray20 = arg1;
	}
}
