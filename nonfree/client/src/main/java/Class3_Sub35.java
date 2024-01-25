import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "[S")
	public final short[] aShortArray63;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub35(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray63 = arg0;
		this.aByteArray50 = arg1;
	}
}
