import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
	}
}
