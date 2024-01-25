import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray92 = arg0;
	}
}
