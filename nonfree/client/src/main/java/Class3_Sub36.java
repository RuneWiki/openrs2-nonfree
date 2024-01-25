import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[S")
	public final short[] aShortArray124;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub36(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray124 = arg0;
		this.aByteArray84 = arg1;
	}
}
