import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray56 = arg0;
	}
}
