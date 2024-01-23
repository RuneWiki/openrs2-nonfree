import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray30 = arg0;
	}
}
