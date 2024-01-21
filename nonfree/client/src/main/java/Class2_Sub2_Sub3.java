import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
	}
}
