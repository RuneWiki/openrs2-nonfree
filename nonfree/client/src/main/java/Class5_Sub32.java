import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V")
	public Class5_Sub32(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
	}
}
