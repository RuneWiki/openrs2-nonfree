import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
	public final short[] aShortArray103;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
	public final byte[] aByteArray89;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub39(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray103 = arg0;
		this.aByteArray89 = arg1;
	}
}
