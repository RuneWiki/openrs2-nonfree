import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class14_Sub32 extends Class14 {

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "[B")
	public final byte[] aByteArray179;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([B)V")
	public Class14_Sub32(@OriginalArg(0) byte[] arg0) {
		this.aByteArray179 = arg0;
	}
}
