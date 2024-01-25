import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}
}
