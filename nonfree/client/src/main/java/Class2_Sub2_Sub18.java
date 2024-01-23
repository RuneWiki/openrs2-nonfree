import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray53 = arg0;
	}
}
