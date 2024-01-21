import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
	}
}
