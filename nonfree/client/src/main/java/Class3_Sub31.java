import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "[S")
	public final short[] aShortArray156;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "[B")
	public final byte[] aByteArray66;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub31(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray156 = arg0;
		this.aByteArray66 = arg1;
	}
}
