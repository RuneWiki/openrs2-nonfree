import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = arg0;
	}
}
