import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
	}
}
