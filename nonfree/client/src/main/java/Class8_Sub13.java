import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class8_Sub13 extends Class8 {

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
	public Class8_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
	}
}
