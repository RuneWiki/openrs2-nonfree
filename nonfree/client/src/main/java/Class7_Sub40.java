import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class7_Sub40 extends Class7 {

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "[B")
	public final byte[] aByteArray94;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "([B)V")
	public Class7_Sub40(@OriginalArg(0) byte[] arg0) {
		this.aByteArray94 = arg0;
	}
}
