import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = arg0;
	}
}
