import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class8_Sub1_Sub17 extends Class8_Sub1 {

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
	public Class8_Sub1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
	}
}
