import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62 = arg0;
	}
}
