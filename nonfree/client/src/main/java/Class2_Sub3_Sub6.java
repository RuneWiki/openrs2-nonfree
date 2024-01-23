import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}
}
