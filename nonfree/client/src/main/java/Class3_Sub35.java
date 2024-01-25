import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "([B)V")
	public Class3_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}
}
