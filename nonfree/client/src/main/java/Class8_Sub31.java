import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class8_Sub31 extends Class8 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
	public Class8_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
	}
}
